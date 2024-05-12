package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankLeagueTab_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankLeagueTab> {
    public static RankListV2Response.RankLeagueTab LIZIZ(Q9H q9h) {
        RankListV2Response.RankLeagueTab rankLeagueTab = new RankListV2Response.RankLeagueTab();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                rankLeagueTab.briefDescription = _Text_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            rankLeagueTab.titleText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankLeagueTab.leaguePhase = q9h.LJIIJ();
                    }
                } else {
                    rankLeagueTab.rankType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankLeagueTab;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankLeagueTab LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
