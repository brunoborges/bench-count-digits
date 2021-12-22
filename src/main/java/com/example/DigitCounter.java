package com.example;

public class DigitCounter {

    public static final int MAX_DIGIT_COUNT = 19;

    public int countDigitsByStringLength(long number) {
        return String.valueOf(number).length();
    }

    public int countDigitsByLogarithmic(long number) {
        return (int) Math.log10(number) + 1;
    }

    public int countDigitsByDivision(long number) {
        int length = 0;
        while (number > 0) {
            number = number / 10;
            length++;
        }
        return length;
    }

    public int countDigitsByWhile(long number) {
        int length = 0;
        while (number > 0) {
            number = number / 10;
            length++;
        }
        return length;
    }

    public int countDigitsByFor(long number) {
        int length = 0;
        for (long i = 0; i < number; i++) {
            number = number / 10;
            length++;
        }
        if (number > 0) {
            length++;
        }
        return length;
    }

    public int countDigitsByDoWhile(long number) {
        int length = 0;
        do {
            number = number / 10;
            length++;
        } while (number > 0);
        return length;
    }

    public int countDigitsByPowersOfTwo(long number) {
        int length = 1;
        if (number >= 10000000000000000L) {
            length += 16;
            number /= 10000000000000000L;
        }
        if (number >= 100000000) {
            length += 8;
            number /= 100000000;
        }
        if (number >= 10000) {
            length += 4;
            number /= 10000;
        }
        if (number >= 100) {
            length += 2;
            number /= 100;
        }
        if (number >= 10) {
            length += 1;
        }
        return length;
    }

    public int countDigitsByDivideAndConquer(long number) {
        if (number < 100000) {
            if (number < 100) {
                if (number < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (number < 1000) {
                    return 3;
                } else {
                    if (number < 10000) {
                        return 4;
                    } else {
                        return 5;
                    }
                }
            }
        } else {
            if (number < 10000000) {
                if (number < 1000000) {
                    return 6;
                } else {
                    return 7;
                }
            } else {
                if (number < 100000000) {
                    return 8;
                } else {
                    if (number < 1000000000) {
                        return 9;
                    } else {
                        if (number < 10000000000L) { 
                            return 10;
                        } else if (number < 100000000000L) {
                            return 11;
                        } else if (number < 1000000000000L) {
                            return 12;
                        } else if (number < 10000000000000L) {
                            return 13;
                        } else if (number < 100000000000000L) {
                            return 14;
                        } else if (number < 1000000000000000L) {
                            return 15;
                        } else if (number < 10000000000000000L) {
                            return 16;
                        } else if (number < 100000000000000000L) {
                            return 17;
                        } else if (number < 1000000000000000000L) {
                            return 18;
                        } else {
                            return 19;
                        }
                    }
                }
            }
        }
    }
}
