package com.company.skbtask6.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.FileDescriptor;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|id")
@Table(name = "SKBTASK6_ADD_FILES")
@Entity(name = "skbtask6$ADD_FILES")
public class ADD_FILES extends StandardEntity {
    private static final long serialVersionUID = -5316014986336367512L;

    @Column(name = "F_NAME")
    protected String f_name;

    @Column(name = "TYPE_", length = 10)
    protected String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_ID")
    protected FileDescriptor id_file;

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setId_file(FileDescriptor id_file) {
        this.id_file = id_file;
    }

    public FileDescriptor getId_file() {
        return id_file;
    }


}