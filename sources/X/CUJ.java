package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TPINNED_MODEL; */
/* loaded from: classes6.dex */
public final class CUJ implements InterfaceC31469CWr {
    public final /* synthetic */ CSH LIZ;
    public final /* synthetic */ CUF<TEXT_MODEL, PINNED_MODEL> LIZIZ;

    @Override // X.InterfaceC31469CWr
    public final void invalidate() {
        CS6 cs6 = ((CSG) this.LIZ).LJIIIZ;
        if (cs6.LJ && cs6.LJII > 0) {
            this.LIZIZ.P().LIZIZ().LIZIZ = -1;
            this.LIZIZ.LLFII.requestLayout();
            C31463CWl LIZIZ = this.LIZIZ.P().LIZIZ();
            LIZIZ.LJJL = 0;
            Object value = LIZIZ.LJJLIIIJJI.getValue();
            o.LJIIIIZZ(value, "<get-showAnimator>(...)");
            ((ValueAnimator) value).start();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TPINNED_MODEL;LX/CUF<TTEXT_MODEL;TPINNED_MODEL;>;)V */
    public CUJ(CSH csh, CUF cuf) {
        this.LIZ = csh;
        this.LIZIZ = cuf;
    }
}
