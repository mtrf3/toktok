package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JbI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49472JbI extends AbstractC030309z {
    public final /* synthetic */ int LJLIL;

    public C49472JbI(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZIZ;
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) == 0) {
            LIZIZ = 0;
        } else {
            LIZIZ = C7MY.LIZIZ(this.LJLIL);
        }
        rect.left = LIZIZ;
        rect.right = 0;
    }
}
