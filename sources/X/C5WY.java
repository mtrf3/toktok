package X;

import Y.ALAdapterS1S0200000_2;
import Y.AObjectS12S0001000_7;
import Y.AUListenerS91S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: X.5WY, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5WY extends FrameLayout {
    public static final int LJLJLJ;
    public static final int LJLJLLL;
    public static Drawable LJLL;
    public static Drawable LJLLI;
    public final Queue<ImageView> LJLIL;
    public Context LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public Random LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    static {
        int i;
        boolean LIZIZ = C5WZ.LIZIZ();
        int i2 = LiveTryModeCountDownThresholdSetting.DEFAULT;
        if (LIZIZ) {
            i = LiveTryModeCountDownThresholdSetting.DEFAULT;
        } else if ((C5WZ.LIZ() & 4) == 4) {
            i = 75;
        } else {
            i = 79;
        }
        LJLJLJ = i;
        if (!C5WZ.LIZIZ()) {
            if ((C5WZ.LIZ() & 4) == 4) {
                i2 = 75;
            } else {
                i2 = 72;
            }
        }
        LJLJLLL = i2;
    }

    public C5WY(Context context) {
        this(context, null, 0);
    }

    public C5WY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(float f, float f2) {
        ImageView imageView;
        FrameLayout.LayoutParams layoutParams;
        float f3;
        int i;
        if (this.LJLIL.isEmpty()) {
            imageView = new ImageView(this.LJLILLLLZI);
            if (LJLL == null) {
                if (R3A.LJII()) {
                    LJLL = null;
                    LJLL = C04270Et.LIZIZ(this.LJLILLLLZI, R.drawable.a9f);
                } else if (C5WZ.LIZIZ() || (C5WZ.LIZ() & 4) == 4) {
                    AObjectS12S0001000_7 aObjectS12S0001000_7 = new AObjectS12S0001000_7(0, 3);
                    C2068389v c2068389v = new C2068389v();
                    aObjectS12S0001000_7.invoke(c2068389v);
                    LJLL = c2068389v.LIZ(imageView.getContext());
                } else {
                    LJLL = C04270Et.LIZIZ(this.LJLILLLLZI, R.drawable.a9f);
                }
            }
            if (LJLLI == null) {
                LJLLI = C04270Et.LIZIZ(this.LJLILLLLZI, R.drawable.ic_home_like_after);
            }
        } else {
            imageView = (ImageView) ((LinkedList) this.LJLIL).poll();
        }
        if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
            imageView.setImageDrawable(LJLLI);
        } else {
            imageView.setImageDrawable(LJLL);
        }
        if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
            layoutParams = new FrameLayout.LayoutParams(C32151Nz.LJIILLIIL(56), C32151Nz.LJIILLIIL(48));
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.LJLJJI, this.LJLJI);
        }
        layoutParams.topMargin = (int) (f2 - (this.LJLJI / 2));
        if (C16310kV.LIZLLL(this) == 1) {
            if (C79004UzY.LJJIJIIJI(this.LJLILLLLZI)) {
                i = this.LJLJL;
            } else {
                i = this.LJLJJLL;
            }
            f3 = i - f;
        } else {
            f3 = f;
        }
        layoutParams.setMarginStart((int) (f3 - (this.LJLJJI / 2)));
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            addView(imageView);
        }
        if (C5WZ.LIZIZ()) {
            imageView.setAlpha(0.0f);
            if (this.LJLJJL == null) {
                this.LJLJJL = new SecureRandom();
            }
            float nextInt = this.LJLJJL.nextInt(40) - 20;
            imageView.setRotation(nextInt);
            float LIZJ = KL2.LIZJ(this.LJLILLLLZI, 30.0f);
            float f4 = -LIZJ;
            imageView.setTranslationY(f4);
            int i2 = this.LJLJJI;
            if (i2 > 0 && this.LJLJI > 0) {
                imageView.setPivotX(i2 / 2.0f);
                imageView.setPivotY(this.LJLJI);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.2f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS91S0100000_2(imageView, 56));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(imageView, 57));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(C55953Lxd.LJIIJ());
            animatorSet.playTogether(ofFloat, ofFloat2);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, (this.LJLJJL.nextInt(5) + 16.0f) / 10.0f);
            ofFloat3.addUpdateListener(new AUListenerS91S0100000_2(imageView, 58));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.addUpdateListener(new AUListenerS91S0100000_2(imageView, 59));
            int LIZJ2 = (int) KL2.LIZJ(this.LJLILLLLZI, 10.0f);
            float f5 = -(this.LJLJJL.nextInt(LIZJ2) + LIZJ2);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, (float) (Math.tan((nextInt * 3.141592653589793d) / 360.0d) * f5));
            ofFloat5.addUpdateListener(new AUListenerS91S0100000_2(imageView, 60));
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f4, f5 - LIZJ);
            ofFloat6.addUpdateListener(new AUListenerS91S0100000_2(imageView, 61));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(600L);
            animatorSet2.setInterpolator(C55953Lxd.LJIIJ());
            animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(animatorSet);
            animatorSet3.play(animatorSet2).after(400L);
            animatorSet3.addListener(new ALAdapterS1S0200000_2(this, imageView, 16));
            animatorSet3.start();
            return;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new Random();
        }
        float nextInt2 = this.LJLJJL.nextInt(40) - 20;
        imageView.setRotation(nextInt2);
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(2.56f, 1.6f);
        ofFloat7.setInterpolator(new OvershootInterpolator());
        ofFloat7.setDuration(300L);
        ofFloat7.addUpdateListener(new AUListenerS91S0100000_2(imageView, 62));
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(1.6f, (this.LJLJJL.nextInt(10) + 20.0f) / 10.0f);
        ofFloat8.addUpdateListener(new AUListenerS91S0100000_2(imageView, 63));
        ValueAnimator ofFloat9 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat9.addUpdateListener(new AUListenerS91S0100000_2(imageView, 53));
        int LIZJ3 = (int) KL2.LIZJ(this.LJLILLLLZI, 50.0f);
        float f6 = -(this.LJLJJL.nextInt(LIZJ3) + LIZJ3);
        ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, (float) (Math.tan((nextInt2 * 3.141592653589793d) / 360.0d) * f6));
        ofFloat10.addUpdateListener(new AUListenerS91S0100000_2(imageView, 54));
        ValueAnimator ofFloat11 = ValueAnimator.ofFloat(0.0f, f6);
        ofFloat11.addUpdateListener(new AUListenerS91S0100000_2(imageView, 55));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(500L);
        animatorSet4.setInterpolator(new DecelerateInterpolator());
        animatorSet4.playTogether(ofFloat8, ofFloat9, ofFloat10, ofFloat11);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.play(ofFloat7);
        animatorSet5.play(animatorSet4).after(500L);
        animatorSet5.addListener(new ALAdapterS1S0200000_2(this, imageView, 15));
        animatorSet5.start();
    }

    public C5WY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = new LinkedList();
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLILLLLZI = context;
        this.LJLJJL = new Random();
        this.LJLJJI = (int) KL2.LIZJ(context, LJLJLLL);
        this.LJLJI = (int) KL2.LIZJ(context, LJLJLJ);
        this.LJLJJLL = C60996Nwm.LJIIIIZZ(context);
        int LJIIIIZZ = C60996Nwm.LJIIIIZZ(context);
        int LJ = C60996Nwm.LJ(context);
        this.LJLJL = LJIIIIZZ <= LJ ? LJ : LJIIIIZZ;
    }
}
