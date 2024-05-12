package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeReqUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeReqUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeReqUpdateRequest LIZ(Q9H q9h) {
        KaraokeReqUpdateRequest karaokeReqUpdateRequest = new KaraokeReqUpdateRequest();
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
                                karaokeReqUpdateRequest.hostId = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            karaokeReqUpdateRequest.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        karaokeReqUpdateRequest.updateType = q9h.LJIIJ();
                    }
                } else {
                    karaokeReqUpdateRequest.songId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeReqUpdateRequest;
            }
        }
    }
}
