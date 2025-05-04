package com.namkeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.namkeen.entity.NamkeenItem;

@Repository
public interface NamkeenItemRepository extends JpaRepository<NamkeenItem, Long> {

}
