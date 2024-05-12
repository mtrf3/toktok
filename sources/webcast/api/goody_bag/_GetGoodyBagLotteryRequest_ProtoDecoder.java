package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetGoodyBagLotteryRequest_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagLotteryRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagLotteryRequest LIZ(Q9H q9h) {
        GetGoodyBagLotteryRequest getGoodyBagLotteryRequest = new GetGoodyBagLotteryRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getGoodyBagLotteryRequest.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagLotteryRequest;
            }
        }
    }
}
