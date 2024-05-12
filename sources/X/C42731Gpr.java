package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42731Gpr extends AbstractC028509h {
    public RecyclerView LJ;
    public GridLayoutManager LJFF;
    public AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        RecyclerView recyclerView = this.LJ;
        o.LJI(recyclerView);
        o.LJI(recyclerView.getAdapter());
        if (i < r0.getItemCount() - 1) {
            AbstractC028509h abstractC028509h = this.LJI;
            o.LJI(abstractC028509h);
            return abstractC028509h.LJFF(i);
        }
        GridLayoutManager gridLayoutManager = this.LJFF;
        o.LJI(gridLayoutManager);
        return gridLayoutManager.LLIIIL;
    }
}
