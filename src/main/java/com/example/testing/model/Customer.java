package com.example.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "customers")
@EqualsAndHashCode(callSuper = true)
@EntityListeners(AuditingEntityListener.class)
public class Customer extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7564129983343692493L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "active")
	private boolean active;

	public Customer() {
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.active = false;
	}

}
