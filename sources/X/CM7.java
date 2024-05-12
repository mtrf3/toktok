package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CM7 extends C0A6 {
    public final int LJLIL;

    public CM7(int i) {
        this.LJLIL = i;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && W5I.LIZ().LJIIJ()) {
            W5I.LIZ().LJIILL();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.LJLIL) {
            W5I.LIZ().LJIILL();
            return;
        }
        if (recyclerView.getScrollState() == 1 && abs >= this.LJLIL) {
            W5I.LIZ().LJIIJJI();
        } else {
            if (recyclerView.getScrollState() != 2) {
                return;
            }
            W5I.LIZ().LJIIJJI();
        }
    }
}
