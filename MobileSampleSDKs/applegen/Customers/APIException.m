//
//  APIHelper.m
//  Customers
//
//  This file was automatically generated by APIMATIC BETA v2.0 on 09/17/2014
//
#import "APIException.h"

@implementation APIException

/**
* The HTTP response code from the API request
*/
@synthesize responseCode;

/**
* Initialization
* @param	name	The name of the exception
* @param	reason	The reason for throwing exception
* @param	code	The HTTP response code from the API request
* @param	body	The HTTP response body from the API request
*/
- (APIException*) initWithName: (NSString*) name
                     andReason: (NSString*) reason
                       andCode: (NSInteger) code
{
    self = [super initWithName: name reason: reason userInfo:Nil];
    self.responseCode = code;
    return self;
}

@end