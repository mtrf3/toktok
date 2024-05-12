package com.ss.android.ugc.aweme.feed.model.livesplash;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class LiveAwesomeSplashInfo implements Serializable {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("feed_show_time")
    public int feedShowTime;
    public boolean hasShown;

    @InterfaceC65349Pkn("is_topview_data")
    public boolean isTopViewData;

    @InterfaceC65349Pkn("live_info")
    public String liveData;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("topview_valid")
    public boolean topviewValid = true;

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFeedShowTime() {
        return this.feedShowTime;
    }

    public final boolean getHasShown() {
        return this.hasShown;
    }

    public final String getLiveData() {
        return this.liveData;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getTopviewValid() {
        return this.topviewValid;
    }

    public final boolean isTopViewData() {
        return this.isTopViewData;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFeedShowTime(int i) {
        this.feedShowTime = i;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public final void setLiveData(String str) {
        this.liveData = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTopViewData(boolean z) {
        this.isTopViewData = z;
    }

    public final void setTopviewValid(boolean z) {
        this.topviewValid = z;
    }
}
