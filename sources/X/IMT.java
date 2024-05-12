package X;

/* loaded from: classes9.dex */
public enum IMT {
    DIGITAL_0(0),
    DIGITAL_1(1),
    DIGITAL_2(2);

    public final int LJLIL;

    public static IMT valueOf(String str) {
        return (IMT) V0N.LJJJ(IMT.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    IMT(int i) {
        this.LJLIL = i;
    }
}
