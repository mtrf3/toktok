package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _RankListV2Response_LeagueTabInfo_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.LeagueTabInfo> {
    public static RankListV2Response.LeagueTabInfo LIZIZ(Q9H q9h) {
        RankListV2Response.LeagueTabInfo leagueTabInfo = new RankListV2Response.LeagueTabInfo();
        leagueTabInfo.standardTab = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        leagueTabInfo.standardTab.add(_RankListV2Response_RankLeagueTab_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    leagueTabInfo.superTab = _RankListV2Response_RankLeagueTab_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return leagueTabInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.LeagueTabInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
