package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_preview_panel_effect_opt")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPreviewPanelEffectOptSetting {

    @Group(isDefault = true, value = "use online logic")
    public static final int DEFAULT = 0;

    @Group("experiment group, no effect")
    public static final int EXPERIMENT_GROUP = 1;
    public static final LinkMicMultiGuestPreviewPanelEffectOptSetting INSTANCE = new LinkMicMultiGuestPreviewPanelEffectOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicMultiGuestPreviewPanelEffectOptSetting.class);
    }
}
