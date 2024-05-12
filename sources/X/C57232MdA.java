package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.MdA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57232MdA implements ValueAnimator.AnimatorUpdateListener {
    public View LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ C57233MdB LJLJJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.LJLIL;
        if (view == null || view.getTag() == null) {
            return;
        }
        PointF pointF = (PointF) valueAnimator.getAnimatedValue();
        this.LJLIL.setX(pointF.x);
        this.LJLIL.setY(pointF.y);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction <= 0.7f) {
            float f = animatedFraction / 0.7f;
            this.LJLIL.setAlpha(0.7f * f);
            float f2 = (f * 0.3f) + 0.3f;
            this.LJLIL.setScaleX(f2);
            this.LJLIL.setScaleY(f2);
        } else if (animatedFraction <= 0.8d) {
            this.LJLIL.setAlpha(0.7f);
            this.LJLIL.setScaleX(0.6f);
            this.LJLIL.setScaleY(0.6f);
        } else if (animatedFraction <= 1.0f) {
            float f3 = (animatedFraction - 0.8f) / 0.2f;
            this.LJLIL.setAlpha((1.0f - f3) * 0.7f);
            float f4 = (f3 * 0.1f) + 0.6f;
            this.LJLIL.setScaleX(f4);
            this.LJLIL.setScaleY(f4);
            if (1.0f - animatedFraction < 1.0E-10d) {
                this.LJLJJI.LIZIZ(this.LJLIL);
                return;
            }
        }
        if (animatedFraction <= 0.5f) {
            this.LJLIL.setRotation((animatedFraction / 0.5f) * 20.0f * this.LJLILLLLZI);
        } else {
            this.LJLIL.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * this.LJLJI) + (this.LJLILLLLZI * 20));
        }
    }

    public C57232MdA(C57233MdB c57233MdB, View view) {
        int i;
        this.LJLJJI = c57233MdB;
        this.LJLIL = view;
        if (c57233MdB.LJLJJL.nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = c57233MdB.LJLJJL.nextBoolean() ? 1 : -1;
    }
}
