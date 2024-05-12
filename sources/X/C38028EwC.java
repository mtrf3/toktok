package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.EwC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38028EwC {
    public final FSY LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final BlockingQueue<Runnable> LIZLLL;
    public final RejectedExecutionHandler LJ;
    public final long LJFF;
    public final ThreadFactory LJI;

    public C38028EwC(C38027EwB c38027EwB) {
        this.LIZ = c38027EwB.LIZ;
        this.LIZIZ = c38027EwB.LIZIZ;
        this.LIZJ = c38027EwB.LIZJ;
        this.LIZLLL = c38027EwB.LIZLLL;
        this.LJ = c38027EwB.LJ;
        this.LJFF = c38027EwB.LJFF;
        this.LJI = c38027EwB.LJI;
    }

    public static C38027EwB LIZ(FSY fsy) {
        return new C38027EwB(fsy);
    }
}
