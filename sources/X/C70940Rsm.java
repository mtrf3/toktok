package X;

/* renamed from: X.Rsm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70940Rsm extends AbstractC70875Rrj {
    public C70940Rsm() {
        super("tiktokec_photo_show", "lib_track_builtin_lane_business");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        QSQ qsq = new QSQ(17);
        qsq.LIZ(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("review_id", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("review_author_id", new C71008Rts(new C71005Rtp("page_name", "product_review"))));
        qsq.LIZ(new C71006Rtq("product_id", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("sku_id", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("page_show_type", new C71008Rts(new C71005Rtp("page_name", "product_review"), new C71005Rtp("page_name", "shop_review"), new C71005Rtp("", null, 2, null))));
        qsq.LIZ(new C71006Rtq("previous_page", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("photo_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("is_self", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("rank", new C71008Rts(new C71005Rtp("page_name", "product_review")), new C71008Rts(new C71005Rtp("page_name", "shop_review"))));
        qsq.LIZ(new C71006Rtq("biz_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("review_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("rank", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("photo_show_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("is_self", new C71008Rts[0]));
        qsq.LJ(C78248UnM.LJLIL);
        return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
    }
}
