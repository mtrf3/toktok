package tikcast.api.perception;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _MultiViolationStatusReq_ProtoDecoder implements InterfaceC31105CIr<MultiViolationStatusReq> {
    @Override // X.InterfaceC31105CIr
    public final MultiViolationStatusReq LIZ(Q9H q9h) {
        MultiViolationStatusReq multiViolationStatusReq = new MultiViolationStatusReq();
        multiViolationStatusReq.scenes = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            multiViolationStatusReq.anchorId = q9h.LJIIJJI();
                        }
                    } else {
                        multiViolationStatusReq.roomId = q9h.LJIIJJI();
                    }
                } else {
                    multiViolationStatusReq.scenes.add(Integer.valueOf(q9h.LJIIJ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return multiViolationStatusReq;
            }
        }
    }
}
