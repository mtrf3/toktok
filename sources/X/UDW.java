package X;

import Y.IDAListenerS145S0200000_13;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* loaded from: classes14.dex */
public final class UDW implements InterfaceC81841WAb {
    public final /* synthetic */ UDY LJLIL;
    public final /* synthetic */ GiftGuideMessage LJLILLLLZI;

    @Override // X.InterfaceC81841WAb
    public final void LIZIZ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
    }

    @Override // X.InterfaceC81841WAb
    public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
        C29306Beo.LJJLJLI(this.LJLIL.LIZLLL);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.375f, 1, 1.0f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setAnimationListener(new IDAListenerS145S0200000_13(this.LJLIL, this.LJLILLLLZI, 3));
        FrameLayout frameLayout = this.LJLIL.LIZLLL;
        if (frameLayout != null) {
            frameLayout.startAnimation(scaleAnimation);
        }
        UDY udy = this.LJLIL;
        udy.getClass();
        new UDX(udy).start();
    }

    public UDW(UDY udy, GiftGuideMessage giftGuideMessage) {
        this.LJLIL = udy;
        this.LJLILLLLZI = giftGuideMessage;
    }
}
