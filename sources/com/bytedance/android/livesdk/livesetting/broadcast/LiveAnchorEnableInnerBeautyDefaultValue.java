package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_inner_beauty_smooth_default_value")
/* loaded from: classes6.dex */
public final class LiveAnchorEnableInnerBeautyDefaultValue {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAnchorEnableInnerBeautyDefaultValue INSTANCE = new LiveAnchorEnableInnerBeautyDefaultValue();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorEnableInnerBeautyDefaultValue.class);
    }
}
