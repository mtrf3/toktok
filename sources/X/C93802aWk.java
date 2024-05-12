package X;

import android.animation.ValueAnimator;
import android.graphics.Color;
import kotlin.jvm.internal.o;

/* renamed from: X.aWk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93802aWk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C93803aWl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C93802aWk(C93803aWl c93803aWl, int i) {
        this.LJLIL = c93803aWl;
        this.LJLILLLLZI = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator anim) {
        Integer num;
        o.LJIIIZ(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            C93803aWl c93803aWl = this.LJLIL;
            int i = this.LJLILLLLZI;
            float intValue = num.intValue();
            c93803aWl.LIZ = (((5.0f * intValue) / 100.0f) + 1.0f) * i;
            c93803aWl.LJ.setColor(Color.argb((int) (((100.0f - intValue) / 100.0f) * 255), 254, 44, 85));
            c93803aWl.invalidateSelf();
        }
    }
}
