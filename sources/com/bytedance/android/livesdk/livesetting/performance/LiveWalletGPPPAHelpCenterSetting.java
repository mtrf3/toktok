package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58509Mxl;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gpppa_recharge_ban_help_center")
/* loaded from: classes11.dex */
public final class LiveWalletGPPPAHelpCenterSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://support.tiktok.com/en/using-tiktok/growing-your-audience/government-politician-and-political-party-accounts";
    public static final LiveWalletGPPPAHelpCenterSetting INSTANCE = new LiveWalletGPPPAHelpCenterSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58509Mxl.LJLIL);

    private final String getSettingValue() {
        return (String) settingValue$delegate.getValue();
    }

    public final String getValue() {
        return getSettingValue();
    }
}
