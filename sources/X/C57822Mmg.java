package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AdapterLoadingCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57822Mmg implements InterfaceC57910Mo6 {
    public final /* synthetic */ AdapterLoadingCell LJLIL;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    public C57822Mmg(AdapterLoadingCell adapterLoadingCell) {
        this.LJLIL = adapterLoadingCell;
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        this.LJLIL.U(state);
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
