package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MoT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57933MoT implements InterfaceC57910Mo6 {
    public final /* synthetic */ List<Class<? extends AbstractC57828Mmm<? extends InterfaceC57927MoN>>> LJLIL;
    public final /* synthetic */ C57935MoV LJLILLLLZI;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        if (this.LJLIL.contains(abstractC57828Mmm.getClass())) {
            this.LJLILLLLZI.LIZ().nv0();
            this.LJLILLLLZI.K8(this);
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57933MoT(List<? extends Class<? extends AbstractC57828Mmm<? extends InterfaceC57927MoN>>> list, C57935MoV c57935MoV) {
        this.LJLIL = list;
        this.LJLILLLLZI = c57935MoV;
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
