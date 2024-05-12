package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.goody_bag.GetGoodyBagHistoryResponse;

/* loaded from: classes17.dex */
public final class _GetGoodyBagHistoryResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagHistoryResponse.ResponseData> {
    public static GetGoodyBagHistoryResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGoodyBagHistoryResponse.ResponseData responseData = new GetGoodyBagHistoryResponse.ResponseData();
        responseData.history = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.nextOffset = q9h.LJIIJJI();
                        }
                    } else {
                        responseData.hasMore = Q9J.LIZ(q9h);
                    }
                } else {
                    responseData.history.add(_GetGoodyBagHistoryResponse_HistoryItem_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagHistoryResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
