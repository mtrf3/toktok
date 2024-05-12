package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CGw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31058CGw {
    public static final C31058CGw LIZ = new C31058CGw();

    public static void LIZJ(String orderId, boolean z) {
        o.LJIIIZ(orderId, "orderId");
        UFE.LIZIZ(z ? 1 : 0, C0JU.LIZIZ("livesdk_subscription_create_order_start", "normal_sub", "source", orderId, "order_id"), "type");
    }

    public static void LJ(String str, boolean z) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_query_status_start", "normal_sub", "source", str, "order_id");
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZIZ.LJIJJ(0, "is_supplement");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZIZ(long j, boolean z, String str) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_create_iap_order_success", "normal_sub", "source", str, "order_id");
        LIZIZ.LJIL("duration", Float.valueOf((float) j));
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZIZ.LJIJJ(0, "is_supplement");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJII(int i, long j, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_tpl_iap_success");
        LIZ2.LJIJJ("normal_sub", "source");
        LIZ2.LJIL("duration", Float.valueOf((float) j));
        LIZ2.LJIJJ(Integer.valueOf(i), "tpl_count");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJFF(int i, long j, boolean z, String str) {
        BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_query_status_success", "normal_sub", "source", str, "order_id");
        LIZIZ.LJIL("duration", Float.valueOf((float) j));
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZIZ.LJIJJ(Integer.valueOf(i), "retry_count");
        LIZIZ.LJIJJ(0, "is_supplement");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LJI(int i, int i2, long j, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscription_tpl_iap_fail");
        LIZ2.LJIJJ("normal_sub", "source");
        LIZ2.LJIL("duration", Float.valueOf((float) j));
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ2.LJIJJ(Integer.valueOf(i2), "detail_error_code");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(int i, int i2, long j, String orderId, boolean z) {
        o.LJIIIZ(orderId, "orderId");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_create_iap_order_fail", "normal_sub", "source", orderId, "order_id");
        LIZIZ.LJIJJ(Integer.valueOf(i), "error_code");
        LIZIZ.LJIL("duration", Float.valueOf((float) j));
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZIZ.LJIJJ(Integer.valueOf(i2), "detail_error_code");
        LIZIZ.LJIJJ(0, "is_supplement");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZLLL(int i, int i2, long j, String orderId, boolean z) {
        o.LJIIIZ(orderId, "orderId");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_subscription_query_status_fail", "normal_sub", "source", orderId, "order_id");
        LIZIZ.LJIJJ(Integer.valueOf(i2), "error_code");
        LIZIZ.LJIL("duration", Float.valueOf((float) j));
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "type");
        LIZIZ.LJIJJ(Integer.valueOf(i), "retry_count");
        LIZIZ.LJIJJ(0, "is_supplement");
        LIZIZ.LJJIIJZLJL();
    }
}
