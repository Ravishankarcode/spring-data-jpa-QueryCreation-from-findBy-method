/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.datajpa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = -2952735933715107252L;

	@Id
	@Column(name="user_id",nullable = false) 
	private int userId;
	@Column(name="user_first_name")
	private String firstname;
	@Column(name="user_last_name")
	private String lastname;
	@Column(name="user_age")
	private int age;
	@Column(name="user_status",nullable = false)
	private boolean active;
	@Column(name="start_date")
	@CreatedDate
	private Date startDate;

}
