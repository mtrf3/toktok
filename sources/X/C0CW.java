package X;

import a04.IDfS0S0000000;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0CW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CW {
    public final int LJFF;
    public final Executor LIZ = LIZ(false);
    public final Executor LIZIZ = LIZ(true);
    public final C1NP LIZJ = new AbstractC08560Vg() { // from class: X.1NP
    };
    public final IDfS0S0000000 LIZLLL = new IDfS0S0000000(1);
    public final C0XW LJ = new C0XW(0);
    public final int LJI = Integer.MAX_VALUE;
    public final int LJII = 20;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1NP] */
    public C0CW(C0CU c0cu) {
        this.LJFF = c0cu.LIZ;
    }

    public static Executor LIZ(final boolean z) {
        return C16880lQ.LLLLZI(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: X.0VN
            public final AtomicInteger LJLIL = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str;
                if (z) {
                    str = "WM.task-";
                } else {
                    str = "androidx.work-";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(this.LJLIL.incrementAndGet());
                return new PthreadThread(runnable, X1D.LIZIZ(LIZ));
            }
        });
    }
}
