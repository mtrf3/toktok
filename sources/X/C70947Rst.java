package X;

/* renamed from: X.Rst, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70947Rst extends AbstractC70875Rrj {
    public C70947Rst() {
        super("tiktokec_toast_show", "lib_track_builtin_lane_business");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        QSQ qsq = new QSQ(12);
        qsq.LIZ(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("toast_name", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("previous_page", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("entrance_info", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("sku_id", new C71008Rts(new C71005Rtp("", null, 2, null))));
        qsq.LIZ(new C71006Rtq("product_id", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("quantity_limit", new C71008Rts(new C71005Rtp("toast_name", "discount_quantity_limitation")), new C71008Rts(new C71005Rtp("toast_name", "min_quantity_limitation")), new C71008Rts(new C71005Rtp("toast_name", "first_order_limit_addcart"))));
        qsq.LIZ(new C71006Rtq("ttf_page_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("biz_type", new C71008Rts[0]));
        qsq.LIZ(new C71006Rtq("toast_type", new C71008Rts[0]));
        qsq.LJ(C78248UnM.LJLIL);
        return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
    }
}
