package X;

/* renamed from: X.Lzh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56081Lzh {
    STAGE_CLICK_TAB("click_tab"),
    STAGE_CREATE_VIEW_START("create_view_start"),
    STAGE_CREATE_VIEW_END("create_view_end"),
    STAGE_LOAD_DATA("load_data"),
    STAGE_SET_DATA_STATE("set_data_state"),
    STAGE_UPDATE_DATA("update_data");

    public final String LJLIL;

    public static EnumC56081Lzh valueOf(String str) {
        return (EnumC56081Lzh) V0N.LJJJ(EnumC56081Lzh.class, str);
    }

    public final String getStage() {
        return this.LJLIL;
    }

    EnumC56081Lzh(String str) {
        this.LJLIL = str;
    }
}
