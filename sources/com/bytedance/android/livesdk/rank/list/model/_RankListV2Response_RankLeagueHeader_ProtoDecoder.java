package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankLeagueHeader_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankLeagueHeader> {
    public static RankListV2Response.RankLeagueHeader LIZIZ(Q9H q9h) {
        RankListV2Response.RankLeagueHeader rankLeagueHeader = new RankListV2Response.RankLeagueHeader();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    rankLeagueHeader.leagueTabInfo = _RankListV2Response_LeagueTabInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rankLeagueHeader;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankLeagueHeader LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
