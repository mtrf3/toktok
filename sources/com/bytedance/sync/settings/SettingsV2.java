package com.bytedance.sync.settings;

import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public class SettingsV2 {

    @InterfaceC65349Pkn("channel")
    public int channel;

    @InterfaceC65349Pkn("version")
    public int version;

    @InterfaceC65349Pkn("sync")
    public int sync = 60;

    @InterfaceC65349Pkn("poll")
    public int poll = 300;

    @InterfaceC65349Pkn("background_sync")
    public int backgroundSync = 300;

    @InterfaceC65349Pkn("background_poll")
    public int backgroundPoll = 600;

    @InterfaceC65349Pkn("report_size_limit")
    public int reportSizeLimit = 6144;

    @InterfaceC65349Pkn("submit_size_limit")
    public int submitSizeLimit = 51200;

    @InterfaceC65349Pkn("db_store_size_limit")
    public int dbStoreSizeLimit = 51200;

    @InterfaceC65349Pkn("event_send_delay")
    public long eventSendDelay = 5;

    @InterfaceC65349Pkn("android_ws_poll_interval")
    public long pollIntervalWhenWsConnected = -1;

    public final long LIZ() {
        long j = this.pollIntervalWhenWsConnected;
        if (j > 0) {
            return j;
        }
        return this.poll;
    }

    public final boolean LIZIZ() {
        if (this.channel <= 0) {
            return true;
        }
        return false;
    }
}
