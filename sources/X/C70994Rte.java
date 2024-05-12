package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Rte, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70994Rte extends AbstractC70875Rrj {
    public C70994Rte() {
        super("rd_tiktokec_pdp_recommend_preload", "lib_track_builtin_lane_rd");
    }

    @Override // X.AbstractC71002Rtm
    public final C71007Rtr LIZ() {
        return new C71007Rtr(new C71006Rtq("duration", new C71008Rts[0]), new C71006Rtq("is_success", new C71008Rts[0]), new C71006Rtq("err_msg", new C71008Rts(new C71005Rtp("is_success", CardStruct.IStatusCode.DEFAULT))));
    }
}
