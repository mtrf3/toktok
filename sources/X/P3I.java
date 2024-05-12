package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class P3I extends AtomicLong implements ThreadFactory {
    public static final long serialVersionUID = -7789753024099756196L;
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RxThreadFactory[");
        return JBR.LJFF(LIZ, this.LJLIL, "]", LIZ);
    }

    public P3I(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread pthreadThread;
        String str = this.LJLIL + '-' + incrementAndGet();
        if (this.LJLJI) {
            pthreadThread = new P3J(runnable, str);
        } else {
            pthreadThread = new PthreadThread(runnable, str);
        }
        pthreadThread.setPriority(this.LJLILLLLZI);
        pthreadThread.setDaemon(true);
        return pthreadThread;
    }

    public P3I(String str, int i) {
        this(str, i, false);
    }

    public P3I(String str, int i, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
