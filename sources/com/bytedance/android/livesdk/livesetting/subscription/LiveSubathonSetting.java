package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subathon")
/* loaded from: classes6.dex */
public final class LiveSubathonSetting {
    public static final LiveSubathonSetting INSTANCE = new LiveSubathonSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSubathonConfig DEFAULT = new LiveSubathonConfig(false, false, 0, 0, 0, false, 63, null);

    public final LiveSubathonConfig getValue() {
        LiveSubathonConfig liveSubathonConfig = (LiveSubathonConfig) SettingsManager.INSTANCE.getValueSafely(LiveSubathonSetting.class);
        if (liveSubathonConfig == null) {
            return DEFAULT;
        }
        return liveSubathonConfig;
    }

    public final LiveSubathonConfig getDEFAULT() {
        return DEFAULT;
    }
}
