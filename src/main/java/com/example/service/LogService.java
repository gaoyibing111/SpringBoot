package com.example.service;

import com.example.entity.Log;


import java.util.List;
import java.util.Map;

public interface LogService {

	List<Log> selectByMap(Map<String, Object> map);

}