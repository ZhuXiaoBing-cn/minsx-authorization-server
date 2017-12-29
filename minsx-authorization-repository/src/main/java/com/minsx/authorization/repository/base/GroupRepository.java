package com.minsx.authorization.repository.base;

import com.minsx.authorization.entity.base.auth.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer>{
	

}
