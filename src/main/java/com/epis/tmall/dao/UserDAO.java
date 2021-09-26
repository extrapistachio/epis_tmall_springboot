package com.epis.tmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epis.tmall.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{

}