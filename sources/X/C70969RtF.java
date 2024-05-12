package X;

/* renamed from: X.RtF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70969RtF extends AbstractC70875Rrj {
    public final /* synthetic */ int LJIIIIZZ;

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        int i = this.LJIIIIZZ;
        C71006Rtq[] c71006RtqArr = C78248UnM.LJLIL;
        switch (i) {
            case 0:
                QSQ qsq = new QSQ(5);
                qsq.LIZ(new C71006Rtq("EVENT_ORIGIN_FEATURE", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("enter_from", new C71008Rts[0]));
                qsq.LIZ(new C71006Rtq("previous_page", new C71008Rts[0]));
                qsq.LJ(c71006RtqArr);
                return new C71007Rtr((C71006Rtq[]) qsq.LJIIIZ(new C71006Rtq[qsq.LJFF()]));
            default:
                QSQ qsq2 = new QSQ(9);
                qsq2.LIZ(new C71006Rtq("page_name", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("previous_page", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("chat_type", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("from_user_id", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("to_user_id", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("conversation_id", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("tips_type", new C71008Rts[0]));
                qsq2.LIZ(new C71006Rtq("tips_title", new C71008Rts[0]));
                qsq2.LJ(c71006RtqArr);
                return new C71007Rtr((C71006Rtq[]) qsq2.LJIIIZ(new C71006Rtq[qsq2.LJFF()]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70969RtF(int i) {
        super("tiktokec_ecommerce_centre_entry_click", "lib_track_builtin_lane_business");
        this.LJIIIIZZ = i;
        if (i != 1) {
        } else {
            super("tiktokec_tips_show", "lib_track_builtin_lane_business");
        }
    }
}
