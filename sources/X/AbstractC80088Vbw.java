package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vbw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80088Vbw extends C0A4 {
    public RecyclerView LIZ;
    public final C7DD LIZIZ = new C0A6() { // from class: X.7DD
        public boolean LJLIL;

        @Override // X.C0A6
        public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        }

        @Override // X.C0A6
        public final void LJIILJJIL(int i, RecyclerView recyclerView) {
            if (i == 0) {
                if (!this.LJLIL) {
                    this.LJLIL = AbstractC80088Vbw.this.LIZLLL();
                    return;
                } else {
                    this.LJLIL = false;
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            this.LJLIL = false;
        }
    };

    public abstract int[] LIZIZ(C0A2 c0a2, View view);

    public abstract View LIZJ(C0A2 c0a2);

    public final boolean LIZLLL() {
        C0A2 layoutManager;
        View LIZJ;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (LIZJ = LIZJ(layoutManager)) == null) {
            return false;
        }
        int[] LIZIZ = LIZIZ(layoutManager, LIZJ);
        int i = LIZIZ[0];
        if (i == 0 && LIZIZ[1] == 0) {
            return false;
        }
        this.LIZ.LJLIIIL(i, LIZIZ[1]);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        C0A2 layoutManager;
        C80097Vc5 c80097Vc5;
        RecyclerView recyclerView;
        View LJI;
        int LJJJLL;
        boolean z;
        boolean z2;
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == 0 || this.LIZ.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof C0AA) || (recyclerView = (c80097Vc5 = (C80097Vc5) this).LIZ) == null) {
            return false;
        }
        C80086Vbu c80086Vbu = new C80086Vbu(c80097Vc5, recyclerView.getContext());
        int LJJJJZ = layoutManager.LJJJJZ();
        if (LJJJJZ == 0) {
            return false;
        }
        if (layoutManager.LJIL()) {
            LJI = C80097Vc5.LJI(layoutManager, c80097Vc5.LJIIIIZZ(layoutManager));
        } else {
            if (!layoutManager.LJIJJLI()) {
                return false;
            }
            LJI = C80097Vc5.LJI(layoutManager, c80097Vc5.LJII(layoutManager));
        }
        if (LJI == null || (LJJJLL = C0A2.LJJJLL(LJI)) == -1) {
            return false;
        }
        if (!layoutManager.LJIJJLI() ? i2 > 0 : i > 0) {
            z = true;
        } else {
            z = false;
        }
        PointF LJII = ((C0AA) layoutManager).LJII(LJJJJZ - 1);
        if (LJII != null && (LJII.x < 0.0f || LJII.y < 0.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int LJIIIZ = c80097Vc5.LJIIIZ() * (LJJJLL / c80097Vc5.LJIIIZ());
        if (z2) {
            if (z) {
                LJIIIZ -= c80097Vc5.LJIIIZ();
            }
        } else if (z) {
            LJIIIZ += c80097Vc5.LJIIIZ();
        } else {
            LJIIIZ = (c80097Vc5.LJIIIZ() + LJIIIZ) - 1;
        }
        if (LJIIIZ == -1) {
            return false;
        }
        c80086Vbu.LIZ = LJIIIZ;
        layoutManager.LLIIIILZ(c80086Vbu);
        return true;
    }
}
