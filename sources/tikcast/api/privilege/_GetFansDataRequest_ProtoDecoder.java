package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetFansDataRequest_ProtoDecoder implements InterfaceC31105CIr<GetFansDataRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetFansDataRequest LIZ(Q9H q9h) {
        GetFansDataRequest getFansDataRequest = new GetFansDataRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 8) {
                            Q9J.LIZJ(q9h);
                        } else {
                            getFansDataRequest.fansDataSection = q9h.LJIIJ();
                        }
                    } else {
                        getFansDataRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    getFansDataRequest.scene = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getFansDataRequest;
            }
        }
    }
}
