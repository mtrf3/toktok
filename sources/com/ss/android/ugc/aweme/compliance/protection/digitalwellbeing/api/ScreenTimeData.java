package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ScreenTimeData extends F9E implements Serializable {

    @InterfaceC65349Pkn("time_usage")
    public final List<ScreenTimeDailyUsage> timeUsage;

    @InterfaceC65349Pkn("upload_type")
    public final int type;

    @InterfaceC65349Pkn("upload_timestamp")
    public final long uploadTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScreenTimeData copy$default(ScreenTimeData screenTimeData, long j, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = screenTimeData.uploadTime;
        }
        if ((i2 & 2) != 0) {
            list = screenTimeData.timeUsage;
        }
        if ((i2 & 4) != 0) {
            i = screenTimeData.type;
        }
        return screenTimeData.copy(j, list, i);
    }

    public final ScreenTimeData copy(long j, List<ScreenTimeDailyUsage> timeUsage, int i) {
        o.LJIIIZ(timeUsage, "timeUsage");
        return new ScreenTimeData(j, timeUsage, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uploadTime), this.timeUsage, Integer.valueOf(this.type)};
    }

    public final List<ScreenTimeDailyUsage> getTimeUsage() {
        return this.timeUsage;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUploadTime() {
        return this.uploadTime;
    }

    public ScreenTimeData(long j, List<ScreenTimeDailyUsage> timeUsage, int i) {
        o.LJIIIZ(timeUsage, "timeUsage");
        this.uploadTime = j;
        this.timeUsage = timeUsage;
        this.type = i;
    }
}
