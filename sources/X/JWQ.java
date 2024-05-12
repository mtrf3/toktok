package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWQ extends AbstractC030309z {
    public final int LJLIL = (int) C78847Ux1.LJJIFFI(8);

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        boolean LIZIZ = C90193gN.LIZIZ(view.getContext());
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (LJJJJIZL > 1) {
            outRect.top = this.LJLIL;
        }
        int i = LJJJJIZL % 2;
        if (i == 0) {
            if (LIZIZ) {
                outRect.left = this.LJLIL / 2;
                return;
            } else {
                outRect.right = this.LJLIL / 2;
                return;
            }
        }
        if (i != 1) {
            return;
        }
        if (LIZIZ) {
            outRect.right = this.LJLIL / 2;
        } else {
            outRect.left = this.LJLIL / 2;
        }
    }
}
