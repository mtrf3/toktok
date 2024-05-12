package X;

/* renamed from: X.XkA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC85694XkA {
    EMAIL("email"),
    PASSWORD("password"),
    SMS("sms");

    public final String LJLIL;

    public static EnumC85694XkA valueOf(String str) {
        return (EnumC85694XkA) V0N.LJJJ(EnumC85694XkA.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC85694XkA(String str) {
        this.LJLIL = str;
    }
}
