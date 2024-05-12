package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_inner_beauty_smooth_max_value")
/* loaded from: classes6.dex */
public final class LiveAnchorEnableInnerBeautyMaxValue {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 85;
    public static final LiveAnchorEnableInnerBeautyMaxValue INSTANCE = new LiveAnchorEnableInnerBeautyMaxValue();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorEnableInnerBeautyMaxValue.class);
    }
}
