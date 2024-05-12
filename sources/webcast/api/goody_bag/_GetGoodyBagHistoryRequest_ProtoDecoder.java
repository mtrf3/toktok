package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetGoodyBagHistoryRequest_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagHistoryRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagHistoryRequest LIZ(Q9H q9h) {
        GetGoodyBagHistoryRequest getGoodyBagHistoryRequest = new GetGoodyBagHistoryRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getGoodyBagHistoryRequest.limit = q9h.LJIIJJI();
                    }
                } else {
                    getGoodyBagHistoryRequest.offset = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagHistoryRequest;
            }
        }
    }
}
