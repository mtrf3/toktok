package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.ViC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80476ViC extends C80475ViB {
    @Override // X.C80475ViB
    public final void LJ() {
    }

    @Override // X.C80475ViB
    public final void LJIIIZ() {
    }

    @Override // X.C80475ViB
    public final void LJIIJ() {
    }

    @Override // X.C80475ViB
    public final float LIZJ() {
        return this.LJIIZILJ.getElevation();
    }

    public final boolean LJIILIIL() {
        if (((C80489ViP) this.LJIJ).LIZ.LJLJLLL) {
            return true;
        }
        if (this.LIZIZ && this.LJIIZILJ.getSizeDimension() < 0) {
            return true;
        }
        return false;
    }

    @Override // X.C80475ViB
    public final void LJFF() {
        LJIIJJI();
        throw null;
    }

    @Override // X.C80475ViB
    public final void LIZLLL(Rect rect) {
        if (((C80489ViP) this.LJIJ).LIZ.LJLJLLL) {
            super.LIZLLL(rect);
        } else if (!this.LIZIZ || this.LJIIZILJ.getSizeDimension() >= 0) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (0 - this.LJIIZILJ.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // X.C80475ViB
    public final void LJI(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.LJIIZILJ.isEnabled()) {
                this.LJIIZILJ.setElevation(this.LIZLLL);
                if (this.LJIIZILJ.isPressed()) {
                    this.LJIIZILJ.setTranslationZ(this.LJFF);
                    return;
                } else if (this.LJIIZILJ.isFocused() || this.LJIIZILJ.isHovered()) {
                    this.LJIIZILJ.setTranslationZ(this.LJ);
                    return;
                } else {
                    this.LJIIZILJ.setTranslationZ(0.0f);
                    return;
                }
            }
            this.LJIIZILJ.setElevation(0.0f);
            this.LJIIZILJ.setTranslationZ(0.0f);
        }
    }

    public C80476ViC(C80474ViA c80474ViA, C80489ViP c80489ViP) {
        super(c80474ViA, c80489ViP);
    }

    public final Animator LJIIL(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.LJIIZILJ, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C80474ViA, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C80475ViB.LJIL);
        return animatorSet;
    }

    @Override // X.C80475ViB
    public final void LJII(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.LJIIZILJ.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C80475ViB.LJJ, LJIIL(f, f3));
            stateListAnimator.addState(C80475ViB.LJJI, LJIIL(f, f2));
            stateListAnimator.addState(C80475ViB.LJJIFFI, LJIIL(f, f2));
            stateListAnimator.addState(C80475ViB.LJJII, LJIIL(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.LJIIZILJ, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                C80474ViA c80474ViA = this.LJIIZILJ;
                arrayList.add(ObjectAnimator.ofFloat(c80474ViA, (Property<C80474ViA, Float>) View.TRANSLATION_Z, c80474ViA.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.LJIIZILJ, (Property<C80474ViA, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C80475ViB.LJIL);
            stateListAnimator.addState(C80475ViB.LJJIII, animatorSet);
            stateListAnimator.addState(C80475ViB.LJJIIJ, LJIIL(0.0f, 0.0f));
            this.LJIIZILJ.setStateListAnimator(stateListAnimator);
        }
        if (!LJIILIIL()) {
            return;
        }
        LJIIJJI();
        throw null;
    }
}
