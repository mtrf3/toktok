package X;

import android.content.Context;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42177Ggv extends C0B4 {
    public final /* synthetic */ C42176Ggu LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public C42177Ggv(Context context, C42176Ggu c42176Ggu) {
        this.LIZLLL = c42176Ggu;
        this.LJ = context;
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(bindingAdapterPosition);
        }
        C42175Ggt c42175Ggt = this.LIZLLL.LJLIL;
        c42175Ggt.getClass();
        Integer num = c42175Ggt.LJLJJLL;
        if (num != null) {
            int intValue = num.intValue();
            c42175Ggt.LJLJJLL = null;
            int bindingAdapterPosition2 = viewHolder.getBindingAdapterPosition();
            InterfaceC42180Ggy interfaceC42180Ggy = c42175Ggt.LJLJJI;
            if (interfaceC42180Ggy != null) {
                interfaceC42180Ggy.LIZJ(intValue, bindingAdapterPosition2);
            }
            c42175Ggt.LJLJL = false;
            c42175Ggt.notifyItemChanged(0);
        }
        super.LIZIZ(recyclerView, viewHolder);
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        return C0B4.LJIIIZ(12, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        C42175Ggt c42175Ggt = this.LIZLLL.LJLIL;
        if (viewHolder == null) {
            return;
        }
        c42175Ggt.getClass();
        Integer valueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        c42175Ggt.LJLJJLL = valueOf;
        InterfaceC42180Ggy interfaceC42180Ggy = c42175Ggt.LJLJJI;
        if (interfaceC42180Ggy != null) {
            o.LJI(valueOf);
            valueOf.intValue();
            interfaceC42180Ggy.LIZ();
        }
        c42175Ggt.LJLJL = true;
        Integer num = c42175Ggt.LJLJJLL;
        if (num == null || num.intValue() != 0) {
            c42175Ggt.notifyItemChanged(0);
        } else {
            ((C42178Ggw) viewHolder).LJLIL.setVisibility(8);
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        C42175Ggt c42175Ggt = this.LIZLLL.LJLIL;
        c42175Ggt.getClass();
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        int i = c42175Ggt.LJLILLLLZI;
        if (bindingAdapterPosition == i) {
            c42175Ggt.LJLILLLLZI = bindingAdapterPosition2;
        } else if (bindingAdapterPosition2 == i) {
            c42175Ggt.LJLILLLLZI = bindingAdapterPosition;
        }
        ListProtector.add(c42175Ggt.LJLIL, bindingAdapterPosition2, ListProtector.remove(c42175Ggt.LJLIL, bindingAdapterPosition));
        c42175Ggt.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        InterfaceC42180Ggy interfaceC42180Ggy = c42175Ggt.LJLJJI;
        if (interfaceC42180Ggy != null) {
            interfaceC42180Ggy.LIZIZ();
            return true;
        }
        return true;
    }

    @Override // X.C0B4
    public final void LJIIJ(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        float LIZIZ = C74275TDb.LIZIZ(this.LJ, 8.0f);
        if (z) {
            viewHolder.itemView.setScaleX(1.2f);
            viewHolder.itemView.setScaleY(1.2f);
        } else {
            viewHolder.itemView.setScaleX(1.0f);
            viewHolder.itemView.setScaleY(1.0f);
        }
        if (f2 <= LIZIZ) {
            LIZIZ = -LIZIZ;
            if (f2 >= LIZIZ) {
                LIZIZ = f2;
            }
        }
        super.LJIIJ(c, recyclerView, viewHolder, f, LIZIZ, i, z);
    }
}
