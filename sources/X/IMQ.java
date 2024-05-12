package X;

/* loaded from: classes9.dex */
public enum IMQ {
    DIGITAL_0(0),
    DIGITAL_1(1);

    public final int LJLIL;

    public static IMQ valueOf(String str) {
        return (IMQ) V0N.LJJJ(IMQ.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    IMQ(int i) {
        this.LJLIL = i;
    }
}
