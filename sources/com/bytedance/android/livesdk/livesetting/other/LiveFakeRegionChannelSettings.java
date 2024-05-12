package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fake_region_channel")
/* loaded from: classes6.dex */
public final class LiveFakeRegionChannelSettings {
    public static final LiveFakeRegionChannelSettings INSTANCE = new LiveFakeRegionChannelSettings();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveFakeRegionChannelSettings.class);
    }
}
