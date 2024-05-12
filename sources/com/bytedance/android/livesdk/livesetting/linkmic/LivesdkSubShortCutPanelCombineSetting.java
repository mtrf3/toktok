package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_sub_short_cut_panel_combine")
/* loaded from: classes6.dex */
public final class LivesdkSubShortCutPanelCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkSubShortCutPanelCombineSetting INSTANCE = new LivesdkSubShortCutPanelCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkSubShortCutPanelCombineSetting.class);
    }
}
