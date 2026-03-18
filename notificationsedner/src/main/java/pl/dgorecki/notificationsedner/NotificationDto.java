package pl.dgorecki.notificationsedner;

public record NotificationDto(String title, String content, String email, String phoneNumber, Long productId) {
}
