package com.ss.android.ugc.aweme.liveevent;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class EventParams {

    @InterfaceC65349Pkn("event")
    public CalendarEvent event;

    @InterfaceC65349Pkn("operation")
    public String operation;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParams)) {
            return false;
        }
        EventParams eventParams = (EventParams) obj;
        return o.LJ(this.operation, eventParams.operation) && o.LJ(this.event, eventParams.event);
    }

    public final int hashCode() {
        String str = this.operation;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CalendarEvent calendarEvent = this.event;
        return hashCode + (calendarEvent != null ? calendarEvent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventParams(operation=");
        LIZ.append(this.operation);
        LIZ.append(", event=");
        LIZ.append(this.event);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public EventParams(String str, CalendarEvent calendarEvent) {
        this.operation = str;
        this.event = calendarEvent;
    }
}
