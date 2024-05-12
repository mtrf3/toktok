package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import webcast.data.EventCard;

/* loaded from: classes6.dex */
public final class LiveEventMessage extends CR6 {

    @InterfaceC65349Pkn("action_type")
    public int actionType;

    @InterfaceC65349Pkn("card")
    public EventCard card;

    public LiveEventMessage() {
        this.type = EnumC31509CYf.LIVE_EVENT_MESSAGE;
    }

    public final String toString() {
        Long l;
        boolean z;
        LiveEventInfo liveEventInfo;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event id: ");
        EventCard eventCard = this.card;
        if (eventCard != null && (liveEventInfo = eventCard.event) != null) {
            l = liveEventInfo.eventId;
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(",is pin:");
        boolean z2 = false;
        if (this.actionType == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", isUnpin:");
        if (this.actionType == 2) {
            z2 = true;
        }
        LIZ.append(z2);
        return X1D.LIZIZ(LIZ);
    }
}
