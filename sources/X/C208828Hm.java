package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.8Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208828Hm extends AbstractC030309z {
    public final float LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C208828Hm(boolean z, float f, boolean z2) {
        this.LJLIL = f;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, this.LJLIL);
        if (!this.LJLILLLLZI) {
            outRect.bottom = LIZIZ;
        } else if (this.LJLJI) {
            Context context2 = view.getContext();
            o.LJIIIIZZ(context2, "view.context");
            LIZIZ = (int) C74275TDb.LIZIZ(context2, 8.0f);
        }
        int i = LIZIZ / 2;
        outRect.left = i;
        outRect.right = i;
    }
}
