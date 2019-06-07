/*
 * Customers.PCL
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 09/17/2014
 */
using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using unirest_net.request;

namespace Customers.PCL
{
    static class APIHelper
    {
        /// <summary>
        /// JSON Serialization of a given object.
        /// </summary>
        /// <param name="obj">The object to serialize into JSON</param>
        /// <returns>The serialized Json string representation of the given object</returns>
        internal static string JsonSerialize(object obj)
        {
            if(null == obj)
                return null;
                
            return JsonConvert.SerializeObject
                (obj, Formatting.None, new JsonSerializerSettings() {
                    Converters = new List<JsonConverter> {
                        new Newtonsoft.Json.Converters.StringEnumConverter()
                }});
        }

        /// <summary>
        /// JSON Deserialization of the given json string.
        /// </summary>
        /// <param name="json">The json string to deserialize</param>
        /// <typeparam name="T">The type of the object to desialize into</typeparam>
        /// <returns>The deserialized object</returns>
        internal static T JsonDeserialize<T>(string json)
        {
            if (string.IsNullOrWhiteSpace(json))
                return default(T);

            return JsonConvert.DeserializeObject<T>(json);
        }

        /// <summary>
        /// Replaces template parameters in the given url
        /// </summary>
        /// <param name="queryUrl">The query url string to replace the template parameters</param>
        /// <param name="parameters">The parameters to replace in the url</param>        
        internal static void AppendUrlWithTemplateParameters
            (StringBuilder queryBuilder, IEnumerable<KeyValuePair<string, object>> parameters)
        {
            //perform parameter validation
            if (null == queryBuilder)
                throw new ArgumentNullException("queryBuilder");

            if (null == parameters)
                return;

            //iterate and replace parameters
            foreach(KeyValuePair<string, object> pair in parameters)
            {
                string replaceValue = string.Empty;

                //load paramter value
                if (null != pair.Value)
                    replaceValue = pair.Value.ToString();

                //find the template parameter and replace it with its value
                queryBuilder.Replace(string.Format("{{{0}}}", pair.Key), replaceValue);
            }
        }

        /// <summary>
        /// Appends the given set of parameters to the given query string
        /// </summary>
        /// <param name="queryUrl">The query url string to append the parameters</param>
        /// <param name="parameters">The parameters to append</param>        
        internal static void AppendUrlWithQueryParameters
            (StringBuilder queryBuilder, IEnumerable<KeyValuePair<string, object>> parameters)
        {
            //perform parameter validation
            if (null == queryBuilder)
                throw new ArgumentNullException("queryBuilder");
                
            if (null == parameters)
                return;

            //does the query string already has parameters
            bool hasParams = (indexOf(queryBuilder, "?") > 0);
            
            //iterate and append parameters
            foreach (KeyValuePair<string, object> pair in parameters)
            {
                //ignore null values
                if (pair.Value == null)
                    continue;

                //if already has parameters, use the &amp; to append new parameters
                char separator = (hasParams) ? '&' : '?';

                queryBuilder.AppendFormat("{0}{1}={2}", separator, pair.Key, pair.Value);

                //indicate that now the query has some params
                hasParams = true;
            }
        }

        /// <summary>
        /// StringBuilder extension method to implement IndexOf functionality.
        /// This does a StringComparison.Ordinal kind of comparison.
        /// </summary>
        /// <param name="stringBuilder">The string builder to find the index in</param>
        /// <param name="strCheck">The string to locate in the string builder</param>
        /// <returns>The index of string inside the string builder</returns>
        private static int indexOf(StringBuilder stringBuilder, string strCheck)
        {
            if (stringBuilder == null)
                throw new ArgumentNullException("stringBuilder");

            if (strCheck == null)
                return 0;

            //iterate over the input
            for (int inputCounter = 0; inputCounter < stringBuilder.Length; inputCounter++)
            {
                int matchCounter;

                //attempt to locate a potential match
                for (matchCounter = 0;
                        (matchCounter < strCheck.Length)
                        && (inputCounter + matchCounter < stringBuilder.Length)
                        && (stringBuilder[inputCounter + matchCounter] == strCheck[matchCounter]);
                    matchCounter++); 
                
                //verify the match
                if (matchCounter == strCheck.Length)
                    return inputCounter;
            }

            return -1;
        }

        /// <summary>
        /// Validates and processes the given query Url to clean empty slashes
        /// </summary>
        /// <param name="queryBuilder">The given query Url to process</param>
        /// <returns>Clean Url as string</returns>
        internal static string CleanUrl(StringBuilder queryBuilder)
        {
            //convert to immutable string
            string url = queryBuilder.ToString();

            //ensure that the urls are absolute            
            Match protocol = Regex.Match(url, "^https?://[^/]+");
            if (!protocol.Success)
                throw new ArgumentException("Invalid Url format.");

            //remove redundant forward slashes
            string query = url.Substring(protocol.Length);
            query = Regex.Replace(query, "//+", "/");

            //return process url
            return string.Concat(protocol.Value, query);
        }

        /// <summary>
        /// A neat way of parsing string to enum values
        /// </summary>
        /// <param name="sEnumValue">String value to parse</param>
        /// <returns>Parsed enum value in the given type</returns>
        internal static TEnum ParseEnum<TEnum>(string sEnumValue) where TEnum : struct
        {
            TEnum eTemp;
            if (Enum.TryParse<TEnum>(sEnumValue, true, out eTemp) == true)
                return eTemp;

            throw new ArgumentOutOfRangeException(
                string.Format("Value \"{0}\" is not defined in {1}", sEnumValue, typeof(TEnum)));
        }
    }
}
