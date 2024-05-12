package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.1B2, reason: invalid class name */
/* loaded from: classes.dex */
public class C1B2 implements C08W {
    public final boolean LIZ;
    public final C1B3 LIZIZ;
    public int LIZJ;

    public final void LIZ() {
        boolean z;
        if (this.LIZJ > 0) {
            z = true;
        } else {
            z = false;
        }
        for (Fragment fragment : this.LIZIZ.LJIILLIIL.LJJJJLI()) {
            fragment.setOnStartEnterTransitionListener(null);
            if (z && fragment.isPostponed()) {
                fragment.startPostponedEnterTransition();
            }
        }
        C1B3 c1b3 = this.LIZIZ;
        c1b3.LJIILLIIL.LJIIJJI(c1b3, this.LIZ, !z, true);
    }

    public C1B2(C1B3 c1b3, boolean z) {
        this.LIZ = z;
        this.LIZIZ = c1b3;
    }
}
