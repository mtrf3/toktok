package webcast.api.ranklist;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_DailyAndRookieExtra_ProtoDecoder;
import com.bytedance.android.livesdk.rank.list.model._RankListV2Response_RankLeagueExtra_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _RankExtraInfo_ProtoDecoder implements InterfaceC31105CIr<RankExtraInfo> {
    public static RankExtraInfo LIZIZ(Q9H q9h) {
        RankExtraInfo rankExtraInfo = new RankExtraInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            rankExtraInfo.rankLeagueExtra = _RankListV2Response_RankLeagueExtra_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankExtraInfo.dailyAndRookieExtra = _RankListV2Response_DailyAndRookieExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rankExtraInfo.hallOfFameRankExtra = _HallOfFameRankExtra_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rankExtraInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankExtraInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
