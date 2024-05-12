package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.TPc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74588TPc extends C1C9 {
    public final /* synthetic */ ScrollTopLinearLayoutManager LJIILL;

    @Override // X.C1C9
    public final int LJIILIIL() {
        return -1;
    }

    @Override // X.C1C9
    public final int LJIILJJIL() {
        return -1;
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return this.LJIILL.LLIIIZ / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74588TPc(ScrollTopLinearLayoutManager scrollTopLinearLayoutManager, Context context) {
        super(context);
        this.LJIILL = scrollTopLinearLayoutManager;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        int LJIIIIZZ = LJIIIIZZ(-1, targetView);
        int LJIIIZ = LJIIIZ(-1, targetView) + this.LJIILL.LLIIIJ;
        int LJIIJJI = LJIIJJI((int) Math.sqrt((LJIIIZ * LJIIIZ) + (LJIIIIZZ * LJIIIIZZ)));
        if (LJIIJJI > 0) {
            action.LIZIZ(-LJIIIIZZ, -LJIIIZ, LJIIJJI, this.LJIIIIZZ);
        }
    }
}
