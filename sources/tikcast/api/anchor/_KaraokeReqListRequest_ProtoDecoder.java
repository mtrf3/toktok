package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeReqListRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeReqListRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeReqListRequest LIZ(Q9H q9h) {
        KaraokeReqListRequest karaokeReqListRequest = new KaraokeReqListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    karaokeReqListRequest.hostId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                karaokeReqListRequest.timestamp = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeReqListRequest.offset = q9h.LJIIJJI();
                        }
                    } else {
                        karaokeReqListRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    karaokeReqListRequest.role = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeReqListRequest;
            }
        }
    }
}
