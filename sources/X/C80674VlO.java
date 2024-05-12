package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.VlO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80674VlO {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LIZLLL;
    public View LJFF;
    public C80675VlP LJII;
    public C80672VlM LJIIIIZZ;
    public int LJ = -1;
    public int LJI = -1;

    public final void LIZ() {
        C80675VlP c80675VlP = this.LJII;
        if (c80675VlP != null) {
            c80675VlP.LJIILJJIL(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ() {
        C80672VlM c80672VlM = this.LJIIIIZZ;
        if (c80672VlM != null) {
            c80672VlM.LIZ();
        }
    }
}
