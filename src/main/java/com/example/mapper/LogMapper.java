package com.example.mapper;

import com.example.entity.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LogMapper {

	List<Log> selectByMap(@Param("map") Map<String, Object> map);

}