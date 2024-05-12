package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VolumeAdjustmentExperimentParams;

/* renamed from: X.5P9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P9 {
    public static final C5P9 LIZ = new C5P9();
    public static final VolumeAdjustmentExperimentParams LIZIZ = new VolumeAdjustmentExperimentParams(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0.0f, 7, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C5PA.LJLIL);

    public static final boolean LIZ() {
        LIZ.getClass();
        C62822Ol8 c62822Ol8 = LIZJ;
        if (((VolumeAdjustmentExperimentParams) c62822Ol8.getValue()).getEnabled() && ((VolumeAdjustmentExperimentParams) c62822Ol8.getValue()).getDbRange() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return true;
        }
        return false;
    }

    public static final float LIZIZ() {
        if (LIZ()) {
            LIZ.getClass();
            return ((VolumeAdjustmentExperimentParams) LIZJ.getValue()).getDefaultPos();
        }
        return 1.0f;
    }
}
