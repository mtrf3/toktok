package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.EkR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ThreadFactoryC37299EkR implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "ProxyServer$1");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video-proxyserver-");
        LIZ.append(pthreadThread.getId());
        pthreadThread.setName(X1D.LIZIZ(LIZ));
        return pthreadThread;
    }
}
