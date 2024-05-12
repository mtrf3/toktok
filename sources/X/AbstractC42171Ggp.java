package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42171Ggp extends AbstractC42169Ggn implements TLG<TEN> {
    public TEN LJLJJI;
    public TL6 LJLJJL;

    public abstract void LJLZ(RecyclerView.ViewHolder viewHolder, TEN ten);

    public abstract RecyclerView.ViewHolder LJZ(ViewGroup viewGroup);

    @Override // X.TLG
    public final /* bridge */ /* synthetic */ TEN getState() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42171Ggp(AbstractC45801HyH delegate) {
        super(delegate, true);
        o.LJIIIZ(delegate, "delegate");
        this.LJLJJI = TEN.NONE;
    }

    @Override // X.TLG
    public final void setState(TEN ten) {
        TEN state = ten;
        o.LJIIIZ(state, "state");
        this.LJLJJI = state;
        notifyItemChanged(getItemCount() - 1);
    }
}
