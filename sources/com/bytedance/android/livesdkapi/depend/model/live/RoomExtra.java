package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class RoomExtra extends F9E {

    @InterfaceC65349Pkn("deprecated1")
    public EnterRegionMatch deprecated1;

    @InterfaceC65349Pkn("is_sandbox")
    public Boolean isSandbox;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.isSandbox;
        EnterRegionMatch enterRegionMatch = this.deprecated1;
        return new Object[]{bool, bool, enterRegionMatch, enterRegionMatch};
    }
}
