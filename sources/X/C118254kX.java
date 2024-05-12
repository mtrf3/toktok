package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118254kX extends AbstractC030309z {
    public final int LJLIL = 2;
    public final int LJLILLLLZI;

    public C118254kX(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) < this.LJLIL) {
            rect.top = this.LJLILLLLZI;
        }
        if (RecyclerView.LJJJJIZL(view) % this.LJLIL == 0) {
            int i = this.LJLILLLLZI;
            rect.left = i;
            rect.right = i / 2;
        } else {
            int LJJJJIZL = RecyclerView.LJJJJIZL(view);
            int i2 = this.LJLIL;
            if (LJJJJIZL % i2 == i2 - 1) {
                int i3 = this.LJLILLLLZI;
                rect.left = i3 / 2;
                rect.right = i3;
            } else {
                int i4 = this.LJLILLLLZI / 2;
                rect.left = i4;
                rect.right = i4;
            }
        }
        rect.bottom = this.LJLILLLLZI;
    }
}
