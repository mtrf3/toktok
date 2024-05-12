package com.bytedance.android.livesdkapi.ping;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public class PingResult {

    @InterfaceC65349Pkn("mosaic_status")
    public int mosaicStatus;

    @InterfaceC65349Pkn("next_ping")
    public long nextPingInterval;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("room_status")
    public int roomStatus;

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }
}
