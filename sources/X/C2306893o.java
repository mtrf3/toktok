package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.93o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2306893o {
    public final ExecutorService LIZ;

    public C2306893o(ExecutorService executorService) {
        this.LIZ = executorService;
    }

    public final void LIZ(final Runnable runnable) {
        ExecutorService executorService = this.LIZ;
        if (executorService != null) {
            executorService.execute(new Runnable(runnable) { // from class: X.93n
                public static final Object LJLILLLLZI = new Object();
                public final Runnable LJLIL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        synchronized (LJLILLLLZI) {
                            Runnable runnable2 = this.LJLIL;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    this.LJLIL = runnable;
                }
            });
        }
    }
}
