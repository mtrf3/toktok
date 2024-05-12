package X;

/* renamed from: X.Evo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38004Evo {
    PUBLIC("public"),
    PRIVATE("private"),
    PROTECT("protect"),
    SECURE("secure");

    public final String LJLIL;

    public static EnumC38004Evo valueOf(String str) {
        return (EnumC38004Evo) V0N.LJJJ(EnumC38004Evo.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC38004Evo(String str) {
        this.LJLIL = str;
    }
}
