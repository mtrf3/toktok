package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C5H3;
import X.InterfaceC65349Pkn;
import X.YKF;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_bottom_right_like_animation_behavior")
/* loaded from: classes16.dex */
public final class LiveBottomRightLikeBehaviorSetting {
    public static final LiveBottomRightLikeBehaviorSetting INSTANCE = new LiveBottomRightLikeBehaviorSetting();

    @Group(isDefault = true, value = "default group")
    public static final LikeBehaviorConfig DEFAULT = new LikeBehaviorConfig();
    public static final C5H3 strategy$delegate = C221108m2.LIZIZ(YKF.LJLIL);

    /* loaded from: classes16.dex */
    public static final class LikeBehaviorConfig {

        @InterfaceC65349Pkn("right_bottom_others_appear_animation_alpha_start")
        public float right_bottom_others_appear_animation_alpha_start = -1.0f;

        @InterfaceC65349Pkn("right_bottom_others_appear_animation_alpha_end")
        public float right_bottom_others_appear_animation_alpha_end = -1.0f;

        @InterfaceC65349Pkn("right_bottom_others_disappear_animation_alpha_start")
        public float right_bottom_others_disappear_animation_alpha_start = -1.0f;

        @InterfaceC65349Pkn("right_bottom_others_disappear_animation_alpha_end")
        public float right_bottom_others_disappear_animation_alpha_end = -1.0f;

        @InterfaceC65349Pkn("right_bottom_others_animation_bezier_enable")
        public boolean right_bottom_others_animation_bezier_enable = true;

        @InterfaceC65349Pkn("right_bottom_others_animation_distance_ratio")
        public float right_bottom_others_animation_distance_ratio = 1.0f;

        @InterfaceC65349Pkn("right_bottom_others_animation_time_ratio")
        public float right_bottom_others_animation_time_ratio = 1.0f;

        @InterfaceC65349Pkn("right_bottom_self_disappear_animation_alpha_start")
        public float right_bottom_self_disappear_animation_alpha_start = -1.0f;

        @InterfaceC65349Pkn("right_bottom_self_disappear_animation_alpha_end")
        public float right_bottom_self_disappear_animation_alpha_end = -1.0f;

        @InterfaceC65349Pkn("right_bottom_self_appear_animation_alpha_start")
        public float right_bottom_self_appear_animation_alpha_start = -1.0f;

        @InterfaceC65349Pkn("right_bottom_self_appear_animation_alpha_end")
        public float right_bottom_self_appear_animation_alpha_end = -1.0f;

        @InterfaceC65349Pkn("right_bottom_self_animation_bezier_enable")
        public boolean right_bottom_self_animation_bezier_enable = true;

        @InterfaceC65349Pkn("right_bottom_self_animation_distance_ratio")
        public float right_bottom_self_animation_distance_ratio = 1.0f;

        @InterfaceC65349Pkn("right_bottom_self_animation_time_ratio")
        public float right_bottom_self_animation_time_ratio = 1.0f;
    }

    public final LikeBehaviorConfig getStrategy() {
        return (LikeBehaviorConfig) strategy$delegate.getValue();
    }

    public final LikeBehaviorConfig getValue() {
        return (LikeBehaviorConfig) SettingsManager.INSTANCE.getValueSafely(LiveBottomRightLikeBehaviorSetting.class);
    }

    public final float getRightBottomOthersAnimationDistanceRatio() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_animation_distance_ratio;
    }

    public final float getRightBottomOthersAnimationTimeRatio() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_animation_time_ratio;
    }

    public final float getRightBottomOthersAppearAnimationAlphaEnd() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_appear_animation_alpha_end;
    }

    public final float getRightBottomOthersAppearAnimationAlphaStart() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_appear_animation_alpha_start;
    }

    public final float getRightBottomOthersDisAppearAnimationAlphaEnd() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_disappear_animation_alpha_end;
    }

    public final float getRightBottomOthersDisAppearAnimationAlphaStart() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_disappear_animation_alpha_start;
    }

    public final float getRightBottomSelfAnimationDistanceRatio() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_animation_distance_ratio;
    }

    public final float getRightBottomSelfAnimationTimeRatio() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_animation_time_ratio;
    }

    public final float getRightBottomSelfAppearAnimationAlphaEnd() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_appear_animation_alpha_end;
    }

    public final float getRightBottomSelfAppearAnimationAlphaStart() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_appear_animation_alpha_start;
    }

    public final float getRightBottomSelfDisappearAnimationAlphaEnd() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_disappear_animation_alpha_end;
    }

    public final float getRightBottomSelfDisappearAnimationAlphaStart() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_disappear_animation_alpha_start;
    }

    public final boolean rightBottomOthersAnimationBezierEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_others_animation_bezier_enable;
    }

    public final boolean rightBottomSelfAnimationBezierEnable() {
        LikeBehaviorConfig strategy = getStrategy();
        if (strategy == null) {
            strategy = DEFAULT;
        }
        return strategy.right_bottom_self_animation_bezier_enable;
    }
}
