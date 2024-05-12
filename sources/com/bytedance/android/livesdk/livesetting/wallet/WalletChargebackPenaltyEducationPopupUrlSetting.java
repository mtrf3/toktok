package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_chargeback_penalty_education_popup_url")
/* loaded from: classes6.dex */
public final class WalletChargebackPenaltyEducationPopupUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final WalletChargebackPenaltyEducationPopupUrlSetting INSTANCE = new WalletChargebackPenaltyEducationPopupUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(WalletChargebackPenaltyEducationPopupUrlSetting.class);
    }
}
