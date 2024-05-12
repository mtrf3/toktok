package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: X.4OL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OL extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public C4OL(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                if (LIZJ == 0) {
                    rect.right = this.LJLIL;
                } else {
                    rect.right = this.LJLILLLLZI;
                }
                if (LIZJ == itemCount - 1) {
                    rect.left = this.LJLJI;
                    return;
                }
                return;
            }
            if (LIZJ == 0) {
                rect.left = this.LJLIL;
            } else {
                rect.left = this.LJLILLLLZI;
            }
            if (LIZJ != itemCount - 1) {
                return;
            }
            rect.right = this.LJLJI;
        }
    }
}
