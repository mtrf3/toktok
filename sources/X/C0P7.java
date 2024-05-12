package X;

import Y.IDRunnableS1S0400000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Objects;

/* renamed from: X.0P7, reason: invalid class name */
/* loaded from: classes.dex */
public class C0P7 implements View.OnApplyWindowInsetsListener {
    public final C0P4 LIZ;
    public C0PI LIZIZ;

    public C0P7(View view, C0P4 c0p4) {
        C0PI c0pi;
        this.LIZ = c0p4;
        C0PI LIZ = C0P1.LIZ(view);
        if (LIZ != null) {
            c0pi = new C0PC(LIZ).LIZ.LIZIZ();
        } else {
            c0pi = null;
        }
        this.LIZIZ = c0pi;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
        Interpolator decelerateInterpolator;
        if (!view.isLaidOut()) {
            this.LIZIZ = C0PI.LIZJ(view, windowInsets);
            return C30611Ib.LJIIIIZZ(view, windowInsets);
        }
        final C0PI LIZJ = C0PI.LIZJ(view, windowInsets);
        if (this.LIZIZ == null) {
            this.LIZIZ = C0P1.LIZ(view);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = LIZJ;
            return C30611Ib.LJIIIIZZ(view, windowInsets);
        }
        C0P4 LJIIIZ = C30611Ib.LJIIIZ(view);
        if (LJIIIZ != null && Objects.equals(LJIIIZ.LIZ, windowInsets)) {
            return C30611Ib.LJIIIIZZ(view, windowInsets);
        }
        C0PI c0pi = this.LIZIZ;
        int i = 1;
        final int i2 = 0;
        do {
            C06920Oy LIZ = LIZJ.LIZ(i);
            if (LIZ != null && !LIZ.equals(c0pi.LIZ(i))) {
                i2 |= i;
            }
            i <<= 1;
        } while (i <= 256);
        if (i2 == 0) {
            return C30611Ib.LJIIIIZZ(view, windowInsets);
        }
        final C0PI c0pi2 = this.LIZIZ;
        if (LIZJ.LIZ(i2).LIZLLL == 0) {
            decelerateInterpolator = new AccelerateInterpolator();
        } else {
            decelerateInterpolator = new DecelerateInterpolator();
        }
        final C0PA c0pa = new C0PA(i2, decelerateInterpolator, 160L);
        c0pa.LIZIZ(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0pa.LIZ.LIZ());
        C06920Oy LIZ2 = LIZJ.LIZ(i2);
        C06920Oy LIZ3 = c0pi2.LIZ(i2);
        C0P3 c0p3 = new C0P3(C06920Oy.LIZIZ(Math.min(LIZ2.LIZ, LIZ3.LIZ), Math.min(LIZ2.LIZIZ, LIZ3.LIZIZ), Math.min(LIZ2.LIZJ, LIZ3.LIZJ), Math.min(LIZ2.LIZLLL, LIZ3.LIZLLL)), C06920Oy.LIZIZ(Math.max(LIZ2.LIZ, LIZ3.LIZ), Math.max(LIZ2.LIZIZ, LIZ3.LIZIZ), Math.max(LIZ2.LIZJ, LIZ3.LIZJ), Math.max(LIZ2.LIZLLL, LIZ3.LIZLLL)));
        C30611Ib.LJFF(view, c0pa, windowInsets, false);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0P5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0PA.this.LIZIZ(valueAnimator.getAnimatedFraction());
                C0PI c0pi3 = LIZJ;
                C0PI c0pi4 = c0pi2;
                float LIZIZ = C0PA.this.LIZ.LIZIZ();
                int i3 = i2;
                C0PC c0pc = new C0PC(c0pi3);
                int i4 = 1;
                do {
                    if ((i3 & i4) == 0) {
                        c0pc.LIZ.LIZJ(i4, c0pi3.LIZ(i4));
                    } else {
                        C06920Oy LIZ4 = c0pi3.LIZ(i4);
                        C06920Oy LIZ5 = c0pi4.LIZ(i4);
                        float f = 1.0f - LIZIZ;
                        int i5 = (int) (((r3 - LIZ5.LIZ) * f) + 0.5d);
                        int i6 = (int) (((LIZ4.LIZIZ - LIZ5.LIZIZ) * f) + 0.5d);
                        int i7 = (int) (((LIZ4.LIZJ - LIZ5.LIZJ) * f) + 0.5d);
                        int i8 = (int) (((LIZ4.LIZLLL - LIZ5.LIZLLL) * f) + 0.5d);
                        int max = Math.max(0, LIZ4.LIZ - i5);
                        int max2 = Math.max(0, LIZ4.LIZIZ - i6);
                        int max3 = Math.max(0, LIZ4.LIZJ - i7);
                        int max4 = Math.max(0, LIZ4.LIZLLL - i8);
                        if (max != i5 || max2 != i6 || max3 != i7 || max4 != i8) {
                            LIZ4 = C06920Oy.LIZIZ(max, max2, max3, max4);
                        }
                        c0pc.LIZ.LIZJ(i4, LIZ4);
                    }
                    i4 <<= 1;
                } while (i4 <= 256);
                C30611Ib.LJI(view, c0pc.LIZ.LIZIZ(), Collections.singletonList(C0PA.this));
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: X.0P6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C0PA.this.LIZIZ(1.0f);
                C30611Ib.LJ(view, C0PA.this);
            }
        });
        ViewTreeObserverOnPreDrawListenerC06930Oz.LIZ(view, new IDRunnableS1S0400000(view, c0pa, c0p3, duration, 1));
        this.LIZIZ = LIZJ;
        return C30611Ib.LJIIIIZZ(view, windowInsets);
    }
}
