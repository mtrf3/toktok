package X;

import Y.ARunnableS7S0000100_5;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class C67 {
    public static final C5H3<C67> LIZIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C68.LJLIL);
    public ExecutorService LIZ;

    public final void LIZ() {
        NegativeTestExperiment negativeTestExperiment = NegativeTestExperiment.INSTANCE;
        if (!negativeTestExperiment.isEnable()) {
            return;
        }
        C0NB.LJIIIZ("negative_test", "startNegativeTest--------!!!!!!");
        long cpuSleepTime = negativeTestExperiment.getCpuSleepTime();
        ExecutorService LIZ = C38995FSd.LIZ(C38028EwC.LIZ(FSY.SERIAL).LIZ());
        this.LIZ = LIZ;
        LIZ.submit(new ARunnableS7S0000100_5(cpuSleepTime, 0));
    }
}
