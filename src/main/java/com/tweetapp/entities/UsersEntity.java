package com.tweetapp.entities;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@IdClass(UsersEntityId.class)
public class UsersEntity {

	@Id
	private ObjectId objectId;

	private String loginId;

	private String firstName;

	private String lastName;

	private String emailId;

	private String password;

	private String contactNumber;

	private Boolean loggedIn;
	
	private List<String> roles;
}
