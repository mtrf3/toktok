package X;

/* renamed from: X.Evp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38005Evp {
    PUBLIC("public"),
    PRIVATE("private"),
    PROTECT("protect"),
    SECURE("secure");

    public final String LJLIL;

    public static EnumC38005Evp valueOf(String str) {
        return (EnumC38005Evp) V0N.LJJJ(EnumC38005Evp.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC38005Evp(String str) {
        this.LJLIL = str;
    }
}
