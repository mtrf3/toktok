package X;

import Y.ARunnableS51S0100000_15;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.YGk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87102YGk extends C87107YGp {
    public Animator LIZLLL;
    public Animator LJ;
    public Animator LJFF;

    @Override // X.AbstractC87105YGn
    public final void LIZ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.end();
        }
    }

    @Override // X.AbstractC87105YGn
    public final void LIZIZ() {
        ARunnableS51S0100000_15 aRunnableS51S0100000_15 = new ARunnableS51S0100000_15(this, 11);
        this.LIZIZ = aRunnableS51S0100000_15;
        this.LIZ.LIZ.post(aRunnableS51S0100000_15);
    }

    @Override // X.AbstractC87105YGn
    public final void LJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        LJI(null);
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
        Animator animator3 = this.LJ;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.LJ = null;
        Animator animator4 = this.LJFF;
        if (animator4 != null) {
            animator4.cancel();
        }
        this.LJFF = null;
    }

    public final void LJII() {
        C87113YGv LJII = this.LIZ.LIZ.LJII();
        int i = LJII.LIZ;
        float f = LJII.LIZIZ;
        C87113YGv c87113YGv = this.LIZ.LIZIZ;
        int i2 = c87113YGv.LIZ;
        if (i == i2 && f == c87113YGv.LIZIZ) {
            return;
        }
        float f2 = (i2 - i) / 2.0f;
        float LIZ = f - C87115YGx.LIZ(r2.LIZ);
        Animator animator = this.LJ;
        if (animator != null) {
            animator.cancel();
        }
        View target = this.LIZ.LJFF;
        float f3 = LIZ - f2;
        float f4 = i;
        float f5 = i2;
        float f6 = f4 / f5;
        o.LJIIIZ(target, "target");
        float f7 = f5 / 2.0f;
        target.setPivotX(f7);
        target.setPivotY(f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(target, "scaleX", target.getScaleX(), f6);
        o.LJIIIIZZ(ofFloat, "ofFloat(target, SCALE_X, target.scaleX, toScale)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(target, "ScaleY", target.getScaleY(), f6);
        o.LJIIIIZZ(ofFloat2, "ofFloat(target, SCALE_Y, target.scaleY, toScale)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(target, "translationY", target.getTranslationY(), f3);
        AnimatorSet LIZ2 = C1DD.LIZ(300L);
        LIZ2.play(ofFloat3).with(ofFloat).with(ofFloat2);
        this.LJ = LIZ2;
        LIZ2.start();
        float f8 = f4 + LIZ;
        Animator animator2 = this.LJFF;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator LIZ3 = C81276Vv6.LIZ(this.LIZ.LJI, f8);
        this.LJFF = LIZ3;
        LIZ3.start();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("EggShowState.checkPosition, newSize:");
        LIZ4.append(i);
        LIZ4.append(", newTop:");
        LIZ4.append(f);
        LIZ4.append(", rawEggImageSize:");
        LIZ4.append(i2);
        LIZ4.append(", eggTransY:");
        LIZ4.append(LIZ);
        LIZ4.append(", titleTransY:");
        LIZ4.append(f8);
        String msg = X1D.LIZIZ(LIZ4);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.AbstractC87105YGn
    public final boolean LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEggClickable");
        LIZ.append(this.LIZ.LIZ.LJLL);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        return !this.LIZ.LIZ.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87102YGk(C87098YGg stateContext) {
        super(stateContext);
        o.LJIIIZ(stateContext, "stateContext");
    }
}
