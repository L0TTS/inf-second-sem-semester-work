package com.example.infsecondsemsemesterwork.util;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class CloudinaryHelper {
	@Getter
	private static Cloudinary cloudinary;

	public CloudinaryHelper() {
		if (cloudinary == null) {
			cloudinary = new Cloudinary(ObjectUtils.asMap(
					"cloud_name", "denzel666",
					"api_key", "369544916742953",
					"api_secret", "kqCmHw938M-HLKQGq2WftTeli5c"));
		}
	}

}