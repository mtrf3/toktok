package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EventCollectRequest_ProtoDecoder implements InterfaceC31105CIr<EventCollectRequest> {
    @Override // X.InterfaceC31105CIr
    public final EventCollectRequest LIZ(Q9H q9h) {
        EventCollectRequest eventCollectRequest = new EventCollectRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            eventCollectRequest.anchorId = q9h.LJIIJJI();
                        }
                    } else {
                        eventCollectRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    eventCollectRequest.eventType = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return eventCollectRequest;
            }
        }
    }
}
