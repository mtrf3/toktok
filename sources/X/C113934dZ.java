package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4dZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113934dZ extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI = 4;

    public C113934dZ(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) / this.LJLILLLLZI == 0) {
            rect.bottom = this.LJLIL;
        }
    }
}
