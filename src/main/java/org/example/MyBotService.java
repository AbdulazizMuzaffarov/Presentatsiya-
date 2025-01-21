package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Assalomu alekum, xush kelibsiz!\nЗдараствуйте, добро пожаловать!\nHeelo, welkome!");
        return sendMessage;
    }

    public SendMessage shareContact(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring \n Пожалуйста отправьте ваш номера \n Please share your phone number");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Telefon raqam yuborish \n Отправить номер \n Share my contact");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage shareLocation(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos lokatsyangizni yuboring\n Пожалуйста отправьте cвою локацию локацию \n Please share your location");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Lokatsya yuborish \n Отправить локацию \n Share location");
        button.setRequestLocation(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Til tanlang\nВыберите язык\nChoose language");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Uzbek tili\uD83C\uDDFA\uD83C\uDDFF");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Русский язык\uD83C\uDDF7\uD83C\uDDFA");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("English language\uD83C\uDDFA\uD83C\uDDF8");
        row2.add(button2);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    public SendMessage uzbekAiraports(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Uchib ketmoqchi bo'lgan aeroportni tanlang \uD83D\uDEEB");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Toshkent, (TAS), Uzbekiston");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Andijan, (AZN), Uzbekiston");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Buxoro, (BHK), Uzbekiston");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Farg'ona, (FEG), Uzbekiston");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Namagan, (NMA), Uzbekiston");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Nukus, (NCU), Uzbekiston");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Qarshi, (KSQ), Uzbekiston");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Samarqand, (SKD), Uzbekiston");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Termez, (TMJ), Uzbekiston");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Urgench, (UGC), Uzbekiston");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Bosh saxifaga qaytish");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Orqaga qaytish");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage tashkentUzblishcoutryside(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Shimoliy America \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Janubiy America \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Osiyo \uD83C\uDF0F");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Evropa \uD83C\uDDEA\uD83C\uDDFA");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Avstraliya \uD83C\uDDE6\uD83C\uDDFA");
        row1.add(button4);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();

        button5.setText("\uD83D\uDD19 Bosh sahifaga qaytosh");
        row2.add(button5);

        KeyboardButton button6 = new KeyboardButton();

        button6.setText("\uD83D\uDD19 Orqaga qaytish");
        row2.add(button6);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage northamerikaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Shimoliy-Amerikaga Turlar \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("O'zim-tanlayman \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Orqaga qaytish");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage southamerikaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Bittasini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Janubiy-Amerika Turlar \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("O'zim tanlayman \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Orqaga qaytish");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage asiaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Osiyoga Turlar \uD83C\uDF0F");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("O'zim tanlayman \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Bosha sahifaga qaytish");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Orqaga qaytish");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage europeUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Evropaga Turlar \uD83C\uDDEA\uD83C\uDDFA");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("O'zim tanlayman \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Bosh sahifaga qaytoish");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Orqaga qaytish");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage australiaUzb(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Avstraliyaga turlar \uD83C\uDDE6\uD83C\uDDFA");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("O'zim tanlayman \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Bosha sahifaga qaytish");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Orqaga qaytish");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage northamerikaUzbInfo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qaysi saharga uchib ketmoqchisiz?");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("AQSh \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Kanada \uD83C\uDDE8\uD83C\uDDE6");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Kuba \uD83C\uDDE8\uD83C\uDDFA");
        row1.add(button3);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Meksiko \uD83C\uDDF2\uD83C\uDDFD");
        row1.add(button2);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();

        button5.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row2.add(button5);

        KeyboardButton button4 = new KeyboardButton();

        button4.setText("\uD83D\uDD19 Orqaga qaytish");
        row2.add(button4);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendPhoto AQSh(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://gdb.currenttime.tv/0d7d36d3-901e-4692-a7c6-94dea6da8c2e_w1080_h608.jpg"));
        sendPhoto.setCaption("AQSH (Amerika Qoʻshma Shtatlari) +\n" +
                " \"Poytaxti: Vashington, DC. +\n" +
                " \"Ma'lum: global super kuch, kino sanoati markazi (Gollivud), rivojlanayotgan texnologiya (Silikon vodiysi), moliya (Uoll-strit) va madaniyat.+\n" +
                " Diqqatga sazovor joylar: Ozodlik haykali, Katta Kanyon, Oq uy, Milliy bog‘lar.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Nyu-York shahri");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Los-Anjeles");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Chikago");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Mayami");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Las Vegass");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("San Francisko");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Bo'ston");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Hyuston");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Orlandoo");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Vashington, D.C.");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Orqaga qaytish");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto kanada(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("data:image/jpeg;base64,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"));
        sendPhoto.setCaption("Kanada +\n" +
                " \"Poytaxti: Ottava. +\n" +
                " \"Ma'lum: tabiiy landshaftlari, yuqori turmush darajasi, do'stona odamlari va ko'p madaniyatli jamiyati. +\n" +
                " Diqqatga sazovor joylar: Niagara sharsharasi, Banff va Rokki tog'lari, Kvebekning eski shahri.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Ottava");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Toranto");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Vankuver");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Monreal");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Kalgari");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Kvebek");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Edmonton");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Halifaxx");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("\uD83D\uDD19 Orqaga qaytish");
        row4.add(button9);
        rowList.add(row4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto meksiko(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://media.nomadicmatt.com/2022/mexicocitylove2.jpg"));
        sendPhoto.setCaption("Meksika\n" +
                " Poytaxti: Mexiko shahri.\n" +
                " Ma'lum: Mayya va Azteklarning madaniy merosi, Karib dengizi plyajlari, jonli festivallar (O'liklar kuni), noyob taomlari (tacos, guakamol).\n" +
                " Diqqatga sazovor joylar: Chichen Itza, Teotihuacan, Kankun, Playa del Karmen.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Meksiko shaxri");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Gvadalaxara");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Kankun");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Puerto Vallartaa");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Monterreyy");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button1.setText("Meridaa");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Tixuana");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Oaxaka");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("San-Migel de Allende");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Playa del Karmen");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row5.add(button8);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Orqaga qaytish");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto kuba(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQCH0Ghw2I5-6gCTunEAPK4mcGBWc2hTJ3yw&s"));
        sendPhoto.setCaption("Kuba\n" +
                " Poytaxti: Gavana.\n" +
                " Mashhur: mustamlaka shaharlari, boy tarix, musiqa (salsa), plyajlar va eski avtomobillar.\n" +
                " Diqqatga sazovor joylar: Gavana, Trinidad, Varadero, Vinales.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Gavana");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Santyago de Kuba");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Trinidadd");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Varaderoo");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Camaguey");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button1.setText("Cienfuegoss");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Barakoa");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Olgin");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Santa Klaraa");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Matanzalar");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Bosh sahifaga qaytish");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Orqaga qaytish");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }
    public SendMessage russiaAiraports(Long chatId) {
    SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите аэропорт, из которого вы хотите вылететь \uD83D\uDEEB");

    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    List<KeyboardRow> rowList = new ArrayList<>();

    KeyboardRow row = new KeyboardRow();
    KeyboardButton button = new KeyboardButton();

        button.setText("Ташкент, (ТАС), Узбекистан");
        row.add(button);

    KeyboardButton button1 = new KeyboardButton();

        button1.setText("Андижан, (AZN), Узбекистан");
        row.add(button1);
        rowList.add(row);

    KeyboardRow row1 = new KeyboardRow();
    KeyboardButton button2 = new KeyboardButton();

        button2.setText("Бухара, (БХК), Узбекистан");
        row1.add(button2);

    KeyboardButton button3 = new KeyboardButton();

        button3.setText("Фергана, (ФЕГ), Узбекистан");
        row1.add(button3);
        rowList.add(row1);

    KeyboardRow row2 = new KeyboardRow();
    KeyboardButton button4 = new KeyboardButton();

        button4.setText("Намагана, (НМА), Узбекистан");
        row2.add(button4);

    KeyboardButton button5 = new KeyboardButton();

        button5.setText("Нукус, (НКУ), Узбекистан");
        row2.add(button5);
        rowList.add(row2);

    KeyboardRow row3 = new KeyboardRow();
    KeyboardButton button6 = new KeyboardButton();

        button6.setText("Карши, (КСК), Узбекистан");
        row3.add(button6);

    KeyboardButton button7 = new KeyboardButton();

        button7.setText("Samarkand, (СКД), Узбекистан");
        row3.add(button7);
        rowList.add(row3);

    KeyboardRow row4 = new KeyboardRow();
    KeyboardButton button8 = new KeyboardButton();

        button8.setText("Термез, (ТМЖ), Узбекистан");
        row4.add(button8);

    KeyboardButton button9 = new KeyboardButton();

        button9.setText("Ургенч, (УГС), Узбекстан");
        row4.add(button9);
        rowList.add(row4);

    KeyboardRow row5 = new KeyboardRow();
    KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Вернуться в главную меню");
        row5.add(button10);

    KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Вернуться назад");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
}
    public SendMessage englishAiraports(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select the airport you want to fly from \uD83D\uDEEB");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tashkent, (TAS), Uzbekistan");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Andijan, (AZN), Uzbekistan");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Bukhara, (BHK), Uzbekistan");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fergana, (FEG), Uzbekistan");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Namagana, (NMA), Uzbekistan");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Nukus, (NCU), Uzbekistan");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Kasrshi, (KSQ), Uzbekistan");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Samarkand, (SKD), Uzbekistan");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Termez, (TMJ), Uzbekistan");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Urgench, (UGC), Uzbekistan");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Go to main menu");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Go back");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage tashkentEnglishcoutryside(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("North America \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("South America \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Asia \uD83C\uDF0F");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Europe \uD83C\uDDEA\uD83C\uDDFA");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Australia \uD83C\uDDE6\uD83C\uDDFA");
        row1.add(button4);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();

        button5.setText("\uD83D\uDD19 Go to main menu");
        row2.add(button5);

        KeyboardButton button6 = new KeyboardButton();

        button6.setText("\uD83D\uDD19 Go back");
        row2.add(button6);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage northamerikaEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tour in North-Amerika \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Choose yourself \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage southamerikaEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tour in South-Amerika \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Choose yourself \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage asiaEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tour in Asia \uD83C\uDF0F");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Choose yourself \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage europeEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tour in Europe \uD83C\uDDEA\uD83C\uDDFA");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Choose yourself \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage australiaEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose one");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tour in Australia \uD83C\uDDE6\uD83C\uDDFA");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Choose yourself \uD83D\uDC64");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage northamerikaInfo(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select which country you want to visit");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("USA \uD83C\uDDFA\uD83C\uDDF8");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Canada \uD83C\uDDE8\uD83C\uDDE6");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Cuba \uD83C\uDDE8\uD83C\uDDFA");
        row1.add(button3);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Mexico \uD83C\uDDF2\uD83C\uDDFD");
        row1.add(button2);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();

        button5.setText("\uD83D\uDD19 Go to main menu");
        row2.add(button5);

        KeyboardButton button4 = new KeyboardButton();

        button4.setText("\uD83D\uDD19 Go back");
        row2.add(button4);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendPhoto usa(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://gdb.currenttime.tv/0d7d36d3-901e-4692-a7c6-94dea6da8c2e_w1080_h608.jpg"));
        sendPhoto.setCaption("USA (United States of America)\n" +
                "Capital: Washington, DC.\n" +
                "Known for: global superpower, center of the film industry (Hollywood), emerging technology (Silicon Valley), finance (Wall Street) and culture.\n" +
                "Attractions: Statue of Liberty, Grand Canyon, White House, National Parks.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("New York City");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Los Angeles");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Chicago");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Miami");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Las Vegas");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("San Francisco");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Boston");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Houston");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Orlando");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Washington, D.C.");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Go to main menu");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Go back");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto canada(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("data:image/jpeg;base64,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"));
        sendPhoto.setCaption("Canada\n" +
                "Capital: Ottawa.\n" +
                "Known for: its natural landscapes, high standard of living, friendly people and multicultural society.\n" +
                "Attractions: Niagara Falls, Banff and Rocky Mountains, old town of Quebec.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Ottawa");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Toronto");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Vancouver");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Montreal");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Calgary");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Quebec");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Edmonton");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Halifax");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("\uD83D\uDD19 Go to main menu");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("\uD83D\uDD19 Go back");
        row4.add(button9);
        rowList.add(row4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto mexico(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://media.nomadicmatt.com/2022/mexicocitylove2.jpg"));
        sendPhoto.setCaption("Mexico\n" +
                "Capital: Mexico City.\n" +
                "Known for: the cultural heritage of the Mayans and Aztecs, the beaches of the Caribbean Sea, vibrant festivals (Day of the Dead), unique cuisine (tacos, guacamole).\n" +
                "Attractions: Chichen Itza, Teotihuacan, Cancun, Playa del Carmen.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Mexico City");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Guadalajara");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Cancun");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Puerto Vallarta");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Monterrey");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button1.setText("Merida");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Tijuana");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Oaxaca");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("San Miguel de Allende");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Playa del Carmen");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Go to main menu");
        row5.add(button8);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Go back");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto cuba(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQCH0Ghw2I5-6gCTunEAPK4mcGBWc2hTJ3yw&s"));
        sendPhoto.setCaption("Cuba\n" +
                "Capital: Havana.\n" +
                "Known for: its colonial cities, rich history, music (salsa), beaches and vintage cars.\n" +
                "Sights: Havana, Trinidad, Varadero, Viñales.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Havana");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Santiago de Cuba");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Trinidad");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Varadero");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Camagüey");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button1.setText("Cienfuegos");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Baracoa");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Holguin");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Santa Clara");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Matanzas");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("\uD83D\uDD19 Go to main menu");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("\uD83D\uDD19 Go back");
        row5.add(button11);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto newyork(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);

        String photoUrl = "https://media.gettyimages.com/id/599766748/photo/the-city-of-dreams-new-york-citys-skyline-at-twilight.jpg?b=1&s=170667a&w=0&k=20&c=TbuUPvEHzTUmcsrvElBmW10IDpvRW1_cDnD4pyv0XlA=";
        sendPhoto.setPhoto(new InputFile(photoUrl));

        String caption = "\uD83C\uDFD9 New York City is one of the largest and most famous cities in the world, "
                + "the cultural and economic center of the United States. The city is often called the \"Big Apple\" "
                + "and is a symbol of the American dream.\n\n"
                + "Interesting facts about New York:\n"
                + "\uD83D\uDCCD Location: On the east coast of the United States, in New York State.\n"
                + "\uD83C\uDFD8 Boroughs:\n"
                + "- Manhattan: Times Square, Central Park, Wall Street.\n"
                + "- Brooklyn: Cultural hub with Brooklyn Bridge.\n"
                + "- Queens: The most diverse borough.\n"
                + "- Bronx: Home of hip-hop and the Yankees.\n"
                + "- Staten Island: A quieter, greener borough.\n\n"
                + "Attractions:\n"
                + "- \uD83D\uDDFD Statue of Liberty: Icon of freedom.\n"
                + "- \uD83C\uDFDE Central Park: Green escape.\n"
                + "- \uD83C\uDFE2 Empire State Building: Global icon.\n"
                + "- Times Square: Energy-filled center.\n"
                + "- Metropolitan Museum of Art: World-class art.\n"
                + "- Broadway: Theater capital.";

        if (caption.length() > 1024) {
            caption = caption.substring(0, 1021) + "...";
        }
        sendPhoto.setCaption(caption);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(new KeyboardButton("John F. Kennedy International Airport, JFK"));
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("🔙 Go to main menu"));
        row1.add(new KeyboardButton("🔙 Go back"));
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }


    public SendPhoto losangeles(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://th.bing.com/th/id/R.b79ec3706941f0f1387105b3a7ed8f9b?rik=mwkMvGy92OQkIA&riu=http%3a%2f%2fwww.orangesmile.com%2fcommon%2fimg_final_large%2flos-angeles_sightseeing.jpg&ehk=To9NSX2MBPTqIfREymBJo0NvoStAdgZJRen6YbSj4YI%3d&risl=&pid=ImgRaw&r=0"));
        sendPhoto.setCaption("\uD83C\uDFD9 Los Angeles, often called the \"City of Angels\", is the second most populous city in the United States and one of the most popular metropolises in the world. It is a place where beaches, Hollywood and a dynamic culture combine.\n" +
                "\n" +
                "\uD83D\uDCCA Los Angeles Facts\n" +
                "\uD83D\uDCCD Location: On the West Coast of the United States, in the state of California.\n" +
                "\n" +
                "Main Attractions\n" +
                "⭐\uFE0F Hollywood: The heart of the film industry. Here you will find the famous Walk of Fame, TCL Chinese Theatre and the iconic \"Hollywood\" sign.\n" +
                "Santa Monica: A beautiful beach with an iconic pier, rides and restaurants.\n" +
                "Griffith Park and Observatory: A great place to stroll and watch the stars.\n" +
                "Downtown Los Angeles: Modern skyscrapers, the Museum of Contemporary Art (MOCA) and the Walt Disney Concert Hall.\n" +
                "Universal Studios: A theme park and studio where you can see how films are made.\n" +
                "Little Tokyo: A center for Japanese culture, cuisine and art.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Los Angeles International Airport, LAX");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go back");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }
    public SendPhoto chikago(Long chatId) {
        if (chatId == null) {
            throw new IllegalArgumentException("Chat ID cannot be null");
        }

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://th.bing.com/th/id/R.826cc2065d5fca170984a2f2103a3f6a?rik=eGanc7rO9NrA%2fg&pid=ImgRaw&r=0"));
        sendPhoto.setCaption("Chicago is the third-largest city in the United States and the largest economic and cultural center in the Midwest.\n" +
                "Known as the \"Windy City,\" Chicago is known for its rich architecture, musical history, and picturesque location on Lake Michigan.\n\n" +
                "🔹 **Top Attractions:**\n" +
                "- Millennium Park: Famous for \"The Bean.\"\n" +
                "- Chicago River: Scenic boat tours.\n" +
                "- Navy Pier: Restaurants, rides, Ferris wheel.\n" +
                "- Willis Tower: Skydeck with panoramic views.\n\n" +
                "🔹 **Food:**\n" +
                "- Deep-dish pizza.\n" +
                "- Chicago hot dogs.\n" +
                "- Italian beef sandwich.\n\n" +
                "Fun Facts:\n" +
                "- The Chicago River turns green every year on St. Patrick's Day.\n" +
                "- The city has served as the setting for many iconic films.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton("O'Hare International Airport, ORD"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton("\uD83D\uDD19 Go to main menu"));
        row2.add(new KeyboardButton("\uD83D\uDD19 Go back"));

        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }



    public SendPhoto miami(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("\uD83C\uDFD9 Miami is a sunny and vibrant city in the southeastern United States, known for its beaches, art deco architecture and vibrant Latin American culture. It is one of the most popular vacation and entertainment destinations, often called the \"Gateway to America\" \u200B\u200Bdue to its unique location and multicultural atmosphere.\n" +
                "\n" +
                "\uD83D\uDCCA Miami Key Facts\n" +
                "\uD83D\uDCCD Location: In southeastern Florida, on the Atlantic Ocean and Biscayne Bay coast.\n" +
                "\uD83C\uDFA1 Nickname: \"Magic City\" - due to its rapid growth and dynamism.\n" +
                "\n" +
                "Culture and Lifestyle\n" +
                "Miami is a city that never sleeps. It mixes American and Latin American traditions, creating a unique atmosphere. Spanish is as widely spoken as English, which emphasizes the multicultural nature of the city.\n" +
                "\n" +
                "\uD83D\uDD7A Music and Dance: Salsa, reggaeton and Latin jazz are heard here on every corner.\n" +
                "\uD83D\uDDBC Art: Miami hosts the famous Art Basel exhibition, one of the most prestigious international art fairs.\n" +
                "\n" +
                "Main attractions\n" +
                "\uD83C\uDFD6 Miami Beach: Snow-white beaches and the famous South Beach district with its stylish Art Deco architecture.\n" +
                "Wynwood Walls: An area with incredible street graffiti that has become a mecca for artists and photographers.\n" +
                "Cuban quarter Little Havana: The center of Cuban culture with the aroma of cigars, live music and the best cafes.\n" +
                "⛷ Biscayne Bay and Key Biscayne: The perfect place for swimming, kayaking and yachting.\n" +
                "\uD83C\uDFDE Zoo Miami and Fairchild Garden: Magnificent natural corners where you can see exotic flora and fauna.\n" +
                "\n" +
                "Food\n" +
                "Miami is famous for its culinary diversity, with strong Latin American influences:\n" +
                "\n" +
                "\uD83E\uDD6A Cuban Sandwich: Crusty bread, pork, ham, cheese, pickles and mustard.\n" +
                "\uD83E\uDD80 Stone Crab: A local delicacy, especially popular in season.\n" +
                "\uD83E\uDD67 Key Lime Pie: An iconic dessert made from limes grown in the Florida Keys.\n" +
                "\n" +
                "Fun Facts\n" +
                "Miami is the only major American city founded by a woman (Julia Tuttle).\n" +
                "It is one of the world's top cruise ship ports \uD83D\uDC68\u200D⚖\uFE0F.\n" +
                "Miami Beach regularly ranks among the best beaches in the world \uD83C\uDFD6."));

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row=new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Miami International Airport, MIA");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go back");
        row1.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }
    public SendPhoto lasvegas(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.luxurylifestylemag.co.uk/wp-content/uploads/2023/01/bigstock-Las-Vegas-At-Sunset-5181699.jpg"));
        sendPhoto.setCaption("\uD83C\uDFD9 Las Vegas is known as the entertainment capital of the world. Located in the Nevada desert, it is famous for its vibrant nightlife, luxurious resorts, casinos, and entertainment shows.\n" +
                "\n" +
                "\uD83D\uDCCA Key facts about Las Vegas\n" +
                "\uD83D\uDCCD Location: In southern Nevada, in the Mojave Desert.\n" +
                "\uD83C\uDFD9 Nickname: \"The Entertainment Capital of the World\" - renowned for its vibrant nightlife and casinos.\n" +
                "\n" +
                "Culture and lifestyle\n" +
                "Las Vegas is a city that never sleeps. Known for its extravagant shows, high-end shopping, and 24-hour nightlife, it offers a unique mix of luxury and excitement.\n" +
                "\n" +
                "\uD83C\uDFA4 Music and Dance: Las Vegas hosts some of the world's biggest music events and performances from top artists.\n" +
                "\uD83C\uDF8A Casinos: Famous for its world-class casinos, where you can try your luck in the games.\n" +
                "\uD83C\uDFD7 Shows: The city is home to some of the most iconic entertainment shows, including Cirque du Soleil and other famous performances.\n" +
                "\n" +
                "Top Attractions\n" +
                "\uD83C\uDFD6 The Strip: Las Vegas Boulevard, home to the most famous casinos, hotels, and restaurants.\n" +
                "\uD83C\uDFEC Bellagio Fountains: A stunning water and light show outside the Bellagio Hotel.\n" +
                "The Venetian: A luxury hotel and casino that replicates the canals of Venice.\n" +
                "\uD83C\uDF6C The High Roller: The world’s tallest observation wheel with stunning views of the city.\n" +
                "\uD83C\uDF80 Fremont Street: A historic street that offers a unique experience with vintage casinos and an LED canopy.\n" +
                "\n" +
                "Food\n" +
                "Las Vegas is a culinary destination, offering everything from affordable eateries to Michelin-starred restaurants:\n" +
                "\n" +
                "\uD83C\uDF5F Buffets: Famous for its extravagant buffets offering a wide variety of dishes.\n" +
                "\uD83C\uDF6F Fine Dining: World-renowned chefs operate restaurants offering upscale dining experiences.\n" +
                "\uD83C\uDF57 Unique Eateries: Las Vegas is known for unique themed restaurants, from Gordon Ramsay’s eateries to celebrity chef-driven restaurants.\n" +
                "\n" +
                "Fun Facts\n" +
                "\uD83D\uDEE3 The city is home to more than 70 casinos and over 150,000 hotel rooms.\n" +
                "\uD83D\uDCA1 The Las Vegas Strip is over 4 miles long.\n" +
                "\uD83C\uDFB6 Las Vegas hosts more than 30 million visitors annually.\n" +
                "Las Vegas is known for its iconic neon lights, which have become synonymous with the city’s image.\n");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Tickets \uD83C\uDFAB");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go back");
        row1.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto boston(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://th.bing.com/th/id/R.56f784f2cefb26fb347556673f064648?rik=%2bu7j1ECjZd1qsA&riu=http%3a%2f%2fupload.wikimedia.org%2fwikipedia%2fcommons%2fe%2fea%2fBoston_Financial_District_skyline.jpg&ehk=hXBUb6aylio6ZcGfFkXfSwJUErV9NmqkfEn0GQpg2u4%3d&risl=&pid=ImgRaw&r=0"));
        sendPhoto.setCaption("\uD83C\uDFD9 Boston is one of the oldest and most culturally significant cities in the United States, often called the \"cradle of the American Revolution.\" This East Coast city is known for its historic heritage, world-class educational institutions, and sophisticated atmosphere.\n" +
                "\n" +
                "Key Facts\n" +
                "\uD83D\uDCCD Location: On the Atlantic coast, in Massachusetts.\n" +
                "Nickname: \"Beantown\" - due to the popularity of bean dishes during the colonial era.\n" +
                "\uD83C\uDFEB Education: Boston is home to prestigious universities like Harvard and MIT.\n" +
                "\uD83C\uDFC0 Sports: Famous teams like the Boston Red Sox and Celtics.\n" +
                "Explore Boston and dive into its rich history and vibrant culture!");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tickets 🎫");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("🔙 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("🔙 Go back");
        row1.add(button2);

        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto houston(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://s.hdnux.com/photos/01/27/76/17/23061492/3/rawImage.jpg"));
        sendPhoto.setCaption("\uD83C\uDFD9 Houston is the fourth most populous city in the US and a special city in Texas. Known for its vibrant economy, space exploration, and Southern culture blended with modernity.\n" +
                "\n" +
                "\uD83D\uDCCD Location: Southeast Texas, near the Gulf Coast.\n" +
                "\uD83C\uDF0C Nickname: \"Space City\" (NASA Mission Control).\n" +
                "\uD83C\uDFDE Top attractions: Space Center Houston, Museum of Fine Arts, Hermann Park.\n" +
                "\uD83E\uDD69 Food: Texas BBQ, Tex-Mex, fresh Gulf seafood.\n" +
                "\uD83C\uDFE5 Fun fact: Houston has the largest medical center in the world.\n" +
                "Explore this diverse and dynamic city! \uD83D\uDE80");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton("Tickets 🎫");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton("🔙 Go to main menu");
        KeyboardButton button3 = new KeyboardButton("🔄 Go back");
        row1.add(button2);
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);

        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendPhoto sanfrancisco(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://th.bing.com/th/id/R.268beb2a8443c710deda0d8c54f26e04?rik=qLmNLRbzeylnuw&pid=ImgRaw&r=0"));
        sendPhoto.setCaption("\uD83C\uDFD9 San Francisco is a city on the West Coast of the United States known for its unique location, cultural diversity, and iconic landmarks. Situated on hills and surrounded by the waters of San Francisco Bay, the city is often called one of the most beautiful in the world.\n" +
                "\uD83D\uDCCA Key facts about San Francisco\n" +
                "\uD83D\uDCCD Location: On the northern tip of the San Francisco Peninsula in the state of California.\n" +
                "\uD83C\uDFD9 Nickname: \"The City by the Bay\".\n" +
                "\uD83D\uDC68\u200D\uD83D\uDCBB Tech: The city is located near Silicon Valley, making it an important tech hub.\n" +
                "\uD83C\uDFA4 Arts and Music: Contemporary art, theater, and music, from jazz to alternative rock, thrive here.\n" +
                "\uD83C\uDF09 Golden Gate Bridge: One of the most recognizable bridges in the world.\n" +
                "\uD83D\uDC6E\u200D♂ Alcatraz: A former prison on an island, now a popular tourist attraction.\n" +
                "Pier 39: An entertainment complex with shops, restaurants, and a colony of sea lions.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tickets \uD83C\uDFAB");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("🔙 Go back");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);

        return sendPhoto;
    }

    public SendMessage LAX(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please select the type of departure");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Flight to Los Angeles with tours \uD83E\uDDF3");
        row.add(button);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles on your own");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();

        button4.setText("\uD83D\uDD19 Go back");
        row1.add(button4);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesyourown(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose type");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Buy a roundtrip ticket to Los Angeles");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Buy a one-way ticket to Los Angeles only");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage losangelesdepyear(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select departure year");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 2025 year");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 2026 year");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles2025month(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select departure month");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 2025-January");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 2025-February");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 2025-March");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 2025-April");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 2025-May");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 2025-June");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 2025-July");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 2025-August");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 2025-September");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 2025-October");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 2025-November");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 2025-December");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button13 = new KeyboardButton();

        button13.setText("\uD83D\uDD19 Go to main menu");
        row6.add(button13);

        KeyboardButton button12 = new KeyboardButton();

        button12.setText("\uD83D\uDD19 Go back");
        row6.add(button12);
        rowList.add(row6);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles2026(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select departure month");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 2026-January");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25january(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 23.01.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Fly to Los Angeles in 25.01.2025");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 27.01.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 29.01.2025");
        row1.add(button3);
        rowList.add(row);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 31.01.2025");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();

        button5.setText("\uD83D\uDD19 Go to main menu");
        row3.add(button5);

        KeyboardButton button6 = new KeyboardButton();

        button6.setText("\uD83D\uDD19 Go back");
        row3.add(button6);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25faburyary(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.02.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.02.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.02.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.02.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.02.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.02.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.02.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.02.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.02.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.02.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.02.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.02.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.02.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.02.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("\uD83D\uDD19 Go to main menu");
        row7.add(button14);

        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go back");
        row7.add(button15);
        rowList.add(row7);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25march(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.03.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.03.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.03.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.03.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.03.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.03.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.03.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.03.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.03.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.03.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.03.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.03.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.03.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.03.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 30.03.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

       button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25april(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 01.04.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 03.04.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 05.04.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 07.04.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 09.04.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 11.04.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 13.04.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 15.04.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 17.04.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 19.04.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 21.04.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 23.04.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 25.04.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 27.04.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 29.04.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25may(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 01.05.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 03.05.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 05.05.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 07.05.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 09.05.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 11.05.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 13.05.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 15.05.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 17.05.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 19.05.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 21.05.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 23.05.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 25.05.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 27.05.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 29.05.2025");
        row7.add(button14);

        KeyboardButton button15 = new KeyboardButton();

        button15.setText("Fly to Los Angeles in 31.05.2025");

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button16);

        KeyboardButton button17 = new KeyboardButton();

        button17.setText("\uD83D\uDD19 Go back");
        row8.add(button17);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25june(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.06.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.06.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.06.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.06.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.06.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.06.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.06.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.06.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.06.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.06.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.06.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.06.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.06.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.06.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 30.06.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25jule(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.07.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.07.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.07.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.07.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.07.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.07.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.07.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.07.2025");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.07.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.07.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.07.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.07.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.07.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.07.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 30.07.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25august(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 01.08.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 03.08.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 05.08.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 07.08.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 09.08.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 11.08.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 13.08.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 15.08.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 17.08.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 19.08.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 21.08.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 23.08.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 25.08.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 27.08.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 29.08.2025");
        row7.add(button14);

        KeyboardButton button15 = new KeyboardButton();

        button15.setText("Fly to Los Angeles in 31.08.2025");

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button16);

        KeyboardButton button17 = new KeyboardButton();

        button17.setText("\uD83D\uDD19 Go back");
        row8.add(button17);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25september(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.09.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.09.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.09.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.09.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.09.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.09.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.09.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.09.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.09.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.09.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.09.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.09.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.09.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.09.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 30.09.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25oktober(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.10.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.10.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.10.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.10.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.10.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.10.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.10.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.10.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.10.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.10.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.10.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.10.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 26.10.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 28.10.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 30.10.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25november(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 01.11.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 03.11.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 05.11.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 07.11.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 09.11.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 11.11.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 13.11.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 15.11.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 17.11.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 19.11.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 21.11.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 23.11.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 25.11.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 27.11.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 29.11.2025");
        row7.add(button14);
        rowList.add(row7);

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button15 = new KeyboardButton();

        button15.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button15);

        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go back");
        row8.add(button16);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles25december(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 01.12.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 03.12.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 05.12.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 07.12.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 09.12.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 11.12.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 13.12.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 15.12.2025");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 17.12.2025");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 19.12.2025");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 21.12.2025");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 23.12.2025");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("Fly to Los Angeles in 25.12.2025");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("Fly to Los Angeles in 27.12.2025");
        row6.add(button13);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button14 = new KeyboardButton();

        button14.setText("Fly to Los Angeles in 29.12.2025");
        row7.add(button14);

        KeyboardButton button15 = new KeyboardButton();

        button15.setText("Fly to Los Angeles in 31.12.2025");

        KeyboardRow row8 = new KeyboardRow();
        KeyboardButton button16 = new KeyboardButton();

        button16.setText("\uD83D\uDD19 Go to main menu");
        row8.add(button16);

        KeyboardButton button17 = new KeyboardButton();

        button17.setText("\uD83D\uDD19 Go back");
        row8.add(button17);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeles26january(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Fly to Los Angeles in 02.01.2026");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Fly to Los Angeles in 04.01.2026");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("Fly to Los Angeles in 06.01.2026");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("Fly to Los Angeles in 08.01.2026");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("Fly to Los Angeles in 10.01.2026");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("Fly to Los Angeles in 12.01.2026");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("Fly to Los Angeles in 14.01.2026");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("Fly to Los Angeles in 16.01.2026");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("Fly to Los Angeles in 18.01.2026");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("Fly to Los Angeles in 20.01.2026");
        row4.add(button9);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();

        button10.setText("Fly to Los Angeles in 22.01.2026");
        row5.add(button10);

        KeyboardButton button11 = new KeyboardButton();

        button11.setText("Fly to Los Angeles in 24.01.2026");
        row5.add(button11);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();

        button12.setText("\uD83D\uDD19 Go to main menu");
        row6.add(button12);

        KeyboardButton button13 = new KeyboardButton();

        button13.setText("\uD83D\uDD19 Go back");
        row6.add(button13);
        rowList.add(row6);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage losangelesclass2501(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 25, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on January 25 until 15:15");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on January 25 until 15:15");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    } public SendMessage losangelesbusinessprice2501(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 25, the plane from Tashkent to Los Angeles departs at 15:15. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2501(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles departs at 15:15. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }public SendMessage losangelesclass2701(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 27, the plane from Tashkent to Los Angeles will depart at 17:30.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on January 27 until 17:30");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on January 27 until 17:35");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    } public SendMessage losangelesbusinessprice2701(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 27, the plane from Tashkent to Los Angeles departs at 17:35. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2701(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 27, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2301(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on January 23 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on January 23 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    } public SendMessage losangelesbusinessprice2301(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2301(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2901(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on January 23 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on January 23 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    } public SendMessage losangelesbusinessprice2901(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 29, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2901(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 29, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass3101(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 23, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on January 31 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on January 31 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    } public SendMessage losangelesbusinessprice3101(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 31, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice3101(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On January 31, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0202(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 02, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 02 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 02 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 02, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 02, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0402(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 04, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 04 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 04 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 04, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 04, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0602(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 02, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 06 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 06 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 06, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 06, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0802(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 08, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 08 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 08 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 08, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 08, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1002(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 10, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 10 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 10 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1002(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 10, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1002(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 10, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1202(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 12, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 12 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 12 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 12, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 12, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1402(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 14, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 14 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 14 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 14, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 14, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }public SendMessage losangelesclass1602(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 16, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 16 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 16 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 16, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 16, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1802(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 18, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 18 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 18 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 18, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 18, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2002(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 20, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 20 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 02 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2002(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 20, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2002(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 20, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2202(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 22, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 22 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 22 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 22, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2202(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 2, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2402(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 24, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 24 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 24 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 24, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2402(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 24, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2602(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 26, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 26 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 26 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 26, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2602(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 26, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2802(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 28, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on February 28 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on February 28 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Februart 28, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2802(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On Febryary 28, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0203(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 02, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 02 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 02 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 02, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 02, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0403(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 04, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 04 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 04 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 04, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 04, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0603(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 06, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 06 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 06 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 06, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 06, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }public SendMessage losangelesclass0803(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 08, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 08 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 08 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 08, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 08, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1003(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 10, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 10 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 10 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 10, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 10, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1203(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 12, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 12 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 12 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 12, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 12, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1403(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 14, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 14 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 14 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 14, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 14, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1603(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 06, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 16 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 16 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 16, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 16, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1803(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 18, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 18 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 18 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 18, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 18, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2003(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 20, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 20 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 20 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 20, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 20, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2203(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 22, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 22 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 22 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 22, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2203(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 22, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2403(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 24, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 24 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 24 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 24, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2403(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 24, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2603(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 26, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 26 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 26 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 26, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2603(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 26, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2803(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 28, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 28 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 28 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 28, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2803(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 28, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass3003(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On February 30, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on March 30 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on March 30 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice3003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 30, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice3003(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On March 30, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0104(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 01, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 01 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 01 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 01, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 01, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0304(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 01, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 03 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 03 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 03, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 03, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0504(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 05, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 05 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 05 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 05, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 05, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0704(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 07, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 07 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 07 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 07, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 07, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass0904(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 09, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 09 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 09 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice0904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 09, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice0904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 09, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1104(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 11, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 11 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 11 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 11, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 11, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1304(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 13, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 13 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 13 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 13, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 13, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1504(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 15, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 15 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 15 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 15, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 15, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1704(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 17, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 17 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 17 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 17, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 17, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass1904(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 19, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 19 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 19 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice1904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 1*, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice1904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 1*, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2104(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 21, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 21 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 21 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 21, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2104(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 21, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2304(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 23, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 23 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 23 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 23, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2304(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 23, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2504(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 25, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 25 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 25 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 25, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2504(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 25, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2704(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 27, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 27 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 27 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 27, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2704(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 27, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesclass2904(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 29, the plane from Tashkent to Los Angeles will depart at 23:50.");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Economy class on Tashkent-Los Angeles flight on April 29 until 23:50");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("Business class on Tashkent-Los Angeles flight on April 29 until 23:50");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("\uD83D\uDD19 Go back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangelesbusinessprice2904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 29, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in business class is $472.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage lpsangelesecoprice2904(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("On April 29, the plane from Tashkent to Los Angeles departs at 23:50. The cost of 1 seat in economy class is $345.\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage losangeleswithtours(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the date that suits you \uD83D\uDCC5");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("23.01.2025 to 28.01.2025");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();

        button1.setText("30.01.2025 to 04.02.2025");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();

        button2.setText("13.02.2025 to 18.02.2025");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();

        button3.setText("20.02.2025 to 25.02.2025");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();

        button4.setText("27.02.2025 to 04.03.2025");
        row2.add(button4);

        KeyboardButton button5 = new KeyboardButton();

        button5.setText("06.03.2025 to 11.03.2025");
        row2.add(button5);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();

        button6.setText("13.03.2025 to 18.03.2025");
        row3.add(button6);

        KeyboardButton button7 = new KeyboardButton();

        button7.setText("20.03.2025 to 25.03.2025");
        row3.add(button7);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();

        button8.setText("\uD83D\uDD19 Go to main menu");
        row4.add(button8);

        KeyboardButton button9 = new KeyboardButton();

        button9.setText("\uD83D\uDD19 Go back");
        row4.add(button9);
        rowList.add(row4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage january23(Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Information about tour in 23.01.2025\n\n\nGlamorous Los Angeles Tour\n" +
                "Discover the glamour of Hollywood and the California coast on our exclusive 5-star tour!\n" +
                "\n" +
                "Tour highlights:\n" +
                "\n" +
                "Accommodation (Hotel):\n" +
                "\n" +
                "Hotel name: Beverly Hills Hotel\n" +
                "Rating: 5 stars\n" +
                "Amenities: Spacious suites overlooking the Hollywood Hills, Art Deco pool, world-class spa, 24-hour concierge service, gourmet restaurants.\n" +
                "\n" +
                "Meals:\n" +
                "\n" +
                "Meals included: Breakfast and dinner.\n" +
                "Special features: Gourmet dinners by world-renowned chefs, special diet options (vegan, gluten-free, halal).\n" +
                "Entertainment and excursions:\n" +
                "\n" +
                "Day 1:\n" +
                "Personally escorted tour of the Hollywood Hills.\n" +
                "Walk of Fame and visit to the TCL Chinese Theatre.\n" +
                "Evening: Dinner at a Michelin-starred restaurant with a view of the city.\n" +
                "Day 2:\n" +
                "Morning on a luxury yacht along the Santa Monica coast.\n" +
                "Lunch at Nobu Malibu.\n" +
                "Evening stroll along the iconic Rodeo Drive.\n" +
                "Day 3:\n" +
                "Visit to Warner Bros Studios with VIP access to private pavilions.\n" +
                "Free time in the city center for shopping and individual walks.\n" +
                "Final dinner at a rooftop restaurant with panoramic views of Los Angeles.\n" +
                "Group leader:\n" +
                "\n" +
                "Name of the guide: Yuldashev Turahan.\n" +
                "Languages: English, Russian, Uzbek and Turkish.\n" +
                "Experience: Professional guide with 15 years of experience working with VIP tourists.\n" +
                "\n" +
                "Transportation:\n" +
                "\n" +
                "Flight: Abis Airlines (business class).\n" +
                "Transfer: Driver in a Mercedes Vito, available for travel around the city. (there will be 4 cars)\n" +
                "2 more police officers for escort");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Buy tickets to Los-Angeles with tour \uD83C\uDFAB");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();

        button2.setText("\uD83D\uDD19 Go back");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage priceLosangelestour (Long chatId) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("The price for Los-Angeles with 5 star round trip tour for 5 days is 2500$ per person\n You can pay the amount by coming to our office!\n" +
                "Location: Square Amir Temur, street Istikbal 4");

        ReplyKeyboardMarkup replyKeyboardMarkup=new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("Share location: Square Amir Temur, street Istikbal 4");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setText("\uD83D\uDD19 Go to main menu");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendLocation locationIstikbal4(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(41.312239);
        sendLocation.setLongitude(69.2852319);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();



        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendLocation.setReplyMarkup(replyKeyboardMarkup);

        return sendLocation;
    }

}