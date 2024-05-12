package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EventCollectResponse_ProtoDecoder implements InterfaceC31105CIr<EventCollectResponse> {
    @Override // X.InterfaceC31105CIr
    public final EventCollectResponse LIZ(Q9H q9h) {
        EventCollectResponse eventCollectResponse = new EventCollectResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        eventCollectResponse.extra = _EventCollectResponse_EventCollectExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    EventCollectData eventCollectData = new EventCollectData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    eventCollectResponse.data = eventCollectData;
                }
            } else {
                q9h.LJ(LIZJ);
                return eventCollectResponse;
            }
        }
    }
}
