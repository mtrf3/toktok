package X;

/* loaded from: classes16.dex */
public enum XFP {
    CONSUME_DONE,
    CONSUME_WAIT_DATA,
    CONSUME_FAIL,
    CONSUME_END;

    public static XFP valueOf(String str) {
        return (XFP) V0N.LJJJ(XFP.class, str);
    }
}
