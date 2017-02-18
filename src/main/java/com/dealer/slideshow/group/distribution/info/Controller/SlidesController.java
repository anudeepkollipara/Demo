package com.dealer.slideshow.group.distribution.info.Controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author amarnath.raavi
 * @since 07/07/16
 */

@RestController
public class SlidesController {

    private static final Logger log = Logger.getLogger(SlidesController.class);
    @RequestMapping("/")
    public String index() {
        return "Hello Anudeep!";
    }
}
