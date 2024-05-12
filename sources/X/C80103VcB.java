package X;

import Y.IDrS52S0100000_14;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.VcB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80103VcB extends C40161hs {
    public int LJFF;
    public boolean LJI;
    public C28861Bi LJII;
    public C28851Bh LJIIIIZZ;
    public boolean LJIIJJI;
    public RecyclerView LJIIL;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final IDrS52S0100000_14 LJIILIIL = new IDrS52S0100000_14(this, 4);

    @Override // X.AbstractC28951Br
    public final void LIZIZ(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.LJIIL = recyclerView;
            Context context = recyclerView.getContext();
            o.LJIIIIZZ(context, "recyclerView.context");
            this.LJIIJJI = C26338AVi.LIZJ(context);
            recyclerView.LJIIJJI(this.LJIILIIL);
        } else {
            RecyclerView recyclerView2 = this.LJIIL;
            if (recyclerView2 != null) {
                recyclerView2.LJJLL(this.LJIILIIL);
            }
            this.LJIIL = null;
        }
        super.LIZIZ(recyclerView);
    }

    @Override // X.C40161hs, X.AbstractC28951Br
    public final View LJFF(C0A2 layoutManager) {
        o.LJIIIZ(layoutManager, "layoutManager");
        if (layoutManager.LJIL()) {
            C28861Bi c28861Bi = this.LJII;
            if (c28861Bi == null) {
                c28861Bi = new C28861Bi(layoutManager);
                this.LJII = c28861Bi;
            }
            return LJIIL(layoutManager, c28861Bi);
        }
        if (layoutManager.LJIJJLI()) {
            C28851Bh c28851Bh = this.LJIIIIZZ;
            if (c28851Bh == null) {
                c28851Bh = new C28851Bh(layoutManager);
                this.LJIIIIZZ = c28851Bh;
            }
            return LJIIL(layoutManager, c28851Bh);
        }
        return null;
    }

    @Override // X.C40161hs, X.AbstractC28951Br
    public final int[] LIZJ(C0A2 layoutManager, View targetView) {
        int LJ;
        int LJIIJ;
        int LJ2;
        int LJIIJ2;
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(targetView, "targetView");
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (layoutManager.LJIJJLI()) {
            C28851Bh c28851Bh = this.LJIIIIZZ;
            if (c28851Bh == null) {
                c28851Bh = new C28851Bh(layoutManager);
                this.LJIIIIZZ = c28851Bh;
            }
            if (this.LJIIJJI) {
                LJ2 = c28851Bh.LIZIZ(targetView);
                LJIIJ2 = c28851Bh.LJI();
            } else {
                LJ2 = c28851Bh.LJ(targetView);
                LJIIJ2 = c28851Bh.LJIIJ();
            }
            iArr[0] = LJ2 - LJIIJ2;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.LJIL()) {
            C28861Bi c28861Bi = this.LJII;
            if (c28861Bi == null) {
                c28861Bi = new C28861Bi(layoutManager);
                this.LJII = c28861Bi;
            }
            if (this.LJIIJJI) {
                LJ = c28861Bi.LIZIZ(targetView);
                LJIIJ = c28861Bi.LJI();
            } else {
                LJ = c28861Bi.LJ(targetView);
                LJIIJ = c28861Bi.LJIIJ();
            }
            iArr[1] = LJ - LJIIJ;
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final View LJIIL(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        int abs;
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
            int LLILLIZIL = linearLayoutManager.LLILLIZIL();
            int LLIL = linearLayoutManager.LLIL();
            if (LLILLIZIL == linearLayoutManager.LJJJJZ() - 1) {
                return c0a2.LJJIJIL(LLIL);
            }
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            if (this.LJIIJJI) {
                abs = Math.abs(abstractC03050Ab.LIZIZ(LJJJ) - abstractC03050Ab.LJI());
            } else {
                abs = Math.abs(abstractC03050Ab.LJ(LJJJ) - abstractC03050Ab.LJIIJ());
            }
            if (abs < i) {
                view = LJJJ;
                i = abs;
            }
        }
        return view;
    }
}
