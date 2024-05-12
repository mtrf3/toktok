package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RtL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70975RtL extends AbstractC70875Rrj {
    public final /* synthetic */ int LJIIIIZZ = 0;

    public C70975RtL() {
        super("rd_tiktokec_anchor_product_detail_duration", "lib_track_builtin_lane_rd");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        switch (this.LJIIIIZZ) {
            case 0:
                return new C71007Rtr(new C71006Rtq("style", new C71008Rts[0]), new C71006Rtq("retry_count", new C71008Rts[0]), new C71006Rtq("start_click_to_now", new C71008Rts[0]), new C71006Rtq("load_success", new C71008Rts[0]), new C71006Rtq("product_id", new C71008Rts[0]), new C71006Rtq("entrance_info", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("product_type", new C71008Rts[0]), new C71006Rtq("source_page_type", new C71008Rts[0]), new C71006Rtq("is_v2", new C71008Rts[0]));
            default:
                return new C71007Rtr(new C71006Rtq[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70975RtL(String lane) {
        super("get_chain_params", lane);
        o.LJIIIZ(lane, "lane");
    }
}
