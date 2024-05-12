package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessagePreloadConfig {

    @InterfaceC65349Pkn("decode_message")
    public boolean decodeMessage;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("preload_after_ws_connected")
    public boolean preloadAfterWSConnected;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessagePreloadConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessagePreloadConfig.<init>():void");
    }

    public final boolean getDecodeMessage() {
        return this.decodeMessage;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getPreloadAfterWSConnected() {
        return this.preloadAfterWSConnected;
    }

    public final void setDecodeMessage(boolean z) {
        this.decodeMessage = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setPreloadAfterWSConnected(boolean z) {
        this.preloadAfterWSConnected = z;
    }

    public LiveMessagePreloadConfig(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.decodeMessage = z2;
        this.preloadAfterWSConnected = z3;
    }

    public /* synthetic */ LiveMessagePreloadConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3);
    }
}
