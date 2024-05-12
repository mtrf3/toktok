package X;

/* loaded from: classes10.dex */
public enum L8G {
    JSON_PARSE_ERROR(1, "json_parse_error"),
    TOP_TAB_CONFIG_INVALID(2, "top_tab_config_invalid"),
    BOTTOM_TAB_CONFIG_INVALID(3, "bottom_tab_config_invalid"),
    LEFT_CORNER_CONFIG_INVALID(4, "left_corner_config_invalid"),
    RIGHT_CORNER_CONFIG_INVALID(4, "right_corner_config_invalid"),
    TAB_DUPLICATE(5, "tab_duplicate"),
    MISS_FYP(6, "miss_fyp"),
    WRONG_FIRST_BOTTOM_TAB(7, "wrong_first_bottom_tab"),
    WRONG_THIRD_BOTTOM_TAB(8, "wrong_third_bottom_tab"),
    BOTTOM_TAB_SIZE_ERROR(9, "bottom_tab_size_error"),
    UNKNOWN_REASON(10, "un_known_reason");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static L8G valueOf(String str) {
        return (L8G) V0N.LJJJ(L8G.class, str);
    }

    public final int getReasonCode() {
        return this.LJLIL;
    }

    public final String getReasonStr() {
        return this.LJLILLLLZI;
    }

    L8G(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
