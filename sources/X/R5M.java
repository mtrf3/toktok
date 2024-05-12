package X;

/* loaded from: classes12.dex */
public enum R5M {
    DEFAULT(0),
    LOGIN(1),
    SIGN_UP(2),
    SETTING(3),
    FYP_POP_UP(4),
    INBOX_POP_UP(5),
    PROFILE_POP_UP(6),
    LOGOUT(7),
    SMART_LOCK(8),
    REFRESH(9);

    public final int LJLIL;

    public static R5M valueOf(String str) {
        return (R5M) V0N.LJJJ(R5M.class, str);
    }

    public final int getServerCode() {
        return this.LJLIL;
    }

    R5M(int i) {
        this.LJLIL = i;
    }
}
