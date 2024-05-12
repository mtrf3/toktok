package com.ss.android.ugc.effectmanager.knadapt;

import X.InterfaceExecutorC06770Oj;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNExecutor implements InterfaceExecutorC06770Oj {
    public final Executor iExecutor;

    public void shutdown() {
    }

    public KNExecutor(Executor iExecutor) {
        o.LJIIJ(iExecutor, "iExecutor");
        this.iExecutor = iExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.iExecutor.execute(new Runnable() { // from class: com.ss.android.ugc.effectmanager.knadapt.KNExecutor$execute$1
            @Override // java.lang.Runnable
            public final void run() {
                com_ss_android_ugc_effectmanager_knadapt_KNExecutor$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_ss_android_ugc_effectmanager_knadapt_KNExecutor$execute$1__run$___twin___() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            public static void com_ss_android_ugc_effectmanager_knadapt_KNExecutor$execute$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(KNExecutor$execute$1 kNExecutor$execute$1) {
                boolean LIZ;
                try {
                    kNExecutor$execute$1.com_ss_android_ugc_effectmanager_knadapt_KNExecutor$execute$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }
}
