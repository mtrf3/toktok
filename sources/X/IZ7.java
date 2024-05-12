package X;

import Y.ARunnableS12S0101000_8;
import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZ7 implements IXI {
    @Override // X.IXI
    public final void LJI(IX7 ix7, HandlerThread handlerThread) {
        if (handlerThread == null || o.LJ(handlerThread.getLooper(), C16880lQ.LLJJJJ())) {
            return;
        }
        if (ix7 != null) {
            ix7.LJIIIZ = true;
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS12S0101000_8(4, handlerThread, 2));
    }
}
