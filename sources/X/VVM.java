package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VVM extends C1C9 {
    public final int LJIILL;

    public VVM(VNU vnu, int i) {
        super(vnu);
        this.LJIILL = i;
    }

    @Override // X.C1C9
    public final int LJIIIIZZ(int i, View view) {
        o.LJIIJ(view, "view");
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 != null && c0a2.LJIJJLI()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (c0a2.getPaddingLeft() - (c0a2.LJJJJJ(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + this.LJIILL;
            }
            throw new C37692Eqm("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        return 0;
    }

    @Override // X.C1C9
    public final int LJIIIZ(int i, View view) {
        o.LJIIJ(view, "view");
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 != null && c0a2.LJIL()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                return (c0a2.getPaddingTop() - (c0a2.LJJJJLL(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin)) + this.LJIILL;
            }
            throw new C37692Eqm("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        return 0;
    }
}
