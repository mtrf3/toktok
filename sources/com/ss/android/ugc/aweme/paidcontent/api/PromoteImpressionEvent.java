package com.ss.android.ugc.aweme.paidcontent.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PromoteImpressionEvent {

    @InterfaceC65349Pkn("event")
    public final Integer eventType;

    @InterfaceC65349Pkn("events")
    public final List<EventTypes> eventTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoteImpressionEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoteImpressionEvent)) {
            return false;
        }
        PromoteImpressionEvent promoteImpressionEvent = (PromoteImpressionEvent) obj;
        return o.LJ(this.eventType, promoteImpressionEvent.eventType) && o.LJ(this.eventTypes, promoteImpressionEvent.eventTypes);
    }

    public final int hashCode() {
        Integer num = this.eventType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<EventTypes> list = this.eventTypes;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PromoteImpressionEvent(eventType=");
        LIZ.append(this.eventType);
        LIZ.append(", eventTypes=");
        return C1NE.LIZIZ(LIZ, this.eventTypes, ')', LIZ);
    }

    public PromoteImpressionEvent(Integer num, List<EventTypes> list) {
        this.eventType = num;
        this.eventTypes = list;
    }

    public /* synthetic */ PromoteImpressionEvent(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
