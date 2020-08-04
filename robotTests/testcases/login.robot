*** Settings ***
Documentation    Suite description

Resource          ./resources.robot
Test Teardown     Close Browser

*** Test Cases ***

Test Home Page Is Open
    Open Browser To Main Page
    Title Should Be    Code Academy Jns 2020

