package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.agE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94390agE extends C0B4 {
    public final C94007aa3 LIZLLL;
    public final float LJ = 0.1f;
    public final float LJFF = 0.7f;
    public final int LJI = 15;
    public final int LJII = 32;

    @Override // X.C0B4
    public final boolean LJII() {
        C94007aa3 c94007aa3 = this.LIZLLL;
        if (c94007aa3 != null) {
            c94007aa3.getClass();
        }
        return false;
    }

    @Override // X.C0B4
    public final boolean LJIIIIZZ() {
        C94007aa3 c94007aa3 = this.LIZLLL;
        if (c94007aa3 != null) {
            c94007aa3.getClass();
        }
        return false;
    }

    public C94390agE(C94007aa3 c94007aa3) {
        this.LIZLLL = c94007aa3;
    }

    public static final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 268435729 || itemViewType == 268436002 || itemViewType == 268436275 || itemViewType == 268436821) {
            return true;
        }
        return false;
    }

    @Override // X.C0B4
    public final float LIZLLL(RecyclerView.ViewHolder viewHolder) {
        return this.LJ;
    }

    @Override // X.C0B4
    public final float LJFF(RecyclerView.ViewHolder viewHolder) {
        return this.LJFF;
    }

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        C94007aa3 c94007aa3;
        if (!LJIILLIIL(viewHolder) && (c94007aa3 = this.LIZLLL) != null) {
            c94007aa3.LJ(viewHolder);
        }
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZIZ(recyclerView, viewHolder);
        if (LJIILLIIL(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(R.id.nl_) != null && ((Boolean) viewHolder.itemView.getTag(R.id.nl_)).booleanValue()) {
            C94007aa3 c94007aa3 = this.LIZLLL;
            if (c94007aa3 != null) {
                c94007aa3.LIZIZ(viewHolder);
            }
            viewHolder.itemView.setTag(R.id.nl_, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(R.id.nla) != null && ((Boolean) viewHolder.itemView.getTag(R.id.nla)).booleanValue()) {
            viewHolder.itemView.setTag(R.id.nla, Boolean.FALSE);
        }
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (LJIILLIIL(viewHolder)) {
            return C0B4.LJIIIZ(0, 0);
        }
        return C0B4.LJIIIZ(this.LJI, this.LJII);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2) {
            if (!LJIILLIIL(viewHolder)) {
                C94007aa3 c94007aa3 = this.LIZLLL;
                if (c94007aa3 != null) {
                    c94007aa3.LIZLLL(viewHolder);
                }
                viewHolder.itemView.setTag(R.id.nl_, Boolean.TRUE);
                return;
            }
        } else if (i == 1 && !LJIILLIIL(viewHolder)) {
            viewHolder.itemView.setTag(R.id.nla, Boolean.TRUE);
            return;
        }
        if (viewHolder != null) {
        }
    }

    @Override // X.C0B4
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() == viewHolder2.getItemViewType()) {
            return true;
        }
        return false;
    }

    @Override // X.C0B4
    public final void LJIIJJI(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        if (i == 1 && !LJIILLIIL(viewHolder)) {
            View view = viewHolder.itemView;
            canvas.save();
            if (f > 0.0f) {
                canvas.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
                canvas.translate(view.getLeft(), view.getTop());
            } else {
                canvas.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
                canvas.translate(view.getRight() + f, view.getTop());
            }
            C94007aa3 c94007aa3 = this.LIZLLL;
            if (c94007aa3 != null) {
                c94007aa3.getClass();
            }
            canvas.restore();
        }
    }

    @Override // X.C0B4
    public final void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.LJIILIIL(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        C94007aa3 c94007aa3 = this.LIZLLL;
        if (c94007aa3 != null) {
            c94007aa3.LIZJ(viewHolder, viewHolder2);
        }
    }
}
