package com.example.service.impl;

import com.example.entity.Log;
import com.example.service.LogService;
import com.example.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper LogMapper;

	@Override
	public List<Log> selectByMap(Map<String, Object> map) {
		return LogMapper.selectByMap(map);
	}

}