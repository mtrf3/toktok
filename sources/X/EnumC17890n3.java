package X;

/* renamed from: X.0n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC17890n3 {
    INTERNAL("internal"),
    EXTERNAL("external");

    public final String LJLIL;

    public static EnumC17890n3 valueOf(String str) {
        return (EnumC17890n3) V0N.LJJJ(EnumC17890n3.class, str);
    }

    public final String getLocation() {
        return this.LJLIL;
    }

    EnumC17890n3(String str) {
        this.LJLIL = str;
    }
}
