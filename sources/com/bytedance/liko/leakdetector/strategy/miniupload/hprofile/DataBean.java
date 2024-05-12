package com.bytedance.liko.leakdetector.strategy.miniupload.hprofile;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DataBean extends F9E {

    @InterfaceC65349Pkn("event_type")
    public final String eventType;

    @InterfaceC65349Pkn("timestamp")
    public final long timestamp;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.eventType, Long.valueOf(this.timestamp)};
    }

    public DataBean(String eventType, long j) {
        o.LJIIJ(eventType, "eventType");
        this.eventType = eventType;
        this.timestamp = j;
    }
}
