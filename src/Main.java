public class Main {
//  Надо создать свои классы исключений на каждую ситуацию:
//  - Проверить содержит ли номер документа последовательность abc.
//  - Проверить начинается ли номер документа с последовательности 555.
//  - Проверить заканчивается ли номер документа на последовательность 1a2b.
//    Если номер документа не удовлетворяет условию - то "бросить" исключение.
//    В методе класса, в котором будут вызываться эти методы для демонстрации работы,
//    перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя
//    (сообщение на консоль).

    public static void main(String[] args) {
        String document = "1234-jdk-5678-jvm-9q8w";

        try {
            StringInformator.getLetterSequence(document);
        } catch (ABCException e) {
            e.printStackTrace();
        }
        try {
            StringInformator.getStartDigitSequence(document);
        } catch (NumericException e) {
            e.printStackTrace();
        }
        try {
            StringInformator.getEndsDigitSequence(document);
        } catch (SubsequenceException e) {
            e.printStackTrace();
        }
    }
}
