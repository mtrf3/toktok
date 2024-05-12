package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class RTCDualStreamParam extends F9E {

    @InterfaceC65349Pkn("is_auto_switch")
    public int autoSwitch;

    @InterfaceC65349Pkn("auto_switch_user_num")
    public int autoSwitchUserNum;

    @InterfaceC65349Pkn("remote_default_stream_type")
    public int defaultStreamType;

    @InterfaceC65349Pkn("hd_video_param")
    public RTCVideoParam hdVideoParam;

    @InterfaceC65349Pkn("sd_video_param")
    public RTCVideoParam sdVideoParam;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RTCDualStreamParam() {
        /*
            r8 = this;
            r1 = 0
            r4 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r3 = r1
            r5 = r4
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.model.message.linkcore.RTCDualStreamParam.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.defaultStreamType), Integer.valueOf(this.autoSwitch), Integer.valueOf(this.autoSwitchUserNum), this.hdVideoParam, this.sdVideoParam};
    }

    public RTCDualStreamParam(int i, int i2, int i3, RTCVideoParam rTCVideoParam, RTCVideoParam rTCVideoParam2) {
        this.defaultStreamType = i;
        this.autoSwitch = i2;
        this.autoSwitchUserNum = i3;
        this.hdVideoParam = rTCVideoParam;
        this.sdVideoParam = rTCVideoParam2;
    }

    public /* synthetic */ RTCDualStreamParam(int i, int i2, int i3, RTCVideoParam rTCVideoParam, RTCVideoParam rTCVideoParam2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? null : rTCVideoParam, (i4 & 16) == 0 ? rTCVideoParam2 : null);
    }
}
