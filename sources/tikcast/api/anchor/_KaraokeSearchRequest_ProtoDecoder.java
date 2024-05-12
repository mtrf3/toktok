package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeSearchRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeSearchRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeSearchRequest LIZ(Q9H q9h) {
        KaraokeSearchRequest karaokeSearchRequest = new KaraokeSearchRequest();
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
                                karaokeSearchRequest.offset = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeSearchRequest.keywords = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        karaokeSearchRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    karaokeSearchRequest.role = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeSearchRequest;
            }
        }
    }
}
