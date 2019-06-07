<?php
/*
 * CustomersLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 09/17/2014
 */

class CustomersModel {
    /**
     * TODO: Write general description for this method
     * @param string $Phone public property
     */
    protected $Phone;

    /**
     * TODO: Write general description for this method
     * @param string $ContactName public property
     */
    protected $ContactName;

    /**
     * TODO: Write general description for this method
     * @param string $Fax public property
     */
    protected $Fax;

    /**
     * TODO: Write general description for this method
     * @param string $CompanyName public property
     */
    protected $CompanyName;

    /**
     * TODO: Write general description for this method
     * @param string $Country public property
     */
    protected $Country;

    /**
     * TODO: Write general description for this method
     * @param string $ContactTitle public property
     */
    protected $ContactTitle;

    /**
     * TODO: Write general description for this method
     * @param string $City public property
     */
    protected $City;

    /**
     * TODO: Write general description for this method
     * @param string $Region public property
     */
    protected $Region;

    /**
     * TODO: Write general description for this method
     * @param string $PostalCode public property
     */
    protected $PostalCode;

    /**
     * TODO: Write general description for this method
     * @param int $CustomerID public property
     */
    protected $CustomerID;

    /**
     * TODO: Write general description for this method
     * @param string $Address public property
     */
    protected $Address;

    /**
     * TODO: Write general description for this method
     * @param int $Balance public property
     */
    protected $Balance;

    /**
     * TODO: Write general description for this method
     * @param int $CreditLimit public property
     */
    protected $CreditLimit;

    /**
     * Return a property of the response if it exists.
     * Possibilities include: code, raw_body, headers, body (if the response is json-decodable)
     * @return mixed
     */
    public function __get($property)
    {
        if (property_exists($this, $property)) {
            //UTF-8 is recommended for correct JSON serialization
            $value = $this->$property;
            if (is_string($value) && mb_detect_encoding($value, "UTF-8", TRUE) != "UTF-8") {
                return utf8_encode($value);
            }
            else {
                return $value;
            }
        }
    }
    
    /**
     * Set the properties of this object
     * @param string $property the property name
     * @param mixed $value the property value
     */
    public function __set($property, $value)
    {
        if (property_exists($this, $property)) {
            //UTF-8 is recommended for correct JSON serialization
            if (is_string($value) && mb_detect_encoding($value, "UTF-8", TRUE) != "UTF-8") {
                $this->$property = utf8_encode($value);
            }
            else {
                $this->$property = $value;
            }
        }

        return $this;
    }
} 