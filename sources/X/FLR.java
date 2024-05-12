package X;

import com.ss.android.ugc.aweme.experiment.ThreadConvergenceConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.SuperThreadPool;
import com.ss.android.ugc.bytex.pthread.base.convergence.dredge.DredgeHandler;
import com.ss.android.ugc.bytex.pthread.base.convergence.executor.AdaptiveThreadPoolExecutor;

/* loaded from: classes7.dex */
public final class FLR {
    public static final ThreadConvergenceConfig LIZ = new ThreadConvergenceConfig();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(FKA.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(FKO.LJLIL);

    public static void LIZ() {
        if (LIZIZ(1)) {
            ThreadConvergenceConfig threadConvergenceConfig = (ThreadConvergenceConfig) LIZJ.getValue();
            SuperThreadPool superThreadPool = SuperThreadPool.INSTANCE;
            superThreadPool.setEnablePriority(true);
            superThreadPool.setEnableBlockFetchTask(false);
            superThreadPool.setIdleWorkerKeepAliveNs(threadConvergenceConfig.idleWorkerKeepAliveNs);
            DredgeHandler dredgeHandler = new DredgeHandler();
            dredgeHandler.setInterval(threadConvergenceConfig.dredgeInterval);
            dredgeHandler.setEnable(true);
            if (LIZIZ(2)) {
                superThreadPool.setEnableType(11);
            } else {
                superThreadPool.setEnableType(10);
            }
            superThreadPool.setExecutor(new AdaptiveThreadPoolExecutor(threadConvergenceConfig.corePoolSize, threadConvergenceConfig.maxPoolSize, dredgeHandler));
            return;
        }
        SuperThreadPool.INSTANCE.setEnableType(0);
    }

    public static final boolean LIZIZ(int i) {
        if ((((Number) LIZIZ.getValue()).intValue() & i) == i) {
            return true;
        }
        return false;
    }
}
