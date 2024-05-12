package X;

import android.os.Handler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FOz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class RunnableC38913FOz implements Runnable {
    public static final PThreadPoolExecutor LJLJJLL = new PThreadPoolExecutor(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), new DefaultThreadFactory("IntervalHandler"), new ThreadPoolExecutor.DiscardOldestPolicy());
    public final int LJLIL;
    public final Runnable LJLILLLLZI;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJJI;
    public boolean LJLJJL;

    public final void LIZ() {
        if (((Boolean) DXH.LIZIZ.getValue()).booleanValue()) {
            C38995FSd.LJ().execute(this.LJLILLLLZI);
        } else if (!this.LJLJJI) {
            this.LJLJI.post(this);
            this.LJLJJI = true;
        } else {
            this.LJLJJL = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJJL) {
                LJLJJLL.execute(this.LJLILLLLZI);
                this.LJLJJL = false;
            }
            this.LJLJI.postDelayed(this, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC38913FOz(Runnable runnable, int i) {
        this.LJLILLLLZI = runnable;
        this.LJLIL = i;
    }
}
