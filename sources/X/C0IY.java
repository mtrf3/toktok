package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0IY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0IY implements ThreadFactory {
    public static final C0IY LJLIL = new C0IY();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new PthreadThread(runnable, "Live-Pitaya-Thread");
    }
}
