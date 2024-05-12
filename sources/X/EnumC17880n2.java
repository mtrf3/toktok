package X;

/* renamed from: X.0n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC17880n2 {
    KV("kv"),
    FILE("file"),
    DB("db");

    public final String LJLIL;

    public static EnumC17880n2 valueOf(String str) {
        return (EnumC17880n2) V0N.LJJJ(EnumC17880n2.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC17880n2(String str) {
        this.LJLIL = str;
    }
}
