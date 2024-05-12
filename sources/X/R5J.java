package X;

/* loaded from: classes12.dex */
public enum R5J {
    DEFAULT(0),
    AUTO_LOGIN(1),
    ONE_CLICK_LOGIN(2),
    SMART_LOCK(3);

    public final int LJLIL;

    public static R5J valueOf(String str) {
        return (R5J) V0N.LJJJ(R5J.class, str);
    }

    public final int getServerCode() {
        return this.LJLIL;
    }

    R5J(int i) {
        this.LJLIL = i;
    }
}
