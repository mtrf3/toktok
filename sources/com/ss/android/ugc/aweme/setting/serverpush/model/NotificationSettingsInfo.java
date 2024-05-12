package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class NotificationSettingsInfo extends F9E {

    @InterfaceC65349Pkn("push_device_other_channel")
    public int pushDeviceOtherChannel;

    @InterfaceC65349Pkn("push_device_recommend_video")
    public int pushDeviceRecommendVideo;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.pushDeviceRecommendVideo), Integer.valueOf(this.pushDeviceOtherChannel)};
    }

    public NotificationSettingsInfo(int i, int i2) {
        this.pushDeviceRecommendVideo = i;
        this.pushDeviceOtherChannel = i2;
    }
}
