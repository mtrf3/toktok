package X;

/* renamed from: X.a4q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92072a4q {
    CHANGE("CHANGE_PIN"),
    FORGOT("FORGOT_PIN"),
    REGISTER("REGISTER_PIN");

    public final String LJLIL;

    public static EnumC92072a4q valueOf(String str) {
        return (EnumC92072a4q) V0N.LJJJ(EnumC92072a4q.class, str);
    }

    public final String getMode() {
        return this.LJLIL;
    }

    EnumC92072a4q(String str) {
        this.LJLIL = str;
    }
}
