package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _KaraokeTabsListRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeTabsListRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeTabsListRequest LIZ(Q9H q9h) {
        KaraokeTabsListRequest karaokeTabsListRequest = new KaraokeTabsListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            karaokeTabsListRequest.hostId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        karaokeTabsListRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    karaokeTabsListRequest.role = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeTabsListRequest;
            }
        }
    }
}
