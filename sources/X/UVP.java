package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes14.dex */
public final class UVP {
    public static final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public final UV2 LIZ;
    public final WeakReference<InterfaceC77299UVj> LIZIZ;
    public final WeakReference<InterfaceC77301UVl> LIZJ;
    public final WeakReference<InterfaceC77300UVk> LIZLLL;
    public final WeakReference<InterfaceC77303UVn> LJ;
    public final WeakReference<UVU> LJFF;
    public final long LJI = LJIIIIZZ.addAndGet(1);
    public final XLM LJII;

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tran[");
        LIZ.append(this.LJI);
        LIZ.append(']');
        LIZ.append(this.LIZ.LJIIIZ());
        return X1D.LIZIZ(LIZ);
    }

    public UVP(C32804Cu8 c32804Cu8, WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4, WeakReference weakReference5) {
        this.LIZ = c32804Cu8;
        this.LIZIZ = weakReference;
        this.LIZJ = weakReference2;
        this.LIZLLL = weakReference3;
        this.LJ = weakReference4;
        this.LJFF = weakReference5;
        this.LJII = V8H.LIZ(new UV4(c32804Cu8));
    }
}
