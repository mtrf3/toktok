package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gpppa_gift_ban_help_center_url")
/* loaded from: classes6.dex */
public final class GpppaGiftBanHelpCenterUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final GpppaGiftBanHelpCenterUrlSetting INSTANCE = new GpppaGiftBanHelpCenterUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(GpppaGiftBanHelpCenterUrlSetting.class);
    }
}
