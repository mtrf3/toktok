package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class PositionConfig extends F9E {

    @InterfaceC65349Pkn("max_position")
    public int maxPosition;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxPosition)};
    }

    public PositionConfig(int i) {
        this.maxPosition = i;
    }
}
