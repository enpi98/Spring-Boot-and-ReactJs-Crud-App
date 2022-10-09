/*Create a new schema named schema_user in mysql and run the following query.*/
CREATE TABLE schema_user.TBL_USER(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(100) UNIQUE
);

