package com.manage.librarymanager.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId;

  @Column (name = "user_name")
  private String userName;

  @Column (name = "created_date")
  private LocalDateTime createdDate;

  @Column (name = "is_member_active")
  private Boolean isMemberActive;



}
