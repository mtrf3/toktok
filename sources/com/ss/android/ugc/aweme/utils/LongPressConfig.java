package com.ss.android.ugc.aweme.utils;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class LongPressConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public static /* synthetic */ LongPressConfig copy$default(LongPressConfig longPressConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = longPressConfig.enable;
        }
        return longPressConfig.copy(z);
    }

    public final LongPressConfig copy(boolean z) {
        return new LongPressConfig(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable)};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public LongPressConfig(boolean z) {
        this.enable = z;
    }
}
