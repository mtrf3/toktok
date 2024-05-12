package com.ss.android.ugc.aweme.ml.events;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public final class EventWithPortraitsConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("events")
    public List<EventWithPortraitsOneItem> events;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config(enable=");
        LIZ.append(this.enable);
        LIZ.append(", events=");
        return C1NE.LIZIZ(LIZ, this.events, ')', LIZ);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final List<EventWithPortraitsOneItem> getEvents() {
        return this.events;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setEvents(List<EventWithPortraitsOneItem> list) {
        this.events = list;
    }
}
