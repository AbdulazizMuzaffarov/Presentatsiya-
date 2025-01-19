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
            if (text.equals("Uzbek tili\uD83C\uDDFA\uD83C\uDDFF")){
                try {
                    execute(myBotService.uzbekAiraports(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD19 Asosiy menyuga qaytish")){
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Русский язык\uD83C\uDDF7\uD83C\uDDFA")){
                try {
                    execute(myBotService.russiaAiraports(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD19 Вернуться в главное меню")) {
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("English language\uD83C\uDDFA\uD83C\uDDF8")){
                try {
                    execute(myBotService.englishAiraports(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD19 Go to main menu")) {
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tashkent, (TAS), Uzbekistan")){
                try {
                    execute(myBotService.tashkentEnglishcoutryside(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("North America \uD83C\uDDFA\uD83C\uDDF8")){
                try {
                    execute(myBotService.northamerikaEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("South America \uD83C\uDDFA\uD83C\uDDF8")) {
                try {
                    execute(myBotService.southamerikaEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Asia \uD83C\uDF0F")) {
                try {
                    execute(myBotService.asiaEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Europe \uD83C\uDDEA\uD83C\uDDFA")){
                try {
                    execute(myBotService.europeEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Australia \uD83C\uDDE6\uD83C\uDDFA")) {
                try {
                    execute(myBotService.australiaEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("North America \uD83C\uDDFA\uD83C\uDDF8")) {
                try {
                    execute(myBotService.northamerikaInfo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("USA \uD83C\uDDFA\uD83C\uDDF8")) {
                try {
                    execute(myBotService.usa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Canada \uD83C\uDDE8\uD83C\uDDE6")){
                try {
                    execute(myBotService.canada(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Cuba \uD83C\uDDE8\uD83C\uDDFA")) {
                try {
                    execute(myBotService.cuba(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Mexico \uD83C\uDDF2\uD83C\uDDFD")) {
                try {
                    execute(myBotService.mexico(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("New York City")){
                try {
                    execute(myBotService.newyork(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Los Angeles")) {
                try {
                    execute(myBotService.losangeles(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Los Angeles International Airport, LAX")) {
                try {
                    execute(myBotService.LAX(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Flight to Los Angeles with tours \uD83E\uDDF3")) {
                    try {
                        execute(myBotService.losangeleswithtours(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
            }
            if (text.equals("23.01.2025 to 28.01.2025")){
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Buy tickets to Los-Angeles with tour \uD83C\uDFAB")) {
                try {
                    execute(myBotService.priceLosangelestour(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles on your own")) {
                try {
                    execute(myBotService.losangelesyourown(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Buy a one-way ticket to Los Angeles only")){
                try {
                    execute(myBotService.losangelesdepyear(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025 year")) {
                try {
                    execute(myBotService.losangeles2025month(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-January")) {
                try {
                    execute(myBotService.losangeles25january(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-February")) {
                try {
                    execute(myBotService.losangeles25faburyary(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-March")) {
                try {
                    execute(myBotService.losangeles25march(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-April")) {
                try {
                    execute(myBotService.losangeles25april(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-May")) {
                try {
                    execute(myBotService.losangeles25may(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-June")) {
                try {
                    execute(myBotService.losangeles25june(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-July")) {
                try {
                    execute(myBotService.losangeles25jule(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-August")) {
                try {
                    execute(myBotService.losangeles25august(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-September")) {
                try {
                    execute(myBotService.losangeles25september(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-October")) {
                try {
                    execute(myBotService.losangeles25oktober(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-November")) {
                try {
                    execute(myBotService.losangeles25november(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2025-December")) {
                try {
                    execute(myBotService.losangeles25december(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2026 year")) {
                try {
                    execute(myBotService.losangeles2026(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 2026-January")) {
                try {
                    execute(myBotService.losangeles26january(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("30.01.2025 to 04.02.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("13.02.2025 to 18.02.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("20.02.2025 to 25.02.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("27.02.2025 to 04.03.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("(06.03.2025 to 11.03.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("13.03.2025 to 18.03.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("20.03.2025 to 25.03.2025")) {
                try {
                    execute(myBotService.january23(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 23.01.2025")) {
                try {
                    execute(myBotService.losangelesclass2301(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on January 23 until 23:50")) {
                try {
                    execute(myBotService.lpsangelesecoprice2301(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on January 23 until 23:50")) {
                try {
                    execute(myBotService.losangelesbusinessprice2301(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 25.01.2025")) {
                try {
                    execute(myBotService.losangelesclass2501(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on January 25 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2501(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on January 25 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2501(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 27.01.2025")) {
                try {
                    execute(myBotService.losangelesclass2701(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on January 27 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2701(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on January 25 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2701(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 29.01.2025")) {
                try {
                    execute(myBotService.losangelesclass2901(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on January 29 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2901(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on January 29 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2901(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 31.01.2025")) {
                try {
                    execute(myBotService.losangelesclass3101(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on January 31 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice3101(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on January 31 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice3101(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 02.02.2025")) {
                try {
                    execute(myBotService.losangelesclass0202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 02 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 02 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 04.02.2025")) {
                try {
                    execute(myBotService.losangelesclass0402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 04 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 04 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 06.02.2025")) {
                try {
                    execute(myBotService.losangelesclass0602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 06 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 06 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 08.02.2025")) {
                try {
                    execute(myBotService.losangelesclass0802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 08 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 08 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 10.02.2025")) {
                try {
                    execute(myBotService.losangelesclass1002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 10 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 10 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 12.02.2025")) {
                try {
                    execute(myBotService.losangelesclass1202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 12 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 12 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 14.02.2025")) {
                try {
                    execute(myBotService.losangelesclass1402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 14 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 14 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 16.02.2025")) {
                try {
                    execute(myBotService.losangelesclass1602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 16 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 16 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 18.02.2025")) {
                try {
                    execute(myBotService.losangelesclass1802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 18 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 18 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 20.02.2025")) {
                try {
                    execute(myBotService.losangelesclass2002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 20 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 20 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2002(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 22.02.2025")) {
                try {
                    execute(myBotService.losangelesclass2202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 22 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 22 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2202(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 24.02.2025")) {
                try {
                    execute(myBotService.losangelesclass2402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 24 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 24 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2402(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 26.02.2025")) {
                try {
                    execute(myBotService.losangelesclass2602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 26 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 26 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2602(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 28.02.2025")) {
                try {
                    execute(myBotService.losangelesclass2802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on February 28 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on February 28 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2802(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 02.03.2025")) {
                try {
                    execute(myBotService.losangelesclass0203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 02 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 02 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 04.03.2025")) {
                try {
                    execute(myBotService.losangelesclass0403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 04 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 04 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 06.03.2025")) {
                try {
                    execute(myBotService.losangelesclass0603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 06 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 06 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 08.03.2025")) {
                try {
                    execute(myBotService.losangelesclass0803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 08 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 08 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 10.03.2025")) {
                try {
                    execute(myBotService.losangelesclass1003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 10 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 10 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 12.03.2025")) {
                try {
                    execute(myBotService.losangelesclass1203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 12 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 12 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 14.03.2025")) {
                try {
                    execute(myBotService.losangelesclass1403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 14 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 14 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 16.03.2025")) {
                try {
                    execute(myBotService.losangelesclass1603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 16 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 16 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 18.03.2025")) {
                try {
                    execute(myBotService.losangelesclass1803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 18 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 18 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 20.03.2025")) {
                try {
                    execute(myBotService.losangelesclass2003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 20 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 20 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 22.03.2025")) {
                try {
                    execute(myBotService.losangelesclass2203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 22 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 22 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2203(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 24.03.2025")) {
                try {
                    execute(myBotService.losangelesclass2403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 24 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 24 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2403(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 26.03.2025")) {
                try {
                    execute(myBotService.losangelesclass2603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 26 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 26 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2603(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 28.03.2025")) {
                try {
                    execute(myBotService.losangelesclass2803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 28 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 28 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2803(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 30.03.2025")) {
                try {
                    execute(myBotService.losangelesclass3003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on March 30 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice3003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on March 30 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice3003(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 01.04.2025")) {
                try {
                    execute(myBotService.losangelesclass0104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 01 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 01 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 03.04.2025")) {
                try {
                    execute(myBotService.losangelesclass0304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 03 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 03 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 05.04.2025")) {
                try {
                    execute(myBotService.losangelesclass0504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 05 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 05 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 07.04.2025")) {
                try {
                    execute(myBotService.losangelesclass0704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 07 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 07 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 09.04.2025")) {
                try {
                    execute(myBotService.losangelesclass0904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 09 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice0904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 09 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice0904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 11.04.2025")) {
                try {
                    execute(myBotService.losangelesclass1104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 11 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 11 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 13.04.2025")) {
                try {
                    execute(myBotService.losangelesclass1304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 13 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 13 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 15.04.2025")) {
                try {
                    execute(myBotService.losangelesclass1504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 15 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 15 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 17.04.2025")) {
                try {
                    execute(myBotService.losangelesclass1704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 17 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 17 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 19.04.2025")) {
                try {
                    execute(myBotService.losangelesclass1904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 19 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice1904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 19 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice1904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 21.04.2025")) {
                try {
                    execute(myBotService.losangelesclass2104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 21 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 21 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2104(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 23.04.2025")) {
                try {
                    execute(myBotService.losangelesclass2304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 23 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 23 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2304(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 25.04.2025")) {
                try {
                    execute(myBotService.losangelesclass2504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 25 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 25 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2504(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 27.04.2025")) {
                try {
                    execute(myBotService.losangelesclass2704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 27 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 27 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2704(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Fly to Los Angeles in 29.04.2025")) {
                try {
                    execute(myBotService.losangelesclass2904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economy class on Tashkent-Los Angeles flight on Arpil 29 until 15:15")) {
                try {
                    execute(myBotService.losangelesbusinessprice2904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Business class on Tashkent-Los Angeles flight on April 29 until 15:15")) {
                try {
                    execute(myBotService.lpsangelesecoprice2904(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Chicago")) {
                try {
                    execute(myBotService.chikago(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Miami")) {
                try {
                    execute(myBotService.miami(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Las Vegas")) {
                try {
                    execute(myBotService.lasvegas(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("San Francisco")) {
                try {
                    execute(myBotService.sanfrancisco(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Boston")) {
                try {
                    execute(myBotService.boston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Houston")) {
                try {
                    execute(myBotService.houston(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Share location: Square Amir Temur, street Istikbal 4")){
                try {
                    execute(myBotService.locationIstikbal4(chatId));
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
                execute(myBotService.language(chatId));
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
