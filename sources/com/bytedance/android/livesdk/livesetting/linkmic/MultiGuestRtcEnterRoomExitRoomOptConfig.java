package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MultiGuestRtcEnterRoomExitRoomOptConfig {

    @InterfaceC65349Pkn("linkmic_auto_stop_rtc_duration_threshold_1")
    public long stopDurationThreshold1;

    @InterfaceC65349Pkn("linkmic_auto_stop_rtc_duration_threshold_2")
    public long stopDurationThreshold2;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiGuestRtcEnterRoomExitRoomOptConfig() {
        /*
            r7 = this;
            r1 = 0
            r5 = 3
            r6 = 0
            r0 = r7
            r3 = r1
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcEnterRoomExitRoomOptConfig.<init>():void");
    }

    public MultiGuestRtcEnterRoomExitRoomOptConfig(long j, long j2) {
        this.stopDurationThreshold1 = j;
        this.stopDurationThreshold2 = j2;
    }

    public /* synthetic */ MultiGuestRtcEnterRoomExitRoomOptConfig(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 60L : j, (i & 2) != 0 ? 180L : j2);
    }
}
