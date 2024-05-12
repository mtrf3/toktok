package X;

/* renamed from: X.6ER, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C6ER {
    SUBSCRIBE_VIDEO_CHECK_TYPE(1),
    POSSIBLE_SUBSCRIBE_LONG_VIDEO_CHECK_TYPE(0),
    LONG_VIDEO_CHECK_TYPE(2),
    ECOMMERCE_CHECK_TYPE(3),
    SHORT_VIDEO_CHECK_TYPE(4);

    public final int LJLIL;

    public static C6ER valueOf(String str) {
        return (C6ER) V0N.LJJJ(C6ER.class, str);
    }

    public final int getCheckType() {
        return this.LJLIL;
    }

    C6ER(int i) {
        this.LJLIL = i;
    }
}
