package X;

import android.view.Choreographer;

/* renamed from: X.Fx2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class ChoreographerFrameCallbackC40628Fx2 implements Choreographer.FrameCallback {
    public final /* synthetic */ C40624Fwy LJLIL;

    public ChoreographerFrameCallbackC40628Fx2(C40624Fwy c40624Fwy) {
        this.LJLIL = c40624Fwy;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        C40624Fwy c40624Fwy = this.LJLIL;
        if (c40624Fwy.LJIILIIL > 0 && c40624Fwy.LJIIJ > 0) {
            long j2 = j - c40624Fwy.LJIIJ;
            if (j2 > 0) {
                long j3 = c40624Fwy.LJIILJJIL;
                if (j3 < c40624Fwy.LJIILIIL) {
                    c40624Fwy.LJIILJJIL = j3 + 1;
                }
                long j4 = c40624Fwy.LJIILL;
                long j5 = c40624Fwy.LJIILJJIL;
                c40624Fwy.LJIILL = (((j5 - 1) * j4) + j2) / j5;
                c40624Fwy.LJIIJJI = c40624Fwy.LJIIL + c40624Fwy.LJIILL;
            }
        }
        c40624Fwy.LJIIJ = j;
        if (c40624Fwy.LJ(c40624Fwy.LJIJ)) {
            c40624Fwy.LJIJ = -1;
        }
        if (this.LJLIL.LJIIIIZZ) {
            C16880lQ.LLIIIJ().postFrameCallback(this.LJLIL.LJIL);
        }
    }
}
