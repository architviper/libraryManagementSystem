package com.manage.librarymanager.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class UserBookIssueMapping {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer bookId;

    private LocalDateTime issuedDate;

    private LocalDateTime returnedOn;

    private LocalDateTime returnedBy;

    private Boolean isActive;

}
