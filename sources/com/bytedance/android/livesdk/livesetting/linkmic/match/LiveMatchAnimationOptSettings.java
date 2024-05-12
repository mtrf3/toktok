package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_animation_opt_settings")
/* loaded from: classes6.dex */
public final class LiveMatchAnimationOptSettings {
    public static final LiveMatchAnimationOptSettings INSTANCE = new LiveMatchAnimationOptSettings();

    @Group(isDefault = true, value = "default group")
    public static final AnimationConfig DEFAULT = new AnimationConfig(false, false, 3, null);

    private final AnimationConfig getConfig() {
        AnimationConfig animationConfig = (AnimationConfig) SettingsManager.INSTANCE.getValueSafely(LiveMatchAnimationOptSettings.class);
        if (animationConfig == null) {
            return DEFAULT;
        }
        return animationConfig;
    }

    public final boolean getPunishAnimUseLottie() {
        return getConfig().punish_anim_use_lottie;
    }

    public final boolean getStartAnimOptEnabled() {
        return getConfig().start_anim_opt;
    }
}
