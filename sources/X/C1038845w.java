package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import djb.IDaS20S0000000_1;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.45w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038845w extends RecyclerView.RecycledViewPool {
    public final SparseArray<Queue<RecyclerView.ViewHolder>> LIZ = new SparseArray<>();
    public XKQ LIZIZ;

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void clear() {
        super.clear();
        this.LIZ.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i) {
        boolean z;
        XKQ xkq = this.LIZIZ;
        RecyclerView.ViewHolder viewHolder = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        Queue<RecyclerView.ViewHolder> queue = this.LIZ.get(i);
        if (queue != null && (viewHolder = queue.poll()) != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VH Cache hit = ");
        LIZ.append(z);
        LIZ.append(" viewType = ");
        LIZ.append(i);
        C34B.LJI("UnboundedViewPool", X1D.LIZIZ(LIZ));
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VH Cache added = ");
        LIZ.append(viewHolder.getItemViewType());
        C34B.LJI("UnboundedViewPool", X1D.LIZIZ(LIZ));
        int itemViewType = viewHolder.getItemViewType();
        Queue<RecyclerView.ViewHolder> queue = this.LIZ.get(itemViewType);
        if (queue == null) {
            queue = new LinkedList<>();
            this.LIZ.put(itemViewType, queue);
        }
        queue.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void setMaxRecycledViews(int i, int i2) {
        throw new UnsupportedOperationException("UnboundedViewPool does not support setting a maximum number of recycled views");
    }

    public static void LIZ(C1038845w c1038845w, RecyclerView recyclerView, AbstractC1038245q adapter, EnumC110124Tw enumC110124Tw) {
        C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZ.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 1)));
        o.LJIIIZ(adapter, "adapter");
        c1038845w.LIZIZ = XKX.LIZLLL(LIZ, null, null, new C1038745v(enumC110124Tw, c1038845w, adapter, recyclerView, null), 3);
    }
}
