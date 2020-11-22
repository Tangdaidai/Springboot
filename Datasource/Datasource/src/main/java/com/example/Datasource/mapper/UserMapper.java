package com.example.Datasource.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.Datasource.domain.User;

@Mapper
public interface UserMapper {

	User getUser(Integer id);
}
