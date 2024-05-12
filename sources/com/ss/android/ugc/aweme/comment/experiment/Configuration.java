package com.ss.android.ugc.aweme.comment.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class Configuration extends F9E {

    @InterfaceC65349Pkn("interval_days")
    public final int intervalDays;

    @InterfaceC65349Pkn("max_times")
    public final int maxTimes;

    public static /* synthetic */ Configuration copy$default(Configuration configuration, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = configuration.intervalDays;
        }
        if ((i3 & 2) != 0) {
            i2 = configuration.maxTimes;
        }
        return configuration.copy(i, i2);
    }

    public final Configuration copy(int i, int i2) {
        return new Configuration(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.intervalDays), Integer.valueOf(this.maxTimes)};
    }

    public final int getIntervalDays() {
        return this.intervalDays;
    }

    public final int getMaxTimes() {
        return this.maxTimes;
    }

    public Configuration(int i, int i2) {
        this.intervalDays = i;
        this.maxTimes = i2;
    }
}
