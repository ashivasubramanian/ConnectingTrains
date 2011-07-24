CREATE TABLE station
(
	code varchar(10) NOT NULL,
	name varchar(200) NOT NULL
);

ALTER TABLE station ADD CONSTRAINT pk_code PRIMARY KEY (code);