package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class PaidEvent extends F9E {

    @InterfaceC65349Pkn("event_id")
    public Long eventId;

    @InterfaceC65349Pkn("paid_type")
    public int paidType;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.eventId;
        return new Object[]{l, l, Integer.valueOf(this.paidType)};
    }
}
