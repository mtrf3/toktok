package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0AW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AW {
    public final C0AV LIZ;
    public final C0AU LIZIZ = new C0AU();
    public final List<View> LIZJ = new ArrayList();

    public final int LJ() {
        return ((C28891Bl) this.LIZ).LIZ() - ((ArrayList) this.LIZJ).size();
    }

    public final int LJII() {
        return ((C28891Bl) this.LIZ).LIZ();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ.toString());
        LIZ.append(", hidden list:");
        LIZ.append(((ArrayList) this.LIZJ).size());
        return X1D.LIZIZ(LIZ);
    }

    public C0AW(C28891Bl c28891Bl) {
        this.LIZ = c28891Bl;
    }

    public final void LIZJ(int i) {
        RecyclerView.ViewHolder LJJJJL;
        int LJFF = LJFF(i);
        this.LIZIZ.LJFF(LJFF);
        C28891Bl c28891Bl = (C28891Bl) this.LIZ;
        View childAt = c28891Bl.LIZ.getChildAt(LJFF);
        if (childAt != null && (LJJJJL = RecyclerView.LJJJJL(childAt)) != null) {
            if (!LJJJJL.isTmpDetached() || LJJJJL.shouldIgnore()) {
                LJJJJL.addFlags(256);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("called detach on an already detached child ");
                LIZ.append(LJJJJL);
                LIZ.append(c28891Bl.LIZ.LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        c28891Bl.LIZ.detachViewFromParent(LJFF);
    }

    public final View LIZLLL(int i) {
        return ((C28891Bl) this.LIZ).LIZ.getChildAt(LJFF(i));
    }

    public final int LJFF(int i) {
        if (i < 0) {
            return -1;
        }
        int LIZ = ((C28891Bl) this.LIZ).LIZ();
        int i2 = i;
        while (i2 < LIZ) {
            int LIZIZ = i - (i2 - this.LIZIZ.LIZIZ(i2));
            if (LIZIZ == 0) {
                while (this.LIZIZ.LIZLLL(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += LIZIZ;
        }
        return -1;
    }

    public final View LJI(int i) {
        return ((C28891Bl) this.LIZ).LIZ.getChildAt(i);
    }

    public final void LJIIIIZZ(View view) {
        ((ArrayList) this.LIZJ).add(view);
        C28891Bl c28891Bl = (C28891Bl) this.LIZ;
        c28891Bl.getClass();
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (LJJJJL != null) {
            LJJJJL.onEnteredHiddenState(c28891Bl.LIZ);
        }
    }

    public final int LJIIIZ(View view) {
        int indexOfChild = ((C28891Bl) this.LIZ).LIZ.indexOfChild(view);
        if (indexOfChild == -1 || this.LIZIZ.LIZLLL(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.LIZIZ.LIZIZ(indexOfChild);
    }

    public final boolean LJIIJ(View view) {
        return ((ArrayList) this.LIZJ).contains(view);
    }

    public final void LJIIJJI(int i) {
        int LJFF = LJFF(i);
        View childAt = ((C28891Bl) this.LIZ).LIZ.getChildAt(LJFF);
        if (childAt == null) {
            return;
        }
        if (this.LIZIZ.LJFF(LJFF)) {
            LJIIL(childAt);
        }
        ((C28891Bl) this.LIZ).LIZIZ(LJFF);
    }

    public final void LJIIL(View view) {
        if (((ArrayList) this.LIZJ).remove(view)) {
            C28891Bl c28891Bl = (C28891Bl) this.LIZ;
            c28891Bl.getClass();
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
            if (LJJJJL != null) {
                LJJJJL.onLeftHiddenState(c28891Bl.LIZ);
            }
        }
    }

    public final void LIZ(int i, View view, boolean z) {
        int LJFF;
        if (i < 0) {
            LJFF = ((C28891Bl) this.LIZ).LIZ();
        } else {
            LJFF = LJFF(i);
        }
        this.LIZIZ.LJ(LJFF, z);
        if (z) {
            LJIIIIZZ(view);
        }
        C28891Bl c28891Bl = (C28891Bl) this.LIZ;
        c28891Bl.LIZ.addView(view, LJFF);
        RecyclerView recyclerView = c28891Bl.LIZ;
        recyclerView.getClass();
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        AbstractC029409q abstractC029409q = recyclerView.LJLLILLLL;
        if (abstractC029409q != null && LJJJJL != null) {
            abstractC029409q.onViewAttachedToWindow(LJJJJL);
        }
        List<C0A3> list = recyclerView.LLIFFJFJJ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C0A3) ListProtector.get(recyclerView.LLIFFJFJJ, size)).LJJIFFI(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void LIZIZ(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int LJFF;
        if (i < 0) {
            LJFF = ((C28891Bl) this.LIZ).LIZ();
        } else {
            LJFF = LJFF(i);
        }
        this.LIZIZ.LJ(LJFF, z);
        if (z) {
            LJIIIIZZ(view);
        }
        C28891Bl c28891Bl = (C28891Bl) this.LIZ;
        c28891Bl.getClass();
        RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
        if (LJJJJL != null) {
            if (LJJJJL.isTmpDetached() || LJJJJL.shouldIgnore()) {
                LJJJJL.clearTmpDetachFlag();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Called attach on a child which is not detached: ");
                LIZ.append(LJJJJL);
                LIZ.append(c28891Bl.LIZ.LJJIIZ());
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        c28891Bl.LIZ.attachViewToParent(view, LJFF, layoutParams);
    }
}
