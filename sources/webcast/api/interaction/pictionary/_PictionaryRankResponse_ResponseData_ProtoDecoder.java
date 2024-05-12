package webcast.api.interaction.pictionary;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PictionaryInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._PictionaryStatistics_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.interaction.pictionary.PictionaryRankResponse;

/* loaded from: classes6.dex */
public final class _PictionaryRankResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PictionaryRankResponse.ResponseData> {
    public static PictionaryRankResponse.ResponseData LIZIZ(Q9H q9h) {
        PictionaryRankResponse.ResponseData responseData = new PictionaryRankResponse.ResponseData();
        responseData.rankList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        responseData.pictionaryInfo = _PictionaryInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        responseData.pictionaryStatistics = _PictionaryStatistics_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        responseData.rankList.add(_RankEntry_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        responseData.isCorrect = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        responseData.currUserRank = q9h.LJIIJJI();
                        break;
                    case 6:
                        responseData.currUserDuration = q9h.LJIIJJI();
                        break;
                    case 7:
                        responseData.currUser = _User_ProtoDecoder.LIZIZ(q9h);
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
    public final PictionaryRankResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
