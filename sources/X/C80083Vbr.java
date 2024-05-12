package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80083Vbr extends C1C9 {
    public final C62822Ol8 LJIILL;
    public float LJIILLIIL;

    public C80083Vbr(Context context) {
        super(context);
        this.LJIILL = C221108m2.LIZIZ(new AqS161S0200000_14(this, context, 26));
        this.LJIILLIIL = 1.0f;
    }

    @Override // X.C1C9
    public final int LJIIL(int i) {
        return (int) Math.ceil(Math.abs(i) * this.LJIILLIIL);
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
        float f = i;
        float f2 = f * 1.0f * f;
        float f3 = i2;
        int LJIIJJI = LJIIJJI((int) Math.sqrt((1.0f * f3 * f3) + f2));
        if (LJIIJJI > 0) {
            action.LIZIZ(-i, -i2, LJIIJJI, this.LJIIIIZZ);
        }
    }
}
