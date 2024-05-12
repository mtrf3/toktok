package X;

/* renamed from: X.WiX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC83045WiX {
    DARK("dark"),
    LIGHT("light"),
    UNKNOWN(null);

    public static final C83048Wia Companion = new C83048Wia();
    public final String LJLIL;

    public static EnumC83045WiX valueOf(String str) {
        return (EnumC83045WiX) V0N.LJJJ(EnumC83045WiX.class, str);
    }

    public final String getStyle() {
        return this.LJLIL;
    }

    EnumC83045WiX(String str) {
        this.LJLIL = str;
    }
}
