package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceExecutorC06770Oj;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNExecutorService implements InterfaceExecutorC06770Oj {
    public final ExecutorService iExecutor;

    public void shutdown() {
        this.iExecutor.shutdown();
    }

    public KNExecutorService(ExecutorService iExecutor) {
        o.LJIIJ(iExecutor, "iExecutor");
        this.iExecutor = iExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.iExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.effectmanager.knadapt.KNExecutorService$execute$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1__run$___twin___() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            public static void com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(KNExecutorService$execute$1 kNExecutorService$execute$1) {
                boolean LIZ;
                try {
                    kNExecutorService$execute$1.com_ss_android_ugc_effectmanager_knadapt_KNExecutorService$execute$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
