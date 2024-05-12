package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.I2w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45982I2w {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        if (C43465H4b.LIZ() == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ(final TextView textView, final int i, final int i2) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(200L);
        o.LJIIIIZZ(duration, "ofFloat(textView, \"alpha…tion(ALPHA_ANIM_DURATION)");
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.5mK
            public final /* synthetic */ boolean LJLIL = true;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                float animatedFraction;
                o.LJIIIZ(it, "it");
                if (this.LJLIL) {
                    animatedFraction = it.getAnimatedFraction();
                } else {
                    animatedFraction = 1 - it.getAnimatedFraction();
                }
                TextView textView2 = textView;
                int i3 = i;
                int i4 = i2;
                float f = ((i3 >> 24) & 255) / 255.0f;
                float f2 = ((i4 >> 24) & 255) / 255.0f;
                float pow = (float) Math.pow(((i3 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i3 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((i3 & 255) / 255.0f, 2.2d);
                float pow4 = (float) Math.pow(((i4 >> 16) & 255) / 255.0f, 2.2d);
                float pow5 = (float) Math.pow(((i4 >> 8) & 255) / 255.0f, 2.2d);
                float pow6 = (float) Math.pow((i4 & 255) / 255.0f, 2.2d);
                float LIZIZ = C06420Na.LIZIZ(f2, f, animatedFraction, f);
                float LIZIZ2 = C06420Na.LIZIZ(pow4, pow, animatedFraction, pow);
                float LIZIZ3 = C06420Na.LIZIZ(pow5, pow2, animatedFraction, pow2);
                float LIZIZ4 = C06420Na.LIZIZ(pow6, pow3, animatedFraction, pow3);
                float pow7 = ((float) Math.pow(LIZIZ2, 0.45454545454545453d)) * 255.0f;
                float pow8 = ((float) Math.pow(LIZIZ3, 0.45454545454545453d)) * 255.0f;
                textView2.setShadowLayer(8.0f, 0.0f, 1.0f, O6R.LJJIIZ(((float) Math.pow(LIZIZ4, 0.45454545454545453d)) * 255.0f) | (O6R.LJJIIZ(pow7) << 16) | (O6R.LJJIIZ(LIZIZ * 255.0f) << 24) | (O6R.LJJIIZ(pow8) << 8));
            }
        });
        duration.setStartDelay(0L);
        duration.start();
    }
}
