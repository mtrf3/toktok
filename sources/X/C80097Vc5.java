package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vc5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80097Vc5 extends AbstractC80088Vbw {
    public int LIZJ = 1;
    public int LIZLLL = 1;
    public C28861Bi LJ;
    public C28851Bh LJFF;

    public final int LJIIIZ() {
        return this.LIZJ * this.LIZLLL;
    }

    @Override // X.AbstractC80088Vbw
    public View LIZJ(C0A2 c0a2) {
        if (c0a2.LJIL()) {
            return LJFF(c0a2, LJIIIIZZ(c0a2));
        }
        if (c0a2.LJIJJLI()) {
            return LJFF(c0a2, LJII(c0a2));
        }
        return null;
    }

    public final AbstractC03050Ab LJII(C0A2 c0a2) {
        C28851Bh c28851Bh = this.LJFF;
        if (c28851Bh == null || c28851Bh.LIZ != c0a2) {
            this.LJFF = new C28851Bh(c0a2);
        }
        return this.LJFF;
    }

    public final AbstractC03050Ab LJIIIIZZ(C0A2 c0a2) {
        C28861Bi c28861Bi = this.LJ;
        if (c28861Bi == null || c28861Bi.LIZ != c0a2) {
            this.LJ = new C28861Bi(c0a2);
        }
        return this.LJ;
    }

    public static final View LJFF(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        int LJFF;
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        if (c0a2.LJJJJ()) {
            LJFF = (abstractC03050Ab.LJIIJJI() / 2) + abstractC03050Ab.LJIIJ();
        } else {
            LJFF = abstractC03050Ab.LJFF() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            int abs = Math.abs(((abstractC03050Ab.LIZJ(LJJJ) / 2) + abstractC03050Ab.LJ(LJJJ)) - LJFF);
            if (abs < i) {
                view = LJJJ;
                i = abs;
            }
        }
        return view;
    }

    public static final View LJI(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            int LJ = abstractC03050Ab.LJ(LJJJ);
            if (LJ < i) {
                view = LJJJ;
                i = LJ;
            }
        }
        return view;
    }

    @Override // X.AbstractC80088Vbw
    public final int[] LIZIZ(C0A2 c0a2, View view) {
        int[] iArr = new int[2];
        if (c0a2.LJIJJLI()) {
            iArr[0] = LJ(c0a2, view, LJII(c0a2));
        } else {
            iArr[0] = 0;
        }
        if (c0a2.LJIL()) {
            iArr[1] = LJ(c0a2, view, LJIIIIZZ(c0a2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int LJ(C0A2 c0a2, View view, AbstractC03050Ab abstractC03050Ab) {
        int i;
        int LJ;
        int i2;
        int LJ2;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return 0;
        }
        boolean LIZIZ = C90193gN.LIZIZ(recyclerView.getContext());
        if (c0a2.LJIJJLI()) {
            int width = this.LIZ.getWidth() / this.LIZLLL;
            int LJJJLL = C0A2.LJJJLL(view);
            int LJIIIZ = LJIIIZ() * (LJJJLL / LJIIIZ());
            if (LIZIZ) {
                i2 = ((LJIIIZ() - (LJJJLL - LJIIIZ)) / this.LIZJ) * width;
                LJ2 = abstractC03050Ab.LIZIZ(view);
            } else {
                i2 = ((LJJJLL - LJIIIZ) / this.LIZJ) * width;
                LJ2 = abstractC03050Ab.LJ(view);
            }
            int i3 = LJ2 - i2;
            if (i3 <= 5 && i3 >= -5) {
                return 0;
            }
            return i3;
        }
        int height = this.LIZ.getHeight() / this.LIZJ;
        int LJJJLL2 = C0A2.LJJJLL(view);
        int LJIIIZ2 = LJIIIZ() * (LJJJLL2 / LJIIIZ());
        if (LIZIZ) {
            i = ((LJIIIZ() - (LJJJLL2 - LJIIIZ2)) / this.LIZLLL) * height;
            LJ = abstractC03050Ab.LIZIZ(view);
        } else {
            i = ((LJJJLL2 - LJIIIZ2) / this.LIZLLL) * height;
            LJ = abstractC03050Ab.LJ(view);
        }
        int i4 = LJ - i;
        if (i4 <= 5 && i4 >= -5) {
            return 0;
        }
        return i4;
    }
}
