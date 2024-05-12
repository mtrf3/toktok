package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansRankListRequest_ProtoDecoder implements InterfaceC31105CIr<FansRankListRequest> {
    @Override // X.InterfaceC31105CIr
    public final FansRankListRequest LIZ(Q9H q9h) {
        FansRankListRequest fansRankListRequest = new FansRankListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fansRankListRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        fansRankListRequest.secAnchorId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        fansRankListRequest.rankType = q9h.LJIIJ();
                        break;
                    case 4:
                        fansRankListRequest.scene = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        fansRankListRequest.offset = q9h.LJIIJJI();
                        break;
                    case 6:
                        fansRankListRequest.count = q9h.LJIIJJI();
                        break;
                    case 7:
                        fansRankListRequest.onlineOpt = q9h.LJIIJ();
                        break;
                    case 8:
                        fansRankListRequest.fansDataSection = q9h.LJIIJ();
                        break;
                    case 9:
                        fansRankListRequest.withDiscordEntrance = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fansRankListRequest;
            }
        }
    }
}
