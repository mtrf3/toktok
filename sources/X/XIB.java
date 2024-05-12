package X;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* loaded from: classes16.dex */
public class XIB extends XIC {
    public final CoroutineScheduler LJLIL = new CoroutineScheduler(V8B.LIZIZ, V8B.LIZJ, V8B.LIZLLL, "DefaultDispatcher");

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.LJLIL, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            XJE.LJLIL.dispatch(mba, runnable);
        }
    }

    @Override // X.XKW
    public final void dispatchYield(MBA mba, Runnable runnable) {
        try {
            CoroutineScheduler.dispatch$default(this.LJLIL, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            XJE.LJLIL.dispatchYield(mba, runnable);
        }
    }
}
