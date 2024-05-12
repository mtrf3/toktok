package X;

/* loaded from: classes9.dex */
public enum IMS {
    DIGITAL_0(0),
    DIGITAL_1(1);

    public final int LJLIL;

    public static IMS valueOf(String str) {
        return (IMS) V0N.LJJJ(IMS.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    IMS(int i) {
        this.LJLIL = i;
    }
}
