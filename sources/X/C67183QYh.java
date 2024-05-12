package X;

import Y.ACallableS82S0101000_11;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.QYh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67183QYh implements QGY, QYR {
    public static final ThreadFactoryC63826P3e LJFF = new ThreadFactory() { // from class: X.P3e
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new PthreadThread(runnable, "heartbeat-information-executor");
        }
    };
    public final C6Y7<C38324F2i> LIZ;
    public final Context LIZIZ;
    public final C6Y7<QYS> LIZJ;
    public final java.util.Set<InterfaceC67212QZk> LIZLLL;
    public final Executor LJ;

    public C67183QYh() {
        throw null;
    }

    @Override // X.QYR
    public final synchronized QYD LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        C38324F2i c38324F2i = this.LIZ.get();
        if (c38324F2i.LJIIIIZZ(currentTimeMillis)) {
            c38324F2i.LJI();
            return QYD.GLOBAL;
        }
        return QYD.NONE;
    }

    @Override // X.QGY
    public final C67646Qgk LIZIZ() {
        Context context = this.LIZIZ;
        if (Build.VERSION.SDK_INT >= 24 && (!C10730bV.LIZ(context))) {
            return C67637Qgb.LJ("");
        }
        return C67637Qgb.LIZJ(new CallableC67193QYr(0, this), this.LJ);
    }

    public final void LIZJ() {
        if (this.LIZLLL.size() <= 0) {
            C67637Qgb.LJ(null);
            return;
        }
        Context context = this.LIZIZ;
        if (Build.VERSION.SDK_INT >= 24 && (!C10730bV.LIZ(context))) {
            C67637Qgb.LJ(null);
        } else {
            C67637Qgb.LIZJ(new ACallableS82S0101000_11(0, this, 1), this.LJ);
        }
    }

    public C67183QYh(final Context context, final String str, java.util.Set<InterfaceC67212QZk> set, C6Y7<QYS> c6y7) {
        C6Y7<C38324F2i> c6y72 = new C6Y7() { // from class: X.QYi
            @Override // X.C6Y7
            public final Object get() {
                return new C38324F2i(context, str);
            }
        };
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), LJFF);
        this.LIZ = c6y72;
        this.LIZLLL = set;
        this.LJ = pThreadPoolExecutor;
        this.LIZJ = c6y7;
        this.LIZIZ = context;
    }
}
