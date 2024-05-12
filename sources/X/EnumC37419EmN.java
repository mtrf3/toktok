package X;

/* renamed from: X.EmN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC37419EmN {
    PREFETCH_ENABLED("prefetch_enabled"),
    LOADING_ENABLED("native_loading_enabled"),
    NSR_ENABLED("nsr_enabled"),
    NSR_HIT("nsr_hit"),
    SNAPSHOT_ENABLED("snapshot_enabled"),
    SNAPSHOT_HIT("snapshot_hit");

    public final String LJLIL;

    public String getValue() {
        return this.LJLIL;
    }

    public static EnumC37419EmN valueOf(String str) {
        return (EnumC37419EmN) V0N.LJJJ(EnumC37419EmN.class, str);
    }

    EnumC37419EmN(String str) {
        this.LJLIL = str;
    }
}
