CREATE TABLE Customer (
                          id BIGINT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE
);