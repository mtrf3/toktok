package X;

/* renamed from: X.Xk8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85692Xk8 {
    EMAIL("email"),
    PASSWORD("password"),
    SMS("sms");

    public final String LJLIL;

    public static EnumC85692Xk8 valueOf(String str) {
        return (EnumC85692Xk8) V0N.LJJJ(EnumC85692Xk8.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC85692Xk8(String str) {
        this.LJLIL = str;
    }
}
