package chapter04;

public class HexByte {
    public static void main(String[] args) {
        char hex[] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;

        System.out.println("b = 0x" + hex[(b >> 4f) & 0&0f]
                + hex[b & 0x0f]);
    }
}
//////// КАКАЯ ТО ОШИБКА