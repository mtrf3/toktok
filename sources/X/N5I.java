package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N5I extends C0A6 {
    public final /* synthetic */ LinearLayoutManager LJLIL;
    public final /* synthetic */ List<Boolean> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, Boolean, C76800UCe> LJLJI;

    public N5I(LinearLayoutManager linearLayoutManager, List list, AqS173S0200000_10 aqS173S0200000_10) {
        this.LJLIL = linearLayoutManager;
        this.LJLILLLLZI = list;
        this.LJLJI = aqS173S0200000_10;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C44416Hbw.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }
}
