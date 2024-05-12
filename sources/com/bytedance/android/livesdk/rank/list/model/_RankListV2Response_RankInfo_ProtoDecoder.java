package com.bytedance.android.livesdk.rank.list.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;

/* loaded from: classes14.dex */
public final class _RankListV2Response_RankInfo_ProtoDecoder implements InterfaceC31105CIr<RankListV2Response.RankInfo> {
    public static RankListV2Response.RankInfo LIZIZ(Q9H q9h) {
        RankListV2Response.RankInfo rankInfo = new RankListV2Response.RankInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankInfo.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rankInfo.rank = q9h.LJIIJJI();
                        break;
                    case 3:
                        rankInfo.rankStr = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        rankInfo.score = q9h.LJIIJJI();
                        break;
                    case 5:
                        rankInfo.scoreDescription = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        rankInfo.roomId = q9h.LJIIJJI();
                        break;
                    case 7:
                        rankInfo.gap = _RankListV2Response_Gap_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        rankInfo.weeklyRankExtra = _RankListV2Response_WeeklyRankExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        rankInfo.weeklyRookieRankExtra = _RankListV2Response_WeeklyRookieRankExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankListV2Response.RankInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
