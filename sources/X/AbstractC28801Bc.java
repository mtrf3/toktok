package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28801Bc<T, VH extends RecyclerView.ViewHolder> extends AbstractC029409q<VH> {
    public final C0AR<T> mDiffer;
    public final C0AN<T> mListener;

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public List<T> getCurrentList() {
        return this.mDiffer.LJFF;
    }

    @Override // X.AbstractC029409q
    public int getItemCount() {
        return this.mDiffer.LJFF.size();
    }

    public AbstractC28801Bc(AbstractC03160Am<T> abstractC03160Am) {
        C0AN<T> c0an = new C0AN<T>() { // from class: X.1Bb
            @Override // X.C0AN
            public final void LIZ(List<T> list, List<T> list2) {
                AbstractC28801Bc.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = c0an;
        C0AR<T> c0ar = new C0AR<>(new C28811Bd(this), new C0AJ(abstractC03160Am).LIZ());
        this.mDiffer = c0ar;
        ((CopyOnWriteArrayList) c0ar.LIZLLL).add(c0an);
    }

    public T getItem(int i) {
        return (T) ListProtector.get(this.mDiffer.LJFF, i);
    }

    public void submitList(List<T> list) {
        this.mDiffer.LIZIZ(list, null);
    }

    public AbstractC28801Bc(C0AL<T> c0al) {
        C0AN<T> c0an = new C0AN<T>() { // from class: X.1Bb
            @Override // X.C0AN
            public final void LIZ(List<T> list, List<T> list2) {
                AbstractC28801Bc.this.onCurrentListChanged(list, list2);
            }
        };
        this.mListener = c0an;
        C0AR<T> c0ar = new C0AR<>(new C28811Bd(this), c0al);
        this.mDiffer = c0ar;
        ((CopyOnWriteArrayList) c0ar.LIZLLL).add(c0an);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.LIZIZ(list, runnable);
    }
}
