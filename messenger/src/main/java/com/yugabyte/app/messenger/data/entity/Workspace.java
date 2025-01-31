package com.yugabyte.app.messenger.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;

import com.helger.commons.annotation.Nonempty;

@Entity
@IdClass(GeoId.class)
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workspace_id_seq")
    @SequenceGenerator(name = "workspace_id_seq", sequenceName = "workspace_id_seq", allocationSize = 1)
    private Integer id;

    @Id
    private String countryCode;

    @Nonempty
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
