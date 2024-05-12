package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("single_view_render_optimize")
/* loaded from: classes11.dex */
public final class MultiGuestV3SingleViewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3SingleViewSetting INSTANCE = new MultiGuestV3SingleViewSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3SingleViewSetting.class);
    }
}