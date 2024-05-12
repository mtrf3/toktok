package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ViolationStatusReq_ProtoDecoder implements InterfaceC31105CIr<ViolationStatusReq> {
    @Override // X.InterfaceC31105CIr
    public final ViolationStatusReq LIZ(Q9H q9h) {
        ViolationStatusReq violationStatusReq = new ViolationStatusReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        violationStatusReq.roomId = q9h.LJIIJJI();
                    }
                } else {
                    violationStatusReq.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return violationStatusReq;
            }
        }
    }
}
