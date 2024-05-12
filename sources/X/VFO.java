package X;

import Y.ARunnableS50S0100000_14;
import android.view.Choreographer;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VFO implements Choreographer.FrameCallback {
    public final /* synthetic */ ARunnableS50S0100000_14 LJLIL;

    public VFO(ARunnableS50S0100000_14 aRunnableS50S0100000_14) {
        this.LJLIL = aRunnableS50S0100000_14;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        LLog.LIZLLL(2, ((VOO) this.LJLIL.l0).LJIILJJIL, "onRootViewDraw ObserverHandler");
        ((VOO) this.LJLIL.l0).LJI();
    }
}
