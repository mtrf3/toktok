package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Zte, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91378Zte extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LIZLLL(Rect outRect, int i, RecyclerView parent) {
        int i2;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(parent, "parent");
        AbstractC029409q adapter = parent.getAdapter();
        if (adapter != null) {
            i2 = adapter.getItemCount();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return;
        }
        outRect.top = C17N.LJIILL(16.0d);
    }
}
