package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ScB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72459ScB implements InterfaceC57910Mo6 {
    public final /* synthetic */ MufListPageFragment LJLIL;

    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
    }

    public C72459ScB(MufListPageFragment mufListPageFragment) {
        this.LJLIL = mufListPageFragment;
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
        MufListPageViewModel Hl = this.LJLIL.Hl();
        Hl.getClass();
        Hl.setState(new AqS178S0100000_12(state, 664));
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
