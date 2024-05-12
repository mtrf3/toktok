package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveAvatarAnimationOptimizeV2Config;

@SettingsKey("live_avatar_animation_optimize_v2")
/* loaded from: classes6.dex */
public final class LiveAvatarAnimationOptimizeV2Setting {

    @Group("v2")
    public static final LiveAvatarAnimationOptimizeV2Config V2;
    public static final LiveAvatarAnimationOptimizeV2Setting INSTANCE = new LiveAvatarAnimationOptimizeV2Setting();

    @Group(isDefault = true, value = "default group")
    public static final LiveAvatarAnimationOptimizeV2Config DEFAULT = LiveAvatarAnimationOptimizeV2Config.LIZ;

    static {
        LiveAvatarAnimationOptimizeV2Config liveAvatarAnimationOptimizeV2Config = new LiveAvatarAnimationOptimizeV2Config();
        liveAvatarAnimationOptimizeV2Config.enable = true;
        V2 = liveAvatarAnimationOptimizeV2Config;
    }

    public final boolean getEnable() {
        LiveAvatarAnimationOptimizeV2Config liveAvatarAnimationOptimizeV2Config = (LiveAvatarAnimationOptimizeV2Config) SettingsManager.INSTANCE.getValueSafely(LiveAvatarAnimationOptimizeV2Setting.class);
        if (liveAvatarAnimationOptimizeV2Config != null) {
            return liveAvatarAnimationOptimizeV2Config.enable;
        }
        return false;
    }
}
