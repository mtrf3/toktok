package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_open_optimizer_enable")
/* loaded from: classes6.dex */
public final class LiveStreamOpenOptimizerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStreamOpenOptimizerSetting INSTANCE = new LiveStreamOpenOptimizerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamOpenOptimizerSetting.class);
    }
}
