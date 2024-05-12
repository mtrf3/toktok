package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_group_url")
/* loaded from: classes6.dex */
public final class LiveFansGroupUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveFansGroupUrlSetting INSTANCE = new LiveFansGroupUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFansGroupUrlSetting.class);
    }
}
