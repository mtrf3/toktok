package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class RoomStruct implements Serializable {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("live_type_audio")
    public boolean liveTypeAudio;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;

    @InterfaceC65349Pkn("user_count")
    public int userCount;

    @InterfaceC65349Pkn("width")
    public int width;

    @InterfaceC65349Pkn("with_linkmic")
    public boolean withLinkmic;

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
