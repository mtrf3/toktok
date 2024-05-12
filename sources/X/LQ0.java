package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes10.dex */
public final class LQ0 implements Runnable {
    public final /* synthetic */ LQ1 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public LQ0(LQ1 lq1, int i, int i2, boolean z) {
        this.LJLIL = lq1;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
    }

    public final void LIZ() {
        ViewParent parent;
        this.LJLIL.getClass();
        LQ1.LIZJ(1.0f, 0.0f);
        View view = LQM.LJIIIIZZ;
        if (view != null && (parent = view.getParent()) != null) {
            parent.requestLayout();
        }
        this.LJLIL.LJIIIIZZ.setVisibility(0);
        this.LJLIL.LJI.setVisibility(0);
        this.LJLIL.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        this.LJLIL.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(C54170LNu.LJLIL);
        ofFloat.setDuration(160L);
        ofFloat.start();
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
}
