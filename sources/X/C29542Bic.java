package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Bic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29542Bic extends AbstractC030309z {
    public final int LJLIL;

    public C29542Bic(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (parent.getAdapter() != null && RecyclerView.LJJJJIZL(view) != 0) {
            outRect.top = (int) KL2.LIZJ(view.getContext(), this.LJLIL);
        }
    }
}
