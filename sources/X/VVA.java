package X;

import Y.ARunnableS33S0200000_14;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.xelement.LynxScrollView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VVA extends LinearLayoutManager {
    public final /* synthetic */ LynxScrollView LLIIIJ;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        LynxScrollView lynxScrollView = this.LLIIIJ;
        int i = lynxScrollView.LJLLLL;
        if (i > 0 && lynxScrollView.LJJIFFI(i, false)) {
            this.LLIIIJ.LJLLLL = 0;
        }
        if (this.LLIIIJ.LJLLLLLL > 0) {
            C76732zl c76732zl = new C76732zl();
            LynxScrollView lynxScrollView2 = this.LLIIIJ;
            c76732zl.element = lynxScrollView2.LJLLLLLL;
            lynxScrollView2.LJLLLLLL = 0;
            VV8 vv8 = lynxScrollView2.LJLLI;
            if (vv8 != null) {
                vv8.post(new ARunnableS33S0200000_14(c76732zl, this, 8));
            } else {
                o.LJIJI("mRecyclerView");
                throw null;
            }
        }
    }

    public VVA(LynxScrollView lynxScrollView, Context context) {
        o.LJIIJ(context, "context");
        this.LLIIIJ = lynxScrollView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIJ(recyclerView, "recyclerView");
        o.LJIIJ(state, "state");
        final Context context = recyclerView.getContext();
        o.LJFF(context, "recyclerView.context");
        C1C9 c1c9 = new C1C9(context) { // from class: X.4nJ
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
                if (displayMetrics != null) {
                    return 50.0f / displayMetrics.densityDpi;
                }
                throw new NullPointerException("densityDpi");
            }
        };
        c1c9.LIZ = i;
        LLIIIILZ(c1c9);
    }
}
