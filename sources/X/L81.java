package X;

/* loaded from: classes10.dex */
public enum L81 {
    ERROR_REASON(1, "error_reason"),
    ERROR_STAGE(2, "error_stage"),
    FCP_ORIGIN_DATA(3, "fcp_origin_data"),
    ERROR_TAB_PART(5, "error_tab_part"),
    OPERATION_TYPE(6, "operation_type"),
    USE_FCP_SUCCESS(7, "use_fcp_success"),
    USE_PRELOAD_SUCCESS(8, "use_preload_success"),
    HIT_FCP_TAB_EXP(9, "hit_fcp_tab_exp");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static L81 valueOf(String str) {
        return (L81) V0N.LJJJ(L81.class, str);
    }

    public final String getCateGoryStr() {
        return this.LJLILLLLZI;
    }

    public final int getCategoryCode() {
        return this.LJLIL;
    }

    L81(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
