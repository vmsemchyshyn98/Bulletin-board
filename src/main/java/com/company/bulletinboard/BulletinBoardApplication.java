package com.company.bulletinboard;

import com.company.bulletinboard.model.Advertisement;
import com.company.bulletinboard.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BulletinBoardApplication implements CommandLineRunner {

    @Autowired
    AdvertisementRepository advertisementRepository;

    public static void main(String[] args) {
        SpringApplication.run(BulletinBoardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Advertisement advertisement=new Advertisement("ewfwe","ferf",new Date(),"dewf");
        Advertisement advertisement2=new Advertisement("ewfwe22","ferf2222",new Date(),"dewf");

        advertisementRepository.save(advertisement);
        advertisementRepository.save(advertisement2);
//        advertisementRepository.save(new Advertisement("ewfwe","ferf",new Date(),"dewf"));
//        for (int i = 0; i < 5; i++) {
//            advertisementRepository.save(new Advertisement("ewfwe"+ i,"ferf",new Date(),"dewf"));
//        }
    }
}
