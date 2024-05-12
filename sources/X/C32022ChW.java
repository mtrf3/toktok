package X;

import Y.ARunnableS4S0201000_1;
import android.os.Handler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: X.ChW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32022ChW {
    public static final PThreadScheduledThreadPoolExecutor LIZJ = new PThreadScheduledThreadPoolExecutor(4, new DefaultThreadFactory("d/TaskManager"));
    public static C32022ChW LIZLLL;
    public boolean LIZ;
    public Executor LIZIZ;

    public static synchronized C32022ChW LIZIZ() {
        C32022ChW c32022ChW;
        synchronized (C32022ChW.class) {
            if (LIZLLL == null) {
                LIZLLL = new C32022ChW();
            }
            c32022ChW = LIZLLL;
        }
        return c32022ChW;
    }

    public final void LIZ(Handler handler, Callable callable, int i) {
        if (this.LIZ) {
            this.LIZIZ.execute(new ARunnableS4S0201000_1(i, handler, callable, 11));
            return;
        }
        throw new IllegalStateException("TaskManager not init");
    }
}
