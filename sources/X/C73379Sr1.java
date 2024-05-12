package X;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Sr1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73379Sr1 extends C0A6 {
    public final int LJLIL;

    public C73379Sr1(Context context) {
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.C0A6
    public void LJIILJJIL(int i, RecyclerView recyclerView) {
        if (i == 0) {
            W5I.LIZ().LJIILL();
        }
    }

    @Override // X.C0A6
    public void LJIILL(RecyclerView recyclerView, int i, int i2) {
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
