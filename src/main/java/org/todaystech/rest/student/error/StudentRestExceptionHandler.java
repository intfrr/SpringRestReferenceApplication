package org.todaystech.rest.student.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

	/**
     * Application Specific error handler
     * @param studentException
     * @return
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentApiException studentException) {
    	StudentErrorResponse errorResponse = new StudentErrorResponse();
    	errorResponse.setStatus(studentException.getStatus().value());
    	errorResponse.setErrorMessage(studentException.getMessage());
    	errorResponse.setTimestamp(System.currentTimeMillis());
    	
    	return new ResponseEntity<StudentErrorResponse>(errorResponse,studentException.getStatus());
    }
    
}
