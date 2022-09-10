package com.kminan.schoolRegistrationSystem.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kminan.schoolRegistrationSystem.model.Course;

@Transactional
public interface CoursesDao extends JpaRepository<Course, Long> {
    
}
