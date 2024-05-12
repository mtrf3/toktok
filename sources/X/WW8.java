package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WW8 extends C0A6 {
    public final WWT LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public final boolean LJLJJI;

    public WW8(Context context, WW3 ww3) {
        this.LJLIL = ww3;
        this.LJLJJI = C26338AVi.LIZJ(context);
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        int i2;
        o.LJIIIZ(recyclerView, "recyclerView");
        int i3 = 1;
        if (i == 0) {
            if (this.LJLILLLLZI) {
                int i4 = this.LJLJI;
                if (i4 != 0) {
                    if (i4 > 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    this.LJLIL.LIZ(new WWR(i2, i4));
                    this.LJLJI = 0;
                    if (this.LJLJJI) {
                        i3 = -1;
                    }
                    if (!recyclerView.canScrollHorizontally(i3)) {
                        this.LJLIL.LIZIZ();
                    }
                }
                this.LJLILLLLZI = false;
                return;
            }
            return;
        }
        if (1 != i) {
            return;
        }
        this.LJLILLLLZI = true;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI += i;
    }
}
