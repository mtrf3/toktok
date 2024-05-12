package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeTabListRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeTabListRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeTabListRequest LIZ(Q9H q9h) {
        KaraokeTabListRequest karaokeTabListRequest = new KaraokeTabListRequest();
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
                                    karaokeTabListRequest.hostId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                karaokeTabListRequest.offset = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeTabListRequest.tabId = q9h.LJIIJJI();
                        }
                    } else {
                        karaokeTabListRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    karaokeTabListRequest.role = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeTabListRequest;
            }
        }
    }
}
