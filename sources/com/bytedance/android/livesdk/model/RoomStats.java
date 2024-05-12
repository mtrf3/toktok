package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import X.YXS;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;

/* loaded from: classes17.dex */
public class RoomStats implements YXS {

    @InterfaceC65349Pkn("enter_count")
    public int enterCount;

    @InterfaceC65349Pkn("follow_count")
    public int followCount;

    @InterfaceC65349Pkn("gift_uv_count")
    public int giftUVCount;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("id_str")
    public String idStr;

    @InterfaceC65349Pkn("replay_viewers")
    public int replayViewers;

    @InterfaceC65349Pkn("share_count")
    public int shareCount;

    @InterfaceC65349Pkn("fan_ticket")
    public long ticket;

    @InterfaceC65349Pkn("total_user")
    public int totalUser;

    @InterfaceC65349Pkn("watermelon")
    public int watermelon;
    public final int INT_32 = 32;
    public final int INT_31 = 31;

    public int hashCode() {
        int i;
        long j = this.id;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.ticket;
        int i3 = (((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        String str = this.idStr;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i3 + i;
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    @Override // X.YXS
    public int getFollowCount() {
        return this.followCount;
    }

    @Override // X.YXS
    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    @Override // X.YXS
    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    @Override // X.YXS
    public long getTicket() {
        return this.ticket;
    }

    @Override // X.YXS
    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public static RoomStats from(YXS yxs) {
        if (yxs == null) {
            return null;
        }
        if (yxs instanceof RoomStats) {
            Gson gson = new Gson();
            return (RoomStats) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, yxs), RoomStats.class);
        }
        RoomStats roomStats = new RoomStats();
        roomStats.initWith(yxs);
        return roomStats;
    }

    private void initWith(YXS yxs) {
        this.id = yxs.getId();
        this.ticket = yxs.getTicket();
        this.totalUser = yxs.getTotalUser();
        this.followCount = yxs.getFollowCount();
        this.giftUVCount = yxs.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoomStats roomStats = (RoomStats) obj;
        if (this.id != roomStats.id || this.ticket != roomStats.ticket || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
            return false;
        }
        String str = this.idStr;
        if (str == null ? roomStats.idStr != null : !str.equals(roomStats.idStr)) {
            return false;
        }
        if (this.totalUser == roomStats.totalUser) {
            return true;
        }
        return false;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }
}
