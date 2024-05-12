package X;

import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Eyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38192Eyq {
    public static final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public static PThreadPoolExecutor LIZIZ;

    public static ExecutorService LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new PThreadPoolExecutor(4, 8, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("HybridMonitorExecutor"), new ThreadPoolExecutor.DiscardPolicy());
        }
        PThreadPoolExecutor pThreadPoolExecutor = LIZIZ;
        if (pThreadPoolExecutor != null) {
            return pThreadPoolExecutor;
        }
        o.LJIIZILJ();
        throw null;
    }

    public static void LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        LIZ().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 73));
    }

    public static void LIZJ(Runnable runnable) {
        LIZ().execute(new RunnableC37827Esx(runnable));
    }
}
