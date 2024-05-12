package X;

import Y.ARunnableS24S0300000_13;
import android.graphics.Point;
import com.bytedance.android.live.base.model.user.User;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE1 implements InterfaceC81841WAb {
    public final /* synthetic */ C76846UDy LJLIL;
    public final /* synthetic */ AnimatedDrawable2 LJLILLLLZI;
    public final /* synthetic */ C2A4 LJLJI;
    public final /* synthetic */ C33611Tp LJLJJI;

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationStart");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationRepeat");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playBigGiftOnMask onAnimationStop");
        this.LJLIL.LIZIZ.LJJIJIL().post(new ARunnableS24S0300000_13(this.LJLILLLLZI, this.LJLIL, this.LJLJI, 5));
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
        if (i == 1) {
            C33611Tp c33611Tp = new C33611Tp(this.LJLJJI.LJLIL, new OSZ(new Point(0, 0), new Point(0, 0)), 0, 0L, 12);
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp, 0, 1, 1, TV3.LJIIIIZZ(LJ));
        }
    }

    public UE1(C76846UDy c76846UDy, AnimatedDrawable2 animatedDrawable2, C2A4 c2a4, C33611Tp c33611Tp) {
        this.LJLIL = c76846UDy;
        this.LJLILLLLZI = animatedDrawable2;
        this.LJLJI = c2a4;
        this.LJLJJI = c33611Tp;
    }
}
