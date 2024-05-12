package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AppealRequest_ProtoDecoder implements InterfaceC31105CIr<AppealRequest> {
    @Override // X.InterfaceC31105CIr
    public final AppealRequest LIZ(Q9H q9h) {
        AppealRequest appealRequest = new AppealRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    appealRequest.snapshotId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return appealRequest;
            }
        }
    }
}
