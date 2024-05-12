package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class ScheduleItem extends F9E {

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.startTime;
        Long l2 = this.duration;
        return new Object[]{l, l, l2, l2};
    }
}
