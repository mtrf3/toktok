package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.CDg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30964CDg extends LinearLayoutManager {
    public final int LLIIIJ;

    public C30964CDg(Context context) {
        LLJJIII(0);
        this.LLIIIJ = C15380j0.LIZ(48.0f);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        int abs;
        float f = this.LJLLLL / 2.0f;
        int LJJJI = LJJJI();
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = LJJJ(i2);
            if (LJJJ != null && (LJJJ instanceof C30958CDa)) {
                C30958CDa c30958CDa = (C30958CDa) LJJJ;
                if (CCJ.LIZ(c30958CDa.getContext())) {
                    abs = Math.abs((C0A2.LJJJZ(LJJJ) + LJJJ.getRight()) - (this.LJLLLL - this.LLIIIJ));
                } else {
                    abs = Math.abs((LJJJ.getLeft() - C0A2.LJJJLIIL(LJJJ)) - this.LLIIIJ);
                }
                c30958CDa.setItemScale(Math.max(1.0f - ((abs / f) * 0.27999997f), 0.72f));
            }
        }
        return super.LJZI(i, c0a7, c0ac);
    }
}
