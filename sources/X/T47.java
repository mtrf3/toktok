package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T47 extends AbstractC030309z {
    public final TKR LJLIL;

    public T47(TKR tkr) {
        this.LJLIL = tkr;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        float f;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        outRect.bottom = (int) C74275TDb.LIZIZ(context, this.LJLIL.LJLLILLLL);
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        if (this.LJLIL.LLIIJLIL == 3) {
            f = 30.0f;
        } else {
            f = 18.0f;
        }
        int LIZIZ = ((int) C74275TDb.LIZIZ(context2, f)) / 2;
        outRect.left = LIZIZ;
        outRect.right = LIZIZ;
    }
}
