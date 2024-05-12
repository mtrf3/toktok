package X;

/* loaded from: classes9.dex */
public enum ILV {
    SUCCESS(1),
    FAILURE(2),
    SWITCH_VIDEO(3),
    TRANSLATION_TURNED_OFF(4),
    ADDED_TO_DO_NOT_TRANSLATE(5),
    UNKNOWN(6);

    public final int LJLIL;

    public static ILV valueOf(String str) {
        return (ILV) V0N.LJJJ(ILV.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    ILV(int i) {
        this.LJLIL = i;
    }
}
