package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveHarConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("manual_trigger_interval")
    public long minTriggerInterval;

    @InterfaceC65349Pkn("timer_trigger_enable")
    public boolean timerTriggerEnable;

    @InterfaceC65349Pkn("timer_trigger_interval")
    public long timerTriggerInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveHarConfig() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 15
            r8 = 0
            r0 = r9
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.LiveHarConfig.<init>():void");
    }

    public LiveHarConfig(boolean z, boolean z2, long j, long j2) {
        this.enable = z;
        this.timerTriggerEnable = z2;
        this.timerTriggerInterval = j;
        this.minTriggerInterval = j2;
    }

    public /* synthetic */ LiveHarConfig(boolean z, boolean z2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? 60000L : j, (i & 8) != 0 ? LivePlayEnforceIntervalSetting.DEFAULT : j2);
    }
}
