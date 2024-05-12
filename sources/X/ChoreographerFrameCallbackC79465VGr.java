package X;

import android.view.Choreographer;
import com.lynx.tasm.core.VSyncMonitor;

/* renamed from: X.VGr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ChoreographerFrameCallbackC79465VGr implements Choreographer.FrameCallback {
    public final /* synthetic */ long LJLIL;

    public ChoreographerFrameCallbackC79465VGr(long j) {
        this.LJLIL = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        VSyncMonitor.LIZ(this.LJLIL, j);
    }
}
