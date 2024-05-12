package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.UxA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78856UxA {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LIZLLL;
    public View LJFF;
    public C80261Vej LJII;
    public C80267Vep LJIIIIZZ;
    public int LJ = -1;
    public final int LJI = 1;
    public int LJIIIZ = -1;

    public final boolean LIZ() {
        C80261Vej c80261Vej = this.LJII;
        if (c80261Vej != null) {
            if (c80261Vej.getSelectedTabPosition() == this.LJ) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ() {
        C80261Vej c80261Vej = this.LJII;
        if (c80261Vej != null) {
            c80261Vej.selectTab(this);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LJFF() {
        C80267Vep c80267Vep = this.LJIIIIZZ;
        if (c80267Vep != null) {
            c80267Vep.update();
        }
    }

    public final void LIZJ(int i) {
        this.LJFF = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJIIIIZZ.getContext()), i, this.LJIIIIZZ, false);
        LJFF();
    }

    public final void LIZLLL(View view) {
        this.LJFF = view;
        LJFF();
    }

    public final void LJ(SY9 sy9) {
        this.LIZIZ = sy9;
        C80261Vej c80261Vej = this.LJII;
        if (c80261Vej.tabGravity == 1 || c80261Vej.mode == 2) {
            c80261Vej.updateTabViews(true);
        }
        LJFF();
    }
}
