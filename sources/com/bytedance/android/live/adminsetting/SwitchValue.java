package com.bytedance.android.live.adminsetting;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public final class SwitchValue extends F9E {

    @InterfaceC65349Pkn("switch_type")
    public final int switchType;

    @InterfaceC65349Pkn("switch_value")
    public final boolean switchValue;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.switchType), Boolean.valueOf(this.switchValue)};
    }

    public SwitchValue(int i, boolean z) {
        this.switchType = i;
        this.switchValue = z;
    }
}
