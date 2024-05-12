package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class FUW extends RecyclerView.RecycledViewPool {
    public final SparseArray<C35744E1c> LIZ = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void clear() {
        super.clear();
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            this.LIZ.valueAt(i).LIZIZ.clear();
        }
    }

    public final C35744E1c LIZ(int i) {
        C35744E1c c35744E1c = this.LIZ.get(i);
        if (c35744E1c == null) {
            C35744E1c c35744E1c2 = new C35744E1c(null);
            this.LIZ.put(i, c35744E1c2);
            return c35744E1c2;
        }
        return c35744E1c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized RecyclerView.ViewHolder getRecycledView(int i) {
        int i2;
        ArrayList<RecyclerView.ViewHolder> arrayList;
        C35744E1c c35744E1c = this.LIZ.get(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getRecycledView: ");
        LIZ.append(i);
        LIZ.append(", scrapData: ");
        if (c35744E1c == null || (arrayList = c35744E1c.LIZIZ) == null) {
            i2 = 0;
        } else {
            i2 = arrayList.size();
        }
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (c35744E1c != null && (!c35744E1c.LIZIZ.isEmpty())) {
            ListProtector.remove(c35744E1c.LIZIZ, r1.size() - 1);
            return super.getRecycledView(i);
        }
        return super.getRecycledView(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return;
        }
        super.putRecycledView(viewHolder);
        int itemViewType = viewHolder.getItemViewType();
        ArrayList<RecyclerView.ViewHolder> arrayList = LIZ(itemViewType).LIZIZ;
        if (this.LIZ.get(itemViewType).LIZ <= arrayList.size()) {
            return;
        }
        arrayList.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void setMaxRecycledViews(int i, int i2) {
        super.setMaxRecycledViews(i, i2);
        C35744E1c LIZ = LIZ(i);
        LIZ.LIZ = i2;
        ArrayList<RecyclerView.ViewHolder> arrayList = LIZ.LIZIZ;
        while (arrayList.size() > i2) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
        }
    }
}
