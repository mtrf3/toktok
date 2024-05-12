package X;

/* loaded from: classes9.dex */
public enum IMH {
    DIGITAL_0(0),
    DIGITAL_1(1);

    public final int LJLIL;

    public static IMH valueOf(String str) {
        return (IMH) V0N.LJJJ(IMH.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    IMH(int i) {
        this.LJLIL = i;
    }
}
