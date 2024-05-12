package X;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.WdJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82721WdJ implements ValueAnimator.AnimatorUpdateListener {
    public View LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ C82722WdK LJLJJI;

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
                this.LJLJJI.LIZ(this.LJLIL);
                return;
            }
        }
        if (animatedFraction <= 0.5f) {
            this.LJLIL.setRotation((animatedFraction / 0.5f) * 20.0f * this.LJLILLLLZI);
        } else {
            this.LJLIL.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * this.LJLJI) + (this.LJLILLLLZI * 20));
        }
    }

    public C82721WdJ(C82722WdK c82722WdK, View view) {
        int i;
        this.LJLJJI = c82722WdK;
        this.LJLIL = view;
        if (c82722WdK.LJLJJL.nextBoolean()) {
            i = 1;
        } else {
            i = -1;
        }
        this.LJLILLLLZI = i;
        this.LJLJI = c82722WdK.LJLJJL.nextBoolean() ? 1 : -1;
    }
}
