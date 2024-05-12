package X;

/* renamed from: X.XjB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85633XjB {
    EMAIL("email"),
    PASSWORD("password"),
    SMS("sms");

    public final String LJLIL;

    public static EnumC85633XjB valueOf(String str) {
        return (EnumC85633XjB) V0N.LJJJ(EnumC85633XjB.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC85633XjB(String str) {
        this.LJLIL = str;
    }
}
