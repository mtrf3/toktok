package X;

/* renamed from: X.SFl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC71789SFl {
    NOT_ENABLED("-1"),
    UNKNOWN("-1"),
    WEAK("1"),
    MEDIUM("2"),
    STRONG("3");

    public final String LJLIL;

    public static EnumC71789SFl valueOf(String str) {
        return (EnumC71789SFl) V0N.LJJJ(EnumC71789SFl.class, str);
    }

    public final boolean isSetPasswordAllowed() {
        if (this == MEDIUM || this == STRONG || this == NOT_ENABLED) {
            return true;
        }
        return false;
    }

    public final String getEtValue() {
        return this.LJLIL;
    }

    EnumC71789SFl(String str) {
        this.LJLIL = str;
    }
}
