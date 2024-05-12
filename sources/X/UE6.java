package X;

import Y.ARunnableS24S0300000_13;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE6 implements InterfaceC81841WAb {
    public final /* synthetic */ C76846UDy LJLIL;
    public final /* synthetic */ FrameLayout LJLILLLLZI;
    public final /* synthetic */ C2A4 LJLJI;
    public final /* synthetic */ C33611Tp LJLJJI;

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationStart");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationRepeat");
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        C0NB.LIZIZ("GiftExpressionHelper", "playSmallGiftOnMask onAnimationStop");
        this.LJLIL.LIZIZ.LJJIJIL().post(new ARunnableS24S0300000_13(this.LJLILLLLZI, this.LJLJI, this.LJLIL, 6));
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
        if (i == 1) {
            C33611Tp c33611Tp = this.LJLJJI;
            int i2 = c33611Tp.LJLJI;
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp, 0, i2, 1, TV3.LJIIIIZZ(LJ));
        }
    }

    public UE6(C76846UDy c76846UDy, FrameLayout frameLayout, C2A4 c2a4, C33611Tp c33611Tp) {
        this.LJLIL = c76846UDy;
        this.LJLILLLLZI = frameLayout;
        this.LJLJI = c2a4;
        this.LJLJJI = c33611Tp;
    }
}
