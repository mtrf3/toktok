package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
public final class OAL implements ThreadFactory {
    public final /* synthetic */ OAP LJLIL = OAR.LIZ;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "/ThreadPool$2");
        StringBuilder sb = new StringBuilder("gecko-check-update-client-thread-");
        OAP oap = this.LJLIL;
        int i = oap.LIZLLL + 1;
        oap.LIZLLL = i;
        sb.append(i);
        pthreadThread.setName(sb.toString());
        pthreadThread.setPriority(3);
        return pthreadThread;
    }
}
