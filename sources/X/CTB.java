package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class CTB extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI = 1;

    public CTB(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        recyclerView.getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        int i = this.LJLILLLLZI;
        if (i == 0) {
            if (LJJJJIZL != 0) {
                rect.left = this.LJLIL;
            }
        } else {
            if (1 != i) {
                return;
            }
            rect.top = this.LJLIL;
        }
    }
}
