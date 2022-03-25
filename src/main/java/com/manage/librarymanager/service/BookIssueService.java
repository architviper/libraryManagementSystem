package com.manage.librarymanager.service;

import com.manage.librarymanager.model.BookingRequest;

public interface BookIssueService {

    Boolean issueBook(BookingRequest bookingRequest);
}
