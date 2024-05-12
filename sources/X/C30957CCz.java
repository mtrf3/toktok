package X;

/* renamed from: X.CCz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30957CCz {
    public static int LJIIIIZZ(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int LJ(int i) {
        return CD6.LIZ(i) + 1;
    }

    public static int LJIIJJI(String str) {
        long j;
        char c;
        if (str == null || str.length() == 0) {
            return 0;
        }
        long j2 = 0;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    if (i2 < str.length()) {
                        c = str.charAt(i2);
                    } else {
                        c = 0;
                    }
                    if (charAt > 56319 || c < 56320 || c > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return (int) j2;
    }

    public static int LJFF(int i, Boolean bool) {
        if (bool == null) {
            return 0;
        }
        bool.booleanValue();
        return CD6.LIZ(i) + 1;
    }

    public static int LJI(int i, int i2) {
        int i3;
        if (i2 >= 0) {
            i3 = CD6.LIZIZ(i2);
        } else {
            i3 = 10;
        }
        return CD6.LIZ(i) + i3;
    }

    public static int LJII(int i, Integer num) {
        int i2;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            i2 = CD6.LIZIZ(intValue);
        } else {
            i2 = 10;
        }
        return CD6.LIZ(i) + i2;
    }

    public static int LJIIIZ(int i, long j) {
        return CD6.LIZ(i) + LJIIIIZZ(j);
    }

    public static int LJIIJ(int i, Long l) {
        if (l == null) {
            return 0;
        }
        return CD6.LIZ(i) + LJIIIIZZ(l.longValue());
    }

    public static int LJIIL(int i, String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int LJIIJJI = LJIIJJI(str);
        return CD6.LIZ(i) + CD6.LIZIZ(LJIIJJI) + LJIIJJI;
    }

    public static void LIZ(CD6 cd6, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        cd6.LIZLLL(i, 0);
        cd6.LJ(bool.booleanValue() ? 1 : 0);
    }

    public static void LIZIZ(CD6 cd6, int i, Integer num) {
        if (num == null) {
            return;
        }
        cd6.LIZLLL(i, 0);
        cd6.LIZJ(num.intValue());
    }

    public static void LIZJ(CD6 cd6, int i, Long l) {
        if (l == null) {
            return;
        }
        cd6.LIZLLL(i, 0);
        cd6.LJFF(l.longValue());
    }

    public static void LIZLLL(CD6 cd6, int i, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        cd6.LIZLLL(i, 2);
        cd6.LJ(LJIIJJI(str));
        cd6.LIZ.LLIIIZ(str);
    }
}
