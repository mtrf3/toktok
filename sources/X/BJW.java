package X;

/* loaded from: classes6.dex */
public enum BJW {
    RANK_SWITCH_STATUS_HIDE(0),
    RANK_SWITCH_STATUS_ON(1),
    RANK_SWITCH_STATUS_OFF(2);

    public static final BJV Companion = new BJV();
    public final long LJLIL;

    public static BJW valueOf(String str) {
        return (BJW) V0N.LJJJ(BJW.class, str);
    }

    public final long getValue() {
        return this.LJLIL;
    }

    BJW(long j) {
        this.LJLIL = j;
    }
}
