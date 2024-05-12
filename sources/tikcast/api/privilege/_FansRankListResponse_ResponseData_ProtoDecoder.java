package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.api.privilege.FansRankListResponse;
import webcast.data._DiscordEntrance_ProtoDecoder;
import webcast.data._SlotFansRecord_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansRankListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<FansRankListResponse.ResponseData> {
    public static FansRankListResponse.ResponseData LIZIZ(Q9H q9h) {
        FansRankListResponse.ResponseData responseData = new FansRankListResponse.ResponseData();
        responseData.ranks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.ranks.add(_FansRankListResponse_Rank_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        responseData.nextOffset = q9h.LJIIJJI();
                        break;
                    case 3:
                        responseData.hasMore = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        responseData.total = q9h.LJIIJJI();
                        break;
                    case 5:
                        responseData.slotFansRecord = _SlotFansRecord_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        responseData.discordEntrance = _DiscordEntrance_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansRankListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
