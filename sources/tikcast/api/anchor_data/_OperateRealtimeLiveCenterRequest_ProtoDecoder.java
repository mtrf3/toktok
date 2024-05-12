package tikcast.api.anchor_data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _OperateRealtimeLiveCenterRequest_ProtoDecoder implements InterfaceC31105CIr<OperateRealtimeLiveCenterRequest> {
    @Override // X.InterfaceC31105CIr
    public final OperateRealtimeLiveCenterRequest LIZ(Q9H q9h) {
        OperateRealtimeLiveCenterRequest operateRealtimeLiveCenterRequest = new OperateRealtimeLiveCenterRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            operateRealtimeLiveCenterRequest.roomId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        operateRealtimeLiveCenterRequest.pushInterval = q9h.LJIIJ();
                    }
                } else {
                    operateRealtimeLiveCenterRequest.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return operateRealtimeLiveCenterRequest;
            }
        }
    }
}
