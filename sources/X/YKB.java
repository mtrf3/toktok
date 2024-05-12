package X;

import Y.AUListenerS102S0100000_15;
import Y.AUListenerS104S0200000_15;
import Y.IDAListenerS45S0200000_15;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YKB {
    public final Bitmap LIZ;
    public final Bitmap LIZIZ;
    public final RectF LIZJ;
    public final RectF LIZLLL;
    public float LJ;
    public float LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final boolean LJIIJ;
    public final AnimatorSet LJIIJJI;
    public final YKD LJIIL;
    public final YKE LJIILIIL;
    public final int LJIILJJIL;

    public YKB(YKA yka, boolean z, Bitmap bitmap, Bitmap iconBitmap, PointF pointF, PointF pointF2, PointF pointF3) {
        int LJJIIZ;
        boolean z2;
        TypeEvaluator cxe;
        o.LJIIIZ(iconBitmap, "iconBitmap");
        this.LIZ = bitmap;
        this.LIZIZ = iconBitmap;
        this.LIZJ = new RectF();
        this.LIZLLL = new RectF();
        this.LJ = 1.0f;
        this.LJI = 255;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = true;
        this.LJIIJ = true;
        if (LiveLikeAnimationOptConfig.likeAnimationFluencyOpt()) {
            LJJIIZ = O6R.LJJIIZ((((float) yka.getTotal_duration_optimization()) / 1000) * LiveLikeAnimationOptConfig.likeAnimationFps());
        } else {
            LJJIIZ = O6R.LJJIIZ((((float) yka.getTotal_duration_optimization()) / 1000) * 60);
        }
        this.LJIILJJIL = LJJIIZ;
        AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this, 8);
        if (z) {
            z2 = yka.LJLLL;
        } else {
            z2 = yka.LJLJL;
        }
        this.LJIIJ = z2;
        if (yka.LLFII) {
            if (z2) {
                YKD LIZIZ = yka.LLFF.LIZIZ();
                this.LJIIL = LIZIZ == null ? new YKD(pointF, pointF3, pointF2, LJJIIZ) : LIZIZ;
            } else {
                YKE LIZIZ2 = yka.LLFFF.LIZIZ();
                this.LJIILIIL = LIZIZ2 == null ? new YKE(pointF, pointF3, LJJIIZ) : LIZIZ2;
            }
        }
        yka.setVisibility(0);
        V0R v0r = V0Q.Default;
        long nextLong = v0r.nextLong(yka.getTotal_duration_optimization() / 4, (yka.getTotal_duration_optimization() / 5) * 3);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (yka.LLFII) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, LJJIIZ - 1);
            ofInt.setDuration(yka.getTotal_duration_optimization());
            ofInt.addUpdateListener(new AUListenerS104S0200000_15(this, yka, 2));
            ofInt.addListener(new IDAListenerS45S0200000_15(this, yka, 1));
            arrayList.add(ofInt);
        } else {
            if (z2) {
                cxe = new CXD(pointF2, aqS181S0100000_15);
            } else {
                cxe = new CXE(aqS181S0100000_15);
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(cxe, pointF, pointF3);
            ofObject.setDuration(yka.getTotal_duration_optimization());
            ofObject.addUpdateListener(new AUListenerS104S0200000_15(this, yka, 3));
            ofObject.addListener(new IDAListenerS45S0200000_15(this, yka, 2));
            arrayList.add(ofObject);
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.15f);
            ofFloat.setDuration(yka.LJLZ);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new AUListenerS102S0100000_15(this, 0));
            arrayList.add(ofFloat);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.15f, 1.0f);
            ofFloat2.setDuration(yka.LJZ);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat2.addUpdateListener(new AUListenerS102S0100000_15(this, 1));
            ofFloat2.setStartDelay(yka.LJLZ);
            arrayList.add(ofFloat2);
            long LIZIZ3 = YKA.LIZIZ(yka.LJLLLLLL, 150L);
            long LIZIZ4 = YKA.LIZIZ(yka.LJLLLLLL, 100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setDuration(LIZIZ3);
            ofFloat3.addUpdateListener(new AUListenerS102S0100000_15(this, 5));
            ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
            ofInt2.setDuration(LIZIZ3);
            ofInt2.addUpdateListener(new AUListenerS102S0100000_15(this, 6));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat4.setDuration(LIZIZ3);
            ofFloat4.setStartDelay(LIZIZ4);
            ofFloat4.addUpdateListener(new AUListenerS102S0100000_15(this, 7));
            ValueAnimator ofInt3 = ValueAnimator.ofInt(yka.LJLL, yka.LJLLI);
            ofInt3.setDuration(LIZIZ3);
            ofInt3.setStartDelay(LIZIZ4);
            ofInt3.addUpdateListener(new AUListenerS102S0100000_15(this, 8));
            animatorSet2.playTogether(ofFloat3, ofInt2, ofFloat4, ofInt3);
            animatorSet2.setStartDelay(nextLong);
            arrayList.add(animatorSet2);
            long LIZIZ5 = YKA.LIZIZ(yka.LJLLLLLL, v0r.nextInt(100, 200)) + nextLong;
            ValueAnimator ofInt4 = ValueAnimator.ofInt(yka.LJLLILLLL, yka.LJLLJ);
            ofInt4.setDuration(yka.getTotal_duration_optimization() - LIZIZ5);
            ofInt4.setInterpolator(new DecelerateInterpolator());
            ofInt4.addUpdateListener(new AUListenerS102S0100000_15(this, 2));
            ofInt4.setStartDelay(LIZIZ5);
            arrayList.add(ofInt4);
        } else {
            this.LJ = 0.0f;
            this.LJI = 0;
            this.LJFF = 1.0f;
            this.LJII = 0;
            ValueAnimator ofInt5 = ValueAnimator.ofInt(yka.LJLJI, yka.LJLJJI);
            ofInt5.setDuration(yka.getIcon_alpha_duration_optimization());
            ofInt5.addUpdateListener(new AUListenerS102S0100000_15(this, 3));
            arrayList.add(ofInt5);
            long nextInt = v0r.nextInt((int) (((float) yka.getTotal_duration_optimization()) / 3.0f), (int) (((float) yka.getTotal_duration_optimization()) * 0.55f));
            ValueAnimator ofInt6 = ValueAnimator.ofInt(yka.LJLJJL, yka.LJLJJLL);
            ofInt6.setDuration(yka.getTotal_duration_optimization() - nextInt);
            ofInt6.setStartDelay(nextInt);
            ofInt6.addUpdateListener(new AUListenerS102S0100000_15(this, 4));
            arrayList.add(ofInt6);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.LJIIJJI = animatorSet;
    }
}
