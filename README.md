# reading-list 
This is a Spring Boot application deployed on PWS, Heroku, local. 
Source code is from the book "Spring Boot in Action".

Modified by: **Minh-Thien Le**

Time spent: **** hours spent in total

Deployed URL: ****

## User Stories

The following **original** functionality is complete and working in the original git repo:
* [x] A

The following **modified** features are implemented by **Minh-Thien Le**
* [x] A

## Video Walkthrough

Here's a walkthrough of implemented user stories:

## Notes
* Upgraded to latest Spring Boot 1.3.2
* Flyway is used as a database version control
* This app has been working on both Heroku and local.

## Running locally with PostgreSQL

* The following assumes you have a working Java 1.8 SDK installed.

* Install and start PostgreSQL:

* Create a database user and table:

```sql
CREATE USER lmthien with password 'pass' CREATEDB;
create database readinglist with owner lmthien ENCODING 'UTF8';
grant all privileges on database readinglist to lmthien;
```

## Deployment on Heroku
Add the **Procfile** containing metadata for Heroku specific deployment.
As the Procfile tells Heroku that this is a web application, a PostgreSQL service will be **automatically created and binded to this application during deployment**.

Edit **application.yml**: must configure the **spring.datasource.url = ${JDBC_DATABASE_URL}**

Then, run these commands:

```bash
heroku create
git push heroku master
```
