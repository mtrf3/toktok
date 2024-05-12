package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKW implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ RecommendSwipeNewWidget LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;
    public final /* synthetic */ C56K LJLJJI;

    public BKW(boolean z, RecommendSwipeNewWidget recommendSwipeNewWidget, C56K c56k, C56K c56k2) {
        this.LJLIL = z;
        this.LJLILLLLZI = recommendSwipeNewWidget;
        this.LJLJI = c56k;
        this.LJLJJI = c56k2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        if (this.LJLIL) {
            View view = this.LJLILLLLZI.LJLILLLLZI;
            if (view != null) {
                Object animatedValue = animation.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setTranslationY(((Float) animatedValue).floatValue());
            }
            if (this.LJLILLLLZI.LLIIIL()) {
                C47061t0 c47061t0 = this.LJLILLLLZI.LJLJJI;
                if (c47061t0 != null) {
                    Object animatedValue2 = animation.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    c47061t0.setTranslationY(((Float) animatedValue2).floatValue());
                }
                C47061t0 c47061t02 = this.LJLILLLLZI.LJLJI;
                if (c47061t02 != null) {
                    Object animatedValue3 = animation.getAnimatedValue();
                    o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    c47061t02.setTranslationY(((Float) animatedValue3).floatValue());
                }
            }
        } else {
            View view2 = this.LJLILLLLZI.LLIIIJ;
            if (view2 != null) {
                Object animatedValue4 = animation.getAnimatedValue();
                o.LJII(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                view2.setTranslationY(((Float) animatedValue4).floatValue());
            }
        }
        if (animation.getAnimatedFraction() >= 0.98f) {
            RecommendSwipeNewWidget recommendSwipeNewWidget = this.LJLILLLLZI;
            if (!recommendSwipeNewWidget.LLIIIL) {
                recommendSwipeNewWidget.LLIIIL = true;
                if (this.LJLIL) {
                    View view3 = recommendSwipeNewWidget.LJLILLLLZI;
                    if (view3 != null) {
                        view3.setTranslationY(this.LJLJI.element);
                    }
                    if (this.LJLILLLLZI.LLIIIL()) {
                        C47061t0 c47061t03 = this.LJLILLLLZI.LJLJJI;
                        if (c47061t03 != null) {
                            c47061t03.setTranslationY(this.LJLJI.element);
                        }
                        C47061t0 c47061t04 = this.LJLILLLLZI.LJLJI;
                        if (c47061t04 != null) {
                            c47061t04.setTranslationY(this.LJLJI.element);
                        }
                    }
                } else {
                    View view4 = recommendSwipeNewWidget.LLIIIJ;
                    if (view4 != null) {
                        view4.setTranslationY(this.LJLJI.element);
                    }
                }
                RecommendSwipeNewWidget recommendSwipeNewWidget2 = this.LJLILLLLZI;
                recommendSwipeNewWidget2.LL = recommendSwipeNewWidget2.LLFFF * this.LJLJJI.element;
                recommendSwipeNewWidget2.LJLZ(this.LJLIL);
            }
        }
    }
}
