package X;

import com.ss.android.ugc.aweme.dsp.experiment.PerformanceConfig;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Zs3, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91279Zs3 {
    public static final HashMap<String, AtomicBoolean> LIZ = new HashMap<>(2);
    public static final Runnable LIZIZ = RunnableC91275Zrz.LJLIL;
    public static final Runnable LIZJ = RunnableC91277Zs1.LJLIL;
    public static final Runnable LIZLLL = RunnableC91276Zs0.LJLIL;
    public static final Runnable LJ = RunnableC91278Zs2.LJLIL;

    public static boolean LIZ() {
        C64399PPf.LIZ.getClass();
        return ((PerformanceConfig) C64399PPf.LIZJ.getValue()).getSmoothConfig().getEnableUpload();
    }

    public static void LIZIZ() {
        AtomicBoolean atomicBoolean = LIZ.get("dsp_launch");
        if (atomicBoolean == null || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        C40443Fu3.LIZ("dsp_launch").stop();
    }

    public static void LIZJ() {
        AtomicBoolean atomicBoolean = LIZ.get("dsp_sub_player_launch");
        if (atomicBoolean == null || atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        C40443Fu3.LIZ("dsp_sub_player_launch").stop();
    }
}
