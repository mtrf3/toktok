package X;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.Ita, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48058Ita<T> extends LinkedBlockingDeque<T> {
    public ThreadPoolExecutor LJLIL;

    public C48058Ita() {
    }

    public /* synthetic */ C48058Ita(int i) {
        this();
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public final boolean offer(T t) {
        synchronized (this) {
            int poolSize = this.LJLIL.getPoolSize();
            int activeCount = this.LJLIL.getActiveCount();
            int maximumPoolSize = this.LJLIL.getMaximumPoolSize();
            if (activeCount >= poolSize && poolSize < maximumPoolSize) {
                C48841JEv.LJIILIIL("TAG_PROXY_TT", "create new preloader thread", null);
                return false;
            }
            return offerFirst(t);
        }
    }
}
