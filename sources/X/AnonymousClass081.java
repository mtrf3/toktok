package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.081, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class AnonymousClass081 implements ThreadFactory {
    public final /* synthetic */ String LJLIL;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, this.LJLIL);
        pthreadThread.setPriority(10);
        return pthreadThread;
    }
}
