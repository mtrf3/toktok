package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vc0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80092Vc0 extends AbstractC80089Vbx {
    public int LIZJ = 1;
    public int LIZLLL = 1;
    public C80094Vc2 LJ;
    public C80093Vc1 LJFF;

    public final int LJIIIIZZ() {
        return this.LIZJ * this.LIZLLL;
    }

    public final AbstractC80095Vc3 LJI(C0A2 c0a2) {
        C80093Vc1 c80093Vc1 = this.LJFF;
        if (c80093Vc1 == null || c80093Vc1.LIZ != c0a2) {
            this.LJFF = new C80093Vc1(c0a2);
        }
        return this.LJFF;
    }

    public final AbstractC80095Vc3 LJII(C0A2 c0a2) {
        C80094Vc2 c80094Vc2 = this.LJ;
        if (c80094Vc2 == null || c80094Vc2.LIZ != c0a2) {
            this.LJ = new C80094Vc2(c0a2);
        }
        return this.LJ;
    }

    public static View LJ(C0A2 c0a2, AbstractC80095Vc3 abstractC80095Vc3) {
        int LIZLLL;
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        if (c0a2.LJJJJ()) {
            LIZLLL = (abstractC80095Vc3.LJFF() / 2) + abstractC80095Vc3.LJ();
        } else {
            LIZLLL = abstractC80095Vc3.LIZLLL() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            int abs = Math.abs(((abstractC80095Vc3.LIZIZ(LJJJ) / 2) + abstractC80095Vc3.LIZJ(LJJJ)) - LIZLLL);
            if (abs < i) {
                view = LJJJ;
                i = abs;
            }
        }
        return view;
    }

    public static View LJFF(C0A2 c0a2, AbstractC80095Vc3 abstractC80095Vc3) {
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            int LIZJ = abstractC80095Vc3.LIZJ(LJJJ);
            if (LIZJ < i) {
                view = LJJJ;
                i = LIZJ;
            }
        }
        return view;
    }

    @Override // X.AbstractC80089Vbx
    public final int[] LIZIZ(C0A2 c0a2, View view) {
        int[] iArr = new int[2];
        if (c0a2.LJIJJLI()) {
            iArr[0] = LIZLLL(c0a2, view, LJI(c0a2));
        } else {
            iArr[0] = 0;
        }
        if (c0a2.LJIL()) {
            iArr[1] = LIZLLL(c0a2, view, LJII(c0a2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int LIZLLL(C0A2 c0a2, View view, AbstractC80095Vc3 abstractC80095Vc3) {
        int i;
        int LIZJ;
        int i2;
        int LIZJ2;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return 0;
        }
        boolean LIZ = CCJ.LIZ(recyclerView.getContext());
        if (c0a2.LJIJJLI()) {
            int width = this.LIZ.getWidth() / this.LIZLLL;
            int LJJJLL = C0A2.LJJJLL(view);
            int LJIIIIZZ = LJIIIIZZ() * (LJJJLL / LJIIIIZZ());
            if (LIZ) {
                i2 = ((LJIIIIZZ() - (LJJJLL - LJIIIIZZ)) / this.LIZJ) * width;
                LIZJ2 = abstractC80095Vc3.LIZ(view);
            } else {
                i2 = ((LJJJLL - LJIIIIZZ) / this.LIZJ) * width;
                LIZJ2 = abstractC80095Vc3.LIZJ(view);
            }
            int i3 = LIZJ2 - i2;
            if (i3 <= 5 && i3 >= -5) {
                return 0;
            }
            return i3;
        }
        int height = this.LIZ.getHeight() / this.LIZJ;
        int LJJJLL2 = C0A2.LJJJLL(view);
        int LJIIIIZZ2 = LJIIIIZZ() * (LJJJLL2 / LJIIIIZZ());
        if (LIZ) {
            i = ((LJIIIIZZ() - (LJJJLL2 - LJIIIIZZ2)) / this.LIZLLL) * height;
            LIZJ = abstractC80095Vc3.LIZ(view);
        } else {
            i = ((LJJJLL2 - LJIIIIZZ2) / this.LIZLLL) * height;
            LIZJ = abstractC80095Vc3.LIZJ(view);
        }
        int i4 = LIZJ - i;
        if (i4 <= 5 && i4 >= -5) {
            return 0;
        }
        return i4;
    }
}
