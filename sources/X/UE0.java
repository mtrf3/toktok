package X;

import Y.ARunnableS24S0300000_13;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UE0 extends AbstractC65781Prl implements InterfaceC88473Ynt<String, InterfaceC81599W0t, AnimatedDrawable2, C76800UCe> {
    public final /* synthetic */ C76846UDy LJLIL;
    public final /* synthetic */ FrameLayout LJLILLLLZI;
    public final /* synthetic */ C2A4 LJLJI;
    public final /* synthetic */ C33611Tp LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UE0(C76846UDy c76846UDy, FrameLayout frameLayout, C2A4 c2a4, C33611Tp c33611Tp) {
        super(3);
        this.LJLIL = c76846UDy;
        this.LJLILLLLZI = frameLayout;
        this.LJLJI = c2a4;
        this.LJLJJI = c33611Tp;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, InterfaceC81599W0t interfaceC81599W0t, AnimatedDrawable2 animatedDrawable2) {
        AnimatedDrawable2 animatedDrawable22 = animatedDrawable2;
        C76846UDy c76846UDy = this.LJLIL;
        if (c76846UDy.LJIIL) {
            FrameLayout frameLayout = this.LJLILLLLZI;
            C2A4 c2a4 = this.LJLJI;
            if (frameLayout != null) {
                frameLayout.post(new ARunnableS24S0300000_13(frameLayout, c2a4, c76846UDy, 7));
            }
            C33611Tp c33611Tp = this.LJLJJI;
            int i = c33611Tp.LJLJI;
            User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
            o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
            C14480hY.LIZIZ(c33611Tp, 0, i, 2, TV3.LJIIIIZZ(LJ));
            C0NB.LIZIZ("GiftExpressionHelper", "playSmallFlyGiftOnMask return for screen is cleared");
        } else {
            C33611Tp c33611Tp2 = this.LJLJJI;
            FrameLayout frameLayout2 = this.LJLILLLLZI;
            C2A4 c2a42 = this.LJLJI;
            c76846UDy.LJIIJ = animatedDrawable22;
            if (animatedDrawable22 != null) {
                animatedDrawable22.stop();
                animatedDrawable22.LJI(new UE6(c76846UDy, frameLayout2, c2a42, c33611Tp2));
                animatedDrawable22.start();
            }
        }
        return C76800UCe.LIZ;
    }
}
