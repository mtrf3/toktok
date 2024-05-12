package Y;

import X.AlertDialogC45396Hrk;
import X.C264612c;
import X.C41634GVq;
import X.C42938GtC;
import X.C46036I4y;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AUListenerS95S0100000_7 implements ValueAnimator.AnimatorUpdateListener {
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
            default:
                return;
        }
    }

    public AUListenerS95S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        View view = ((MvChoosePhotoScene) aUListenerS95S0100000_7.l0).mView;
        if (view != null) {
            float translationY = view.getTranslationY();
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aUListenerS95S0100000_7.l0;
            View view2 = mvChoosePhotoScene.mView;
            if (view2 == null) {
                return;
            }
            view2.setTranslationY((it.getAnimatedFraction() * (mvChoosePhotoScene.LLLLIIL() - translationY)) + translationY);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aUListenerS95S0100000_7.l0;
        View view = mvChoosePhotoScene.mView;
        if (view == null) {
            return;
        }
        view.setTranslationY(mvChoosePhotoScene.LLLLIIL() - (it.getAnimatedFraction() * ((MvChoosePhotoScene) aUListenerS95S0100000_7.l0).LLLLIIL()));
    }

    public static final void onAnimationUpdate$2(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLJJI;
        if (textView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setAlpha(((Float) animatedValue).floatValue());
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLJLLL;
            if (cutVideoBottomBarViewModel != null) {
                Object animatedValue2 = it.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                ((LiveData) cutVideoBottomBarViewModel.LJLJJLL.getValue()).setValue(Float.valueOf(1.0f - ((Float) animatedValue2).floatValue()));
                CutVideoSpeedViewModel cutVideoSpeedViewModel = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLLL;
                if (cutVideoSpeedViewModel != null) {
                    Object animatedValue3 = it.getAnimatedValue();
                    o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    ((LiveData) cutVideoSpeedViewModel.LJLJL.getValue()).setValue(Float.valueOf(1.0f - ((Float) animatedValue3).floatValue()));
                    return;
                }
                o.LJIJI("speedViewModel");
                throw null;
            }
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        o.LJIJI("selfAdaptionToast");
        throw null;
    }

    public static final void onAnimationUpdate$3(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLJJI;
        if (textView != null) {
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setAlpha(((Float) animatedValue).floatValue());
            CutVideoBottomBarViewModel cutVideoBottomBarViewModel = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLJLLL;
            if (cutVideoBottomBarViewModel != null) {
                Object animatedValue2 = it.getAnimatedValue();
                o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                ((LiveData) cutVideoBottomBarViewModel.LJLJJLL.getValue()).setValue(Float.valueOf(1.0f - ((Float) animatedValue2).floatValue()));
                CutVideoSpeedViewModel cutVideoSpeedViewModel = ((C46036I4y) aUListenerS95S0100000_7.l0).LJLLL;
                if (cutVideoSpeedViewModel != null) {
                    Object animatedValue3 = it.getAnimatedValue();
                    o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    ((LiveData) cutVideoSpeedViewModel.LJLJL.getValue()).setValue(Float.valueOf(1.0f - ((Float) animatedValue3).floatValue()));
                    return;
                }
                o.LJIJI("speedViewModel");
                throw null;
            }
            o.LJIJI("bottomBarViewModel");
            throw null;
        }
        o.LJIJI("selfAdaptionToast");
        throw null;
    }

    public static final void onAnimationUpdate$4(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator valueAnimator) {
        View view = ((AlertDialogC45396Hrk) aUListenerS95S0100000_7.l0).LJLLLL;
        if (view != null) {
            view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((AlertDialogC45396Hrk) aUListenerS95S0100000_7.l0).LJLLLL.requestLayout();
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        TextView textView = ((C42938GtC) aUListenerS95S0100000_7.l0).LJLJLJ;
        if (textView != null) {
            textView.setPaddingRelative((int) floatValue, 0, 0, 0);
        }
        if (floatValue <= 4.0f) {
            TextView textView2 = ((C42938GtC) aUListenerS95S0100000_7.l0).LJLJLJ;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TuxTextView tuxTextView = ((C42938GtC) aUListenerS95S0100000_7.l0).LJLJL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(0);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS95S0100000_7 aUListenerS95S0100000_7, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            ((C41634GVq) aUListenerS95S0100000_7.l0).LIZIZ.setAlpha(f.floatValue());
        }
    }
}
