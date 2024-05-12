package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public final class P8T implements ThreadFactory {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        PthreadThread pthreadThread = new PthreadThread(runnable, this.LJLIL);
        pthreadThread.setDaemon(this.LJLILLLLZI);
        return pthreadThread;
    }

    public P8T(String str, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
    }
}
