package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_DailyAndRookieExtra_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.DailyAndRookieExtra> {
    public static RankListV2Response.DailyAndRookieExtra LIZIZ(Q9H q9h) {
        RankListV2Response.DailyAndRookieExtra dailyAndRookieExtra = new RankListV2Response.DailyAndRookieExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    dailyAndRookieExtra.pathToLeague = _RankListV2Response_PathToOtherList_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dailyAndRookieExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.DailyAndRookieExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
