package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class LiveMessagePreviewConfig {

    @InterfaceC65349Pkn("enable_message")
    public boolean enableMessage;

    @InterfaceC65349Pkn("start_message_instant")
    public boolean startMessageInstant;

    @InterfaceC65349Pkn("stop_disconnect_ws_delay")
    public long stopDisconnectWsDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessagePreviewConfig() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewConfig.<init>():void");
    }

    public final boolean getEnableMessage() {
        return this.enableMessage;
    }

    public final boolean getStartMessageInstant() {
        return this.startMessageInstant;
    }

    public final long getStopDisconnectWsDelay() {
        return this.stopDisconnectWsDelay;
    }

    public final void setEnableMessage(boolean z) {
        this.enableMessage = z;
    }

    public final void setStartMessageInstant(boolean z) {
        this.startMessageInstant = z;
    }

    public final void setStopDisconnectWsDelay(long j) {
        this.stopDisconnectWsDelay = j;
    }

    public LiveMessagePreviewConfig(boolean z, boolean z2, long j) {
        this.enableMessage = z;
        this.startMessageInstant = z2;
        this.stopDisconnectWsDelay = j;
    }

    public /* synthetic */ LiveMessagePreviewConfig(boolean z, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 10000L : j);
    }
}
