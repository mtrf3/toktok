package X;

import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* loaded from: classes14.dex */
public final class V9D {
    public static ValueAnimator LIZ(AnimatedDrawable2 animatedDrawable2) {
        int loopCount;
        if (animatedDrawable2.LJLILLLLZI) {
            loopCount = animatedDrawable2.LJLIL;
        } else {
            WAA waa = animatedDrawable2.LJLJI;
            if (waa == null) {
                loopCount = 0;
            } else {
                loopCount = waa.getLoopCount();
            }
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, (int) animatedDrawable2.LIZLLL());
        valueAnimator.setDuration(animatedDrawable2.LIZLLL());
        if (loopCount == 0) {
            loopCount = -1;
        }
        valueAnimator.setRepeatCount(loopCount);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(null);
        valueAnimator.addUpdateListener(new AUListenerS100S0100000_13(animatedDrawable2, 17));
        return valueAnimator;
    }
}
