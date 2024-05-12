package X;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MQ1 extends C0A6 {
    public final int LJLIL;

    public MQ1(Context context) {
        int i;
        if (context != null) {
            i = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            i = 0;
        }
        this.LJLIL = i;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            C68925R3h.LJFF();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.LJLIL) {
            C68925R3h.LJFF();
            return;
        }
        if (recyclerView.getScrollState() == 1 && abs >= this.LJLIL) {
            C68925R3h.LJ();
        } else {
            if (recyclerView.getScrollState() != 2) {
                return;
            }
            C68925R3h.LJ();
        }
    }
}
