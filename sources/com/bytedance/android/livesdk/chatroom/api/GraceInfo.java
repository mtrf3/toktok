package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class GraceInfo extends F9E {

    @InterfaceC65349Pkn("grace_end_time")
    public Long graceEndTime;

    @InterfaceC65349Pkn("is_in_grace_period")
    public Boolean isInGracePeriod;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.isInGracePeriod;
        Long l = this.graceEndTime;
        return new Object[]{bool, bool, l, l};
    }
}
