package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BLh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28625BLh extends C0A6 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public boolean LJLILLLLZI;

    public C28625BLh(AqS155S0100000_5 aqS155S0100000_5) {
        this.LJLIL = aqS155S0100000_5;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (i == 0 && this.LJLILLLLZI && linearLayoutManager.LLILLIZIL() == linearLayoutManager.LJJJJZ() - 1) {
            this.LJLIL.invoke();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
    }
}
