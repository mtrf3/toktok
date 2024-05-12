package Y;

import X.KUP;
import X.X1D;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class AUListenerS70S0101000_8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
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
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS70S0101000_8(SearchContainerHeaderVM searchContainerHeaderVM, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.l0 = searchContainerHeaderVM;
                Integer num = (Integer) searchContainerHeaderVM.LJLLJ.getValue();
                this.i1 = (num == null ? 0 : num).intValue();
                return;
            default:
                this.l0 = searchContainerHeaderVM;
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS70S0101000_8 aUListenerS70S0101000_8, ValueAnimator animation) {
        Integer num;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aUListenerS70S0101000_8.l0;
            int intValue = num.intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("show animator: animation.animatedValue = ");
            LIZ.append(animation.getAnimatedValue());
            LIZ.append("  hasY = ");
            LIZ.append(aUListenerS70S0101000_8.i1);
            X1D.LIZIZ(LIZ);
            int max = Math.max(intValue, 0);
            int i = aUListenerS70S0101000_8.i1 - max;
            searchContainerHeaderVM.LJLJLJ.setValue(Integer.valueOf(max));
            searchContainerHeaderVM.LJLJJLL.setValue(Integer.valueOf(-max));
            aUListenerS70S0101000_8.i1 = max;
            if (searchContainerHeaderVM.LLFF) {
                searchContainerHeaderVM.LJLL.setValue(Integer.valueOf(-i));
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS70S0101000_8 aUListenerS70S0101000_8, ValueAnimator valueAnimator) {
        int pow;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop = ((KUP) aUListenerS70S0101000_8.l0).getViewPagerMarginTop();
        KUP kup = (KUP) aUListenerS70S0101000_8.l0;
        if (animatedFraction == 1.0f) {
            pow = -viewPagerMarginTop;
        } else {
            pow = (int) (((1.0d - Math.pow(animatedFraction, 3.0d)) * aUListenerS70S0101000_8.i1) - ((KUP) aUListenerS70S0101000_8.l0).getViewPagerMarginTop());
        }
        kup.setViewPagerMarginTopByDelta(pow);
    }

    public static final void onAnimationUpdate$2(AUListenerS70S0101000_8 aUListenerS70S0101000_8, ValueAnimator valueAnimator) {
        int viewPagerMarginTop;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int viewPagerMarginTop2 = ((KUP) aUListenerS70S0101000_8.l0).getViewPagerMarginTop();
        KUP kup = (KUP) aUListenerS70S0101000_8.l0;
        if (animatedFraction == 1.0f) {
            viewPagerMarginTop = -(viewPagerMarginTop2 + kup.LJLL);
        } else {
            double pow = 1.0d - Math.pow(animatedFraction, 3.0d);
            int i = aUListenerS70S0101000_8.i1;
            KUP kup2 = (KUP) aUListenerS70S0101000_8.l0;
            viewPagerMarginTop = (int) ((pow * (i + kup2.LJLL)) - (kup2.getViewPagerMarginTop() + ((KUP) aUListenerS70S0101000_8.l0).LJLL));
        }
        kup.setViewPagerMarginTopByDelta(viewPagerMarginTop);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationUpdate$3(AUListenerS70S0101000_8 aUListenerS70S0101000_8, ValueAnimator animation) {
        Integer num;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            SearchContainerHeaderVM searchContainerHeaderVM = (SearchContainerHeaderVM) aUListenerS70S0101000_8.l0;
            int intValue = num.intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hide animator: animation.animatedValue = ");
            LIZ.append(animation.getAnimatedValue());
            LIZ.append("  hasY = ");
            LIZ.append(aUListenerS70S0101000_8.i1);
            X1D.LIZIZ(LIZ);
            Integer num2 = (Integer) searchContainerHeaderVM.LJLLJ.getValue();
            if (num2 == null) {
                num2 = 0;
            }
            o.LJIIIIZZ(num2, "rvTopPadding.value ?: 0");
            int min = Math.min(intValue, num2.intValue());
            int i = min - aUListenerS70S0101000_8.i1;
            searchContainerHeaderVM.LJLJLJ.setValue(Integer.valueOf(min));
            searchContainerHeaderVM.LJLJJLL.setValue(Integer.valueOf(-min));
            searchContainerHeaderVM.LJLL.setValue(Integer.valueOf(i));
            aUListenerS70S0101000_8.i1 = min;
        }
    }

    public AUListenerS70S0101000_8(KUP kup, int i, int i2) {
        this.$t = i2;
        this.l0 = kup;
        this.i1 = i;
    }
}
