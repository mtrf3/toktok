package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_guide_popup_recharged")
/* loaded from: classes11.dex */
public final class LiveRechargeGiftGuideSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRechargeGiftGuideSetting INSTANCE = new LiveRechargeGiftGuideSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRechargeGiftGuideSetting.class);
    }
}
