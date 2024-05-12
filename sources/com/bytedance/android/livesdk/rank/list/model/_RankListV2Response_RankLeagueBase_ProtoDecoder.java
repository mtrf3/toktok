package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankLeagueBase_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankLeagueBase> {
    public static RankListV2Response.RankLeagueBase LIZIZ(Q9H q9h) {
        RankListV2Response.RankLeagueBase rankLeagueBase = new RankListV2Response.RankLeagueBase();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankLeagueBase.rankType = q9h.LJIIJ();
                        break;
                    case 2:
                        rankLeagueBase.showLeaguePhase = q9h.LJIIJ();
                        break;
                    case 3:
                        rankLeagueBase.showLeaguePhaseStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        rankLeagueBase.ifShowPromotionEffect = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        rankLeagueBase.leaguePeriod = q9h.LJIIJJI();
                        break;
                    case 6:
                        rankLeagueBase.showLeaguePhaseIndicator = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankLeagueBase;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankLeagueBase LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
