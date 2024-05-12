package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.FTh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39025FTh {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final BlockingQueue<Runnable> LIZJ;
    public static final FOX LIZLLL;
    public static final RejectedExecutionHandlerC38912FOy LJ;
    public static final C39026FTi LJFF;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        int max = Math.max(2, Math.min(availableProcessors - 1, 6)) * 2;
        LIZ = max;
        LIZIZ = (max * 2) + 1;
        LIZJ = new LinkedBlockingQueue();
        LIZLLL = new FOX();
        LJ = new RejectedExecutionHandlerC38912FOy();
        LJFF = new C39026FTi();
    }
}
