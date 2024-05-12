package X;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I77 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ I6Z LJLIL;
    public final /* synthetic */ C56K LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;

    public I77(I6Z i6z, C56K c56k, float f, int i) {
        this.LJLIL = i6z;
        this.LJLILLLLZI = c56k;
        this.LJLJI = f;
        this.LJLJJI = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        C46069I6f c46069I6f = this.LJLIL.LJLJLLL;
        if (c46069I6f != null) {
            float f = (this.LJLJI * animatedFraction) + this.LJLILLLLZI.element;
            c46069I6f.LIZ((90 * animatedFraction) + 0, f, f, 0, this.LJLJJI);
        }
    }
}
