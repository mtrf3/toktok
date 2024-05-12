package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _FirstScreenRequest_ProtoDecoder implements InterfaceC31105CIr<FirstScreenRequest> {
    @Override // X.InterfaceC31105CIr
    public final FirstScreenRequest LIZ(Q9H q9h) {
        FirstScreenRequest firstScreenRequest = new FirstScreenRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            firstScreenRequest.roomTag = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        firstScreenRequest.anchorId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    firstScreenRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return firstScreenRequest;
            }
        }
    }
}
