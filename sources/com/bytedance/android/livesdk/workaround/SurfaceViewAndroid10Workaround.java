package com.bytedance.android.livesdk.workaround;

import X.C221108m2;
import X.C5H3;
import X.YKH;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("surfaceview_android10_workaround")
/* loaded from: classes16.dex */
public final class SurfaceViewAndroid10Workaround {
    public static final SurfaceViewAndroid10Workaround INSTANCE = new SurfaceViewAndroid10Workaround();

    @Group(isDefault = true, value = "default")
    public static final Options DEFAULT = new Options(false, false, false, false, false, 31, null);
    public static final C5H3 optimizeConfig$delegate = C221108m2.LIZIZ(YKH.LJLIL);

    private final Options getOptimizeConfig() {
        return (Options) optimizeConfig$delegate.getValue();
    }

    public static final boolean isFurtherOptimizePositionChangeProxy() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optFurtherPositionChange;
        }
        return false;
    }

    public static final boolean isOptimizePositionChangeProxy() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optPositionChange;
        }
        return false;
    }

    public static final boolean isProxyPositionChangeListenerOfSurfaceViewOtherPlan() {
        Options optimizeConfig = INSTANCE.getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optOtherPlan;
        }
        return false;
    }

    public final boolean isProxyPositionChangeListenerOfSurfaceView() {
        Options optimizeConfig = getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optEnablePositionChange;
        }
        return false;
    }

    public final boolean isProxyPreviewPositionChangeListenerOfSurfaceView() {
        Options optimizeConfig = getOptimizeConfig();
        if (optimizeConfig != null) {
            return optimizeConfig.optEnablePreviewPositionChange;
        }
        return false;
    }

    public final Options getDEFAULT() {
        return DEFAULT;
    }
}
