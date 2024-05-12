package X;

/* renamed from: X.DwK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC35488DwK {
    BUSINESS_BLOCK("panel_blocked"),
    DEPENDENCIES_NOT_READY("dependencies_not_ready");

    public final String LJLIL;

    public static EnumC35488DwK valueOf(String str) {
        return (EnumC35488DwK) V0N.LJJJ(EnumC35488DwK.class, str);
    }

    public final String getFailReason() {
        return this.LJLIL;
    }

    EnumC35488DwK(String str) {
        this.LJLIL = str;
    }
}
