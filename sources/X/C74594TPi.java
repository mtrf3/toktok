package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.TPi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74594TPi extends C1C9 {
    public final /* synthetic */ C80098Vc6 LJIILL;

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 40.0f / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74594TPi(C80098Vc6 c80098Vc6, Context context) {
        super(context);
        this.LJIILL = c80098Vc6;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        C0A2 layoutManager;
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        RecyclerView recyclerView = this.LJIILL.LJIIIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        int[] LIZJ = this.LJIILL.LIZJ(layoutManager, targetView);
        int i = LIZJ[0];
        int i2 = LIZJ[1];
        int LJIIJJI = LJIIJJI(Math.max(Math.abs(i), Math.abs(i2)));
        if (LJIIJJI <= 0) {
            return;
        }
        action.LIZIZ(i, i2, LJIIJJI, this.LJIIIIZZ);
    }
}
