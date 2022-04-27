package com.archisacademy.rentalservices.service;

import com.archisacademy.rentalservices.dto.UserDetailsDTO;

public interface UserServices {

    String getWelcomeMessage(UserDetailsDTO userDetailsDTO);
}
