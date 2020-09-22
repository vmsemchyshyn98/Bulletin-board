package com.company.bulletinboard.controller;

import com.company.bulletinboard.model.Advertisement;
import com.company.bulletinboard.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/advertisements")
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;


    @GetMapping
    public String main() {
        return "main";
    }

    @RequestMapping(value="/main", method= RequestMethod.GET)
    public String AdvertisementList(Model model) {
        model.addAttribute("adv", advertisementService.getAllAdvertisements());
        return "main";
    }


    @RequestMapping(value="/new", method = RequestMethod.GET)
    public String newAdvertisement(Model model) {
        model.addAttribute("advertisement",new Advertisement());
        return "new";
    }


    @PostMapping
    public String create(@ModelAttribute("advertisement") Advertisement advertisement) {
advertisementService.create(advertisement.getHeader(),advertisement.getText(),
        advertisement.getAuthor());
        return "redirect:/advertisements";
    }

}
