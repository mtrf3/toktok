package X;

import Y.IDRunnableS85S0100000;
import android.animation.Animator;

/* renamed from: X.2I2, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I2 extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C2I2(C14520hc c14520hc) {
        super(1, c14520hc, C14520hc.class, "handleScreenClearEvent", "handleScreenClearEvent(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C14520hc c14520hc = (C14520hc) this.receiver;
        if (booleanValue) {
            c14520hc.LJI = true;
            Animator animator = c14520hc.LJII;
            if (animator != null) {
                animator.cancel();
            }
        } else {
            c14520hc.getClass();
            C15610jN.LIZ().postDelayed(new IDRunnableS85S0100000(c14520hc, 85), 700L);
        }
        return C76800UCe.LIZ;
    }
}
