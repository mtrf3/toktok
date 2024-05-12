package X;

/* renamed from: X.PSt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64491PSt extends AbstractC79017Uzl {
    public static final char[] LJLIL;
    public static final char[] LJLILLLLZI = {'T', 'N', '*', 'E'};
    public static final char[] LJLJI = {'/', ':', '+', '.'};
    public static final char LJLJJI;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        LJLIL = cArr;
        LJLJJI = cArr[0];
    }

    @Override // X.AbstractC79017Uzl
    public final boolean[] LIZIZ(String str) {
        int i;
        int length = str.length();
        char c = LJLJJI;
        if (length < 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c);
            LIZ.append(str);
            LIZ.append(c);
            str = X1D.LIZIZ(LIZ);
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = LJLIL;
            boolean LLLLZ = C64492PSu.LLLLZ(upperCase, cArr);
            boolean LLLLZ2 = C64492PSu.LLLLZ(upperCase2, cArr);
            char[] cArr2 = LJLILLLLZI;
            boolean LLLLZ3 = C64492PSu.LLLLZ(upperCase, cArr2);
            boolean LLLLZ4 = C64492PSu.LLLLZ(upperCase2, cArr2);
            if (LLLLZ) {
                if (!LLLLZ2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (LLLLZ3) {
                if (!LLLLZ4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!LLLLZ2 && !LLLLZ4) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c);
                LIZ2.append(str);
                LIZ2.append(c);
                str = X1D.LIZIZ(LIZ2);
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (C64492PSu.LLLLZ(str.charAt(i3), LJLJI)) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i2];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C64492PSu.LJLIL;
                if (i6 < cArr3.length) {
                    if (upperCase3 == cArr3[i6]) {
                        i = C64492PSu.LJLILLLLZI[i6];
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                boolean z2 = false;
                if (i7 >= 7) {
                    break;
                }
                while (true) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) != 0 && !z2) {
                        z2 = true;
                    }
                }
                z = !z;
                i7++;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
