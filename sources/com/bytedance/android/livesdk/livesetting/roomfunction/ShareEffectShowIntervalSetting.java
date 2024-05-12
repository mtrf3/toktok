package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.ShareEffectIntervalConfig;

@SettingsKey("live_show_share_effect_params")
/* loaded from: classes6.dex */
public final class ShareEffectShowIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final ShareEffectIntervalConfig DEFAULT;
    public static final ShareEffectShowIntervalSetting INSTANCE = new ShareEffectShowIntervalSetting();

    static {
        ShareEffectIntervalConfig shareEffectIntervalConfig = new ShareEffectIntervalConfig();
        shareEffectIntervalConfig.anchorInterval = 1;
        shareEffectIntervalConfig.audienceInterval = 1;
        shareEffectIntervalConfig.showShareEffect = false;
        DEFAULT = shareEffectIntervalConfig;
    }

    public final ShareEffectIntervalConfig getValue() {
        ShareEffectIntervalConfig shareEffectIntervalConfig = (ShareEffectIntervalConfig) SettingsManager.INSTANCE.getValueSafely(ShareEffectShowIntervalSetting.class);
        if (shareEffectIntervalConfig == null) {
            return DEFAULT;
        }
        return shareEffectIntervalConfig;
    }
}
