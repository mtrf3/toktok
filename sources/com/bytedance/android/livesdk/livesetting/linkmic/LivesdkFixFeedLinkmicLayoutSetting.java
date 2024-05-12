package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_fix_feed_linkmic_layout")
/* loaded from: classes11.dex */
public final class LivesdkFixFeedLinkmicLayoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkFixFeedLinkmicLayoutSetting INSTANCE = new LivesdkFixFeedLinkmicLayoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkFixFeedLinkmicLayoutSetting.class);
    }
}
