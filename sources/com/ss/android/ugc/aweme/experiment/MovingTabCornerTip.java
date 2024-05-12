package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public final class MovingTabCornerTip extends F9E {

    @InterfaceC65349Pkn("max_pop_times")
    public final int maxPopTimes;

    @InterfaceC65349Pkn("pop_interval_hour")
    public final int popIntervalHour;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.popIntervalHour), Integer.valueOf(this.maxPopTimes)};
    }

    public MovingTabCornerTip(int i, int i2) {
        this.popIntervalHour = i;
        this.maxPopTimes = i2;
    }
}
