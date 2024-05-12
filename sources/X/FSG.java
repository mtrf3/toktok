package X;

import Y.ARunnableS0S1200100_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.i0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class FSG {
    public static final int LIZ;
    public static final int LIZIZ;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        LIZ = availableProcessors + 1;
        LIZIZ = (availableProcessors * 2) + 1;
    }

    public static void LIZ(String str, ExecutorService executorService) {
        Runtime.getRuntime().addShutdownHook(new PthreadThread(new ARunnableS0S1200100_6(str, executorService, TimeUnit.SECONDS, 0), i0.LJFF("Twitter Shutdown Hook for ", str)));
    }
}
