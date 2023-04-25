package com.yoesoff.pondasi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;
@Data
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    @PrePersist
    protected void onCreate() {
        createdDate = new Timestamp(new Date().getTime());
    }

    @PreUpdate
    protected void onUpdate() {
        updatedDate = new Timestamp(new Date().getTime());
    }

    public BaseEntity() {}
}
