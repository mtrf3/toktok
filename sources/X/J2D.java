package X;

import android.view.Choreographer;

/* loaded from: classes9.dex */
public final class J2D implements Choreographer.FrameCallback {
    public J2D(J28 j28) {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        J28.LJIILIIL = j;
    }
}
