package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.PvU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ThreadFactoryC66012PvU implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, "logger/ALog$2");
        pthreadThread.setName("Alog_newthreadpoolimpl");
        return pthreadThread;
    }
}
