package com.bytedance.android.livesdk.livesetting.game;

import X.C09650Zl;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_live_interrupt_guidelines_v2")
/* loaded from: classes6.dex */
public final class InterruptGuidelinesSettingV2 {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final InterruptGuidelinesSettingV2 INSTANCE = new InterruptGuidelinesSettingV2();

    private final String getStringValue() {
        return SettingsManager.INSTANCE.getStringValue(InterruptGuidelinesSettingV2.class);
    }

    public final InterruptionGuideImproveData getData() {
        try {
            return (InterruptionGuideImproveData) C09650Zl.LIZIZ.LJI(getStringValue(), InterruptionGuideImproveData.class);
        } catch (Exception unused) {
            return null;
        }
    }

    private final int getGroup() {
        Integer num;
        InterruptionGuideImproveData data = getData();
        if (data != null && (num = data.group) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getGuideUrl() {
        InterruptionGuideImproveData data = getData();
        if (data != null) {
            return data.guideUrl;
        }
        return null;
    }

    public final boolean isEnable() {
        if (getGroup() != 0) {
            return true;
        }
        return false;
    }
}
