package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class AppOpenTimes extends F9E implements Serializable {

    @InterfaceC65349Pkn("day_open_times")
    public final int dayOpenTimes;

    @InterfaceC65349Pkn("night_open_times")
    public final int nightOpenTimes;

    @InterfaceC65349Pkn("upload_date")
    public final int uploadDate;

    public static /* synthetic */ AppOpenTimes copy$default(AppOpenTimes appOpenTimes, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = appOpenTimes.uploadDate;
        }
        if ((i4 & 2) != 0) {
            i2 = appOpenTimes.dayOpenTimes;
        }
        if ((i4 & 4) != 0) {
            i3 = appOpenTimes.nightOpenTimes;
        }
        return appOpenTimes.copy(i, i2, i3);
    }

    public final AppOpenTimes copy(int i, int i2, int i3) {
        return new AppOpenTimes(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.uploadDate), Integer.valueOf(this.dayOpenTimes), Integer.valueOf(this.nightOpenTimes)};
    }

    public final int getDayOpenTimes() {
        return this.dayOpenTimes;
    }

    public final int getNightOpenTimes() {
        return this.nightOpenTimes;
    }

    public final int getUploadDate() {
        return this.uploadDate;
    }

    public AppOpenTimes(int i, int i2, int i3) {
        this.uploadDate = i;
        this.dayOpenTimes = i2;
        this.nightOpenTimes = i3;
    }
}
