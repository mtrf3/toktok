package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.IVl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46725IVl {
    public static double LIZ = -1.0d;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C46724IVk.LJLIL);

    public static final boolean LIZ() {
        if (LIZ < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            LIZ = ThreadLocalRandom.current().nextDouble();
        }
        if (LIZ < ((Number) LIZIZ.getValue()).doubleValue()) {
            return true;
        }
        return false;
    }
}
