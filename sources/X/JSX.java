package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class JSX extends C49189JSf {
    public final float LJIIJJI;

    public JSX(float f) {
        this.LJIIJJI = f;
    }

    @Override // X.C49189JSf, X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        C0A2 c0a2;
        C49133JQb.LIZ("GHGCA", Integer.valueOf(i));
        if (i == -1) {
            return;
        }
        RecyclerView recyclerView = this.LIZLLL;
        LinearLayoutManager linearLayoutManager = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) c0a2;
        }
        int LIZ = (int) C74275TDb.LIZ(this.LJIIJJI);
        if (linearLayoutManager != null) {
            linearLayoutManager.LJFF(i, LIZ);
        }
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            if (C16330kX.LIZJ(recyclerView2) && !recyclerView2.isLayoutRequested()) {
                LJIIIZ(i, interfaceC49186JSc);
            } else {
                recyclerView2.addOnLayoutChangeListener(new JSZ(this, i, interfaceC49186JSc));
            }
        }
    }
}
