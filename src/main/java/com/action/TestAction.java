package com.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Levy on 2017/4/28.
 */
public class TestAction extends ActionSupport {
    private static final Logger logger = LogManager.getLogger(TestAction.class);
    public String test(){
        logger.info("here");
        return "success";
    }
}
