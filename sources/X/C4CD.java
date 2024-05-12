package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4CD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CD extends AbstractC030309z {
    public final int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI = C90193gN.LIZIZ(EF7.LIZIZ());

    public C4CD(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ >= 0 && LIZJ < this.LJLIL) {
            rect.top = (int) KL2.LIZJ(view.getContext(), 16.0f);
        }
        int i2 = this.LJLIL;
        if (LIZJ >= i2) {
            rect.top = this.LJLJI;
        }
        int i3 = LIZJ % i2;
        int i4 = this.LJLILLLLZI;
        int i5 = (i3 * i4) / i2;
        int i6 = i4 - (((i3 + 1) * i4) / i2);
        boolean z = this.LJLJJI;
        if (z) {
            i = i6;
        } else {
            i = i5;
        }
        rect.left = i;
        if (!z) {
            i5 = i6;
        }
        rect.right = i5;
    }
}
