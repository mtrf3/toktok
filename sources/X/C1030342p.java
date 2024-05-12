package X;

import Y.AUListenerS65S0101000_1;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.42p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1030342p implements C43O {
    public final /* synthetic */ C4KD LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ ValueAnimator LIZJ;
    public final /* synthetic */ ViewGroup LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // X.C43O
    public final boolean LIZ() {
        return false;
    }

    @Override // X.C43O
    public final void LIZIZ() {
        if (this.LIZIZ) {
            this.LIZJ.removeAllUpdateListeners();
            this.LIZJ.addUpdateListener(new AUListenerS65S0101000_1(this.LJ, this.LIZLLL, 2));
            this.LIZJ.reverse();
        }
        C1029242e c1029242e = this.LIZ.LIZLLL;
        if (c1029242e != null) {
            c1029242e.LIZIZ();
        }
    }

    @Override // X.C43O
    public final void onDismiss() {
        C1029242e c1029242e = this.LIZ.LIZLLL;
        if (c1029242e != null) {
            c1029242e.onDismiss();
        }
    }

    @Override // X.C43O
    public final void onShow() {
        C1029242e c1029242e = this.LIZ.LIZLLL;
        if (c1029242e != null) {
            c1029242e.onShow();
        }
    }

    public C1030342p(C4KD c4kd, boolean z, ValueAnimator valueAnimator, ViewGroup viewGroup, int i) {
        this.LIZ = c4kd;
        this.LIZIZ = z;
        this.LIZJ = valueAnimator;
        this.LIZLLL = viewGroup;
        this.LJ = i;
    }
}
