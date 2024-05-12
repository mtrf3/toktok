package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TL8 extends AbstractC42171Ggp {
    public final /* synthetic */ TL5 LJLJJLL;

    @Override // X.AbstractC42171Ggp
    public final RecyclerView.ViewHolder LJZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return this.LJLJJLL.LJIIIIZZ(parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TL8(TL5 tl5, AbstractC45801HyH delegate) {
        super(delegate);
        o.LJIIIZ(delegate, "delegate");
        this.LJLJJLL = tl5;
    }

    @Override // X.AbstractC42171Ggp
    public final void LJLZ(RecyclerView.ViewHolder holder, TEN loadMoreState) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        this.LJLJJLL.LJI(holder, loadMoreState);
    }
}
