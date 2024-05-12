package X;

import Y.ARunnableS28S0200000_9;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.LRs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54272LRs {
    public static final /* synthetic */ int LIZJ = 0;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public InterfaceC54279LRz LIZIZ;

    public abstract void LIZIZ();

    public final void LIZ(InterfaceC54279LRz observer) {
        o.LJIIIZ(observer, "observer");
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            this.LIZ.post(new ARunnableS28S0200000_9(observer, this, 2));
        } else if (this.LIZIZ == null) {
            this.LIZIZ = observer;
            LIZIZ();
        } else {
            this.LIZIZ = observer;
        }
    }
}
