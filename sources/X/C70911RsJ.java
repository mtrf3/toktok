package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.RsJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70911RsJ extends AbstractC70875Rrj {
    public static final /* synthetic */ int LJIIIIZZ = 0;

    public C70911RsJ() {
        super("rd_tiktokec_product_detail_request_result", "lib_track_builtin_lane_rd");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq("page_name", new C71008Rts[0]), new C71006Rtq("task_type", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("is_v2", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("product_type", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("error_message", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("is_retry", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("template", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("entrance_info", new C71008Rts[0]), new C71006Rtq("ask_enter_from", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("action_type", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("enter_method", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("enter_from_merge", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("enter_from_info", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("follow_status", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("is_ad", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("author_id", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("product_id", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("product_id", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("start_click_to_now", new C71008Rts[0]), new C71006Rtq("source", new C71008Rts[0]), new C71006Rtq("source_from", new C71008Rts[0]), new C71006Rtq("product_source", new C71008Rts[0]), new C71006Rtq("api_duration", new C71008Rts[0]), new C71006Rtq("error_code", new C71008Rts[0]), new C71006Rtq("is_success", new C71008Rts[0]), new C71006Rtq("preload_type", new C71008Rts[0]));
    }

    @Override // X.AbstractC70875Rrj, X.AbstractC70995Rtf
    public final void LJFF(LaneParams params) {
        o.LJIIIZ(params, "params");
        if (o.LJ(params.get("is_success"), "no")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PDP_requestFailed: ErrCode ");
            LIZ.append(params.get("error_code"));
            LIZ.append(" ErrMsg ");
            LIZ.append(params.get("error_message"));
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
    }
}
