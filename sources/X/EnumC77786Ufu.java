package X;

/* renamed from: X.Ufu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC77786Ufu {
    TYPE_WEB_URL(0),
    TYPE_DEEPLINK_FALLBACK_STORE(1),
    TYPE_DEEPLINK_FALLBACK_WEB(2),
    TYPE_BROWSER_WEB(4);

    public final int LJLIL;

    public static EnumC77786Ufu valueOf(String str) {
        return (EnumC77786Ufu) V0N.LJJJ(EnumC77786Ufu.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC77786Ufu(int i) {
        this.LJLIL = i;
    }
}
