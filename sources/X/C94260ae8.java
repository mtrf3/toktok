package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.ae8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94260ae8 extends AbstractC030309z {
    public final int LJLIL;

    public C94260ae8(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        super.LJ(outRect, view, parent, state);
        outRect.set(0, 0, 0, this.LJLIL);
    }
}
