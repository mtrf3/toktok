package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_game_stream_proportion_adapt")
/* loaded from: classes6.dex */
public final class LiveGameStreamProportionAdaptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGameStreamProportionAdaptSetting INSTANCE = new LiveGameStreamProportionAdaptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGameStreamProportionAdaptSetting.class);
    }
}
