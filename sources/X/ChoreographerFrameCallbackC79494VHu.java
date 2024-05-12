package X;

import android.view.Choreographer;

/* renamed from: X.VHu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ChoreographerFrameCallbackC79494VHu implements Choreographer.FrameCallback {
    public final /* synthetic */ Runnable LJLIL;

    public ChoreographerFrameCallbackC79494VHu(Runnable runnable) {
        this.LJLIL = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.LJLIL.run();
    }
}
