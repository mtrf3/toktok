package X;

import Y.ARunnableS47S0100000_11;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes12.dex */
public final class PF1 {
    public final PthreadThread LIZ;
    public final BlockingQueue<Runnable> LIZIZ;

    public PF1() {
        if (Build.VERSION.SDK_INT > 21) {
            this.LIZIZ = new LinkedTransferQueue();
        } else {
            this.LIZIZ = new LinkedBlockingQueue();
        }
        this.LIZ = new PthreadThread(new ARunnableS47S0100000_11(this, 162), "looper_monitor");
        new PF2(this, C16880lQ.LLJJJJ());
    }

    public final void LIZ(Runnable runnable) {
        this.LIZIZ.offer(runnable);
    }
}
