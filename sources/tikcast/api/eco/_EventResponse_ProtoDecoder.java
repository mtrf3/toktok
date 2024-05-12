package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import tikcast.api.eco.EventResponse;

/* loaded from: classes14.dex */
public final class _EventResponse_ProtoDecoder implements InterfaceC31105CIr<EventResponse> {
    @Override // X.InterfaceC31105CIr
    public final EventResponse LIZ(Q9H q9h) {
        EventResponse eventResponse = new EventResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        eventResponse.extra = _EventResponse_ResponseExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    EventResponse.ResponseData responseData = new EventResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    eventResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return eventResponse;
            }
        }
    }
}
