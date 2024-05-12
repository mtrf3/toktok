package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gpppa_gift_ban_contract_us_url")
/* loaded from: classes6.dex */
public final class GpppaGiftBanContractUsUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final GpppaGiftBanContractUsUrlSetting INSTANCE = new GpppaGiftBanContractUsUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(GpppaGiftBanContractUsUrlSetting.class);
    }
}
