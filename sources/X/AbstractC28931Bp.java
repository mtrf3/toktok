package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC28931Bp extends AbstractC030109x {
    public boolean LJI = true;

    public abstract void LJIJ(RecyclerView.ViewHolder viewHolder);

    public abstract boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

    public abstract boolean LJIJJ(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract void LJIJJLI(RecyclerView.ViewHolder viewHolder);

    public void LJJ(RecyclerView.ViewHolder viewHolder) {
    }

    @Override // X.AbstractC030109x
    public final boolean LJFF(RecyclerView.ViewHolder viewHolder) {
        if (!this.LJI || viewHolder.isInvalid()) {
            return true;
        }
        return false;
    }

    public final void LJIL(RecyclerView.ViewHolder viewHolder) {
        LJJ(viewHolder);
        LJII(viewHolder);
    }

    @Override // X.AbstractC030109x
    public final boolean LIZ(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2) {
        int i;
        int i2;
        if (c030009w != null && ((i = c030009w.LIZ) != (i2 = c030009w2.LIZ) || c030009w.LIZIZ != c030009w2.LIZIZ)) {
            return LJIJJ(viewHolder, i, c030009w.LIZIZ, i2, c030009w2.LIZIZ);
        }
        LJIJ(viewHolder);
        return true;
    }

    @Override // X.AbstractC030109x
    public boolean LIZJ(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2) {
        int i;
        int i2;
        int i3 = c030009w.LIZ;
        int i4 = c030009w.LIZIZ;
        View view = viewHolder.itemView;
        if (c030009w2 == null) {
            i = view.getLeft();
        } else {
            i = c030009w2.LIZ;
        }
        if (c030009w2 == null) {
            i2 = view.getTop();
        } else {
            i2 = c030009w2.LIZIZ;
        }
        if (!viewHolder.isRemoved() && (i3 != i || i4 != i2)) {
            view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
            return LJIJJ(viewHolder, i3, i4, i, i2);
        }
        LJIJJLI(viewHolder);
        return true;
    }

    @Override // X.AbstractC030109x
    public final boolean LIZLLL(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2) {
        int i = c030009w.LIZ;
        int i2 = c030009w2.LIZ;
        if (i != i2 || c030009w.LIZIZ != c030009w2.LIZIZ) {
            return LJIJJ(viewHolder, i, c030009w.LIZIZ, i2, c030009w2.LIZIZ);
        }
        LJII(viewHolder);
        return false;
    }

    @Override // X.AbstractC030109x
    public boolean LIZIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C030009w c030009w, C030009w c030009w2) {
        int i;
        int i2;
        int i3 = c030009w.LIZ;
        int i4 = c030009w.LIZIZ;
        if (viewHolder2.shouldIgnore()) {
            i = c030009w.LIZ;
            i2 = c030009w.LIZIZ;
        } else {
            i = c030009w2.LIZ;
            i2 = c030009w2.LIZIZ;
        }
        return LJIJI(i3, i4, i, i2, viewHolder, viewHolder2);
    }
}
