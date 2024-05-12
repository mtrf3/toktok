package X;

/* loaded from: classes9.dex */
public enum IMD {
    DIGITAL_1(1),
    DIGITAL_2(2);

    public final int LJLIL;

    public static IMD valueOf(String str) {
        return (IMD) V0N.LJJJ(IMD.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    IMD(int i) {
        this.LJLIL = i;
    }
}
