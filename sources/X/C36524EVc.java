package X;

import android.os.SystemClock;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import kotlin.jvm.internal.o;

/* renamed from: X.EVc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36524EVc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, int... masks) {
        o.LJIIIZ(masks, "masks");
        if (((Number) DUR.LIZ.getValue()).intValue() == 0 || !JatoXL.isInited()) {
            return;
        }
        SystemClock.uptimeMillis();
        for (int i : masks) {
            if ((((Number) DUR.LIZ.getValue()).intValue() & i) == i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i == 8 && C36531EVj.LJIIIIZZ) {
                                JatoXL.requestBlockGc(j);
                            }
                        } else {
                            JatoXL.boostRenderThread(FKM.LIZ(), -20);
                            C1DH.LJJIJIIJIL(j, RunnableC36526EVe.LJLIL);
                        }
                    } else {
                        JatoXL.tryCpuBoost(j);
                    }
                } else {
                    CpusetManager.bindBigCore();
                    C1DH.LJJIJIIJIL(j, RunnableC36525EVd.LJLIL);
                }
            } else if (i != -2) {
                if (i == -1) {
                    CpusetManager.resetCoreBind();
                }
            } else {
                JatoXL.resetRenderThread();
            }
        }
    }
}
