package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _EventCard_ProtoDecoder implements InterfaceC31105CIr<EventCard> {
    public static EventCard LIZIZ(Q9H q9h) {
        EventCard eventCard = new EventCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            eventCard.cardIconUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        eventCard.cardStartTime = q9h.LJIIJJI();
                    }
                } else {
                    eventCard.event = _LiveEventInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return eventCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EventCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
