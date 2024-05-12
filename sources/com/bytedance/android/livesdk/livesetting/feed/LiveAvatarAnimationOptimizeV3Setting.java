package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_avatar_animation_optimize_v3")
/* loaded from: classes11.dex */
public final class LiveAvatarAnimationOptimizeV3Setting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAvatarAnimationOptimizeV3Setting INSTANCE = new LiveAvatarAnimationOptimizeV3Setting();

    @Group("v2")
    public static final int V2 = 1;

    @Group("v3")
    public static final int V3 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAvatarAnimationOptimizeV3Setting.class);
    }
}
