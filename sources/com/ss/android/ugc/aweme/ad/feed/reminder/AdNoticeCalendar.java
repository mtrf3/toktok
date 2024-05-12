package com.ss.android.ugc.aweme.ad.feed.reminder;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes14.dex */
public final class AdNoticeCalendar implements Serializable {

    @InterfaceC65349Pkn("end_time")
    public final long endTime;

    @InterfaceC65349Pkn("predict_interval")
    public final long predictInterval;

    @InterfaceC65349Pkn("start_time")
    public final long startTime;

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getPredictInterval() {
        return this.predictInterval;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
