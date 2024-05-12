package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;

/* loaded from: classes6.dex */
public final class _GetGoodyBagLotteryResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagLotteryResponse.ResponseData> {
    public static GetGoodyBagLotteryResponse.ResponseData LIZIZ(Q9H q9h) {
        GetGoodyBagLotteryResponse.ResponseData responseData = new GetGoodyBagLotteryResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.coins = q9h.LJIIJ();
                    }
                } else {
                    responseData.win = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagLotteryResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
