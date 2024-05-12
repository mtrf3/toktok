package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_WeeklyRankExtra_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.WeeklyRankExtra> {
    public static RankListV2Response.WeeklyRankExtra LIZIZ(Q9H q9h) {
        RankListV2Response.WeeklyRankExtra weeklyRankExtra = new RankListV2Response.WeeklyRankExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        weeklyRankExtra.lastWeekRank = q9h.LJIIJJI();
                    }
                } else {
                    weeklyRankExtra.currWeekRank = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return weeklyRankExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.WeeklyRankExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
