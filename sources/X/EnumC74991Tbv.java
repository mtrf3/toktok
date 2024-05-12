package X;

/* renamed from: X.Tbv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74991Tbv {
    FLOAT("panel_float"),
    FLOAT_FIX("panel_fix"),
    GRID_FLOAT("grid_float"),
    GRID_FIX("grid_fix"),
    NORMAL("normal"),
    GRID_FLOAT_COHOST_OLD("grid_float_cohost_old"),
    ZOOM_PANEL("zoom_panel"),
    ZOOM_GRID_GUEST("zoom_grid_guest"),
    ZOOM_GRID_ANCHOR("zoom_grid_anchor");

    public final String LJLIL;

    public static EnumC74991Tbv valueOf(String str) {
        return (EnumC74991Tbv) V0N.LJJJ(EnumC74991Tbv.class, str);
    }

    public final String getBusinessType() {
        return this.LJLIL;
    }

    EnumC74991Tbv(String str) {
        this.LJLIL = str;
    }
}
