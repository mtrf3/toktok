package X;

import android.view.MotionEvent;

/* renamed from: X.Smw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73126Smw implements Runnable {
    public final MotionEvent LJLIL;
    public final /* synthetic */ C73125Smv LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C73125Smv c73125Smv = this.LJLILLLLZI;
            c73125Smv.LLLJIL = false;
            WXG wxg = c73125Smv.LLLIIIIL;
            if (wxg != null && wxg.onSingleTapConfirmed(this.LJLIL)) {
                this.LJLILLLLZI.LJLJJLL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC73126Smw(C73125Smv c73125Smv, MotionEvent motionEvent) {
        this.LJLILLLLZI = c73125Smv;
        this.LJLIL = motionEvent;
    }
}
