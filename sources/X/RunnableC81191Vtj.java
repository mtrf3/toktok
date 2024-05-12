package X;

import android.content.Context;
import android.graphics.Matrix;

/* renamed from: X.Vtj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC81191Vtj implements Runnable {
    public final C07X LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ ViewOnTouchListenerC81187Vtf LJLJJI;

    public final void LIZ() {
        VA9<V92> LJ;
        if (!this.LJLIL.LIZ.isFinished() && (LJ = this.LJLJJI.LJ()) != null && this.LJLIL.LIZ.computeScrollOffset()) {
            int currX = this.LJLIL.LIZ.getCurrX();
            int currY = this.LJLIL.LIZ.getCurrY();
            this.LJLJJI.LJLLJ.postTranslate(this.LJLILLLLZI - currX, this.LJLJI - currY);
            LJ.invalidate();
            this.LJLILLLLZI = currX;
            this.LJLJI = currY;
            ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf = this.LJLJJI;
            if (viewOnTouchListenerC81187Vtf.LIZIZ()) {
                Matrix matrix = viewOnTouchListenerC81187Vtf.LJLLJ;
                VA9<V92> LJ2 = viewOnTouchListenerC81187Vtf.LJ();
                if (LJ2 != null) {
                    LJ2.setImageMatrix(matrix);
                }
            }
            this.LJLJJI.getClass();
            LJ.postOnAnimation(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC81191Vtj(ViewOnTouchListenerC81187Vtf viewOnTouchListenerC81187Vtf, Context context) {
        this.LJLJJI = viewOnTouchListenerC81187Vtf;
        this.LJLIL = new C07X(context);
    }
}
