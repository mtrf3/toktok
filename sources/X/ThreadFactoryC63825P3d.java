package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.P3d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ThreadFactoryC63825P3d implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(runnable, "SplitCompatBackgroundThread");
    }
}
