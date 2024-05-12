package com.ss.android.ugc.aweme.settings;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class Upsell2svProfilePopupFrequencyModel extends F9E {

    @InterfaceC65349Pkn("interval")
    public final int interval;

    @InterfaceC65349Pkn("max_count")
    public final int max_count;

    @InterfaceC65349Pkn("max_count_month")
    public final int max_count_month;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.interval), Integer.valueOf(this.max_count), Integer.valueOf(this.max_count_month)};
    }

    public Upsell2svProfilePopupFrequencyModel(int i, int i2, int i3) {
        this.interval = i;
        this.max_count = i2;
        this.max_count_month = i3;
    }
}
