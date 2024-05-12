package com.ss.android.ugc.aweme.settings;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class Upsell2svInboxPopupFrequencyModel extends F9E {

    @InterfaceC65349Pkn("interval")
    public final int interval;

    @InterfaceC65349Pkn("max_count")
    public final int max_count;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.interval), Integer.valueOf(this.max_count)};
    }

    public Upsell2svInboxPopupFrequencyModel(int i, int i2) {
        this.interval = i;
        this.max_count = i2;
    }
}
