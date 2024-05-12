package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_fixed_layout_btn_mapping_switch")
/* loaded from: classes6.dex */
public final class MultiGuestFixedLayoutBtnMappingSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestFixedLayoutBtnMappingSwitch INSTANCE = new MultiGuestFixedLayoutBtnMappingSwitch();

    public final boolean isOn() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFixedLayoutBtnMappingSwitch.class);
    }
}
