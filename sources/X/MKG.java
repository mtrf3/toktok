package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MKG implements ValueAnimator.AnimatorUpdateListener {
    public View LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ MKI LJLJJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        View view = this.LJLIL;
        if (view != null) {
            o.LJI(view);
            if (view.getTag() == null) {
                return;
            }
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
            PointF pointF = (PointF) animatedValue;
            View view2 = this.LJLIL;
            o.LJI(view2);
            view2.setX(pointF.x);
            View view3 = this.LJLIL;
            o.LJI(view3);
            view3.setY(pointF.y);
            float animatedFraction = animation.getAnimatedFraction();
            if (animatedFraction <= 0.7f) {
                View view4 = this.LJLIL;
                o.LJI(view4);
                float f = animatedFraction / 0.7f;
                view4.setAlpha(0.7f * f);
                View view5 = this.LJLIL;
                o.LJI(view5);
                float f2 = (f * 0.3f) + 0.3f;
                view5.setScaleX(f2);
                View view6 = this.LJLIL;
                o.LJI(view6);
                view6.setScaleY(f2);
            } else if (animatedFraction <= 0.8d) {
                View view7 = this.LJLIL;
                o.LJI(view7);
                view7.setAlpha(0.7f);
                View view8 = this.LJLIL;
                o.LJI(view8);
                view8.setScaleX(0.6f);
                View view9 = this.LJLIL;
                o.LJI(view9);
                view9.setScaleY(0.6f);
            } else if (animatedFraction <= 1.0f) {
                float f3 = (animatedFraction - 0.8f) / 0.2f;
                View view10 = this.LJLIL;
                o.LJI(view10);
                view10.setAlpha((1 - f3) * 0.7f);
                View view11 = this.LJLIL;
                o.LJI(view11);
                float f4 = (f3 * 0.1f) + 0.6f;
                view11.setScaleX(f4);
                View view12 = this.LJLIL;
                o.LJI(view12);
                view12.setScaleY(f4);
                if (r2 - animatedFraction < 1.0E-10d) {
                    MKI mki = this.LJLJJI;
                    View view13 = this.LJLIL;
                    o.LJI(view13);
                    mki.LIZ(view13);
                    return;
                }
            }
            if (animatedFraction <= 0.5f) {
                View view14 = this.LJLIL;
                o.LJI(view14);
                view14.setRotation((animatedFraction / 0.5f) * 20 * this.LJLILLLLZI);
            } else {
                View view15 = this.LJLIL;
                o.LJI(view15);
                view15.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20 * this.LJLJI) + (this.LJLILLLLZI * 20));
            }
        }
    }

    public MKG(MKI mki, View view) {
        int i;
        this.LJLJJI = mki;
        this.LJLIL = view;
        if (mki.LJLJJL.nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = mki.LJLJJL.nextBoolean() ? 1 : -1;
    }
}
