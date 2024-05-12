package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.PIz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ThreadFactoryC64237PIz implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(runnable, "Apm_Log_Bypass_Store");
    }
}
