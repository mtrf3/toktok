package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_multi_live_anchor_switch_frequency")
/* loaded from: classes6.dex */
public final class MultiLiveAnchorSwitchFrequency {
    public static final MultiLiveAnchorSwitchFrequency INSTANCE = new MultiLiveAnchorSwitchFrequency();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 15;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiLiveAnchorSwitchFrequency.class);
    }
}
