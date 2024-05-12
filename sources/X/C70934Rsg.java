package X;

/* renamed from: X.Rsg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70934Rsg extends AbstractC70875Rrj {
    public C70934Rsg() {
        super("tiktokec_cart_entrance_click", "lib_track_builtin_lane_business");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        QSQ qsq = new QSQ(19);
        qsq.LIZ(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("click_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("author_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("follow_status", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("is_ad", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("product_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("original_price", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("sale_price", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("notice_number", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("entrance_info", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("shop_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("product_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("has_rate", new C71008Rts(new C71005Rtp("page_name", "product_review"), new C71005Rtp("", null, 2, null))));
        qsq.LIZ(new C71006Rtq("rate", new C71008Rts(new C71005Rtp("page_name", "product_review"))));
        qsq.LIZ(new C71006Rtq("impression_tag_cnt", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("page_info", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("review_cnt", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LJ(C78248UnM.LJLIL);
        return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
    }
}
