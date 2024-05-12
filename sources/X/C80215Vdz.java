package X;

import android.view.View;
import o3.h0;

/* renamed from: X.Vdz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80215Vdz {
    public final View LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF = true;
    public boolean LJI = true;

    public final void LIZ() {
        View view = this.LIZ;
        h0.LJIIL(this.LIZLLL - (view.getTop() - this.LIZIZ), view);
        View view2 = this.LIZ;
        h0.LJIIJJI(this.LJ - (view2.getLeft() - this.LIZJ), view2);
    }

    public C80215Vdz(View view) {
        this.LIZ = view;
    }

    public final boolean LIZIZ(int i) {
        if (this.LJFF && this.LIZLLL != i) {
            this.LIZLLL = i;
            LIZ();
            return true;
        }
        return false;
    }
}
