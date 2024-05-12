package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("co_host_sei_talk_setting")
/* loaded from: classes6.dex */
public final class CoHostSeiTalkSetting {
    public static final CoHostSeiTalkSetting INSTANCE = new CoHostSeiTalkSetting();

    @Group(isDefault = true, value = "default group")
    public static final CoHostSeiTalkSettingConfig DEFAULT = new CoHostSeiTalkSettingConfig(false, 0, 0, 7, null);

    private final CoHostSeiTalkSettingConfig getConfig() {
        CoHostSeiTalkSettingConfig coHostSeiTalkSettingConfig = (CoHostSeiTalkSettingConfig) SettingsManager.INSTANCE.getValueSafely(CoHostSeiTalkSetting.class);
        if (coHostSeiTalkSettingConfig == null) {
            return DEFAULT;
        }
        return coHostSeiTalkSettingConfig;
    }

    public final boolean enable() {
        return getConfig().seiTalkEnable;
    }

    public final int getInterval() {
        return getConfig().seiInterval;
    }

    public final int getMinAudioVolume() {
        return getConfig().minAudioVolume;
    }
}
