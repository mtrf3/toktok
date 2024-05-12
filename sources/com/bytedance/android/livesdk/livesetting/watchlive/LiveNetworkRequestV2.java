package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_network_request_v2")
/* loaded from: classes11.dex */
public final class LiveNetworkRequestV2 {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveNetworkRequestV2 INSTANCE = new LiveNetworkRequestV2();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNetworkRequestV2.class);
    }
}
