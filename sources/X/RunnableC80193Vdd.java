package X;

import Y.ALAdapterS11S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vdd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80193Vdd implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar LJLIL;

    public final void LIZ() {
        BaseTransientBottomBar.h hVar = this.LJLIL.LIZJ;
        if (hVar == null) {
            return;
        }
        if (hVar.getParent() != null) {
            this.LJLIL.LIZJ.setVisibility(0);
        }
        if (this.LJLIL.LIZJ.getAnimationMode() == 1) {
            BaseTransientBottomBar baseTransientBottomBar = this.LJLIL;
            baseTransientBottomBar.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(C80237VeL.LIZ);
            ofFloat.addUpdateListener(new C80011Vah(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(C80237VeL.LIZLLL);
            ofFloat2.addUpdateListener(new C80008Vae(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(150L);
            animatorSet.addListener(new ALAdapterS11S0100000_14(baseTransientBottomBar, 2));
            animatorSet.start();
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.LJLIL;
        int height = baseTransientBottomBar2.LIZJ.getHeight();
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.LIZJ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        baseTransientBottomBar2.LIZJ.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(C80237VeL.LIZIZ);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new ALAdapterS11S0100000_14(baseTransientBottomBar2, 4));
        valueAnimator.addUpdateListener(new C80009Vaf(baseTransientBottomBar2, height));
        valueAnimator.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80193Vdd(BaseTransientBottomBar baseTransientBottomBar) {
        this.LJLIL = baseTransientBottomBar;
    }
}
