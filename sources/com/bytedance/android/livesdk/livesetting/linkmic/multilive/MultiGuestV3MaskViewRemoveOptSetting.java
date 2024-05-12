package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_linkmic_mask_view_remove_opt")
/* loaded from: classes6.dex */
public final class MultiGuestV3MaskViewRemoveOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3MaskViewRemoveOptSetting INSTANCE = new MultiGuestV3MaskViewRemoveOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3MaskViewRemoveOptSetting.class);
    }
}
