$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APITesting.feature");
formatter.feature({
  "line": 2,
  "name": "API Tesing",
  "description": "",
  "id": "api-tesing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@API_Testing"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "TC001 API Tesing",
  "description": "",
  "id": "api-tesing;tc001-api-tesing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC001"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "API Testing Sample1",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "API Testing Sample2",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "API Testing Sample3",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.api_testing_sample1()"
});
formatter.result({
  "duration": 210851800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.api_testing_sample2()"
});
formatter.result({
  "duration": 64800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.api_testing_sample3()"
});
formatter.result({
  "duration": 76700,
  "status": "passed"
});
});