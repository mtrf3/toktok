package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JnP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50223JnP extends AbstractC030309z {
    public final boolean LJLIL;

    public C50223JnP(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (!this.LJLIL) {
            if (LIZJ == 0) {
                rect.left = (int) C78847Ux1.LJJIFFI(8);
            }
            rect.right = (int) C78847Ux1.LJJIFFI(8);
        } else {
            if (LIZJ == 0) {
                rect.right = (int) C78847Ux1.LJJIFFI(8);
            }
            rect.left = (int) C78847Ux1.LJJIFFI(8);
        }
    }
}
