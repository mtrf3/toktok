package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import tikcast.api.privilege.FansRankListResponse;

/* loaded from: classes17.dex */
public final class _FansRankListResponse_Rank_ProtoDecoder implements InterfaceC31105CIr<FansRankListResponse.Rank> {
    public static FansRankListResponse.Rank LIZIZ(Q9H q9h) {
        FansRankListResponse.Rank rank = new FansRankListResponse.Rank();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rank.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rank.rank = q9h.LJIIJJI();
                        break;
                    case 3:
                        rank.fansScore = q9h.LJIIJJI();
                        break;
                    case 4:
                        rank.fansLevel = q9h.LJIIJJI();
                        break;
                    case 5:
                        rank.userLevel = q9h.LJIIJJI();
                        break;
                    case 6:
                        rank.fansTagForFans = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        rank.fansTagForAnchor = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        rank.liveOnline = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        rank.roomId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rank;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansRankListResponse.Rank LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
