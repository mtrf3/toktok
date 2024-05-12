package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.HNy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43982HNy extends C43981HNx {
    public C43982HNy(C46048I5k c46048I5k) {
        super(c46048I5k);
    }

    @Override // X.C43981HNx, X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if ((viewHolder instanceof C141305gc) || (viewHolder instanceof C46056I5s)) {
            return 0;
        }
        return super.LJ(recyclerView, viewHolder);
    }

    @Override // X.C43981HNx, X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(source, "source");
        if ((viewHolder instanceof C141305gc) || (viewHolder instanceof C46056I5s)) {
            return false;
        }
        super.LJIIL(recyclerView, source, viewHolder);
        return true;
    }
}
