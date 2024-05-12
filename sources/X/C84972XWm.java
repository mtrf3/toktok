package X;

import android.os.Build;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.XWm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84972XWm {
    public final InterfaceC85024XYm LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL = true;
    public int LJ;
    public int LJFF;
    public int LJI;

    public final void LIZ(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new XYK(this));
        } else {
            recyclerView.setOnScrollListener(new XYI(this));
        }
    }

    public final void LIZIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.LJ = recyclerView.getChildCount();
        this.LJFF = linearLayoutManager.LJJJJZ();
        int LLILL = linearLayoutManager.LLILL();
        int i = this.LJFF;
        if (i < this.LIZJ) {
            this.LJI = 0;
            this.LIZJ = i;
            if (i == 0) {
                this.LIZLLL = true;
            }
        }
        if (this.LIZLLL && i > this.LIZJ) {
            this.LIZLLL = false;
            this.LIZJ = i;
            this.LJI++;
        }
        if (!this.LIZLLL && i - this.LJ <= LLILL + this.LIZIZ) {
            InterfaceC85024XYm interfaceC85024XYm = this.LIZ;
            if (interfaceC85024XYm != null) {
                interfaceC85024XYm.LIZ();
            }
            this.LIZLLL = true;
        }
    }

    public C84972XWm(InterfaceC85024XYm interfaceC85024XYm, int i) {
        this.LIZ = interfaceC85024XYm;
        this.LIZIZ = i;
    }
}
