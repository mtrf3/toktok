package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessageWsTimeSyncConfig {

    @InterfaceC65349Pkn("opt_hb_time_sync")
    public boolean optHBTimeSync;

    @InterfaceC65349Pkn("send_hb_after_ws_connect")
    public boolean sendHBAfterWsConnect;

    @InterfaceC65349Pkn("valid_ws_request_interval")
    public long validWsRequestInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessageWsTimeSyncConfig() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r4 = r3
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessageWsTimeSyncConfig.<init>():void");
    }

    public final boolean getOptHBTimeSync() {
        return this.optHBTimeSync;
    }

    public final boolean getSendHBAfterWsConnect() {
        return this.sendHBAfterWsConnect;
    }

    public final long getValidWsRequestInterval() {
        return this.validWsRequestInterval;
    }

    public final void setOptHBTimeSync(boolean z) {
        this.optHBTimeSync = z;
    }

    public final void setSendHBAfterWsConnect(boolean z) {
        this.sendHBAfterWsConnect = z;
    }

    public final void setValidWsRequestInterval(long j) {
        this.validWsRequestInterval = j;
    }

    public LiveMessageWsTimeSyncConfig(long j, boolean z, boolean z2) {
        this.validWsRequestInterval = j;
        this.optHBTimeSync = z;
        this.sendHBAfterWsConnect = z2;
    }

    public /* synthetic */ LiveMessageWsTimeSyncConfig(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
