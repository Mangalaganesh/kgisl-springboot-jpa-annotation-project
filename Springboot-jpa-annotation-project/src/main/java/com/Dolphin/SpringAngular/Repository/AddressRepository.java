package com.Dolphin.SpringAngular.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Dolphin.SpringAngular.Model.Address;

public interface AddressRepository extends JpaRepository <Address, Long>{

}
