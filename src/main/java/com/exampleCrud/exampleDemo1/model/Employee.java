package com.exampleCrud.exampleDemo1.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor // ??
@NoArgsConstructor //??  These both are optional when we are using @Data annotation.
@Data
@Table(name ="Employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "first_name", nullable = false)
	private String first_name;
	
	@Column(name = "last_name", nullable = false)
	private String last_name;
	
	@Column(name= "email_id", nullable = false)
	private String email;

}
