package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.game.GameSubActNewAudienceListResponse;

/* loaded from: classes17.dex */
public final class _GameSubActNewAudienceListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GameSubActNewAudienceListResponse.ResponseData> {
    public static GameSubActNewAudienceListResponse.ResponseData LIZIZ(Q9H q9h) {
        GameSubActNewAudienceListResponse.ResponseData responseData = new GameSubActNewAudienceListResponse.ResponseData();
        responseData.newAudienceList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.newAudienceList.add(_Audience_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GameSubActNewAudienceListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
