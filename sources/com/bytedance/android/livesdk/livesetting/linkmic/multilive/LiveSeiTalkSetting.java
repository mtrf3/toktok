package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sei_talk_setting")
/* loaded from: classes6.dex */
public final class LiveSeiTalkSetting {
    public static final LiveSeiTalkSetting INSTANCE = new LiveSeiTalkSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSeiTalkSettingConfig DEFAULT = new LiveSeiTalkSettingConfig(false, 0, false, 0, 15, null);

    private final LiveSeiTalkSettingConfig getConfig() {
        LiveSeiTalkSettingConfig liveSeiTalkSettingConfig = (LiveSeiTalkSettingConfig) SettingsManager.INSTANCE.getValueSafely(LiveSeiTalkSetting.class);
        if (liveSeiTalkSettingConfig == null) {
            return DEFAULT;
        }
        return liveSeiTalkSettingConfig;
    }

    public final boolean enable() {
        return getConfig().seiTalkEnable;
    }

    public final int getInterval() {
        return getConfig().seiInterval;
    }

    public final int volumeThreshold() {
        return getConfig().volumeThreshold;
    }
}
