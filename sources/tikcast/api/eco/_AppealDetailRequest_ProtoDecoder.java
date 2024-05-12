package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AppealDetailRequest_ProtoDecoder implements InterfaceC31105CIr<AppealDetailRequest> {
    @Override // X.InterfaceC31105CIr
    public final AppealDetailRequest LIZ(Q9H q9h) {
        AppealDetailRequest appealDetailRequest = new AppealDetailRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        appealDetailRequest.featureType = Q9J.LIZIZ(q9h);
                    }
                } else {
                    appealDetailRequest.snapshotId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return appealDetailRequest;
            }
        }
    }
}
