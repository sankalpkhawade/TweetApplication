package com.tweetapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
	private String loginId;

	private String firstName;

	private String lastName;

	private String emailId;

	private String password;

	private String contactNumber;

	private Boolean loggedIn;
}
