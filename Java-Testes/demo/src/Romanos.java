package demo.src;
public class Romanos {

    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            throw new IllegalArgumentException("Invalid Roman numeral");
        }

        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = values[c - 'A'];

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }

            prevValue = value;
        }

        return total;
    }
}
