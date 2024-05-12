package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class UnReadVideoInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("latest_unread_video_created_time")
    public long latestUnreadVideoCreatedTime;

    @InterfaceC65349Pkn("unread_count")
    public int unReadCount;

    public UnReadVideoInfo() {
    }

    public static /* synthetic */ UnReadVideoInfo copy$default(UnReadVideoInfo unReadVideoInfo, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unReadVideoInfo.unReadCount;
        }
        if ((i2 & 2) != 0) {
            j = unReadVideoInfo.latestUnreadVideoCreatedTime;
        }
        return unReadVideoInfo.copy(i, j);
    }

    public final UnReadVideoInfo copy(int i, long j) {
        return new UnReadVideoInfo(i, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.unReadCount), Long.valueOf(this.latestUnreadVideoCreatedTime)};
    }

    public final long getLatestUnreadVideoCreatedTime() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public UnReadVideoInfo(int i, long j) {
        this.unReadCount = i;
        this.latestUnreadVideoCreatedTime = j;
    }
}
