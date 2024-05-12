package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _SubPinRequest_ProtoDecoder implements InterfaceC31105CIr<SubPinRequest> {
    @Override // X.InterfaceC31105CIr
    public final SubPinRequest LIZ(Q9H q9h) {
        SubPinRequest subPinRequest = new SubPinRequest();
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
                                subPinRequest.secAnchorId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subPinRequest.type = q9h.LJIIJ();
                        }
                    } else {
                        subPinRequest.pinId = q9h.LJIIJJI();
                    }
                } else {
                    subPinRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subPinRequest;
            }
        }
    }
}
