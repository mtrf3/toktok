package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessageSampleRatio {

    @InterfaceC65349Pkn("base_ratio")
    public long baseRatio;

    @InterfaceC65349Pkn("device_ratio")
    public long deviceRatio;

    @InterfaceC65349Pkn("msg_ratio")
    public long msgRatio;

    @InterfaceC65349Pkn("user_ratio")
    public long userRatio;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMessageSampleRatio() {
        /*
            r11 = this;
            r1 = 0
            r9 = 15
            r10 = 0
            r0 = r11
            r3 = r1
            r5 = r1
            r7 = r1
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.message.LiveMessageSampleRatio.<init>():void");
    }

    public final long getBaseRatio() {
        return this.baseRatio;
    }

    public final long getDeviceRatio() {
        return this.deviceRatio;
    }

    public final long getMsgRatio() {
        return this.msgRatio;
    }

    public final long getUserRatio() {
        return this.userRatio;
    }

    public final void setBaseRatio(long j) {
        this.baseRatio = j;
    }

    public final void setDeviceRatio(long j) {
        this.deviceRatio = j;
    }

    public final void setMsgRatio(long j) {
        this.msgRatio = j;
    }

    public final void setUserRatio(long j) {
        this.userRatio = j;
    }

    public LiveMessageSampleRatio(long j, long j2, long j3, long j4) {
        this.msgRatio = j;
        this.deviceRatio = j2;
        this.userRatio = j3;
        this.baseRatio = j4;
    }

    public /* synthetic */ LiveMessageSampleRatio(long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) == 0 ? j3 : 0L, (i & 8) != 0 ? 1000L : j4);
    }
}
