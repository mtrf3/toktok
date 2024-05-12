package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.game.model._EsportsTournamentInfo_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameActivity_ProtoDecoder;
import com.bytedance.android.livesdk.game.model._GameInfo_ProtoDecoder;
import webcast.api.partnership.GameDetailResponse;

/* loaded from: classes17.dex */
public final class _GameDetailResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameDetailResponse.ResponseData> {
    public static GameDetailResponse.ResponseData LIZIZ(Q9H q9h) {
        GameDetailResponse.ResponseData responseData = new GameDetailResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.esportsTournamentInfo = _EsportsTournamentInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.gameActivity = _GameActivity_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.gameInfo = _GameInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameDetailResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
