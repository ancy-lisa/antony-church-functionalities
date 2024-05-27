package com.example.st.antonyChurch.familyDataRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.st.antonyChurch.familyData.FamilyData;


@Repository
public interface FamilyDataRepository extends JpaRepository<FamilyData, Long> {

	List<FamilyData> findByFamilyId(Long id);

}
