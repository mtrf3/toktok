package Y;

import X.AbstractC87817YdJ;
import X.C87793Ycv;
import X.C87805Yd7;
import X.C87806Yd8;
import X.C87807Yd9;
import X.C87808YdA;
import X.C87810YdC;
import X.C87819YdL;
import X.C87822YdO;
import X.C87823YdP;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public class AUListenerS103S0100000_16 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                return;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                return;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                return;
            case 33:
                onAnimationUpdate$33(this, valueAnimator);
                return;
            case 34:
                onAnimationUpdate$34(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS103S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87808YdA) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87808YdA) aUListenerS103S0100000_16.l0).LJIIIIZZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$10(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87822YdO) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$11(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87822YdO) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$12(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87822YdO) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$13(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = (TextView) aUListenerS103S0100000_16.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        textView.setScrollX(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$14(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = (TextView) aUListenerS103S0100000_16.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        textView.setScrollX(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$15(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87806Yd8) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$16(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87806Yd8) aUListenerS103S0100000_16.l0).LJIIIIZZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$17(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87806Yd8) aUListenerS103S0100000_16.l0).LIZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        AbstractC87817YdJ.LJIIIIZZ(cardView, ((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$18(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87806Yd8) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$19(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87806Yd8) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$2(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87808YdA) aUListenerS103S0100000_16.l0).LIZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        AbstractC87817YdJ.LJIIIIZZ(cardView, ((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87806Yd8) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$21(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87806Yd8) aUListenerS103S0100000_16.l0).LJIIIIZZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$22(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87806Yd8) aUListenerS103S0100000_16.l0).LIZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        AbstractC87817YdJ.LJIIIIZZ(cardView, ((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$23(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = ((C87793Ycv) aUListenerS103S0100000_16.l0).LJI;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        textView.setScrollX(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$24(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ImageView imageView = ((C87819YdL) aUListenerS103S0100000_16.l0).LJIJJLI;
        if (imageView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            imageView.setTranslationY(((Float) animatedValue).floatValue());
            return;
        }
        o.LJIJI("numArrow");
        throw null;
    }

    public static final void onAnimationUpdate$25(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87807Yd9) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$26(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87807Yd9) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$27(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87807Yd9) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$28(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87807Yd9) aUListenerS103S0100000_16.l0).LJIIIIZZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$29(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87807Yd9) aUListenerS103S0100000_16.l0).LIZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        AbstractC87817YdJ.LJIIIIZZ(cardView, ((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$3(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87823YdP) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$30(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87805Yd7) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$31(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87805Yd7) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$32(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87805Yd7) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$33(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87805Yd7) aUListenerS103S0100000_16.l0).LJIIIIZZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$34(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87805Yd7) aUListenerS103S0100000_16.l0).LIZ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        AbstractC87817YdJ.LJIIIIZZ(cardView, ((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$4(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87823YdP) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$5(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87823YdP) aUListenerS103S0100000_16.l0).LJII;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87823YdP) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$7(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        LinearLayout linearLayout = ((C87810YdC) aUListenerS103S0100000_16.l0).LJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$8(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = ((C87810YdC) aUListenerS103S0100000_16.l0).LJIIJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        textView.setTextSize(((Float) animatedValue).floatValue());
        C87810YdC c87810YdC = (C87810YdC) aUListenerS103S0100000_16.l0;
        AbstractC87817YdJ.LJIIIIZZ(c87810YdC.LJII, c87810YdC.LJIIIIZZ.getWidth());
    }

    public static final void onAnimationUpdate$9(AUListenerS103S0100000_16 aUListenerS103S0100000_16, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CardView cardView = ((C87822YdO) aUListenerS103S0100000_16.l0).LIZJ;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setTranslationY(((Float) animatedValue).floatValue());
    }
}
