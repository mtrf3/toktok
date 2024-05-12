package X;

import com.ss.android.ugc.aweme.feed.ab.BottomGradualOptimizeConfig;

/* renamed from: X.8F2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F2 {
    public static final int LIZ() {
        BottomGradualOptimizeConfig bottomGradualOptimizeConfig;
        try {
            FFL.LJIIIZ().getClass();
            bottomGradualOptimizeConfig = (BottomGradualOptimizeConfig) FFL.LJIILLIIL(BottomGradualOptimizeConfig.class, "feed_bottom_gradual_optimize", true);
        } catch (Exception unused) {
            bottomGradualOptimizeConfig = new BottomGradualOptimizeConfig(0, 0.18f);
        }
        if (bottomGradualOptimizeConfig != null) {
            return bottomGradualOptimizeConfig.getGroupId();
        }
        return 0;
    }
}
