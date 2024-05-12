package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestMonitorConfig {

    @InterfaceC65349Pkn("compatible_version")
    public int compatibleVersion;

    @InterfaceC65349Pkn("enable_android")
    public boolean enable;

    @InterfaceC65349Pkn("exception_room_msg_gap")
    public int exceptionRoomMsgGap;

    @InterfaceC65349Pkn("time_out")
    public long timeOUt;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveSdkMultiGuestMonitorConfig() {
        this(false, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    public LiveSdkMultiGuestMonitorConfig(boolean z, long j, int i, int i2) {
        this.enable = z;
        this.timeOUt = j;
        this.compatibleVersion = i;
        this.exceptionRoomMsgGap = i2;
    }

    public /* synthetic */ LiveSdkMultiGuestMonitorConfig(boolean z, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 60L : j, (i3 & 4) != 0 ? 2650 : i, (i3 & 8) != 0 ? 3 : i2);
    }
}
