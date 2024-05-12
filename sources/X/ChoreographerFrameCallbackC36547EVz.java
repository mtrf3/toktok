package X;

import android.view.Choreographer;

/* renamed from: X.EVz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ChoreographerFrameCallbackC36547EVz implements Choreographer.FrameCallback {
    public final /* synthetic */ C36546EVy LJLIL;

    public ChoreographerFrameCallbackC36547EVz(C36546EVy c36546EVy) {
        this.LJLIL = c36546EVy;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (C9QH.LIZIZ.booleanValue()) {
            if (C36505EUj.LJ) {
                Choreographer.FrameCallback frameCallback = C36546EVy.LIZJ;
                if (frameCallback != null) {
                    frameCallback.doFrame(j);
                    return;
                }
                return;
            }
            C36546EVy.LJFF.LIZIZ(this.LJLIL.LIZ);
            return;
        }
        Choreographer.FrameCallback frameCallback2 = C36546EVy.LIZJ;
        if (frameCallback2 == null) {
            return;
        }
        frameCallback2.doFrame(j);
    }
}
