package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_education_popup_recharge_url")
/* loaded from: classes6.dex */
public final class WalletEducationPopupRechargeUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final WalletEducationPopupRechargeUrlSetting INSTANCE = new WalletEducationPopupRechargeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(WalletEducationPopupRechargeUrlSetting.class);
    }
}
