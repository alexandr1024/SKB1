alter table SKBTASK6_ADD_FILES add constraint FK_SKBTASK6_ADD_FILES_ID_FILE foreign key (ID_FILE_ID) references SYS_FILE(ID);
create index IDX_SKBTASK6_ADD_FILES_ID_FILE on SKBTASK6_ADD_FILES (ID_FILE_ID);
