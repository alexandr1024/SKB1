create table SKBTASK6_ADD_FILES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    F_NAME varchar(255),
    TYPE_ varchar(10),
    ID_FILE_ID varchar(36),
    --
    primary key (ID)
);
