package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AppOpenedTimesData extends F9E implements Serializable {

    @InterfaceC65349Pkn("app_open_times")
    public final List<AppOpenTimes> appOpenedTimes;

    @InterfaceC65349Pkn("upload_type")
    public final int type;

    @InterfaceC65349Pkn("upload_timestamp")
    public final long uploadTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppOpenedTimesData copy$default(AppOpenedTimesData appOpenedTimesData, long j, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = appOpenedTimesData.uploadTime;
        }
        if ((i2 & 2) != 0) {
            list = appOpenedTimesData.appOpenedTimes;
        }
        if ((i2 & 4) != 0) {
            i = appOpenedTimesData.type;
        }
        return appOpenedTimesData.copy(j, list, i);
    }

    public final AppOpenedTimesData copy(long j, List<AppOpenTimes> appOpenedTimes, int i) {
        o.LJIIIZ(appOpenedTimes, "appOpenedTimes");
        return new AppOpenedTimesData(j, appOpenedTimes, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uploadTime), this.appOpenedTimes, Integer.valueOf(this.type)};
    }

    public final List<AppOpenTimes> getAppOpenedTimes() {
        return this.appOpenedTimes;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public AppOpenedTimesData(long j, List<AppOpenTimes> appOpenedTimes, int i) {
        o.LJIIIZ(appOpenedTimes, "appOpenedTimes");
        this.uploadTime = j;
        this.appOpenedTimes = appOpenedTimes;
        this.type = i;
    }
}
