package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubUnPinRequest_ProtoDecoder implements InterfaceC31105CIr<SubUnPinRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubUnPinRequest LIZ(Q9H q9h) {
        SubUnPinRequest subUnPinRequest = new SubUnPinRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                subUnPinRequest.secAnchorId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subUnPinRequest.type = q9h.LJIIJ();
                        }
                    } else {
                        subUnPinRequest.unpinId = q9h.LJIIJJI();
                    }
                } else {
                    subUnPinRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subUnPinRequest;
            }
        }
    }
}
