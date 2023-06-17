package com.example.dependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class SampleController {

    ISampleService sampleService;

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    public SampleController(ISampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale) {
        logger.info("Welcome home! The client locale is {}.", locale);
        logger.info("Welcome home! The client Name is {}.", sampleService.getName());
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);

        return "Welcome home! The client locale is " + locale + formattedDate;
    }
}
