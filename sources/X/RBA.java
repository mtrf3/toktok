package X;

/* loaded from: classes12.dex */
public /* synthetic */ class RBA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[RBE.values().length];
        try {
            iArr[RBE.LETTER_AND_NUMBER_CONTAINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RBE.SPECIAL_CHAR_CONTAINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RBE.LENGTH_RANGE_RULE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RBE.ALL_CHARS_VALID_RULE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
