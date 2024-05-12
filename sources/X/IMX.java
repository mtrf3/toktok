package X;

/* loaded from: classes9.dex */
public enum IMX {
    DIGITAL_1("1"),
    DIGITAL_2("2"),
    DIGITAL_3("3"),
    UNKNOWN("100");

    public final String LJLIL;

    public static IMX valueOf(String str) {
        return (IMX) V0N.LJJJ(IMX.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    IMX(String str) {
        this.LJLIL = str;
    }
}
