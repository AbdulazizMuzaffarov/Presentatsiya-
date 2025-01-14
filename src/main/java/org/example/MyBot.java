package org.example;



import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String text = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            String firstName = update.getMessage().getFrom().getFirstName();
            String lastName = update.getMessage().getFrom().getLastName();
            info(text, chatId, firstName, lastName);

            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                    execute(myBotService.shareContact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        if (update.hasMessage() && update.getMessage().hasContact()){

            Long chatId = update.getMessage().getChatId();
            Contact contact = update.getMessage().getContact();

            try {
                execute(myBotService.shareLocation(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        if (update.hasMessage() && update.getMessage().hasLocation()){
            Long chatId = update.getMessage().getChatId();
            Location location = update.getMessage().getLocation();


            try {
                execute(myBotService.countryside(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

    }


    @Override
    public String getBotUsername() {
        return "@travelwithcrlbot";
    }

    @Override
    public String getBotToken() {
        return "7649021477:AAF35SoUqwOreTCljUU1mKgU-BlTULnW5pE";
    }

    public void info(String text, Long chatId, String firstName, String lastName) {
        System.out.println("\n Chat ID: " + chatId + "\n First Name: " + firstName + "\n Last Name: " + lastName + "\n Text: " + text);
    }
}
