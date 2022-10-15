package com.example.employee.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Long id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email")
    private String email;
    
    public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public void setFirstName(String firstName2) {
		firstName = firstName2;
		
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public void setLastName(String lastName2) {
		lastName = lastName2;
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public void setEmailId(String email2) {
		email=email2;
		
	}
}
