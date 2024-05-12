package X;

/* renamed from: X.Evn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38003Evn {
    PUBLIC("public"),
    PROTECT("protected"),
    PRIVATE("private"),
    SECURE("secure");

    public final String LJLIL;

    public static EnumC38003Evn valueOf(String str) {
        return (EnumC38003Evn) V0N.LJJJ(EnumC38003Evn.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC38003Evn(String str) {
        this.LJLIL = str;
    }
}
