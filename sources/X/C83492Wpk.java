package X;

import Y.IDHandlerS24S0100000_14;
import android.content.Context;
import android.os.HandlerThread;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83492Wpk {
    public IDHandlerS24S0100000_14 LIZ;
    public final HandlerThread LIZIZ;
    public IDHandlerS24S0100000_14 LIZJ;
    public InterfaceC83500Wps LIZLLL;
    public String LJ;
    public String LJFF;
    public final IDqS456S0100000_14 LJI;
    public final InterfaceC83513Wq5 LJII;
    public final Context LJIIIIZZ;
    public final int LJIIIZ;
    public final C83489Wph LJIIJ;
    public final boolean LJIIJJI;

    public final void LIZ() {
        IDHandlerS24S0100000_14 iDHandlerS24S0100000_14 = this.LIZ;
        if (iDHandlerS24S0100000_14 != null) {
            iDHandlerS24S0100000_14.sendEmptyMessage(1001);
        } else {
            o.LJIJI("workHandler");
            throw null;
        }
    }

    public C83492Wpk(InterfaceC83513Wq5 imageDetector, Context context, int i, C83489Wph c83489Wph, boolean z) {
        o.LJIIIZ(imageDetector, "imageDetector");
        o.LJIIIZ(context, "context");
        this.LJII = imageDetector;
        this.LJIIIIZZ = context;
        this.LJIIIZ = i;
        this.LJIIJ = c83489Wph;
        this.LJIIJJI = z;
        HandlerThread handlerThread = new HandlerThread("pixaloop_work");
        this.LIZIZ = handlerThread;
        new IDqS456S0100000_14(this, 1);
        this.LJI = new IDqS456S0100000_14(this, 2);
        handlerThread.start();
        this.LIZ = new IDHandlerS24S0100000_14(this, handlerThread.getLooper(), 3);
        this.LIZJ = new IDHandlerS24S0100000_14(this, C16880lQ.LLJJJJ(), 4);
    }
}
