package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.LynxDragListUIView;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VV5 extends C0B4 {
    public boolean LIZLLL;
    public boolean LJ;
    public VV6 LJFF;
    public final /* synthetic */ LynxDragListUIView LJI;

    @Override // X.C0B4
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    public final void LJIILLIIL() {
        VV6 vv6 = this.LJFF;
        if (vv6 != null) {
            super.LJIILIIL(vv6.LIZ, vv6.LIZIZ, vv6.LIZJ, vv6.LIZLLL, vv6.LJ, vv6.LJFF, vv6.LJI);
            this.LJ = false;
        }
        this.LJFF = null;
    }

    public VV5(LynxDragListUIView lynxDragListUIView) {
        this.LJI = lynxDragListUIView;
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        super.LIZIZ(recyclerView, viewHolder);
        this.LJI.LJJIII(viewHolder.getAbsoluteAdapterPosition(), "idle");
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        return C0B4.LJIIIZ(15, 0);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 0;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            this.LIZLLL = true;
            LynxDragListUIView lynxDragListUIView = this.LJI;
            if (viewHolder != null) {
                i2 = viewHolder.getAbsoluteAdapterPosition();
            }
            lynxDragListUIView.LJJIII(i2, "dragging");
            return;
        }
        if (!this.LIZLLL) {
            return;
        }
        this.LIZLLL = false;
        LynxDragListUIView lynxDragListUIView2 = this.LJI;
        if (viewHolder != null) {
            i2 = viewHolder.getAbsoluteAdapterPosition();
        }
        lynxDragListUIView2.LJJIII(i2, "settling");
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (this.LJ) {
            return false;
        }
        LynxDragListUIView lynxDragListUIView = this.LJI;
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        lynxDragListUIView.getClass();
        C49615Jdb c49615Jdb = new C49615Jdb(lynxDragListUIView.getSign(), "dragmove");
        c49615Jdb.LIZJ(Integer.valueOf(bindingAdapterPosition), "position");
        c49615Jdb.LIZJ(Integer.valueOf(bindingAdapterPosition2), "targetPosition");
        lynxDragListUIView.mContext.LJLJJL.LIZIZ(c49615Jdb);
        this.LJ = true;
        return true;
    }

    @Override // X.C0B4
    public final RecyclerView.ViewHolder LIZ(RecyclerView.ViewHolder selected, List<RecyclerView.ViewHolder> list, int i, int i2) {
        int left;
        int abs;
        int bottom;
        int abs2;
        int abs3;
        int abs4;
        o.LJIIIZ(selected, "selected");
        int height = (int) (selected.itemView.getHeight() * 0.5f);
        int width = (int) (selected.itemView.getWidth() * 0.5f);
        int i3 = i - width;
        int width2 = selected.itemView.getWidth() + i + width;
        int i4 = i2 - height;
        int height2 = selected.itemView.getHeight() + i2 + height;
        int left2 = i - selected.itemView.getLeft();
        int top = i2 - selected.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder = null;
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(list, i6);
            if (left2 > 0) {
                int right = viewHolder2.itemView.getRight() - width2;
                if (right < 0 && viewHolder2.itemView.getRight() > selected.itemView.getRight() && (abs4 = Math.abs(right)) > i5) {
                    viewHolder = viewHolder2;
                    i5 = abs4;
                }
            } else if (left2 < 0 && (left = viewHolder2.itemView.getLeft() - i3) > 0 && viewHolder2.itemView.getLeft() < selected.itemView.getLeft() && (abs = Math.abs(left)) > i5) {
                viewHolder = viewHolder2;
                i5 = abs;
            }
            if (top < 0) {
                int top2 = viewHolder2.itemView.getTop() - i4;
                if (top2 > 0 && viewHolder2.itemView.getTop() < selected.itemView.getTop() && (abs3 = Math.abs(top2)) > i5) {
                    viewHolder = viewHolder2;
                    i5 = abs3;
                }
            } else if (top > 0 && (bottom = viewHolder2.itemView.getBottom() - height2) < 0 && viewHolder2.itemView.getBottom() > selected.itemView.getBottom() && (abs2 = Math.abs(bottom)) > i5) {
                viewHolder = viewHolder2;
                i5 = abs2;
            }
        }
        return viewHolder;
    }

    @Override // X.C0B4
    public final int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int i4 = this.LJI.LLILIL;
        if (i4 > 0) {
            return Integer.signum(i2) * i4;
        }
        return super.LJI(recyclerView, i, i2, i3, j);
    }

    @Override // X.C0B4
    public final void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (this.LJ) {
            this.LJFF = new VV6(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        }
    }
}
