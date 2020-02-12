DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    user_id   NUMBER       NOT NULL PRIMARY KEY,
    name varchar(255) not null
);

DROP TABLE IF EXISTS role_mapping;
CREATE TABLE role_mapping
(
    id      NUMBER        NOT NULL PRIMARY KEY,
    user_id NUMBER NOT NULL,
    name    varchar(255)  not null
);

DROP TABLE IF EXISTS roles;
CREATE TABLE roles
(
    id              NUMBER       NOT NULL PRIMARY KEY,
    name            varchar(255) not null,
    role_mapping_id NUMBER       NOT NULL
);

INSERT INTO users VALUES (1, 'user');
INSERT INTO role_mapping VALUES (1, 1, 'mapping 1');
INSERT INTO role_mapping VALUES (2, 1, 'mapping 2');
INSERT INTO role_mapping VALUES (3, 1, 'mapping 3');
INSERT INTO role_mapping VALUES (4, 1, 'mapping 4');
INSERT INTO role_mapping VALUES (5, 1, 'mapping 5');
INSERT INTO role_mapping VALUES (6, 1, 'mapping 6');
INSERT INTO role_mapping VALUES (7, 1, 'mapping 7');
INSERT INTO role_mapping VALUES (8, 1, 'mapping 8');
INSERT INTO role_mapping VALUES (9, 1, 'mapping 9');

INSERT INTO roles VALUES (1, 'role1', 1);
INSERT INTO roles VALUES (2, 'role2', 2);
INSERT INTO roles VALUES (3, 'role3', 3);