package X;

/* renamed from: X.M0k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56110M0k {
    LYNX_ON_PAGE_START("lynx_on_page_start"),
    LYNX_ON_LOAD_SUCCESS("lynx_on_load_success"),
    LYNX_ON_FIRST_SCREEN("lynx_on_first_screen"),
    LYNX_ON_RUNTIME_READY("lynx_on_runtime_ready"),
    LYNX_ON_RECEIVED_ERROR("lynx_on_received_error"),
    LYNX_ON_TIMING_SETUP("lynx_on_timing_setup"),
    LYNX_ON_TIMING_UPDATE("lynx_on_timing_update"),
    SPARK_ON_PREKIT_CREATE("spark_on_prekit_create"),
    SPARK_ON_POSTKIT_CREATED("spark_on_postkit_created"),
    SPARK_ON_LOAD_START("spark_on_load_start"),
    SPARK_ON_RUNTIME_READY("spark_on_runtime_ready"),
    SPARK_ON_LOAD_FINISH("spark_on_load_finish"),
    SPARK_ON_LOAD_FAILED("spark_on_load_failed");

    public final String LJLIL;

    public static EnumC56110M0k valueOf(String str) {
        return (EnumC56110M0k) V0N.LJJJ(EnumC56110M0k.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC56110M0k(String str) {
        this.LJLIL = str;
    }
}
