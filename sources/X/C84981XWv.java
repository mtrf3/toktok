package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.XWv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84981XWv {
    public final InterfaceC85026XYo LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL = true;
    public int LJ;
    public int LJFF;
    public int LJI;

    public final void LIZ(RecyclerView recyclerView) {
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
            InterfaceC85026XYo interfaceC85026XYo = this.LIZ;
            if (interfaceC85026XYo != null) {
                interfaceC85026XYo.LIZ();
            }
            this.LIZLLL = true;
        }
    }

    public C84981XWv(InterfaceC85026XYo interfaceC85026XYo, int i) {
        this.LIZ = interfaceC85026XYo;
        this.LIZIZ = i;
    }
}
