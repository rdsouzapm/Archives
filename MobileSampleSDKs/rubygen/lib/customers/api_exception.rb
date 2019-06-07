# This file was automatically generated by APIMATIC BETA v2.0 on 09/17/2014

module Customers
  class APIException < StandardError

    # value store
    attr_reader :response_code

    # The HTTP response code from the API request
    # @param [String] the reason for raising an exception
    # @param [Numeric] the HTTP response code from the API request
    def initialize(reason, response_code)
        super(reason)
        @response_code = response_code
    end

  end
end