package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80081Vbp extends C1C9 {
    public C80081Vbp(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return (25.0f / displayMetrics.densityDpi) / 1.5f;
    }

    @Override // X.C1C9, X.C0AB
    public final void LJFF(View targetView, C0AC state, C0A9 action) {
        int i;
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(action, "action");
        C0A2 c0a2 = this.LIZJ;
        int i2 = 0;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            i = 0;
        } else {
            ViewGroup.LayoutParams layoutParams = targetView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LJJJJJ = c0a2.LJJJJJ(targetView) - marginLayoutParams.leftMargin;
            int LJJJJLI = c0a2.LJJJJLI(targetView) + marginLayoutParams.rightMargin;
            int paddingLeft = c0a2.getPaddingLeft();
            i = ((int) (((c0a2.LJLLLL - c0a2.getPaddingRight()) - paddingLeft) / 2.0f)) - (LJJJJJ + ((int) ((LJJJJLI - LJJJJJ) / 2.0f)));
        }
        C0A2 c0a22 = this.LIZJ;
        if (c0a22 != null && c0a22.LJIL()) {
            ViewGroup.LayoutParams layoutParams2 = targetView.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int LJJJJLL = c0a22.LJJJJLL(targetView) - marginLayoutParams2.topMargin;
            int LJJJJIZL = c0a22.LJJJJIZL(targetView) + marginLayoutParams2.bottomMargin;
            int paddingTop = c0a22.getPaddingTop();
            i2 = ((int) (((c0a22.LJLLLLLL - c0a22.getPaddingBottom()) - paddingTop) / 2.0f)) - (LJJJJLL + ((int) ((LJJJJIZL - LJJJJLL) / 2.0f)));
        }
        int LJIIJJI = LJIIJJI((int) Math.sqrt((i2 * i2) + (i * i)));
        if (LJIIJJI > 0) {
            action.LIZIZ(-i, -i2, LJIIJJI, this.LJIIIIZZ);
        }
    }
}
