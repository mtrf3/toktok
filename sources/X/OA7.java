package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OA7 implements InterfaceC81841WAb {
    public final /* synthetic */ OA5 LJLIL;
    public final /* synthetic */ OA8 LJLILLLLZI;

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 drawable) {
        o.LJIIIZ(drawable, "drawable");
    }

    public OA7(OA5 oa5, OA8 oa8) {
        this.LJLIL = oa5;
        this.LJLILLLLZI = oa8;
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 drawable, int i) {
        o.LJIIIZ(drawable, "drawable");
        OA5 oa5 = this.LJLIL;
        if (oa5.LJLLJ == 0 || i != 0) {
            oa5.LJLLJ = i;
        }
        if (i == this.LJLILLLLZI.getFrameCount() - 1) {
            this.LJLIL.LJII();
            OA9 oa9 = this.LJLIL.LJLJLJ;
            if (oa9 != null) {
                oa9.LJL();
            }
        }
    }
}
