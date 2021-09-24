package com.epis.tmall.dao;

import com.epis.tmall.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryDAO extends JpaRepository<Category,Integer> {

}
