package com.tweetapp.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TweetsDto {
	private String tweet;

	private String userTweetId;

	private Long tweetId;
	
	private Long like;
	
	private List<Reply> reply;
	
	private String dateOfPost;
	
	private String timeOfPost;
	
	
}
