package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class RTCEngineConfig extends F9E {

    @InterfaceC65349Pkn("rtc_app_id")
    public String rtcAppId;

    @InterfaceC65349Pkn("rtc_channel_id")
    public long rtcChannelId;

    @InterfaceC65349Pkn("rtc_token")
    public String rtcToken;

    @InterfaceC65349Pkn("rtc_user_id")
    public String rtcUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public RTCEngineConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rtcAppId, this.rtcUserId, this.rtcToken, Long.valueOf(this.rtcChannelId)};
    }

    public RTCEngineConfig(String str, String str2, String str3, long j) {
        this.rtcAppId = str;
        this.rtcUserId = str2;
        this.rtcToken = str3;
        this.rtcChannelId = j;
    }

    public /* synthetic */ RTCEngineConfig(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? 0L : j);
    }
}
