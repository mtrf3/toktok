package X;

import android.view.Choreographer;
import java.lang.ref.WeakReference;

/* renamed from: X.VEz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ChoreographerFrameCallbackC79421VEz implements Choreographer.FrameCallback {
    public final WeakReference<VOE> LJLIL;

    public ChoreographerFrameCallbackC79421VEz(VOE voe) {
        this.LJLIL = new WeakReference<>(voe);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        VOE voe = this.LJLIL.get();
        if (voe != null) {
            voe.LJII();
        }
    }
}
