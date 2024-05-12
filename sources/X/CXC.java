package X;

import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS94S0100000_5;
import Y.AUListenerS97S0200000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;

/* loaded from: classes6.dex */
public final class CXC {
    public final Bitmap LIZ;
    public final RectF LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public final boolean LJ;
    public final AnimatorSet LJFF;
    public final /* synthetic */ CX6 LJI;

    public final AnimatorSet LIZ(boolean z) {
        long j;
        long j2;
        long j3;
        AnimatorSet animatorSet = new AnimatorSet();
        CX6 cx6 = this.LJI;
        Animator[] animatorArr = new Animator[2];
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[2];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
        long j4 = 350;
        if (z) {
            j = 350;
        } else if (this.LJ) {
            j = 100;
        } else {
            j = 150;
        }
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 6));
        animatorArr2[0] = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.5f, 1.36f, 1.4f);
        if (z) {
            j2 = 350;
        } else if (this.LJ) {
            j2 = 100;
        } else {
            j2 = 150;
        }
        ofFloat2.setDuration(j2);
        ofFloat2.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 7));
        if (z) {
            ofFloat2.addListener(new ALAdapterS4S0200000_5(this, cx6, 7));
        }
        animatorArr2[1] = ofFloat2;
        animatorSet2.playSequentially(animatorArr2);
        animatorArr[0] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] animatorArr3 = new Animator[2];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, -8.0f);
        if (z) {
            j3 = 350;
        } else if (this.LJ) {
            j3 = 100;
        } else {
            j3 = 150;
        }
        ofFloat3.setDuration(j3);
        ofFloat3.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 8));
        animatorArr3[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(-8.0f, 3.0f, 0.0f);
        if (!z) {
            if (this.LJ) {
                j4 = 100;
            } else {
                j4 = 150;
            }
        }
        ofFloat4.setDuration(j4);
        ofFloat4.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 9));
        animatorArr3[1] = ofFloat4;
        animatorSet3.playSequentially(animatorArr3);
        animatorArr[1] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    public final void LIZIZ(float f) {
        RectF rectF = this.LIZIZ;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f2 = (CX6.LJLJJL * f) / 2;
        rectF.left = centerX - f2;
        rectF.top = centerY - f2;
        rectF.right = centerX + f2;
        rectF.bottom = centerY + f2;
    }

    public CXC(CX6 cx6, Bitmap bitmap, PointF pointF, PointF pointF2) {
        this.LJI = cx6;
        this.LIZ = bitmap;
        RectF rectF = new RectF();
        this.LIZIZ = rectF;
        this.LIZJ = 255;
        this.LJ = true;
        float f = pointF.x;
        float f2 = CX6.LJLJJL / 2;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(cx6.LJLIL) || LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionRemove()) {
            animatorSet.playSequentially(LIZ(true));
        } else {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator ofObject = ValueAnimator.ofObject(new CXD(new PointF(pointF2.x, pointF.y)), pointF, pointF2);
            ofObject.setDuration(1500L);
            ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
            ofObject.addUpdateListener(new AUListenerS97S0200000_5(this, cx6, 10));
            ofObject.addListener(new ALAdapterS4S0200000_5(this, cx6, 9));
            ValueAnimator ofInt = ValueAnimator.ofInt(255, 153);
            ofInt.setDuration(500L);
            ofInt.addUpdateListener(new AUListenerS94S0100000_5(this, 18));
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator ofInt2 = ValueAnimator.ofInt(153, 0);
            ofInt2.setDuration(1000L);
            ofInt2.addUpdateListener(new AUListenerS94S0100000_5(this, 19));
            ofInt2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt2.setStartDelay(500L);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.4f, 0.5f);
            ofFloat.setDuration(500L);
            ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 20));
            animatorSet2.playTogether(ofObject, ofInt, ofInt2, ofFloat);
            animatorSet2.setStartDelay(200L);
            animatorSet.playSequentially(LIZ(false), animatorSet2);
        }
        this.LJFF = animatorSet;
    }
}
