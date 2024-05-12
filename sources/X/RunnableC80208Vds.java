package X;

import android.view.View;
import android.widget.OverScroller;
import com.google.android.material.appbar.HeaderBehavior;

/* JADX WARN: Incorrect field signature: TV; */
/* renamed from: X.Vds, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80208Vds implements Runnable {
    public final C45621qg LJLIL;
    public final View LJLILLLLZI;
    public final /* synthetic */ HeaderBehavior LJLJI;

    public final void LIZ() {
        OverScroller overScroller;
        if (this.LJLILLLLZI != null && (overScroller = this.LJLJI.scroller) != null) {
            if (overScroller.computeScrollOffset()) {
                HeaderBehavior headerBehavior = this.LJLJI;
                headerBehavior.setHeaderTopBottomOffset(this.LJLIL, this.LJLILLLLZI, headerBehavior.scroller.getCurrY());
                C16300kU.LJIIL(this.LJLILLLLZI, this);
                return;
            }
            this.LJLJI.onFlingFinished(this.LJLIL, this.LJLILLLLZI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC80208Vds(HeaderBehavior headerBehavior, C45621qg c45621qg, V v) {
        this.LJLJI = headerBehavior;
        this.LJLIL = c45621qg;
        this.LJLILLLLZI = v;
    }
}
