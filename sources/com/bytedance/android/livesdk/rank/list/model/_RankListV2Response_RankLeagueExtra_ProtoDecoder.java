package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankLeagueExtra_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankLeagueExtra> {
    public static RankListV2Response.RankLeagueExtra LIZIZ(Q9H q9h) {
        RankListV2Response.RankLeagueExtra rankLeagueExtra = new RankListV2Response.RankLeagueExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    rankLeagueExtra.pathToDaily = _RankListV2Response_PathToOtherList_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                rankLeagueExtra.briefDescription = _RankListV2Response_BriefDescription_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            rankLeagueExtra.rankLeagueHistoryEntrance = _RankListV2Response_HistoryEntrance_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankLeagueExtra.rankLeagueHeader = _RankListV2Response_RankLeagueHeader_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rankLeagueExtra.rankLeagueBase = _RankListV2Response_RankLeagueBase_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rankLeagueExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankLeagueExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
