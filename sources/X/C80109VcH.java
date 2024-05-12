package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.VcH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80109VcH extends C40141hq {
    public C28851Bh LJFF;

    @Override // X.C40141hq, X.AbstractC28951Br
    public final View LJFF(C0A2 c0a2) {
        if ((c0a2 instanceof LinearLayoutManager) && c0a2.LJIJJLI()) {
            int LJJJI = c0a2.LJJJI();
            View view = null;
            if (LJJJI == 0) {
                return null;
            }
            if (this.LJFF == null) {
                this.LJFF = new C28851Bh(c0a2);
            }
            C28851Bh c28851Bh = this.LJFF;
            if (c28851Bh == null) {
                return null;
            }
            int LJIIJJI = (c28851Bh.LJIIJJI() / 2) + c28851Bh.LJIIJ();
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < LJJJI; i2++) {
                View LJJJ = c0a2.LJJJ(i2);
                if (LJJJ != null) {
                    int abs = Math.abs((((LJJJ.getRight() - LJJJ.getLeft()) / 2) + LJJJ.getLeft()) - LJIIJJI);
                    if (abs < i) {
                        view = LJJJ;
                        i = abs;
                    }
                }
            }
            return view;
        }
        return super.LJFF(c0a2);
    }
}
