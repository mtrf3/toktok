package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BKV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ RecommendSwipeNewWidget LJLILLLLZI;

    public BKV(RecommendSwipeNewWidget recommendSwipeNewWidget, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = recommendSwipeNewWidget;
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
            float animatedFraction = (animation.getAnimatedFraction() / 10) + 0.9f;
            View view2 = this.LJLILLLLZI.LJLILLLLZI;
            if (view2 != null) {
                view2.setScaleX(animatedFraction);
            }
            View view3 = this.LJLILLLLZI.LJLILLLLZI;
            if (view3 != null) {
                view3.setScaleY(animatedFraction);
            }
            if (this.LJLILLLLZI.LLIIIL()) {
                C47061t0 c47061t0 = this.LJLILLLLZI.LJLJI;
                if (c47061t0 != null) {
                    Object animatedValue2 = animation.getAnimatedValue();
                    o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    c47061t0.setTranslationY(((Float) animatedValue2).floatValue());
                }
                C47061t0 c47061t02 = this.LJLILLLLZI.LJLJI;
                if (c47061t02 != null) {
                    c47061t02.setScaleY(animatedFraction);
                }
                C47061t0 c47061t03 = this.LJLILLLLZI.LJLJJI;
                if (c47061t03 != null) {
                    Object animatedValue3 = animation.getAnimatedValue();
                    o.LJII(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                    c47061t03.setTranslationY(((Float) animatedValue3).floatValue());
                }
                C47061t0 c47061t04 = this.LJLILLLLZI.LJLJJI;
                if (c47061t04 != null) {
                    c47061t04.setScaleY(animatedFraction);
                }
                RecommendSwipeNewWidget recommendSwipeNewWidget = this.LJLILLLLZI;
                View view4 = recommendSwipeNewWidget.LJLILLLLZI;
                if (view4 != null) {
                    float scaleX = (1 - view4.getScaleX()) * ((Number) recommendSwipeNewWidget.LLIILII.getValue()).intValue();
                    float f = 2;
                    int i = (int) (scaleX / f);
                    C47061t0 c47061t05 = recommendSwipeNewWidget.LJLJJI;
                    if (c47061t05 != null) {
                        c47061t05.setTranslationX((-i) / f);
                    }
                    C47061t0 c47061t06 = recommendSwipeNewWidget.LJLJI;
                    if (c47061t06 != null) {
                        ViewGroup.LayoutParams layoutParams = c47061t06.getLayoutParams();
                        layoutParams.width = i;
                        c47061t06.setLayoutParams(layoutParams);
                    }
                    C47061t0 c47061t07 = recommendSwipeNewWidget.LJLJJI;
                    if (c47061t07 != null) {
                        ViewGroup.LayoutParams layoutParams2 = c47061t07.getLayoutParams();
                        layoutParams2.width = i;
                        c47061t07.setLayoutParams(layoutParams2);
                    }
                }
            }
        } else {
            View view5 = this.LJLILLLLZI.LLIIIJ;
            if (view5 != null) {
                Object animatedValue4 = animation.getAnimatedValue();
                o.LJII(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                view5.setTranslationY(((Float) animatedValue4).floatValue());
            }
            RecommendSwipeNewWidget recommendSwipeNewWidget2 = this.LJLILLLLZI;
            Object animatedValue5 = animation.getAnimatedValue();
            o.LJII(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
            recommendSwipeNewWidget2.LL = ((Float) animatedValue5).floatValue();
            RecommendSwipeNewWidget recommendSwipeNewWidget3 = this.LJLILLLLZI;
            if (recommendSwipeNewWidget3.LLF) {
                recommendSwipeNewWidget3.LLIIL();
            } else {
                recommendSwipeNewWidget3.LJZI();
            }
        }
        if (animation.getAnimatedFraction() >= 0.98f) {
            if (this.LJLIL) {
                View view6 = this.LJLILLLLZI.LJLILLLLZI;
                if (view6 != null) {
                    view6.setTranslationY(0.0f);
                }
                View view7 = this.LJLILLLLZI.LJLILLLLZI;
                if (view7 != null) {
                    view7.setScaleX(1.0f);
                }
                View view8 = this.LJLILLLLZI.LJLILLLLZI;
                if (view8 != null) {
                    view8.setScaleY(1.0f);
                }
                if (this.LJLILLLLZI.LLIIIL()) {
                    C47061t0 c47061t08 = this.LJLILLLLZI.LJLJI;
                    if (c47061t08 != null) {
                        c47061t08.setTranslationY(0.0f);
                    }
                    C47061t0 c47061t09 = this.LJLILLLLZI.LJLJI;
                    if (c47061t09 != null) {
                        c47061t09.setScaleY(1.0f);
                    }
                    C47061t0 c47061t010 = this.LJLILLLLZI.LJLJJI;
                    if (c47061t010 != null) {
                        c47061t010.setTranslationY(0.0f);
                    }
                    C47061t0 c47061t011 = this.LJLILLLLZI.LJLJJI;
                    if (c47061t011 != null) {
                        c47061t011.setScaleY(1.0f);
                    }
                    C29306Beo.LJI(this.LJLILLLLZI.LJLJI);
                    C29306Beo.LJI(this.LJLILLLLZI.LJLJJI);
                }
            } else {
                View view9 = this.LJLILLLLZI.LLIIIJ;
                if (view9 != null) {
                    view9.setTranslationY(0.0f);
                }
            }
            RecommendSwipeNewWidget recommendSwipeNewWidget4 = this.LJLILLLLZI;
            recommendSwipeNewWidget4.LLFFF = 0.0f;
            recommendSwipeNewWidget4.hide();
            this.LJLILLLLZI.LLIIJLIL();
        }
    }
}
