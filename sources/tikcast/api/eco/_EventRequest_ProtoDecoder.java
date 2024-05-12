package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _EventRequest_ProtoDecoder implements InterfaceC31105CIr<EventRequest> {
    @Override // X.InterfaceC31105CIr
    public final EventRequest LIZ(Q9H q9h) {
        EventRequest eventRequest = new EventRequest();
        eventRequest.events = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        eventRequest.events.add(_EventDetail_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    eventRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return eventRequest;
            }
        }
    }
}
