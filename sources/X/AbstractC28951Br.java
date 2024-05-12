package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28951Br extends C0A4 {
    public RecyclerView LIZ;
    public Scroller LIZIZ;
    public final C28941Bq LIZJ = new C0A6() { // from class: X.1Bq
        public boolean LJLIL;

        @Override // X.C0A6
        public final void LJIILJJIL(int i, RecyclerView recyclerView) {
            if (i == 0 && this.LJLIL) {
                this.LJLIL = false;
                AbstractC28951Br.this.LJII();
            }
        }

        @Override // X.C0A6
        public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.LJLIL = true;
            }
        }
    };

    public abstract int[] LIZJ(C0A2 c0a2, View view);

    public abstract View LJFF(C0A2 c0a2);

    public abstract int LJI(C0A2 c0a2, int i, int i2);

    public final void LJII() {
        C0A2 layoutManager;
        View LJFF;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (LJFF = LJFF(layoutManager)) == null) {
            return;
        }
        int[] LIZJ = LIZJ(layoutManager, LJFF);
        int i = LIZJ[0];
        if (i != 0 || LIZJ[1] != 0) {
            this.LIZ.LJLIIIL(i, LIZJ[1]);
        }
    }

    public void LIZIZ(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.LJJLL(this.LIZJ);
            this.LIZ.setOnFlingListener(null);
        }
        this.LIZ = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.LIZ.LJIIJJI(this.LIZJ);
                this.LIZ.setOnFlingListener(this);
                this.LIZIZ = new Scroller(this.LIZ.getContext(), new DecelerateInterpolator());
                LJII();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public C0AB LIZLLL(C0A2 c0a2) {
        return LJ(c0a2);
    }

    public C1C9 LJ(C0A2 c0a2) {
        if (!(c0a2 instanceof C0AA)) {
            return null;
        }
        final Context context = this.LIZ.getContext();
        return new C1C9(context) { // from class: X.1hu
            @Override // X.C1C9
            public final float LJIIJ(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // X.C1C9, X.C0AB
            public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
                AbstractC28951Br abstractC28951Br = AbstractC28951Br.this;
                RecyclerView recyclerView = abstractC28951Br.LIZ;
                if (recyclerView == null) {
                    return;
                }
                int[] LIZJ = abstractC28951Br.LIZJ(recyclerView.getLayoutManager(), view);
                int i = LIZJ[0];
                int i2 = LIZJ[1];
                int LJIIJJI = LJIIJJI(Math.max(Math.abs(i), Math.abs(i2)));
                if (LJIIJJI > 0) {
                    c0a9.LIZIZ(i, i2, LJIIJJI, this.LJIIIIZZ);
                }
            }
        };
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        C0AB LIZLLL;
        int LJI;
        C0A2 layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager == null || this.LIZ.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof C0AA) || (LIZLLL = LIZLLL(layoutManager)) == null || (LJI = LJI(layoutManager, i, i2)) == -1) {
            return false;
        }
        LIZLLL.LIZ = LJI;
        layoutManager.LLIIIILZ(LIZLLL);
        return true;
    }
}
