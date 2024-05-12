package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goody_bag.model._GoodyBagWinnerInfo_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;

/* loaded from: classes6.dex */
public final class _GetGoodyBagWinnerListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagWinnerListResponse.ResponseData> {
    public static GetGoodyBagWinnerListResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGoodyBagWinnerListResponse.ResponseData responseData = new GetGoodyBagWinnerListResponse.ResponseData();
        responseData.winners = new ArrayList();
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
                    responseData.winners.add(_GoodyBagWinnerInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagWinnerListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
