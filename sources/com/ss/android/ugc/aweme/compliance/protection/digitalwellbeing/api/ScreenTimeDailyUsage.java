package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ScreenTimeDailyUsage extends F9E implements Serializable {

    @InterfaceC65349Pkn("day_usage")
    public final int dayUsage;

    @InterfaceC65349Pkn("night_usage")
    public final int nightUsage;

    @InterfaceC65349Pkn("upload_date")
    public final int uploadDate;

    public static /* synthetic */ ScreenTimeDailyUsage copy$default(ScreenTimeDailyUsage screenTimeDailyUsage, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = screenTimeDailyUsage.uploadDate;
        }
        if ((i4 & 2) != 0) {
            i2 = screenTimeDailyUsage.dayUsage;
        }
        if ((i4 & 4) != 0) {
            i3 = screenTimeDailyUsage.nightUsage;
        }
        return screenTimeDailyUsage.copy(i, i2, i3);
    }

    public final ScreenTimeDailyUsage copy(int i, int i2, int i3) {
        return new ScreenTimeDailyUsage(i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.uploadDate), Integer.valueOf(this.dayUsage), Integer.valueOf(this.nightUsage)};
    }

    public final int getDayUsage() {
        return this.dayUsage;
    }

    public final int getNightUsage() {
        return this.nightUsage;
    }

    public final int getUploadDate() {
        return this.uploadDate;
    }

    public ScreenTimeDailyUsage(int i, int i2, int i3) {
        this.uploadDate = i;
        this.dayUsage = i2;
        this.nightUsage = i3;
    }
}
