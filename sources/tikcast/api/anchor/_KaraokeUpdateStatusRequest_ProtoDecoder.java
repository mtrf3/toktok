package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeUpdateStatusRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeUpdateStatusRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeUpdateStatusRequest LIZ(Q9H q9h) {
        KaraokeUpdateStatusRequest karaokeUpdateStatusRequest = new KaraokeUpdateStatusRequest();
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
                                karaokeUpdateStatusRequest.hostId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            karaokeUpdateStatusRequest.opType = q9h.LJIIJ();
                        }
                    } else {
                        karaokeUpdateStatusRequest.status = q9h.LJIIJ();
                    }
                } else {
                    karaokeUpdateStatusRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeUpdateStatusRequest;
            }
        }
    }
}
