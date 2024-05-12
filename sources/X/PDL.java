package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public final class PDL implements ThreadFactory {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, this.LJLIL);
        if (pthreadThread.isDaemon()) {
            pthreadThread.setDaemon(false);
        }
        pthreadThread.setPriority(this.LJLILLLLZI);
        pthreadThread.setUncaughtExceptionHandler(new PDM());
        return pthreadThread;
    }

    public PDL(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
