package X;

/* loaded from: classes16.dex */
public enum XJ6 {
    UNKNOWN(0),
    CHANGE_EMAIL(1),
    UNBIND_EMAIL(2),
    CHANGE_MOBILE(3),
    UNBIND_MOBILE(4);

    public final int LJLIL;

    public static XJ6 valueOf(String str) {
        return (XJ6) V0N.LJJJ(XJ6.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    XJ6(int i) {
        this.LJLIL = i;
    }
}
