package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetGoodyBagWinnerListRequest_ProtoDecoder implements InterfaceC31105CIr<GetGoodyBagWinnerListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetGoodyBagWinnerListRequest LIZ(Q9H q9h) {
        GetGoodyBagWinnerListRequest getGoodyBagWinnerListRequest = new GetGoodyBagWinnerListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            getGoodyBagWinnerListRequest.limit = q9h.LJIIJJI();
                        }
                    } else {
                        getGoodyBagWinnerListRequest.offset = q9h.LJIIJJI();
                    }
                } else {
                    getGoodyBagWinnerListRequest.goodyBagId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getGoodyBagWinnerListRequest;
            }
        }
    }
}
