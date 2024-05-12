package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199867ss extends AbstractC030309z {
    public static final int LJLJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C199867ss() {
        int i = LJLJI;
        this.LJLIL = i;
        this.LJLILLLLZI = i / 2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        int i = this.LJLILLLLZI;
        rect.set(i, this.LJLIL, i, 0);
    }
}
