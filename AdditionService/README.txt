ADDITION MICROSERVICE - SPRING TOOL SUITE

Requirements:
- JDK 17 or compatible
- Spring Tool Suite
- Maven (included through the Maven project)

Import into STS:
1. Extract AdditionService.zip.
2. Open STS.
3. Select File > Import > Maven > Existing Maven Projects.
4. Browse to the extracted AdditionService folder.
5. Select the project and click Finish.
6. Wait for Maven dependencies to download.
7. Open AdditionServiceApplication.java.
8. Right-click > Run As > Spring Boot App.

Test URL:
http://localhost:8001/ms1/add?a=5&b=10

Expected response:
MS 1.1 - Additon = 15

Note:
The YAML file is a contract definition only. It does not run contract tests by itself.
The repository in this example performs addition in memory; no database is required.
