package X;

import Y.ALAdapterS0S0100000_1;
import Y.AUListenerS90S0100000_1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.3qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96293qD {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C97183re.LJLIL);

    public static Interpolator LIZJ() {
        return (Interpolator) LIZ.getValue();
    }

    public static Animator LIZ(View view, boolean z) {
        float[] fArr;
        long j;
        long j2;
        if (z) {
            fArr = new float[]{1.0f, 0.0f};
        } else {
            fArr = new float[]{0.0f, 1.0f};
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(fArr, fArr.length));
        ofFloat.setInterpolator(LIZJ());
        if (z) {
            j = 140;
        } else {
            j = 0;
        }
        ofFloat.setStartDelay(j);
        if (z) {
            j2 = 150;
        } else {
            j2 = 250;
        }
        ofFloat.setDuration(j2);
        return ofFloat;
    }

    public static Animator LIZIZ(View view, boolean z) {
        float[] fArr;
        if (z) {
            fArr = new float[]{1.0f, 0.0f};
        } else {
            fArr = new float[]{0.0f, 1.0f};
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(fArr, fArr.length));
        ofFloat.setInterpolator(LIZJ());
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public static Animator LIZLLL(View view, boolean z) {
        long j;
        float[] fArr = {0.0f, 1.0f};
        if (z) {
            // fill-array-data instruction
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", Arrays.copyOf(fArr, 2));
        ofFloat.setInterpolator(LIZJ());
        long j2 = 250;
        if (z) {
            j = 0;
        } else {
            j = 250;
        }
        ofFloat.setStartDelay(j);
        if (z) {
            j2 = 150;
        }
        ofFloat.setDuration(j2);
        return ofFloat;
    }

    public static Animator LJ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        long j;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1);
        if (z) {
            j = 400;
        } else {
            j = 200;
        }
        ofInt.setDuration(j);
        ofInt.addListener(new ALAdapterS0S0100000_1(interfaceC65784Pro, 7));
        return ofInt;
    }

    public static Animator LJFF(final FrameLayout frameLayout, final C96243q8 c96243q8, final View view, C96223q6 c96223q6, final boolean z, final InterfaceC65784Pro interfaceC65784Pro) {
        float f;
        long j;
        int[] iArr;
        frameLayout.findViewById(R.id.jeb).getGlobalVisibleRect(new Rect());
        float LJIJ = (C78897Uxp.LJIJ(R.dimen.v9, frameLayout) - C78897Uxp.LJIJ(R.dimen.v8, frameLayout)) / 2.0f;
        if (z) {
            f = (c96223q6.LJLILLLLZI - r3.top) - LJIJ;
            j = 300;
        } else {
            f = (r3.top - c96223q6.LJLILLLLZI) + LJIJ;
            j = 400;
        }
        int width = frameLayout.getWidth() - (C78897Uxp.LJIJ(R.dimen.v_, frameLayout) * 2);
        if (z) {
            iArr = new int[]{view.getWidth(), width};
        } else {
            iArr = new int[]{width, view.getWidth()};
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        ofInt.setInterpolator(LIZJ());
        ofInt.addUpdateListener(new AUListenerS90S0100000_1(c96243q8, 54));
        ofInt.setDuration(j);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c96243q8, "translationY", 0.0f, f);
        ofFloat.setInterpolator(LIZJ());
        ofFloat.setDuration(j);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.3qE
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (!z) {
                    C16880lQ.LJLLLL(c96243q8, frameLayout);
                    C17N.LJJLIIIJJI(view);
                }
                if (z) {
                    interfaceC65784Pro.invoke();
                }
            }
        });
        return animatorSet;
    }
}
