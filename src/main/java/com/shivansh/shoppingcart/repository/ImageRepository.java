package com.shivansh.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivansh.shoppingcart.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
