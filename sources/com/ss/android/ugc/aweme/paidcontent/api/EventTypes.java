package com.ss.android.ugc.aweme.paidcontent.api;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class EventTypes extends F9E {

    @InterfaceC65349Pkn("event")
    public final int eventType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.eventType)};
    }

    public EventTypes(int i) {
        this.eventType = i;
    }
}
