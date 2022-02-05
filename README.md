# featureActivation
This project the assignment for internship evaluation given by the ICC department of MBRDI team.
Problem Statement: [here]https://github.com/deva1990/3b5e7544-844e-11ec-a8a3-0242ac120002/blob/main/README_FeatureActivationDeActivation_Usecase.md

This project is executed using MySQL database with one table having the following attributes:
1. id -- primary key/serial number
2. vid -- vehicle identification number
3. featurecode -- code given to the feature
4. activationdate -- shows the activation date of that feature in a vehicle with that vid
5. deactivationdate -- shows the activation date of that feature in a vehicle with that vid
6. enabled -- boolean value to check if teh feature is enabled or no in that particular vehicle

It uses Spring Boot application to generate APIs.
The following 2 work absolutely fine.
1. Listing the enabled features:
   GET /api/list-enabled-features/<VIN>
2. Get feature history:
   GET /api/get-feature-history/{VIN}

