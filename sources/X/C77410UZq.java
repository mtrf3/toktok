package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.UZq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77410UZq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ() {
        C77411UZr.LIZ = true;
        C77411UZr.LIZIZ = C30725C4b.LIZ();
    }

    public static void LIZ(String exchangeEntrance, String str, boolean z) {
        String str2;
        o.LJIIIZ(exchangeEntrance, "exchangeEntrance");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_recharge_gift_exchange_page_start_loading");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str2, "is_automatic_exchange");
        C06490Nh.LIZLLL(LIZ2, exchangeEntrance, "exchange_entrance", str, "charge_reason");
    }

    public static void LIZJ(String exchangeEntrance, String str, boolean z) {
        o.LJIIIZ(exchangeEntrance, "exchangeEntrance");
        UFE.LIZIZ(z ? 1 : 0, C0JU.LIZIZ("livesdk_recharge_click_gift_exchange_second_confirm", exchangeEntrance, "exchange_entrance", str, "charge_reason"), "is_exchange_only");
    }

    public static void LIZLLL(String exchangeEntrance, String str, boolean z, boolean z2) {
        o.LJIIIZ(exchangeEntrance, "exchangeEntrance");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_recharge_click_gift_exchange", exchangeEntrance, "exchange_entrance", str, "charge_reason");
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_need_exchange_second_confirm");
        LIZIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_need_w9");
        LIZIZ.LJJIIJZLJL();
    }

    public static void LIZIZ(long j, String str, boolean z, String str2, String str3) {
        String str4;
        BZI LIZIZ = C0JU.LIZIZ("livesdk_recharge_gift_exchange_result_return", str, "exchange_entrance", str2, "charge_reason");
        LIZIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_exchange_only");
        if (str3 == null) {
            str4 = "success";
        } else {
            str4 = "failed";
        }
        LIZIZ.LJIJJ(str4, "status");
        if (str3 == null) {
            str3 = "";
        }
        LIZIZ.LJIJJ(str3, "error_code");
        LIZIZ.LJIJJ(Long.valueOf(j), "loading_duration");
        LIZIZ.LJJIIJZLJL();
    }
}
