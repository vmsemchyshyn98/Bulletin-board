package com.company.bulletinboard.service;

import com.company.bulletinboard.model.Advertisement;
import com.company.bulletinboard.repository.AdvertisementRepository;
import com.company.bulletinboard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    AdvertisementRepository advertisementRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Advertisement create(String header, String description, String author) {

        Advertisement advertisement=new Advertisement(header,description,new Date(),author);

        advertisementRepository.save(advertisement);

        return advertisement;
    }

    @Override
    public List<Advertisement> getAllAdvertisements() {
        return advertisementRepository.findAll();
    }
}
