package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4JP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JP extends AbstractC030309z {
    public final int LJLIL;
    public final InterfaceC88472Yns<Integer, Integer> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C4JP(int i, InterfaceC88472Yns<? super Integer, Integer> interfaceC88472Yns) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition() % this.LJLIL;
        int intValue = this.LJLILLLLZI.invoke(Integer.valueOf(C53946LFe.LIZJ(null, null).LIZIZ)).intValue();
        int i = this.LJLIL;
        rect.left = (viewLayoutPosition * intValue) / i;
        rect.right = intValue - (((viewLayoutPosition + 1) * intValue) / i);
    }
}
