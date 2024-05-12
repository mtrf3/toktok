package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Rsd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70931Rsd extends AbstractC70875Rrj {
    public C70931Rsd() {
        super("tiktokec_confirm_cart", "lib_track_builtin_lane_business");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]), new C71006Rtq("source_button", new C71008Rts[0]), new C71006Rtq("page_name", new C71008Rts[0]), new C71006Rtq("previous_page", new C71008Rts[0]), new C71006Rtq("author_id", new C71008Rts[0]), new C71006Rtq("cart_form", new C71008Rts[0]), new C71006Rtq("source_content_id", new C71008Rts[0]), new C71006Rtq("enter_from_info", new C71008Rts[0]), new C71006Rtq("product_id", new C71008Rts[0]), new C71006Rtq("sku_id", new C71008Rts[0]), new C71006Rtq("is_single_sku", new C71008Rts[0]), new C71006Rtq("product_source", new C71008Rts[0]), new C71006Rtq("source_from", new C71008Rts[0]), new C71006Rtq("source", new C71008Rts[0]), new C71006Rtq("entrance_info", new C71008Rts[0]), new C71006Rtq("page_show_type", new C71008Rts[0]), new C71006Rtq("source_page_type", new C71008Rts[0]), new C71006Rtq("product_type", new C71008Rts[0]), new C71006Rtq("original_price", new C71008Rts[0]), new C71006Rtq("sales_price", new C71008Rts[0]), new C71006Rtq("sale_price", new C71008Rts[0]), new C71006Rtq("follow_status", new C71008Rts[0]), new C71006Rtq("campaign_id", new C71008Rts[0]), new C71006Rtq("campaign_type", new C71008Rts[0]), new C71006Rtq("campaign_user_tag", new C71008Rts[0]), new C71006Rtq("campaign_channel", new C71008Rts[0]), new C71006Rtq("campaign_cost_role", new C71008Rts[0]), new C71006Rtq("bundle_id", new C71008Rts(new C71005Rtp("source_page_type", "bundle_deal"))), new C71006Rtq("is_discounted_bundle_deal", new C71008Rts(new C71005Rtp("source_page_type", "bundle_deal"))), new C71006Rtq("source_module", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("rec_params", new C71008Rts[0]), new C71006Rtq("request_id", new C71008Rts[0]), new C71006Rtq("first_source_page", new C71008Rts[0]), new C71006Rtq("first_track_id", new C71008Rts[0]), new C71006Rtq("parent_track_id", new C71008Rts[0]), new C71006Rtq("parent_product_id", new C71008Rts[0]), new C71006Rtq("track_id", new C71008Rts[0]), new C71006Rtq("parent_request_id", new C71008Rts(new C71005Rtp("", null, 2, null))));
    }

    @Override // X.AbstractC70995Rtf
    public final void LJI(LaneParams laneParams, LaneParams preChainParams) {
        o.LJIIIZ(preChainParams, "preChainParams");
        if (o.LJ(laneParams.get("source_page_type"), "buy_together")) {
            laneParams.put("parent_track_id", preChainParams.get("track_id"));
            laneParams.put("parent_request_id", preChainParams.get("request_id"));
            laneParams.put("parent_product_id", preChainParams.get("product_id"));
        }
    }
}
