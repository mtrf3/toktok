package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class UrgeStruct implements Serializable {

    @InterfaceC65349Pkn("block_urge_setting")
    public int blockUrgeSetting;

    @InterfaceC65349Pkn("latest_aweme_time")
    public long latestAwemeTime;

    @InterfaceC65349Pkn("latest_room_time")
    public long latestRoomTime;

    @InterfaceC65349Pkn("urge_unread_count")
    public long urgeUnreadCount;

    @InterfaceC65349Pkn("user_urged")
    public int userUrged;

    public boolean shouldHostShowTip() {
        if (this.blockUrgeSetting == 0 && this.urgeUnreadCount > 0) {
            return true;
        }
        return false;
    }

    public int getBlockUrgeSetting() {
        return this.blockUrgeSetting;
    }

    public long getLatestAwemeTime() {
        return this.latestAwemeTime;
    }

    public long getLatestRoomTime() {
        return this.latestRoomTime;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public int getUserUrged() {
        return this.userUrged;
    }

    public void setBlockUrgeSetting(int i) {
        this.blockUrgeSetting = i;
    }

    public void setLatestAwemeTime(long j) {
        this.latestAwemeTime = j;
    }

    public void setLatestRoomTime(long j) {
        this.latestRoomTime = j;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }

    public void setUserUrged(int i) {
        this.userUrged = i;
    }
}
