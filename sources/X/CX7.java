package X;

import Y.AUListenerS97S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class CX7 {
    public final Bitmap LIZ;
    public int LIZIZ = 255;
    public final RectF LIZJ;
    public final AnimatorSet LIZLLL;

    public CX7(CX6 cx6, Bitmap bitmap, PointF pointF) {
        this.LIZ = bitmap;
        RectF rectF = new RectF();
        this.LIZJ = rectF;
        float f = pointF.x;
        float f2 = CX6.LJLJJL / 2;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.7f, 1.1f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 11));
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.setDuration(300L);
        ofInt.setStartDelay(200L);
        ofInt.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 12));
        animatorSet.playSequentially(ofFloat, ofInt);
        this.LIZLLL = animatorSet;
    }
}
