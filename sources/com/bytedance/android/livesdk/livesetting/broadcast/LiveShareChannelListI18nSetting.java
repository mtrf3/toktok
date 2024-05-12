package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_share_channel_list_i18n")
/* loaded from: classes11.dex */
public final class LiveShareChannelListI18nSetting {
    public static final LiveShareChannelListI18nSetting INSTANCE = new LiveShareChannelListI18nSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"facebook", "twitter"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveShareChannelListI18nSetting.class);
    }
}
