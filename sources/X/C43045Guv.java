package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Guv */
/* loaded from: classes8.dex */
public final class C43045Guv {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());

    public static /* synthetic */ void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        ExecutorService executorService = C10K.LJI;
        o.LJIIIIZZ(executorService, "Task.BACKGROUND_EXECUTOR");
        LIZ(executorService, interfaceC65784Pro);
    }

    public static final void LIZ(ExecutorService executor, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(executor, "executor");
        o.LJIIIZ(action, "action");
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            C10K.LIZIZ(new ACallableS110S0100000_7(action, 14), executor, null);
        } else {
            action.invoke();
        }
    }

    public static final void LIZJ(long j, Runnable runnable) {
        if (j > 0) {
            LIZ.postDelayed(runnable, j);
        } else {
            LIZ.post(runnable);
        }
    }

    public static final void LIZLLL(InterfaceC65784Pro action, long j) {
        o.LJIIIZ(action, "action");
        if (j <= 0) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                action.invoke();
                return;
            } else {
                LIZ.post(new ARunnableS43S0100000_7(action, 55));
                return;
            }
        }
        LIZ.postDelayed(new ARunnableS43S0100000_7(action, 55), j);
    }
}
