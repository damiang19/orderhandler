package pl.dgorecki.orderhandler.service;

import jakarta.mail.MessagingException;

import java.io.File;

public interface MailService {
    void sendEmailWithAttachment(String to, String subject, String text, File attachment) throws MessagingException;
    void sendHtmlEmail(String to, String subject, String htmlContent)
            throws MessagingException;
    void sendSimpleEmail(String to, String subject, String text);
}
