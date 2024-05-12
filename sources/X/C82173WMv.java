package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.WMv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82173WMv extends WMK {
    public final WN1 LJIIJ;
    public final boolean LJIIJJI;
    public final View LJIIL;
    public final ViewGroup LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;

    @Override // X.WMK
    public final void LIZIZ(boolean z) {
        if (!z || !this.LJIILJJIL) {
            return;
        }
        this.LJIILL = this.LJIIL.getVisibility();
        this.LJIIL.setVisibility(0);
    }

    @Override // X.WMK
    public final void LIZJ(boolean z) {
        WN3 LIZ;
        if (!z || !this.LJIIJJI || (LIZ = this.LJIIJ.LIZ()) == null) {
            return;
        }
        if (this.LJIILIIL != null && (this.LJIIL.getWidth() == 0 || this.LJIIL.getHeight() == 0)) {
            return;
        }
        LIZ.LIZ(new ARunnableS50S0100000_14(this, 23));
        WMJ.LJII.put(this.LIZ, new C82177WMz(LIZ));
        this.LJIILIIL.startViewTransition(this.LJIIL);
        LIZ.LJ(this.LJIIL);
        this.LJIILJJIL = true;
    }

    public C82173WMv(WMJ wmj, WM7 wm7, WN1 wn1) {
        super(wmj, wm7, -1, null, WME.NONE, false, false, true);
        boolean z;
        this.LJIIJ = wn1;
        View view = wm7.mView;
        if (view != null && view.getParent() != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIJJI = z;
        if (z) {
            View view2 = wm7.mView;
            this.LJIIL = view2;
            this.LJIILIIL = (ViewGroup) view2.getParent();
        } else {
            this.LJIIL = null;
            this.LJIILIIL = null;
        }
    }
}
