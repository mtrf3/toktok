package X;

/* renamed from: X.Rsr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70945Rsr extends AbstractC70875Rrj {
    public final /* synthetic */ int LJIIIIZZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        int i = this.LJIIIIZZ;
        C71006Rtq[] c71006RtqArr = C78248UnM.LJLIL;
        switch (i) {
            case 0:
                QSQ qsq = new QSQ(12);
                qsq.LIZ(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("entrance_info", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("sub_page_name", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("is_success", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("fail_reason", new C71008Rts(new C71005Rtp("", null, 2, null))));
                qsq.LIZ(new C71006Rtq("is_retry", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("duration", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("previous_page", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("location", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("fill_type", new C71008Rts[0]));
                qsq.LJ(c71006RtqArr);
                return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
            default:
                QSQ qsq2 = new QSQ(4);
                qsq2.LIZ(new C71006Rtq("video_id", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("video_whole_duration", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("module_name", new C71008Rts[0]));
                qsq2.LJ(c71006RtqArr);
                return new C71007Rtr((C71006Rtq[]) qsq2.LJIIIZ(new C71006Rtq[qsq2.LJFF()]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70945Rsr(int i) {
        super("tiktokec_auto_location_result", "lib_track_builtin_lane_business");
        this.LJIIIIZZ = i;
        if (i != 1) {
        } else {
            super("tiktokec_product_detail_page_video_click", "lib_track_builtin_lane_business");
        }
    }
}
