package X;

import com.google.gson.internal.b;

/* loaded from: classes13.dex */
public final class S53 {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static final /* synthetic */ int LIZLLL = 0;

    public static void LIZ(long j, String str, String str2) {
        S5A.LIZIZ(j, "template_product_list", "notice_board_edit", str, str2);
    }

    public static void LIZIZ(boolean z, long j, boolean z2, boolean z3, Integer num, String str) {
        b.LJJIJIIJIL("rd_ec_live_request_result", new OSZ("page_name", "template_product_list"), new OSZ("previous_page", "notice_board_edit"), new OSZ("start_click_to_now", Long.valueOf(System.currentTimeMillis() - LIZ)), new OSZ("api_path", "/aweme/v1/oec/affiliate/live/product/list"), new OSZ("request_method", "get"), new OSZ("request_type", 1), new OSZ("is_retry", Boolean.valueOf(z)), new OSZ("api_duration", Long.valueOf(j)), new OSZ("is_success", Boolean.valueOf(z2)), new OSZ("is_empty", Boolean.valueOf(z3)), new OSZ("error_code", num), new OSZ("error_msg", str));
        if (z2) {
            if (!z) {
                LIZ(System.currentTimeMillis() - LIZIZ, "did_load", "load_success");
                return;
            } else {
                LIZ(System.currentTimeMillis() - LIZJ, "load_error", "load_success");
                return;
            }
        }
        if (!z) {
            LIZ(System.currentTimeMillis() - LIZIZ, "did_load", "load_error");
        } else {
            LIZ(System.currentTimeMillis() - LIZJ, "load_error", "load_error");
        }
        LIZJ = System.currentTimeMillis();
    }
}
