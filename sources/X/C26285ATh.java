package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ATh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26285ATh<T> {
    public static final List<Object> LIZIZ = Collections.emptyList();
    public final C0MB<AbstractC26286ATi<T>> LIZ = new C0MB<>();

    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        for (int i = 0; i < this.LIZ.LJIIIIZZ(); i++) {
            if (this.LIZ.LJIIIZ(i) != null) {
                this.LIZ.LJIIIZ(i).getClass();
            }
        }
    }

    public final void LJFF() {
        if (this.LIZ == null) {
            return;
        }
        for (int i = 0; i < this.LIZ.LJIIIIZZ(); i++) {
            if (this.LIZ.LJIIIZ(i) != null) {
                this.LIZ.LJIIIZ(i).getClass();
            }
        }
    }

    public final void LIZ(AbstractC26286ATi abstractC26286ATi) {
        int LJIIIIZZ = this.LIZ.LJIIIIZZ();
        while (this.LIZ.LJ(LJIIIIZZ, null) != null) {
            LJIIIIZZ++;
            if (LJIIIIZZ == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        if (LJIIIIZZ != 2147483646) {
            if (this.LIZ.LJ(LJIIIIZZ, null) == null) {
                this.LIZ.LJI(LJIIIIZZ, abstractC26286ATi);
                return;
            } else {
                StringBuilder LJ = C7MY.LJ("An AdapterDelegate is already registered for the viewType = ", LJIIIIZZ, ". Already registered AdapterDelegate is ");
                LJ.append(this.LIZ.LJ(LJIIIIZZ, null));
                throw new IllegalArgumentException(X1D.LIZIZ(LJ));
            }
        }
        throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
    }

    public final int LIZIZ(int i, Object obj) {
        if (obj != null) {
            if (this.LIZ.LJIIIIZZ() > 0) {
                this.LIZ.LJIIIZ(0).LIZ(obj);
                return this.LIZ.LJFF(0);
            }
            StringBuilder LJ = C7MY.LJ("No AdapterDelegate added that matches position=", i, " delegates=");
            LJ.append(this.LIZ);
            LJ.append(" items=");
            LJ.append(obj);
            throw new NullPointerException(X1D.LIZIZ(LJ));
        }
        throw new NullPointerException("Items datasource is null!");
    }

    public final RecyclerView.ViewHolder LJ(ViewGroup viewGroup, int i) {
        AbstractC26286ATi<T> LJ = this.LIZ.LJ(i, null);
        if (LJ != null) {
            RecyclerView.ViewHolder LIZJ = LJ.LIZJ(viewGroup);
            if (LIZJ != null) {
                return LIZJ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ViewHolder returned from AdapterDelegate ");
            LIZ.append(LJ);
            LIZ.append(" for ViewType =");
            LIZ.append(i);
            LIZ.append(" is null!");
            throw new NullPointerException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException(KMP.LJ("No AdapterDelegate added for ViewType ", i));
    }

    public final void LIZLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        List<Object> list = LIZIZ;
        AbstractC26286ATi<T> LJ = this.LIZ.LJ(viewHolder.getItemViewType(), null);
        if (LJ != null) {
            LJ.LIZIZ(obj, i, viewHolder, list);
        } else {
            StringBuilder LJ2 = C7MY.LJ("No delegate found for item at position = ", i, " for viewType = ");
            LJ2.append(viewHolder.getItemViewType());
            throw new NullPointerException(X1D.LIZIZ(LJ2));
        }
    }
}
