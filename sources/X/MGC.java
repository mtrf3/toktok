package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MGC extends AbstractC030309z {
    public final /* synthetic */ MG8 LJLIL;

    public MGC(MG8 mg8) {
        this.LJLIL = mg8;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int i2;
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (LJJJJIZL == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.LJLIL.LJLJLLL);
            marginLayoutParams.setMarginEnd(0);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        if (LJJJJIZL == this.LJLIL.LJLLI.getState().LJIIIIZZ() - 1) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (this.LJLIL.LJLJI) {
                i2 = MG8.LJZL;
            } else {
                i2 = MG8.LJZI;
            }
            marginLayoutParams2.setMarginStart(i2);
            marginLayoutParams2.setMarginEnd(this.LJLIL.LJLL);
            view.setLayoutParams(marginLayoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        if (this.LJLIL.LJLJI) {
            i = MG8.LJZL;
        } else {
            i = MG8.LJZI;
        }
        marginLayoutParams3.setMarginStart(i);
        marginLayoutParams3.setMarginEnd(0);
        view.setLayoutParams(marginLayoutParams3);
    }
}
