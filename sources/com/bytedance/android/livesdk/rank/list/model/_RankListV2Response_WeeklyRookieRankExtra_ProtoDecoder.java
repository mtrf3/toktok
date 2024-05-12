package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_WeeklyRookieRankExtra_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.WeeklyRookieRankExtra> {
    public static RankListV2Response.WeeklyRookieRankExtra LIZIZ(Q9H q9h) {
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra = new RankListV2Response.WeeklyRookieRankExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        weeklyRookieRankExtra.LastRankAnchorBeyondThresholdValue = q9h.LJIIJJI();
                    }
                } else {
                    weeklyRookieRankExtra.lastrankanchorbeyondthreshold = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return weeklyRookieRankExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.WeeklyRookieRankExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
