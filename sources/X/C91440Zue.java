package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Zue, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91440Zue extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LIZLLL(Rect outRect, int i, RecyclerView parent) {
        int i2;
        AbstractC029409q adapter;
        Integer valueOf;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(parent, "parent");
        AbstractC029409q adapter2 = parent.getAdapter();
        if (adapter2 != null) {
            i2 = adapter2.getItemCount();
        } else {
            i2 = 0;
        }
        if (i >= i2 || (adapter = parent.getAdapter()) == null || (valueOf = Integer.valueOf(adapter.getItemViewType(i))) == null) {
            return;
        }
        if (valueOf.intValue() == 100) {
            outRect.left = C17N.LJIILL(16.0d);
            outRect.right = C17N.LJIILL(16.0d);
            outRect.top = C17N.LJIILL(24.0d);
            outRect.bottom = C17N.LJIILL(10.0d);
            return;
        }
        if (valueOf.intValue() == 101) {
            outRect.left = C17N.LJIILL(16.0d);
            outRect.right = C17N.LJIILL(16.0d);
            outRect.top = C17N.LJIILL(14.0d);
            outRect.bottom = C17N.LJIILL(10.0d);
            return;
        }
        if (valueOf.intValue() == 102) {
            outRect.left = C17N.LJIILL(16.0d);
            outRect.right = C17N.LJIILL(16.0d);
            outRect.top = C17N.LJIILL(20.0d);
            outRect.bottom = C17N.LJIILL(10.0d);
            return;
        }
        if (valueOf.intValue() == 103) {
            outRect.left = C17N.LJIILL(16.0d);
            outRect.right = C17N.LJIILL(16.0d);
            outRect.top = C17N.LJIILL(10.0d);
            outRect.bottom = C17N.LJIILL(10.0d);
            return;
        }
        if (valueOf.intValue() != 104) {
            return;
        }
        outRect.left = C17N.LJIILL(16.0d);
        outRect.right = C17N.LJIILL(16.0d);
        outRect.top = C17N.LJIILL(26.0d);
        outRect.bottom = C17N.LJIILL(35.0d);
    }
}
