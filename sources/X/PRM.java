package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PRM extends C0A6 {
    public final /* synthetic */ PRD LJLIL;

    public PRM(PRD prd) {
        this.LJLIL = prd;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                this.LJLIL.start();
                return;
            } else {
                this.LJLIL.start();
                IOH.LIZIZ(this.LJLIL.LIZ);
                return;
            }
        }
        this.LJLIL.stop();
        IOH.LIZ();
    }
}
