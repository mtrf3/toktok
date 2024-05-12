package X;

import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* loaded from: classes14.dex */
public final /* synthetic */ class UE7 extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public UE7(Object obj) {
        super(1, obj, C76846UDy.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C76846UDy c76846UDy = (C76846UDy) this.receiver;
        c76846UDy.LJIIL = booleanValue;
        if (booleanValue) {
            AnimatedDrawable2 animatedDrawable2 = c76846UDy.LJIIJ;
            if (animatedDrawable2 != null) {
                animatedDrawable2.stop();
            }
            AnimatedDrawable2 animatedDrawable22 = c76846UDy.LJIIJJI;
            if (animatedDrawable22 != null) {
                animatedDrawable22.stop();
            }
        }
        return C76800UCe.LIZ;
    }
}
