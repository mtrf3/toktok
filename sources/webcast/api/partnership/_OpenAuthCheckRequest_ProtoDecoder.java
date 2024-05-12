package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _OpenAuthCheckRequest_ProtoDecoder implements InterfaceC31105CIr<OpenAuthCheckRequest> {
    @Override // X.InterfaceC31105CIr
    public final OpenAuthCheckRequest LIZ(Q9H q9h) {
        OpenAuthCheckRequest openAuthCheckRequest = new OpenAuthCheckRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        openAuthCheckRequest.dropsParam = _OpenAuthCheckRequest_DropsParam_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    openAuthCheckRequest.scene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return openAuthCheckRequest;
            }
        }
    }
}
