package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _KaraokeQueueUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<KaraokeQueueUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeQueueUpdateRequest LIZ(Q9H q9h) {
        KaraokeQueueUpdateRequest karaokeQueueUpdateRequest = new KaraokeQueueUpdateRequest();
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
                                karaokeQueueUpdateRequest.nextSongId = q9h.LJIIJJI();
                            }
                        } else {
                            karaokeQueueUpdateRequest.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        karaokeQueueUpdateRequest.updateType = q9h.LJIIJ();
                    }
                } else {
                    karaokeQueueUpdateRequest.currentSongId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeQueueUpdateRequest;
            }
        }
    }
}
