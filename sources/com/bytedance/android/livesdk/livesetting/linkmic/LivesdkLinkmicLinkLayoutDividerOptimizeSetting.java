package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livesdk_linkmic_link_layout_divider_optimize")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicLinkLayoutDividerOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicLinkLayoutDividerOptimizeSetting INSTANCE = new LivesdkLinkmicLinkLayoutDividerOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicLinkLayoutDividerOptimizeSetting.class);
    }
}
