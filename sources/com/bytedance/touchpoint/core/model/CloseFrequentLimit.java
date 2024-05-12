package com.bytedance.touchpoint.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class CloseFrequentLimit extends F9E {

    @InterfaceC65349Pkn("days_no_show")
    public int daysNoShow;

    @InterfaceC65349Pkn("days_window")
    public int daysWindow;

    @InterfaceC65349Pkn("hours_no_show")
    public Integer hoursNoShow;

    @InterfaceC65349Pkn("max_close")
    public int maxClose;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.daysWindow), Integer.valueOf(this.maxClose), Integer.valueOf(this.daysNoShow), this.hoursNoShow};
    }

    public CloseFrequentLimit(int i, int i2, int i3, Integer num) {
        this.daysWindow = i;
        this.maxClose = i2;
        this.daysNoShow = i3;
        this.hoursNoShow = num;
    }
}
