package X;

/* renamed from: X.2ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC61742ba {
    NO_ISOLATE("no_isolate"),
    EC_SINGLE_ISOLATE("ec_single_isolate"),
    EC_DOUBLE_ISOLATE("ec_double_isolate"),
    ENTRANCE_ISOLATE("entrance_isolate");

    public final String LJLIL;

    public static EnumC61742ba valueOf(String str) {
        return (EnumC61742ba) V0N.LJJJ(EnumC61742ba.class, str);
    }

    public final String getStrategy() {
        return this.LJLIL;
    }

    EnumC61742ba(String str) {
        this.LJLIL = str;
    }
}
