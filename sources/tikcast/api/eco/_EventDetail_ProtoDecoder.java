package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _EventDetail_ProtoDecoder implements InterfaceC31105CIr<EventDetail> {
    public static EventDetail LIZIZ(Q9H q9h) {
        EventDetail eventDetail = new EventDetail();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        eventDetail.timestamp = q9h.LJIIJJI();
                    }
                } else {
                    eventDetail.eventType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return eventDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EventDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
