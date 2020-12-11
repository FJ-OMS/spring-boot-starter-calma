package com.marvin.feign;

import java.util.Map;

import com.marvin.model.DingdingNotice;
import com.marvin.util.JsonExpander;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

public interface DingdingClientFeign {

	@RequestLine("POST /send?access_token={accessToken}") // TODO:ac39ef481aff92d19dc21ec6df05e5f2b2a6870e6046f3f95beb5b34110e2a3e
	@Headers("Content-Type: application/json; charset=utf-8")
	@Body("{body}")
	Object post(@Param("accessToken") String accessToken,
			@Param(value = "body", expander = JsonExpander.class) DingdingNotice body,
			@QueryMap Map<String, Object> map);

}
