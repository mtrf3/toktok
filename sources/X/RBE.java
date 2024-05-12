package X;

/* loaded from: classes12.dex */
public enum RBE {
    ALL_CHARS_VALID_RULE,
    LENGTH_RANGE_RULE,
    LETTER_AND_NUMBER_CONTAINED,
    SPECIAL_CHAR_CONTAINED;

    public static RBE valueOf(String str) {
        return (RBE) V0N.LJJJ(RBE.class, str);
    }
}
