package Y;

import X.AbstractC87817YdJ;
import X.C31521CYr;
import X.C87807Yd9;
import X.C87810YdC;
import X.C87818YdK;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public class AUListenerS105S0200000_16 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationUpdate$0(AUListenerS105S0200000_16 aUListenerS105S0200000_16, ValueAnimator it) {
        int i;
        o.LJIIIZ(it, "it");
        C87810YdC c87810YdC = (C87810YdC) aUListenerS105S0200000_16.l0;
        View view = c87810YdC.LIZLLL;
        C87818YdK c87818YdK = c87810YdC.LIZIZ;
        int i2 = c87818YdK.LJFF;
        RankAnimationInfo rankAnimationInfo = ((C31521CYr) aUListenerS105S0200000_16.l1).LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = c87818YdK.LJI;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setBackgroundColor(AbstractC87817YdJ.LIZIZ(((Float) animatedValue).floatValue(), i2, i));
    }

    public static final void onAnimationUpdate$1(AUListenerS105S0200000_16 aUListenerS105S0200000_16, ValueAnimator it) {
        int i;
        o.LJIIIZ(it, "it");
        C87810YdC c87810YdC = (C87810YdC) aUListenerS105S0200000_16.l0;
        View view = c87810YdC.LIZLLL;
        RankAnimationInfo rankAnimationInfo = ((C31521CYr) aUListenerS105S0200000_16.l1).LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = c87810YdC.LIZIZ.LJI;
        }
        int i2 = ((C87810YdC) aUListenerS105S0200000_16.l0).LIZIZ.LJFF;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setBackgroundColor(AbstractC87817YdJ.LIZIZ(((Float) animatedValue).floatValue(), i, i2));
    }

    public static final void onAnimationUpdate$2(AUListenerS105S0200000_16 aUListenerS105S0200000_16, ValueAnimator it) {
        int i;
        o.LJIIIZ(it, "it");
        C87807Yd9 c87807Yd9 = (C87807Yd9) aUListenerS105S0200000_16.l0;
        CardView cardView = c87807Yd9.LIZ;
        C87818YdK c87818YdK = c87807Yd9.LIZIZ;
        int i2 = c87818YdK.LJFF;
        RankAnimationInfo rankAnimationInfo = ((C31521CYr) aUListenerS105S0200000_16.l1).LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = c87818YdK.LJI;
        }
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setCardBackgroundColor(AbstractC87817YdJ.LIZIZ(((Float) animatedValue).floatValue(), i2, i));
    }

    public static final void onAnimationUpdate$3(AUListenerS105S0200000_16 aUListenerS105S0200000_16, ValueAnimator it) {
        int i;
        o.LJIIIZ(it, "it");
        C87807Yd9 c87807Yd9 = (C87807Yd9) aUListenerS105S0200000_16.l0;
        CardView cardView = c87807Yd9.LJII;
        RankAnimationInfo rankAnimationInfo = ((C31521CYr) aUListenerS105S0200000_16.l1).LJFF;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.getBackgroundColor();
        } else {
            i = c87807Yd9.LIZIZ.LJI;
        }
        int i2 = ((C87807Yd9) aUListenerS105S0200000_16.l0).LIZIZ.LJFF;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cardView.setCardBackgroundColor(AbstractC87817YdJ.LIZIZ(((Float) animatedValue).floatValue(), i, i2));
    }

    public AUListenerS105S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
