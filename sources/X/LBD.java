package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final /* synthetic */ class LBD extends TBS implements InterfaceC88472Yns<ValueAnimator, C76800UCe> {
    public LBD(Object obj) {
        super(1, obj, LBE.class, "updateAnimation", "updateAnimation(Landroid/animation/ValueAnimator;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ValueAnimator valueAnimator) {
        ValueAnimator p0 = valueAnimator;
        o.LJIIIZ(p0, "p0");
        LBF lbf = (LBF) this.receiver;
        lbf.getClass();
        Object animatedValue = p0.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Iterator it = ((ArrayList) lbf.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(floatValue);
        }
        return C76800UCe.LIZ;
    }
}
