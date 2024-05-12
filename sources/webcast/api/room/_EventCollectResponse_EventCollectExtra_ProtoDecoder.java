package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.EventCollectResponse;

/* loaded from: classes17.dex */
public final class _EventCollectResponse_EventCollectExtra_ProtoDecoder implements InterfaceC31105CIr<EventCollectResponse.EventCollectExtra> {
    public static EventCollectResponse.EventCollectExtra LIZIZ(Q9H q9h) {
        EventCollectResponse.EventCollectExtra eventCollectExtra = new EventCollectResponse.EventCollectExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    eventCollectExtra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return eventCollectExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EventCollectResponse.EventCollectExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
