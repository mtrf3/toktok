package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ChannelInfo extends F9E {

    @InterfaceC65349Pkn("dimension")
    public Integer dimension;

    @InterfaceC65349Pkn("layout")
    public Integer layout;

    @InterfaceC65349Pkn("vendor")
    public Integer vendor;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.vendor;
        Integer num2 = this.layout;
        Integer num3 = this.dimension;
        return new Object[]{num, num, num2, num2, num3, num3};
    }
}
