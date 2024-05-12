package X;

import Y.ALAdapterS0S0310000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: X.6mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170696mv {
    public static void LIZ(final View view, boolean z) {
        float f;
        float[] fArr = new float[2];
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.6mx
            public final /* synthetic */ View LJLIL = null;
            public final /* synthetic */ boolean LJLILLLLZI = false;
            public final /* synthetic */ boolean LJLJI = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i;
                View view2 = this.LJLIL;
                if (view2 != null) {
                    if (this.LJLILLLLZI) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    view2.setVisibility(i);
                }
                if (this.LJLJI) {
                    view.setVisibility(4);
                }
            }
        });
    }

    public static void LIZJ(View view, boolean z, int i, View view2, InterfaceC15040iS<Void> interfaceC15040iS) {
        LIZIZ(view, z, i, view2, 300, null, false, interfaceC15040iS);
    }

    public static void LIZIZ(View view, boolean z, int i, View view2, int i2, OSZ<String, String> osz, boolean z2, InterfaceC15040iS<Void> interfaceC15040iS) {
        float f;
        float f2;
        float f3;
        if (z) {
            view2.setVisibility(0);
        }
        view2.bringToFront();
        float[] fArr = new float[2];
        float f4 = 0.0f;
        if (!z) {
            f = 0.0f;
        } else {
            f = i;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = i;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
        long j = i2;
        ofFloat.setDuration(j);
        float[] fArr2 = new float[2];
        if (!z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", fArr2);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat2, j);
        LIZLLL.setInterpolator(new LinearInterpolator());
        LIZLLL.playTogether(ofFloat, ofFloat2);
        if (osz != null) {
            if (z) {
                C173216qz.LJ(ofFloat, osz.getFirst(), z2);
            } else {
                C173216qz.LJ(ofFloat, osz.getSecond(), false);
            }
        }
        LIZLLL.addListener(new ALAdapterS0S0310000_2(view, z, view2, interfaceC15040iS, 0));
        LIZLLL.start();
    }
}
