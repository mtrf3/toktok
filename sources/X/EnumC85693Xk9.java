package X;

/* renamed from: X.Xk9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85693Xk9 {
    EMAIL("email"),
    PASSWORD("password"),
    SMS("sms");

    public final String LJLIL;

    public static EnumC85693Xk9 valueOf(String str) {
        return (EnumC85693Xk9) V0N.LJJJ(EnumC85693Xk9.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC85693Xk9(String str) {
        this.LJLIL = str;
    }
}
