package Y;

import X.C136845Yq;
import X.C81259Vup;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS3S0211000_14 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        float f;
        float f2;
        float f3;
        long j;
        C81259Vup c81259Vup = (C81259Vup) this.l0;
        if (c81259Vup.LJIILIIL == null) {
            return;
        }
        c81259Vup.getClass();
        C81259Vup c81259Vup2 = (C81259Vup) this.l0;
        int i = this.i3;
        View view = (View) this.l1;
        c81259Vup2.getClass();
        Point point = new Point(0, 0);
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i == 80) {
                        o.LJI(view);
                        float x = view.getX();
                        C136845Yq c136845Yq = c81259Vup2.LIZIZ;
                        o.LJI(c136845Yq);
                        point.x = (int) (c136845Yq.getBubbleOffset() + x);
                        point.y = (int) view.getY();
                    }
                } else {
                    o.LJI(view);
                    float x2 = view.getX();
                    C136845Yq c136845Yq2 = c81259Vup2.LIZIZ;
                    o.LJI(c136845Yq2);
                    point.x = (int) (c136845Yq2.getBubbleOffset() + x2);
                    point.y = (int) (view.getY() + view.getMeasuredHeight());
                }
            } else {
                o.LJI(view);
                point.x = (int) view.getX();
                float y = view.getY();
                C136845Yq c136845Yq3 = c81259Vup2.LIZIZ;
                o.LJI(c136845Yq3);
                point.y = (int) (c136845Yq3.getBubbleOffset() + y);
            }
        } else {
            o.LJI(view);
            point.x = (int) (view.getX() + view.getMeasuredWidth());
            float y2 = view.getY();
            C136845Yq c136845Yq4 = c81259Vup2.LIZIZ;
            o.LJI(c136845Yq4);
            point.y = (int) (c136845Yq4.getBubbleOffset() + y2);
        }
        o.LJI(view);
        view.setPivotY(point.y);
        view.setPivotX(point.x);
        View view2 = (View) this.l1;
        float[] fArr = new float[2];
        boolean z = this.z2;
        float f4 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", fArr);
        o.LJIIIIZZ(ofFloat, "ofFloat(view, \"scaleX\", … (isIn) 1.00F else 0F   )");
        View view3 = (View) this.l1;
        float[] fArr2 = new float[2];
        boolean z2 = this.z2;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z2) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "scaleY", fArr2);
        o.LJIIIIZZ(ofFloat2, "ofFloat(view, \"scaleY\", … if (isIn) 1.00F else 0F)");
        AnimatorSet animatorSet = ((C81259Vup) this.l0).LJIILIIL;
        o.LJI(animatorSet);
        animatorSet.play(ofFloat).with(ofFloat2);
        AnimatorSet animatorSet2 = ((C81259Vup) this.l0).LJIILIIL;
        o.LJI(animatorSet2);
        if (this.z2) {
            j = ((C81259Vup) this.l0).LJIILL;
        } else {
            j = ((C81259Vup) this.l0).LJIILLIIL;
        }
        animatorSet2.setDuration(j);
        C81259Vup c81259Vup3 = (C81259Vup) this.l0;
        if (c81259Vup3.LJIIJ) {
            AnimatorSet animatorSet3 = c81259Vup3.LJIILIIL;
            o.LJI(animatorSet3);
            animatorSet3.setInterpolator(new OvershootInterpolator(1.0f));
        }
        AnimatorSet animatorSet4 = ((C81259Vup) this.l0).LJIILIIL;
        o.LJI(animatorSet4);
        animatorSet4.addListener(new ALAdapterS2S0210000_14(this.z2, (View) this.l1, (C81259Vup) this.l0, 1));
        AnimatorSet animatorSet5 = ((C81259Vup) this.l0).LJIILIIL;
        o.LJI(animatorSet5);
        animatorSet5.start();
    }

    public static final void run$0(ARunnableS3S0211000_14 aRunnableS3S0211000_14) {
        boolean LIZ;
        try {
            aRunnableS3S0211000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0211000_14 aRunnableS3S0211000_14) {
        boolean LIZ;
        try {
            ((BottomSheetBehavior) aRunnableS3S0211000_14.l1).LIZJ(aRunnableS3S0211000_14.i3, (View) aRunnableS3S0211000_14.l0, aRunnableS3S0211000_14.z2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0211000_14(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.$t = i2;
        this.l1 = bottomSheetBehavior;
        this.l0 = view;
        this.i3 = i;
        this.z2 = true;
    }

    public ARunnableS3S0211000_14(C81259Vup c81259Vup, int i, C136845Yq c136845Yq, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c81259Vup;
        this.i3 = i;
        this.l1 = c136845Yq;
        this.z2 = z;
    }
}
