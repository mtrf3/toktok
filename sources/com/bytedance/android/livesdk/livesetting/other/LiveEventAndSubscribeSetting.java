package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_event_and_subscribe")
/* loaded from: classes6.dex */
public final class LiveEventAndSubscribeSetting {

    @Group("v2")
    public static final LiveEventAndSubscribeConfig v2;

    @Group("v3")
    public static final LiveEventAndSubscribeConfig v3;

    @Group("v4")
    public static final LiveEventAndSubscribeConfig v4;

    /* renamed from: v5, reason: collision with root package name */
    @Group("v5")
    public static final LiveEventAndSubscribeConfig f116v5;
    public static final LiveEventAndSubscribeSetting INSTANCE = new LiveEventAndSubscribeSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveEventAndSubscribeConfig DEFAULT = new LiveEventAndSubscribeConfig();

    static {
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig = new LiveEventAndSubscribeConfig();
        liveEventAndSubscribeConfig.addLiveEventAndSubscribe = true;
        liveEventAndSubscribeConfig.styleOfLiveEventAndSubscribe = 0;
        v2 = liveEventAndSubscribeConfig;
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig2 = new LiveEventAndSubscribeConfig();
        liveEventAndSubscribeConfig2.addLiveEventAndSubscribe = true;
        liveEventAndSubscribeConfig2.styleOfLiveEventAndSubscribe = 1;
        v3 = liveEventAndSubscribeConfig2;
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig3 = new LiveEventAndSubscribeConfig();
        liveEventAndSubscribeConfig3.addLiveEventAndSubscribe = true;
        liveEventAndSubscribeConfig3.styleOfLiveEventAndSubscribe = 2;
        v4 = liveEventAndSubscribeConfig3;
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig4 = new LiveEventAndSubscribeConfig();
        liveEventAndSubscribeConfig4.addLiveEventAndSubscribe = true;
        liveEventAndSubscribeConfig4.styleOfLiveEventAndSubscribe = 3;
        f116v5 = liveEventAndSubscribeConfig4;
    }

    public final LiveEventAndSubscribeConfig getValue() {
        LiveEventAndSubscribeConfig liveEventAndSubscribeConfig = (LiveEventAndSubscribeConfig) SettingsManager.INSTANCE.getValueSafely(LiveEventAndSubscribeSetting.class);
        if (liveEventAndSubscribeConfig == null) {
            return DEFAULT;
        }
        return liveEventAndSubscribeConfig;
    }
}
