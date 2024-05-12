package X;

import Y.ARunnableS47S0100000_11;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes12.dex */
public final class QFJ implements ThreadFactory {
    public final String LJLIL = "ttnet-io";

    static {
        C16880lQ.LJLLJ(QFJ.class);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Logger.debug();
        return new PthreadThread(new ARunnableS47S0100000_11(runnable, 108), this.LJLIL);
    }
}
