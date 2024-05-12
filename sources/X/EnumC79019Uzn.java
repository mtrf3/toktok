package X;

/* renamed from: X.Uzn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC79019Uzn {
    TERMINATOR(0, new int[]{0, 0, 0}),
    NUMERIC(1, new int[]{10, 12, 14}),
    ALPHANUMERIC(2, new int[]{9, 11, 13}),
    STRUCTURED_APPEND(3, new int[]{0, 0, 0}),
    BYTE(4, new int[]{8, 16, 16}),
    ECI(7, new int[]{0, 0, 0}),
    KANJI(8, new int[]{8, 10, 12}),
    FNC1_FIRST_POSITION(5, new int[]{0, 0, 0}),
    FNC1_SECOND_POSITION(9, new int[]{0, 0, 0}),
    HANZI(13, new int[]{8, 10, 12});

    public final int[] LJLIL;
    public final int LJLILLLLZI;

    public int getBits() {
        return this.LJLILLLLZI;
    }

    public static EnumC79019Uzn forBits(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i == 13) {
                                                return HANZI;
                                            }
                                            throw new IllegalArgumentException();
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    public static EnumC79019Uzn valueOf(String str) {
        return (EnumC79019Uzn) V0N.LJJJ(EnumC79019Uzn.class, str);
    }

    public int getCharacterCountBits(C79021Uzp c79021Uzp) {
        char c;
        int i = c79021Uzp.LIZ;
        if (i <= 9) {
            c = 0;
        } else if (i <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.LJLIL[c];
    }

    EnumC79019Uzn(int i, int[] iArr) {
        this.LJLIL = iArr;
        this.LJLILLLLZI = i;
    }
}
