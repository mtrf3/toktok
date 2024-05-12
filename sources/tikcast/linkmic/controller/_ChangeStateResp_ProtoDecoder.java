package tikcast.linkmic.controller;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ChangeStateResp_ProtoDecoder implements InterfaceC31105CIr<ChangeStateResp> {
    @Override // X.InterfaceC31105CIr
    public final ChangeStateResp LIZ(Q9H q9h) {
        ChangeStateResp changeStateResp = new ChangeStateResp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    changeStateResp.result = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return changeStateResp;
            }
        }
    }
}
