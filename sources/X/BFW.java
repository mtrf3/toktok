package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAnimationOptimizationSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BFW implements InterfaceC28252B6y {
    public static final BFW LIZ = new BFW();

    @Override // X.InterfaceC28252B6y
    public final boolean LIZ(C29889BoD c29889BoD) {
        return c29889BoD.LJ(BFS.LIZIZ().LIZJ(), true);
    }

    @Override // X.InterfaceC28252B6y
    public final boolean LIZIZ(ViewGroup container, C29889BoD c29889BoD) {
        o.LJIIIZ(container, "container");
        if (c29889BoD.LJ(BFS.LIZIZ().LIZJ(), true)) {
            if (LiveAnimationOptimizationSetting.INSTANCE.getValue()) {
                B8X.LIZ(container, null);
            } else {
                BFU.LJJZ(container);
            }
            return true;
        }
        return false;
    }
}
