package X;

import android.view.Choreographer;

/* renamed from: X.YDs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class ChoreographerFrameCallbackC87032YDs implements Choreographer.FrameCallback {
    public final /* synthetic */ C87031YDr LJLIL;

    public ChoreographerFrameCallbackC87032YDs(C87031YDr c87031YDr) {
        this.LJLIL = c87031YDr;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C87031YDr c87031YDr = this.LJLIL;
        if (!c87031YDr.LIZLLL) {
            return;
        }
        if (c87031YDr.LIZIZ <= 0) {
            c87031YDr.LIZIZ = j;
        } else {
            c87031YDr.LIZJ++;
        }
        c87031YDr.LIZ = j;
        try {
            C16880lQ.LLIIIJ().postFrameCallback(this);
            if (C87031YDr.LJI) {
                this.LJLIL.LIZ(true);
            }
        } catch (Throwable unused) {
            this.LJLIL.LIZLLL = false;
        }
    }
}
