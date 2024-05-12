package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.game.AnchorSearchResponse;

/* loaded from: classes17.dex */
public final class _AnchorSearchResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<AnchorSearchResponse.ResponseData> {
    public static AnchorSearchResponse.ResponseData LIZIZ(Q9H q9h) {
        AnchorSearchResponse.ResponseData responseData = new AnchorSearchResponse.ResponseData();
        responseData.searchResult = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.isEnd = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.searchResult.add(_AnchorTagListResult_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorSearchResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
