package com.bytedance.ies.safemode.SmartProtected.state;

import X.InterfaceC65349Pkn;
import X.O1A;

/* loaded from: classes12.dex */
public class StateParam {

    @O1A
    @InterfaceC65349Pkn("flags")
    public int flags;

    @O1A
    @InterfaceC65349Pkn("payload")
    public int payload;

    public StateParam() {
        this(0, 0);
    }

    public StateParam(int i, int i2) {
        this.flags = i;
        this.payload = i2;
    }
}
