package Y;

import X.C144865mM;
import X.C151465x0;
import X.C151535x7;
import X.C264612c;
import X.C6T3;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AUListenerS78S0300000_2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS78S0300000_2 aUListenerS78S0300000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float stickerContainerTranslationY = ((C6T3) aUListenerS78S0300000_2.l0).getStickerContainerTranslationY();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((View) aUListenerS78S0300000_2.l1).setTranslationY(((((BaseStickerModel) aUListenerS78S0300000_2.l2).getTranslateY() - stickerContainerTranslationY) * ((Float) animatedValue).floatValue()) + stickerContainerTranslationY);
    }

    public static final void onAnimationUpdate$1(AUListenerS78S0300000_2 aUListenerS78S0300000_2, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        float stickerContainerTranslationY = ((C6T3) aUListenerS78S0300000_2.l0).getStickerContainerTranslationY();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ((View) aUListenerS78S0300000_2.l1).setTranslationY(((stickerContainerTranslationY - ((BaseStickerModel) aUListenerS78S0300000_2.l2).getTranslateY()) * floatValue) + ((BaseStickerModel) aUListenerS78S0300000_2.l2).getTranslateY());
    }

    public static final void onAnimationUpdate$2(AUListenerS78S0300000_2 aUListenerS78S0300000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C144865mM c144865mM = (C144865mM) aUListenerS78S0300000_2.l0;
        C151535x7 c151535x7 = C151535x7.LIZ;
        Rect rect = (Rect) aUListenerS78S0300000_2.l1;
        Rect rect2 = (Rect) aUListenerS78S0300000_2.l2;
        c151535x7.getClass();
        RectF LIZJ = C151535x7.LIZJ(floatValue, rect, rect2);
        c144865mM.setAnimRect(new Rect((int) LIZJ.left, (int) LIZJ.top, (int) LIZJ.right, (int) LIZJ.bottom));
        ((C144865mM) aUListenerS78S0300000_2.l0).invalidate();
    }

    public static final void onAnimationUpdate$3(AUListenerS78S0300000_2 aUListenerS78S0300000_2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C151465x0 c151465x0 = (C151465x0) aUListenerS78S0300000_2.l0;
        C151535x7 c151535x7 = C151535x7.LIZ;
        Rect rect = (Rect) aUListenerS78S0300000_2.l1;
        Rect rect2 = (Rect) aUListenerS78S0300000_2.l2;
        c151535x7.getClass();
        RectF LIZJ = C151535x7.LIZJ(floatValue, rect, rect2);
        c151465x0.setAnimRect(new Rect((int) LIZJ.left, (int) LIZJ.top, (int) LIZJ.right, (int) LIZJ.bottom));
        ((C151465x0) aUListenerS78S0300000_2.l0).invalidate();
    }

    public AUListenerS78S0300000_2(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
