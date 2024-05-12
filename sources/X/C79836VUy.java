package X;

import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.behavior.ui.list.UIList;

/* renamed from: X.VUy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79836VUy extends RecyclerView.RecycledViewPool {
    public final /* synthetic */ UIList LIZ;

    public C79836VUy(UIList uIList) {
        this.LIZ = uIList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        if (this.LIZ.LJJ() && (viewHolder instanceof C79831VUt)) {
            this.LIZ.LJLJI.LLFFF((C79831VUt) viewHolder);
        }
        super.putRecycledView(viewHolder);
    }
}
