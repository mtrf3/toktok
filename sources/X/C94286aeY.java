package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aeY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94286aeY extends C0B4 {
    public final C94288aea LIZLLL;
    public final float LJ = 0.7f;
    public final int LJFF = 33992323;
    public final int LJI = 33992324;
    public boolean LJII;

    @Override // X.C0B4
    public final boolean LJII() {
        C94288aea c94288aea = this.LIZLLL;
        if (c94288aea != null) {
            c94288aea.getClass();
        }
        return false;
    }

    @Override // X.C0B4
    public final boolean LJIIIIZZ() {
        C94288aea c94288aea = this.LIZLLL;
        if (c94288aea != null) {
            c94288aea.getClass();
        }
        return false;
    }

    public C94286aeY(C94288aea c94288aea) {
        Paint paint = new Paint();
        this.LJII = false;
        this.LIZLLL = c94288aea;
        paint.setStyle(Paint.Style.FILL);
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
        viewHolder.itemView.getHeight();
        viewHolder.itemView.getTop();
        return 0.01f;
    }

    @Override // X.C0B4
    public final float LJFF(RecyclerView.ViewHolder viewHolder) {
        return this.LJ;
    }

    @Override // X.C0B4
    public final void LJIILL(RecyclerView.ViewHolder viewHolder) {
        C94288aea c94288aea;
        if (!LJIILLIIL(viewHolder) && (c94288aea = this.LIZLLL) != null) {
            c94288aea.LJ(viewHolder);
        }
    }

    @Override // X.C0B4
    public final void LIZIZ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZIZ(recyclerView, viewHolder);
        if (LJIILLIIL(viewHolder)) {
            return;
        }
        if (viewHolder.itemView.getTag(this.LJI) != null && ((Boolean) viewHolder.itemView.getTag(this.LJI)).booleanValue()) {
            C94288aea c94288aea = this.LIZLLL;
            if (c94288aea != null) {
                c94288aea.LIZIZ(viewHolder);
            }
            viewHolder.itemView.setTag(this.LJI, Boolean.FALSE);
        }
        if (viewHolder.itemView.getTag(this.LJFF) != null && ((Boolean) viewHolder.itemView.getTag(this.LJFF)).booleanValue()) {
            viewHolder.itemView.setTag(this.LJFF, Boolean.FALSE);
        }
    }

    @Override // X.C0B4
    public final int LJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C94288aea c94288aea = this.LIZLLL;
        c94288aea.getClass();
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(viewHolder, "viewHolder");
        if (LJIILLIIL(viewHolder)) {
            return C0B4.LJIIIZ(0, 0);
        }
        C93867aXn c93867aXn = c94288aea.LJII;
        if (c93867aXn != null) {
            return c93867aXn.LIZ(recyclerView, viewHolder);
        }
        return C0B4.LJIIIZ(c94288aea.LJ, c94288aea.LJFF);
    }

    @Override // X.C0B4
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 2) {
            if (!LJIILLIIL(viewHolder)) {
                C94288aea c94288aea = this.LIZLLL;
                if (c94288aea != null) {
                    c94288aea.LIZLLL(viewHolder);
                }
                viewHolder.itemView.setTag(this.LJI, Boolean.TRUE);
                return;
            }
        } else if (i == 1 && !LJIILLIIL(viewHolder)) {
            viewHolder.itemView.setTag(this.LJFF, Boolean.TRUE);
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
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, z);
    }

    @Override // X.C0B4
    public final void LJIIJJI(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder holder, float f, float f2, int i, boolean z) {
        if (i == 1) {
            if (!LJIILLIIL(holder)) {
                View view = holder.itemView;
                c.save();
                if (f > 0.0f) {
                    c.clipRect(view.getLeft(), view.getTop(), view.getLeft() + f, view.getBottom());
                    c.translate(view.getLeft(), view.getTop());
                } else {
                    c.clipRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom());
                    c.translate(view.getRight() + f, view.getTop());
                }
                c.restore();
            }
        } else if (i == 2) {
            C94288aea c94288aea = this.LIZLLL;
            c94288aea.getClass();
            o.LJIIIZ(c, "c");
            o.LJIIIZ(recyclerView, "recyclerView");
            o.LJIIIZ(holder, "holder");
            C93867aXn c93867aXn = c94288aea.LJII;
            if (c93867aXn != null && z) {
                c93867aXn.LIZ = f2;
            }
            if (this.LJII && !z) {
                this.LIZLLL.getClass();
            }
        }
        this.LJII = z;
    }

    @Override // X.C0B4
    public final void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        super.LJIILIIL(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        C94288aea c94288aea = this.LIZLLL;
        if (c94288aea != null) {
            c94288aea.LJFF(i3, i4, viewHolder, viewHolder2);
        }
    }
}
