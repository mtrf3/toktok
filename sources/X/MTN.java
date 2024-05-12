package X;

/* loaded from: classes10.dex */
public enum MTN {
    NO_CHANGE(0),
    CHANGE_WALL_TIME(1),
    CHANGE_UNREAD_COUNT(2),
    CHANGE_LAST_READ_TIME(4),
    CHANGE_UNREAD_COUNT_DECREASE(8);

    public final int LJLIL;

    public static MTN valueOf(String str) {
        return (MTN) V0N.LJJJ(MTN.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    MTN(int i) {
        this.LJLIL = i;
    }
}
