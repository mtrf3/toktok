package X;

import Y.ARunnableS42S0100000_6;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FSp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC39007FSp implements Runnable {
    public static ExecutorService LJLJI;
    public static ExecutorService LJLJJI;
    public final Runnable LJLIL;
    public final boolean LJLILLLLZI = false;

    static {
        ExecutorService executorService = C38016Ew0.LIZ;
        LJLJI = executorService;
        LJLJJI = executorService;
        new AtomicInteger();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean LIZ;
        try {
            Runnable runnable = this.LJLIL;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZ() {
        Runnable runnable;
        if (Logger.debug()) {
            runnable = new ARunnableS42S0100000_6(this, 141);
        } else {
            runnable = this;
        }
        if (this.LJLILLLLZI) {
            LJLJJI.submit(runnable);
        } else {
            LJLJI.submit(runnable);
        }
    }

    public RunnableC39007FSp(Runnable runnable) {
        this.LJLIL = runnable;
    }

    public static void LIZIZ(Runnable runnable) {
        LJLJI.submit(runnable);
    }

    public RunnableC39007FSp(Object obj) {
    }
}
