package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Mlm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57766Mlm implements InterfaceC57910Mo6 {
    public final /* synthetic */ C57838Mmw LJLIL;

    public C57766Mlm(C57838Mmw c57838Mmw) {
        this.LJLIL = c57838Mmw;
    }

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        InterfaceC88472Yns<AbstractC57828Mmm<?>, C76800UCe> interfaceC88472Yns = this.LJLIL.LJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(abstractC57828Mmm);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
