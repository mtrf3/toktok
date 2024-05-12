package X;

import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.10F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10F {
    public static final C10F LIZJ = new C10F();
    public final ExecutorService LIZ;
    public final C10E LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.10E] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ExecutorService] */
    public C10F() {
        boolean contains;
        PThreadPoolExecutor pThreadPoolExecutor;
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            contains = false;
        } else {
            contains = property.toLowerCase(Locale.US).contains("android");
        }
        if (!contains) {
            pThreadPoolExecutor = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("oltsExecutors"));
        } else {
            PThreadPoolExecutor pThreadPoolExecutor2 = new PThreadPoolExecutor(C10D.LIZJ, C10D.LIZLLL, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("AndroidExecutors"));
            pThreadPoolExecutor2.allowCoreThreadTimeOut(true);
            pThreadPoolExecutor = pThreadPoolExecutor2;
        }
        this.LIZ = pThreadPoolExecutor;
        PThreadExecutorsUtils.newSingleThreadScheduledExecutor(new DefaultThreadFactory("oltsExecutors"));
        this.LIZIZ = new Executor() { // from class: X.10E
            public final ThreadLocal<Integer> LJLIL = new ThreadLocal<>();

            public final void LIZ() {
                Integer num = this.LJLIL.get();
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() - 1;
                if (intValue == 0) {
                    this.LJLIL.remove();
                } else {
                    this.LJLIL.set(Integer.valueOf(intValue));
                }
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Integer num = this.LJLIL.get();
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() + 1;
                this.LJLIL.set(Integer.valueOf(intValue));
                try {
                    if (intValue <= 15) {
                        runnable.run();
                    } else {
                        C38995FSd.LIZJ().execute(runnable);
                    }
                } finally {
                    LIZ();
                }
            }
        };
    }
}
