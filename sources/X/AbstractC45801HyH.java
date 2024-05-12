package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HyH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45801HyH<T> extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<T> LJLIL = new ArrayList();

    public final List<T> getData() {
        return ORZ.LLJILJILJ(this.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public void LJLLLLLL(List<? extends T> list) {
        if (list != null) {
            int size = ((ArrayList) this.LJLIL).size();
            ((ArrayList) this.LJLIL).addAll(list);
            notifyItemRangeInserted(size, list.size());
        }
    }

    public void LJLZ(List<? extends T> list) {
        ((ArrayList) this.LJLIL).clear();
        if (list != null) {
            ((ArrayList) this.LJLIL).addAll(list);
        }
    }
}
