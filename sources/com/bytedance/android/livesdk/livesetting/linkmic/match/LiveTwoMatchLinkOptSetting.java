package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("two_match_link_optimize_setting")
/* loaded from: classes14.dex */
public final class LiveTwoMatchLinkOptSetting {
    public static final LiveTwoMatchLinkOptSetting INSTANCE = new LiveTwoMatchLinkOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveTwoMatchLinkOptSettingData DEFAULT = new LiveTwoMatchLinkOptSettingData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);

    public final LiveTwoMatchLinkOptSettingData getValue() {
        LiveTwoMatchLinkOptSettingData liveTwoMatchLinkOptSettingData = (LiveTwoMatchLinkOptSettingData) SettingsManager.INSTANCE.getValueSafely(LiveTwoMatchLinkOptSetting.class);
        if (liveTwoMatchLinkOptSettingData == null) {
            return DEFAULT;
        }
        return liveTwoMatchLinkOptSettingData;
    }

    public final LiveTwoMatchLinkOptSettingData getDEFAULT() {
        return DEFAULT;
    }
}
