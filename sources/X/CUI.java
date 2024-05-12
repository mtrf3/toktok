package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CUI implements InterfaceC31469CWr {
    public final /* synthetic */ CSG<CQO<? extends CR6>> LIZ;
    public final /* synthetic */ CUG LIZIZ;

    @Override // X.InterfaceC31469CWr
    public final void invalidate() {
        CS6 cs6 = this.LIZ.LJIIIZ;
        if (cs6.LJ && cs6.LJII > 0) {
            this.LIZIZ.P().LIZIZ().LIZIZ = -1;
            this.LIZIZ.LLFF.requestLayout();
            C31463CWl LIZIZ = this.LIZIZ.P().LIZIZ();
            LIZIZ.LJJL = 0;
            Object value = LIZIZ.LJJLIIIJJI.getValue();
            o.LJIIIIZZ(value, "<get-showAnimator>(...)");
            ((ValueAnimator) value).start();
        }
    }

    public CUI(CSG<CQO<? extends CR6>> csg, CUG cug) {
        this.LIZ = csg;
        this.LIZIZ = cug;
    }
}
