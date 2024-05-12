package X;

/* renamed from: X.M0p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56115M0p {
    STAGE_CLICK_TAB("click_tab"),
    STAGE_CREATE_LOAD_CACHE("load_cache"),
    STAGE_CREATE_SPARKVIEW("create_sparkview"),
    STAGE_SPARK_PREKIT_CREATE("spark_prekit_create"),
    STAGE_SPARK_POSTKIT_CREATED("spark_postkit_created"),
    STAGE_SPARK_LOAD_START("spark_load_start"),
    STAGE_SPARK_RUNTIME_READY("spark_runtime_ready"),
    STAGE_SPARK_LOAD_FINISH("spark_load_finish"),
    STAGE_SPARK_LOAD_FAILED("spark_load_failed"),
    STAGE_SPARK_LOAD_TEMPLATE_START("spark_load_template_start"),
    STAGE_SPARK_LOAD_TEMPLATE_FINISH("spark_load_template_finish"),
    STAGE_LYNX_PAGE_START("lynx_page_start"),
    STAGE_LYNX_RUNTIME_READY("lynx_runtime_ready"),
    STAGE_LYNX_LOAD_SUCCESS("lynx_load_success"),
    STAGE_LYNX_FIRST_SCREEN("lynx_first_screen"),
    STAGE_LYNX_RECEIVED_ERROR("lynx_received_error");

    public final String LJLIL;

    public static EnumC56115M0p valueOf(String str) {
        return (EnumC56115M0p) V0N.LJJJ(EnumC56115M0p.class, str);
    }

    public final String getStage() {
        return this.LJLIL;
    }

    EnumC56115M0p(String str) {
        this.LJLIL = str;
    }
}
