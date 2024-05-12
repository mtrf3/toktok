package X;

import Y.ARunnableS50S0100000_14;
import android.view.Choreographer;

/* loaded from: classes15.dex */
public final class VF0 implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable LJLIL;

    public VF0(ARunnableS50S0100000_14 aRunnableS50S0100000_14) {
        this.LJLIL = aRunnableS50S0100000_14;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.LJLIL.run();
    }
}
