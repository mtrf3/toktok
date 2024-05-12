package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _PinRequest_ProtoDecoder implements InterfaceC31105CIr<PinRequest> {
    @Override // X.InterfaceC31105CIr
    public final PinRequest LIZ(Q9H q9h) {
        PinRequest pinRequest = new PinRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pinRequest.method = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        pinRequest.payload = Q9J.LIZIZ(q9h);
                    }
                } else {
                    pinRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pinRequest;
            }
        }
    }
}
