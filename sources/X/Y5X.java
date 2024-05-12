package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5X implements InterfaceC86828Y5w {
    public final /* synthetic */ Y5W LIZ;

    public Y5X(Y5W y5w) {
        this.LIZ = y5w;
    }

    @Override // X.InterfaceC86828Y5w
    public final void LIZ(C86824Y5s c86824Y5s) {
        synchronized (this.LIZ.LIZJ) {
            if (this.LIZ.LIZIZ) {
                Handler handler = this.LIZ.LJ;
                o.LJI(handler);
                handler.obtainMessage(10001, c86824Y5s).sendToTarget();
            }
        }
    }

    @Override // X.InterfaceC86828Y5w
    public final void LIZIZ(Exception exc) {
        exc.toString();
        this.LIZ.LIZIZ();
    }
}
