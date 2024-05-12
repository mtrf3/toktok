package X;

/* renamed from: X.Rsh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70935Rsh extends AbstractC70875Rrj {
    public final /* synthetic */ int LJIIIIZZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        switch (this.LJIIIIZZ) {
            case 0:
                return new C71007Rtr(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]), new C71006Rtq("page_name", new C71008Rts[0]), new C71006Rtq("actionsheet_name", new C71008Rts[0]), new C71006Rtq("previous_page", new C71008Rts(new C71005Rtp("", null, 2, null))), new C71006Rtq("entrance_info", new C71008Rts[0]), new C71006Rtq("source_page_type", new C71008Rts[0]), new C71006Rtq("product_id", new C71008Rts[0]), new C71006Rtq("quit_type", new C71008Rts[0]), new C71006Rtq("stay_time", new C71008Rts[0]), new C71006Rtq("is_load_data", new C71008Rts[0]), new C71006Rtq("default_option", new C71008Rts(new C71005Rtp("actionsheet_name", "select_star")), new C71008Rts(new C71005Rtp("actionsheet_name", "sort_by"))), new C71006Rtq("review_cnt", new C71008Rts(new C71005Rtp("actionsheet_name", "select_star")), new C71008Rts(new C71005Rtp("actionsheet_name", "sort_by"))), new C71006Rtq("enter_from_info", new C71008Rts[0]), new C71006Rtq("shipping_price", new C71008Rts[0]), new C71006Rtq("shipping_currency", new C71008Rts[0]));
            default:
                QSQ qsq = new QSQ(2);
                qsq.LIZ(new C71006Rtq("entrance_zone", new C71008Rts[0]));
                qsq.LJ(C78248UnM.LJLIL);
                return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70935Rsh(int i) {
        super("tiktokec_stay_actionsheet", "lib_track_builtin_lane_business");
        this.LJIIIIZZ = i;
        if (i != 1) {
        } else {
            super("tiktokec_add_on_entrance_click", "lib_track_builtin_lane_business");
        }
    }
}
