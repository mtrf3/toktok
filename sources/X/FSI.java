package X;

import Y.ARunnableS18S0101000_14;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class FSI implements ThreadFactory {
    public final AtomicInteger LJLIL = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(2, runnable, 24);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CrAsyncTask #");
        return new Thread(aRunnableS18S0101000_14, C47135Ieh.LIZJ(this.LJLIL, LIZ, LIZ));
    }
}
