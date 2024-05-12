package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* renamed from: X.NRp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59365NRp implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C59357NRh LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public C59365NRp(C59357NRh c59357NRh, boolean z) {
        this.LJLIL = c59357NRh;
        this.LJLILLLLZI = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C59357NRh c59357NRh = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            float floatValue = f.floatValue();
            NSM nsm = c59357NRh.LIZ;
            if (!z) {
                floatValue = 1.0f - floatValue;
            }
            nsm.LIZIZ(floatValue);
        }
    }
}
