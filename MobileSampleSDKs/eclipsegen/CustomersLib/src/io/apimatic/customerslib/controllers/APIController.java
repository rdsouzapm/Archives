/*
 * CustomersLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 09/17/2014
 */
package io.apimatic.customerslib.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.mashape.unirest.request.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import io.apimatic.customerslib.*;
import io.apimatic.customerslib.models.*;

public class APIController {
    /**
     * Get zero or more objects from table Customers
     * @param    filter    Optional parameter: Arbitrary search criteria
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> GetCustomersAsync (
            final String filter
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4935345454214558589L;
            {
                    put( "filter", filter );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = Unirest.get(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
    /**
     * Insert one or more objects
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> postInsertCustomersAsync (
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers");

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.post(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
    /**
     * Update one or more objects
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> putUpdateCustomersAsync (
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers");

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.put(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
    /**
     * Get one object
     * @param    pk    Required parameter: CustomerID
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> GetOneCustomersAsync (
            final String pk
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers/{pk}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5675699233955351978L;
            {
                    put( "pk", pk );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = Unirest.get(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
    /**
     * Update one object
     * @param    pk    Required parameter: CustomerID
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> putUpdateOneCustomersAsync (
            final String pk
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers/{pk}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5106275682155805344L;
            {
                    put( "pk", pk );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.put(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
    /**
     * Delete one object
     * @param    pk    Required parameter: CustomerID
	 * @return	Returns the CustomersModel response from the API call*/
    public Future<CustomersModel> DeleteOneCustomersAsync (
            final String pk
            ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/Customers/{pk}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5341039564719462178L;
            {
                    put( "pk", pk );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.delete(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json");

        //invoke request and get response
        final Future<HttpResponse<String>> responseAsync = request.asStringAsync();
        return new FutureTask<CustomersModel>(new Callable<CustomersModel>() {
            public CustomersModel call() throws IOException, APIException, ExecutionException, InterruptedException {
                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody(),
                 new TypeReference<CustomersModel>(){});
        }});
    }
        
}