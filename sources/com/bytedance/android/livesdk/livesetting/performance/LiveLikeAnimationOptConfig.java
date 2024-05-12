package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.CG1;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_like_animation_opt")
/* loaded from: classes6.dex */
public final class LiveLikeAnimationOptConfig {
    public static final LiveLikeAnimationOptConfig INSTANCE = new LiveLikeAnimationOptConfig();

    @Group(isDefault = true, value = "default group")
    public static final LikeAnimationOptModel DEFAULT = new LikeAnimationOptModel(false, 60, false);
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CG1.LJLIL);

    public static final boolean enableDynamicAdjustAnimation() {
        return INSTANCE.getValue().likeAnimationDynamicAdjust;
    }

    private final LikeAnimationOptModel getValue() {
        return (LikeAnimationOptModel) value$delegate.getValue();
    }

    public static final boolean likeAnimationFluencyOpt() {
        return INSTANCE.getValue().likeAnimationFluencyOpt;
    }

    public static final int likeAnimationFps() {
        LiveLikeAnimationOptConfig liveLikeAnimationOptConfig = INSTANCE;
        if (liveLikeAnimationOptConfig.getValue().likeAnimationFps > 0) {
            return liveLikeAnimationOptConfig.getValue().likeAnimationFps;
        }
        return 60;
    }
}
