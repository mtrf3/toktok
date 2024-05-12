package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscribe_sub_only_chat")
/* loaded from: classes6.dex */
public final class LiveSubOnlyChatConfig {

    @Group(isDefault = true, value = "default group")
    public static final LiveSubOnlyChatSetting DEFAULT;
    public static final LiveSubOnlyChatConfig INSTANCE = new LiveSubOnlyChatConfig();
    public static LiveSubOnlyChatSetting liveSubOnlyChatSetting;

    static {
        LiveSubOnlyChatSetting liveSubOnlyChatSetting2 = new LiveSubOnlyChatSetting(0, false, false, 7, null);
        DEFAULT = liveSubOnlyChatSetting2;
        LiveSubOnlyChatSetting liveSubOnlyChatSetting3 = (LiveSubOnlyChatSetting) SettingsManager.INSTANCE.getValueSafely(LiveSubOnlyChatConfig.class);
        if (liveSubOnlyChatSetting3 != null) {
            liveSubOnlyChatSetting2 = liveSubOnlyChatSetting3;
        }
        liveSubOnlyChatSetting = liveSubOnlyChatSetting2;
    }

    public final boolean animationEnable() {
        return liveSubOnlyChatSetting.getAnimationEnable();
    }

    public final boolean onLiveSwitchEnable() {
        return liveSubOnlyChatSetting.getOnLiveSwitchEnable();
    }

    public final int onLiveSwitchFrequencyMin() {
        return liveSubOnlyChatSetting.getOnLiveSwitchFrequencyMin();
    }

    public final LiveSubOnlyChatSetting getDEFAULT() {
        return DEFAULT;
    }
}
