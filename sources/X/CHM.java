package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CHM extends C0A6 {
    public final CHP LJLIL;

    public CHM(CHK chk) {
        this.LJLIL = chk;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            CHP chp = this.LJLIL;
            if (chp != null) {
                chp.start();
                return;
            }
            return;
        }
        CHP chp2 = this.LJLIL;
        if (chp2 == null) {
            return;
        }
        chp2.stop();
    }
}
