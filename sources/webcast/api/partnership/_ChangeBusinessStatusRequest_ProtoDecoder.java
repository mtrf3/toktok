package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ChangeBusinessStatusRequest_ProtoDecoder implements InterfaceC31105CIr<ChangeBusinessStatusRequest> {
    @Override // X.InterfaceC31105CIr
    public final ChangeBusinessStatusRequest LIZ(Q9H q9h) {
        ChangeBusinessStatusRequest changeBusinessStatusRequest = new ChangeBusinessStatusRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    changeBusinessStatusRequest.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return changeBusinessStatusRequest;
            }
        }
    }
}
