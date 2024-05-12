package X;

/* loaded from: classes16.dex */
public enum XA2 {
    ORIGIN,
    ZIP;

    public static XA2 valueOf(String str) {
        return (XA2) V0N.LJJJ(XA2.class, str);
    }

    public XA2 fromValue(int i) {
        for (XA2 xa2 : values()) {
            if (xa2.ordinal() == i) {
                return xa2;
            }
        }
        return ORIGIN;
    }
}
