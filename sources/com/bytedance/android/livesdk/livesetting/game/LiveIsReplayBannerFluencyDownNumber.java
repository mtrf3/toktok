package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_replay_banner_fluency_down_number")
/* loaded from: classes6.dex */
public final class LiveIsReplayBannerFluencyDownNumber {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveIsReplayBannerFluencyDownNumber INSTANCE = new LiveIsReplayBannerFluencyDownNumber();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveIsReplayBannerFluencyDownNumber.class);
    }
}
