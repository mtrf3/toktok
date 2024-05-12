package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("single_view_render_planar")
/* loaded from: classes6.dex */
public final class MultiGuestV3SingleViewOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3SingleViewOptSetting INSTANCE = new MultiGuestV3SingleViewOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3SingleViewOptSetting.class);
    }
}
