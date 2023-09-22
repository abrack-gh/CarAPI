package com.ab.CarAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAR")
@SequenceGenerator(name = "seq", initialValue = 4, allocationSize = 100)
public class Car {

    @Id
    private Long id;
    private String manufacturer;
    private String model;
    private int build;

    public Car() {
    }

    public Car(Long id, String manufacturer, String model, int build) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.build = build;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }
}
