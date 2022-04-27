package com.archisacademy.rentalservices.service.impl;

import com.archisacademy.rentalservices.dto.UserDetailsDTO;
import com.archisacademy.rentalservices.log.LogManager;
import com.archisacademy.rentalservices.service.UserServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    private LogManager logManager = new LogManager(UserServicesImpl.class);

    public static final String TURKEY = "Turkey";
    public static final String EMPTY_STRING = "";

    @Override
    public String getWelcomeMessage(UserDetailsDTO userDetailsDTO) {

        String welcome = "";
        List<UserDetailsDTO> userDetails = getUserDetails();
        Map<String, UserDetailsDTO> getUserDetailsMap = getUserDetailsMap();

        for (int i = 0; i < getUserDetailsMap.size(); i++) {
            if ("Anas".equals(getUserDetailsMap.get(userDetailsDTO.getName()).getName())) {
                logManager.log("this is executed " + i + "time");
                welcome = welcome + "   " + getUserDetailsMap.get("Anas").getLocation();
            }
        }

        return welcome;
    }

    private List<UserDetailsDTO> getUserDetails() {

        List<UserDetailsDTO> userDetails = new ArrayList<UserDetailsDTO>();
        userDetails.add(0, new UserDetailsDTO("Anas", "Seeroo", "India"));
        userDetails.add(1, new UserDetailsDTO("Surumi", "Archis", "India"));
        userDetails.add(2, new UserDetailsDTO("Tofi", "Archis", "Turkey"));

        return userDetails;
    }

    private Map<String, UserDetailsDTO> getUserDetailsMap() {

        Map<String, UserDetailsDTO> userDetails = new HashMap<>();
        userDetails.put("Anas", new UserDetailsDTO("Anas", "Seeroo", "India"));
        userDetails.put("Surumi", new UserDetailsDTO("Surumi", "Archis", "India"));
        userDetails.put("Tofi", new UserDetailsDTO("Tofi", "Archis", "Turkey"));

        return userDetails;
    }
}
