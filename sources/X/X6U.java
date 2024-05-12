package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X6U implements View.OnAttachStateChangeListener {
    public final /* synthetic */ X6T LJLIL;

    public X6U(X6T x6t) {
        this.LJLIL = x6t;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        this.LJLIL.LJII = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        XKQ xkq = this.LJLIL.LJIIIIZZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL.LJIIIIZZ = null;
        this.LJLIL.LJII = true;
    }
}
