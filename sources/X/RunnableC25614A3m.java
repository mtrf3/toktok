package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.paidcontent.ui.PaidContentDetailViewItemCell;
import kotlin.jvm.internal.o;

/* renamed from: X.A3m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25614A3m implements Runnable {
    public final /* synthetic */ PaidContentDetailViewItemCell LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    public RunnableC25614A3m(PaidContentDetailViewItemCell paidContentDetailViewItemCell, float f) {
        this.LJLIL = paidContentDetailViewItemCell;
        this.LJLILLLLZI = f;
    }

    public final void LIZ() {
        View view = this.LJLIL.LJLJJI;
        if (view != null) {
            view.setEnabled(false);
            View view2 = this.LJLIL.LJLJJI;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (this.LJLIL.LJLJJL != null) {
                    layoutParams.width = (int) (r0.getMeasuredWidth() * this.LJLILLLLZI);
                    View view3 = this.LJLIL.LJLJJI;
                    if (view3 != null) {
                        view3.setLayoutParams(layoutParams);
                        return;
                    } else {
                        o.LJIJI("progressBar");
                        throw null;
                    }
                }
                o.LJIJI("progressBarBackground");
                throw null;
            }
            o.LJIJI("progressBar");
            throw null;
        }
        o.LJIJI("progressBar");
        throw null;
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
}
