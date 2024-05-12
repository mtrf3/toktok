package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4KW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KW extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C4KW(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        boolean LIZJ = C26338AVi.LIZJ(context);
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        AbstractC029409q adapter = parent.getAdapter();
        if (adapter != null) {
            int intValue = Integer.valueOf(adapter.getItemCount()).intValue();
            if (LJJJJIZL == 0) {
                if (LIZJ) {
                    outRect.right = this.LJLILLLLZI;
                    outRect.left = this.LJLIL;
                    return;
                } else {
                    outRect.left = this.LJLILLLLZI;
                    outRect.right = this.LJLIL;
                    return;
                }
            }
            if (LJJJJIZL == intValue - 1) {
                if (LIZJ) {
                    outRect.left = this.LJLILLLLZI;
                    outRect.right = this.LJLIL;
                    return;
                } else {
                    outRect.right = this.LJLILLLLZI;
                    outRect.left = this.LJLIL;
                    return;
                }
            }
            int i = this.LJLIL;
            outRect.right = i;
            outRect.left = i;
        }
    }
}
