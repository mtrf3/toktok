package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.o;

/* renamed from: X.8xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228378xl extends C0B4 {
    public final SYL LIZLLL;
    public final InterfaceC228388xm LJ;
    public boolean LJFF;

    @Override // X.C0B4
    public final boolean LJII() {
        return false;
    }

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.C0B4
    public final boolean LJIIIIZZ() {
        return this.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        super.LIZIZ(recyclerView, viewHolder);
        viewHolder.itemView.setAlpha(1.0f);
        if (viewHolder instanceof InterfaceC228398xn) {
            ((InterfaceC228398xn) viewHolder).LJIJI();
        }
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            return C0B4.LJIIIZ(15, 0);
        }
        return C0B4.LJIIIZ(3, 48);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0 && (viewHolder instanceof InterfaceC228398xn)) {
            ((InterfaceC228398xn) viewHolder).LJIIJJI();
        }
    }

    public C228378xl(SYL syl, InterfaceC228388xm vm, boolean z) {
        o.LJIIIZ(vm, "vm");
        this.LIZLLL = syl;
        this.LJ = vm;
        this.LJFF = z;
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(source, "source");
        if (source.getItemViewType() != viewHolder.getItemViewType()) {
            return false;
        }
        int headerCount = this.LIZLLL.getHeaderCount();
        int adapterPosition = source.getAdapterPosition() - headerCount;
        int adapterPosition2 = viewHolder.getAdapterPosition() - headerCount;
        this.LJ.Ne0(adapterPosition, adapterPosition2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL.getState().LJII());
        Object obj = ListProtector.get(arrayList, adapterPosition);
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedItem");
        Integer num = ((C228108xK) obj).LJLJL;
        Object obj2 = ListProtector.get(arrayList, adapterPosition2);
        o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedItem");
        Integer num2 = ((C228108xK) obj2).LJLJL;
        Collections.swap(arrayList, adapterPosition, adapterPosition2);
        this.LIZLLL.getState().LJIIJ(arrayList);
        AbstractC029409q adapter = this.LIZLLL.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(source.getAdapterPosition(), viewHolder.getAdapterPosition());
        }
        if (C228098xJ.LIZJ()) {
            AbstractC029409q adapter2 = this.LIZLLL.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemChanged(source.getAdapterPosition(), num2);
            }
            AbstractC029409q adapter3 = this.LIZLLL.getAdapter();
            if (adapter3 != null) {
                adapter3.notifyItemChanged(viewHolder.getAdapterPosition(), num);
            }
        }
        String enterFrom = this.LJ.Uq();
        String enterMethod = this.LJ.TV();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom);
        c188727au.LJIIIZ("enter_method", enterMethod);
        FMX.LJIIL("reorder_playlist", c188727au.LIZ);
        return true;
    }

    @Override // X.C0B4
    public final void LJIIJ(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (i == 1) {
            viewHolder.itemView.setAlpha(1.0f - (Math.abs(f) / viewHolder.itemView.getWidth()));
            viewHolder.itemView.setTranslationX(f);
            return;
        }
        super.LJIIJ(c, recyclerView, viewHolder, f, f2, i, z);
    }
}
