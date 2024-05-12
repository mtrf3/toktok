package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.EwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38027EwB {
    public final FSY LIZ;
    public String LIZIZ;
    public int LIZJ = 1;
    public BlockingQueue<Runnable> LIZLLL = new LinkedBlockingQueue();
    public RejectedExecutionHandler LJ = new ThreadPoolExecutor.AbortPolicy();
    public long LJFF = -1;
    public ThreadFactory LJI;

    public final C38028EwC LIZ() {
        return new C38028EwC(this);
    }

    public C38027EwB(FSY fsy) {
        this.LIZ = fsy;
    }
}
