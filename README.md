	
curl --location --request POST 'https://xyz.execute-api.eu-central-1.amazonaws.com/dev/hello' \
--header 'Content-Type: application/json' \
--data-raw '{
	"hello": "world"
}'


2020-08-06 09:50:32,168 ERROR [be.dri.GreetingFunction] (executor-thread-1) 
Request: APIGatewayV2HTTPEvent(version=null, routeKey=null, rawPath=null, rawQueryString=null, cookies=null, headers=null, queryStringParameters=null, pathParameters=null, stageVariables=null, Body=null, isBase64Encoded=false, requestContext=null)