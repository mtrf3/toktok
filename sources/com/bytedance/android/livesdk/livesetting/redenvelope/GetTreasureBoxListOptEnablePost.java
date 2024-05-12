package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_treasurebox_interface_optimization_enable_post")
/* loaded from: classes6.dex */
public final class GetTreasureBoxListOptEnablePost {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GetTreasureBoxListOptEnablePost INSTANCE = new GetTreasureBoxListOptEnablePost();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GetTreasureBoxListOptEnablePost.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
