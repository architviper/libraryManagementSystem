package com.manage.librarymanager.serviceImpl;

import com.manage.librarymanager.entity.User;
import com.manage.librarymanager.exception.UserNotActiveException;
import com.manage.librarymanager.exception.UserNotFountException;
import com.manage.librarymanager.model.BookingRequest;
import com.manage.librarymanager.repository.UserRepo;
import com.manage.librarymanager.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookIssueServiceImpl implements BookIssueService {

    @Autowired
    UserRepo userRepo;

    @Override
    public Boolean issueBook(BookingRequest bookingRequest) {

        Optional<User> user = userRepo.findById(bookingRequest.getUserId());

        if(user.isPresent()){
            if (! user.get().getIsMemberActive()) {
                throw new UserNotActiveException();
            }
        }






        return null;
    }
}
