package com.company.bulletinboard.service;

import com.company.bulletinboard.model.Advertisement;

import java.util.List;

public interface AdvertisementService {

    Advertisement create(String header, String description, String author);

    List<Advertisement> getAllAdvertisements();
}
