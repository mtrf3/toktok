package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C5H3;
import X.C63;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_self_like_animation_behavior")
/* loaded from: classes6.dex */
public final class LiveSelfLinkedLikeBehaviorSetting {
    public static final LiveSelfLinkedLikeBehaviorSetting INSTANCE = new LiveSelfLinkedLikeBehaviorSetting();

    @Group(isDefault = true, value = "default group")
    public static final LikeBehaviorConfig DEFAULT = new LikeBehaviorConfig();
    public static final C5H3 strategy$delegate = C221108m2.LIZIZ(C63.LJLIL);

    /* loaded from: classes6.dex */
    public static final class LikeBehaviorConfig {

        @InterfaceC65349Pkn("self_like_linked_animator_enable")
        public boolean self_like_linked_animator_enable = true;

        @InterfaceC65349Pkn("self_like_lottie_animation_enable")
        public boolean self_like_lottie_animation_enable = true;
    }

    public final LikeBehaviorConfig getStrategy() {
        return (LikeBehaviorConfig) strategy$delegate.getValue();
    }

    public final LikeBehaviorConfig getValue() {
        return (LikeBehaviorConfig) SettingsManager.INSTANCE.getValueSafely(LiveSelfLinkedLikeBehaviorSetting.class);
    }

    public final boolean isSelfLikeLinkedBreathAnimatorEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.self_like_linked_animator_enable;
    }

    public final boolean isSelfLikeLottieAnimationEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.self_like_lottie_animation_enable;
    }

    public final boolean isSelfLikePathAnimationEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.self_like_linked_animator_enable;
    }

    public final boolean isSelfLikeSimpleAnimationEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return !strategy.self_like_linked_animator_enable;
    }
}
