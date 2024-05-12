package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAnimationOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtRoomSlideUpGuideSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BFV implements InterfaceC28252B6y {
    public static final BFV LIZ = new BFV();

    @Override // X.InterfaceC28252B6y
    public final boolean LIZ(C29889BoD c29889BoD) {
        long LJI = c29889BoD.LJI("live.mt.slide_up_guide.last_show", -1L);
        long currentTimeMillis = System.currentTimeMillis();
        if ((LJI > 0 && currentTimeMillis - LJI <= 86400000) || c29889BoD.LJI("live.mt.slide_up_guide.total_show", 0L) >= LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getMaxShowTimes() || !c29889BoD.LJ(BFS.LIZIZ().LIZJ(), true)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC28252B6y
    public final boolean LIZIZ(ViewGroup container, C29889BoD c29889BoD) {
        o.LJIIIZ(container, "container");
        long LJI = c29889BoD.LJI("live.mt.slide_up_guide.last_show", -1L);
        long currentTimeMillis = System.currentTimeMillis();
        if (LJI > 0 && currentTimeMillis - LJI <= 86400000) {
            return false;
        }
        long LJI2 = c29889BoD.LJI("live.mt.slide_up_guide.total_show", 0L);
        if (LJI2 >= LiveMtRoomSlideUpGuideSetting.INSTANCE.getValue().getMaxShowTimes() || !c29889BoD.LJ(BFS.LIZIZ().LIZJ(), true)) {
            return false;
        }
        if (LiveAnimationOptimizationSetting.INSTANCE.getValue()) {
            B8X.LIZ(container, null);
        } else {
            BFU.LJJZ(container);
        }
        c29889BoD.LJIIIIZZ(Long.valueOf(currentTimeMillis), "live.mt.slide_up_guide.last_show");
        c29889BoD.LJIIIIZZ(Long.valueOf(LJI2 + 1), "live.mt.slide_up_guide.total_show");
        return true;
    }
}
