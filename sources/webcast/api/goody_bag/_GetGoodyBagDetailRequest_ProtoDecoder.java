package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetGoodyBagDetailRequest_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagDetailRequest LIZ(Q9H q9h) {
        GetGoodyBagDetailRequest getGoodyBagDetailRequest = new GetGoodyBagDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getGoodyBagDetailRequest.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagDetailRequest;
            }
        }
    }
}
