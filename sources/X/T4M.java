package X;

/* loaded from: classes13.dex */
public enum T4M {
    LOAD_STICKER_PRIORITY(-100),
    DEFAULT_STICKER_PRIORITY(0),
    LOOP_CHAIN_STICKER_PRIORITY(100),
    NOTICE_STICKER_PRIORITY(200),
    HIGH_INTERCEPT_STICKER_PRIORITY(1000);

    public final int LJLIL;

    public static T4M valueOf(String str) {
        return (T4M) V0N.LJJJ(T4M.class, str);
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    T4M(int i) {
        this.LJLIL = i;
    }
}
