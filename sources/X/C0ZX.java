package X;

import android.os.Binder;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ZX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0ZX<Params, Progress, Result> {
    public static final PThreadPoolExecutor LJLJJLL;
    public static C0ZU LJLJL;
    public static volatile PThreadPoolExecutor LJLJLJ;
    public final C1PF LJLIL;
    public final C0ZR LJLILLLLZI;
    public volatile C0ZV LJLJI = C0ZV.PENDING;
    public final AtomicBoolean LJLJJI = new AtomicBoolean();
    public final AtomicBoolean LJLJJL = new AtomicBoolean();

    public abstract Result LIZ(Params... paramsArr);

    public void LIZIZ(Result result) {
    }

    public void LIZJ(Result result) {
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0ZQ
            public final AtomicInteger LJLIL = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ModernAsyncTask #");
                return new PthreadThread(runnable, C47135Ieh.LIZJ(this.LJLIL, LIZ, LIZ));
            }
        };
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactory);
        LJLJJLL = pThreadPoolExecutor;
        LJLJLJ = pThreadPoolExecutor;
    }

    public C0ZX() {
        C0ZW<Params, Result> c0zw = new C0ZW<Params, Result>() { // from class: X.1PF
            @Override // java.util.concurrent.Callable
            public final Result call() {
                C0ZX.this.LJLJJL.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) C0ZX.this.LIZ(this.LJLIL);
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.LJLIL = c0zw;
        this.LJLILLLLZI = new FutureTask<Result>(c0zw) { // from class: X.0ZR
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                try {
                    Result result = get();
                    C0ZX c0zx = C0ZX.this;
                    if (!c0zx.LJLJJL.get()) {
                        c0zx.LIZLLL(result);
                    }
                } catch (InterruptedException unused) {
                } catch (CancellationException unused2) {
                    C0ZX c0zx2 = C0ZX.this;
                    if (!c0zx2.LJLJJL.get()) {
                        c0zx2.LIZLLL(null);
                    }
                } catch (ExecutionException e) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ZU] */
    public final void LIZLLL(Object obj) {
        C0ZU c0zu;
        synchronized (C0ZX.class) {
            if (LJLJL == null) {
                LJLJL = new Handler() { // from class: X.0ZU
                    {
                        C16880lQ.LLJJJJ();
                    }

                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        C0ZT c0zt = (C0ZT) message.obj;
                        int i = message.what;
                        if (i != 1) {
                            if (i != 2) {
                                return;
                            }
                            c0zt.LIZ.getClass();
                        } else {
                            C0ZX c0zx = c0zt.LIZ;
                            Object obj2 = c0zt.LIZIZ[0];
                            if (c0zx.LJLJJI.get()) {
                                c0zx.LIZIZ(obj2);
                            } else {
                                c0zx.LIZJ(obj2);
                            }
                            c0zx.LJLJI = C0ZV.FINISHED;
                        }
                    }
                };
            }
            c0zu = LJLJL;
        }
        c0zu.obtainMessage(1, new C0ZT(this, obj)).sendToTarget();
    }
}
