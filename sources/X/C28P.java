package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.28P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28P extends QXX {
    public final Object LJLIL;
    public final ExecutorService LJLILLLLZI;
    public volatile Handler LJLJI;

    public C28P() {
        super((Object) null);
        this.LJLIL = new Object();
        this.LJLILLLLZI = C16880lQ.LLLLZI(4, new ThreadFactory() { // from class: X.13H
            public final AtomicInteger LJLIL = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                PthreadThread pthreadThread = new PthreadThread(runnable, "DefaultTaskExecutor$1");
                pthreadThread.setName(C16880lQ.LLLZ("arch_disk_io_%d", new Object[]{Integer.valueOf(this.LJLIL.getAndIncrement())}));
                return pthreadThread;
            }
        });
    }

    @Override // X.QXX
    public final boolean LLJJLIIIJLLLLLLLZ() {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            return true;
        }
        return false;
    }

    public static Handler LLLLZ(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // X.QXX
    public final void LLLLIIL(Runnable runnable) {
        if (this.LJLJI == null) {
            synchronized (this.LJLIL) {
                if (this.LJLJI == null) {
                    this.LJLJI = LLLLZ(C16880lQ.LLJJJJ());
                }
            }
        }
        this.LJLJI.post(runnable);
    }
}
