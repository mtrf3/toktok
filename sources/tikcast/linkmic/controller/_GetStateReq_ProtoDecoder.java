package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.linkmic.common._StateReqCommon_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GetStateReq_ProtoDecoder implements InterfaceC31105CIr<GetStateReq> {
    @Override // X.InterfaceC31105CIr
    public final GetStateReq LIZ(Q9H q9h) {
        GetStateReq getStateReq = new GetStateReq();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        getStateReq.clientVersion = q9h.LJIIJJI();
                    }
                } else {
                    getStateReq.common = _StateReqCommon_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getStateReq;
            }
        }
    }
}
