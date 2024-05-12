package X;

import Y.ARunnableS50S0100000_14;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Vab, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80005Vab implements InterfaceExecutorC06770Oj {
    public final ExecutorService LJLIL;

    public C80005Vab(PThreadPoolExecutor pThreadPoolExecutor) {
        this.LJLIL = pThreadPoolExecutor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(new ARunnableS50S0100000_14(runnable, 241));
    }
}
