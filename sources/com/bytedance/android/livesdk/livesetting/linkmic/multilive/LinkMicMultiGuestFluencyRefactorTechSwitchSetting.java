package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguest_fluency_refactor_tech_switch")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestFluencyRefactorTechSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiGuestFluencyRefactorTechSwitchSetting INSTANCE = new LinkMicMultiGuestFluencyRefactorTechSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestFluencyRefactorTechSwitchSetting.class);
    }
}
