package X;

/* renamed from: X.Lzi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56082Lzi {
    STAGE_CLICK_TAB("click_tab"),
    STAGE_CREATE_VIEW_START("create_view_start"),
    STAGE_CREATE_VIEW_END("create_view_end"),
    STAGE_LOAD_DATA("load_data"),
    STAGE_SET_DATA_STATE("set_data_state"),
    STAGE_UPDATE_DATA("update_data");

    public final String LJLIL;

    public static EnumC56082Lzi valueOf(String str) {
        return (EnumC56082Lzi) V0N.LJJJ(EnumC56082Lzi.class, str);
    }

    public final String getStage() {
        return this.LJLIL;
    }

    EnumC56082Lzi(String str) {
        this.LJLIL = str;
    }
}
