package com.manage.librarymanager.controller;

import com.manage.librarymanager.model.BookingRequest;
import com.manage.librarymanager.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookIssueService bookIssueService;

    @PostMapping("api/v1/issue")
    public ResponseEntity<Boolean> issueBook (@RequestBody BookingRequest bookingRequest) {

        Boolean issued = bookIssueService.issueBook(bookingRequest);

        return ResponseEntity.ok().build();

    }

}
