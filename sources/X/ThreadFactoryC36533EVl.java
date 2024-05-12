package X;

import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.EVl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC36533EVl implements ThreadFactory {
    public static final ThreadFactoryC36533EVl LJLIL = new ThreadFactoryC36533EVl();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(new ARunnableS42S0100000_6(runnable, 150), "MainPreloadExecutorKt$getBuilder$1");
        pthreadThread.setName("homepage-main-preload-serial-t");
        return pthreadThread;
    }
}
