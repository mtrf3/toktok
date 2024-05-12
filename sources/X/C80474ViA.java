package X;

import Y.IDDListenerS395S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ViA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80474ViA extends C80366VgQ implements InterfaceC80382Vgg, InterfaceC80411Vh9, C06B {
    public ColorStateList LJLILLLLZI;
    public PorterDuff.Mode LJLJI;
    public ColorStateList LJLJJI;
    public PorterDuff.Mode LJLJJL;
    public ColorStateList LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public C80476ViC LJLL;

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    private C80475ViB getImpl() {
        if (this.LJLL == null) {
            this.LJLL = new C80476ViC(this, new C80489ViP(this));
        }
        return this.LJLL;
    }

    @Override // X.C06B
    public C06C<C80474ViA> getBehavior() {
        return new FloatingActionButton$Behavior();
    }

    public int getRippleColor() {
        ColorStateList colorStateList = this.LJLJJLL;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public int getSizeDimension() {
        return LJ(this.LJLJL);
    }

    public final void LIZIZ() {
        C80475ViB impl = getImpl();
        if (impl.LJIILL == null) {
            impl.LJIILL = new ArrayList<>();
        }
        impl.LJIILL.add(null);
    }

    public final void LIZLLL() {
        C80475ViB impl = getImpl();
        C80481ViH c80481ViH = new C80481ViH(this);
        if (impl.LJIILLIIL == null) {
            impl.LJIILLIIL = new ArrayList<>();
        }
        impl.LJIILLIIL.add(c80481ViH);
    }

    public final boolean LJI() {
        C80475ViB impl = getImpl();
        if (impl.LJIIZILJ.getVisibility() == 0) {
            if (impl.LJIILIIL == 1) {
                return true;
            }
        } else if (impl.LJIILIIL != 2) {
            return true;
        }
        return false;
    }

    public final boolean LJII() {
        C80475ViB impl = getImpl();
        if (impl.LJIIZILJ.getVisibility() != 0) {
            if (impl.LJIILIIL == 2) {
                return true;
            }
        } else if (impl.LJIILIIL != 1) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.LJLJJI;
        if (colorStateList == null) {
            C07840Sm.LIZ(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.LJLJJL;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C03R.LIZJ(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().LJI(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().LIZJ();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().LJ;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().LJFF;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public C80246VeU getHideMotionSpec() {
        return getImpl().LJIIJ;
    }

    public C80416VhE getShapeAppearanceModel() {
        C80416VhE c80416VhE = getImpl().LIZ;
        c80416VhE.getClass();
        return c80416VhE;
    }

    public C80246VeU getShowMotionSpec() {
        return getImpl().LJIIIZ;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().LJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C80475ViB impl = getImpl();
        impl.getClass();
        if (!(impl instanceof C80476ViC)) {
            ViewTreeObserver viewTreeObserver = impl.LJIIZILJ.getViewTreeObserver();
            if (impl.LJIJJLI == null) {
                impl.LJIJJLI = new IDDListenerS395S0100000_14(impl, 2);
            }
            viewTreeObserver.addOnPreDrawListener(impl.LJIJJLI);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C80475ViB impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.LJIIZILJ.getViewTreeObserver();
        IDDListenerS395S0100000_14 iDDListenerS395S0100000_14 = impl.LJIJJLI;
        if (iDDListenerS395S0100000_14 != null) {
            viewTreeObserver.removeOnPreDrawListener(iDDListenerS395S0100000_14);
            impl.LJIJJLI = null;
        }
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // X.InterfaceC80382Vgg
    public final boolean LJJJLZIJ() {
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.LJLJI;
    }

    public int getCustomSize() {
        return this.LJLJLJ;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public ColorStateList getRippleColorStateList() {
        return this.LJLJJLL;
    }

    public int getSize() {
        return this.LJLJL;
    }

    public ColorStateList getSupportImageTintList() {
        return this.LJLJJI;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.LJLJJL;
    }

    public boolean getUseCompatPadding() {
        return this.LJLJLLL;
    }

    public final void LIZJ(C80470Vi6 c80470Vi6) {
        C80475ViB impl = getImpl();
        if (impl.LJIILJJIL == null) {
            impl.LJIILJJIL = new ArrayList<>();
        }
        impl.LJIILJJIL.add(c80470Vi6);
    }

    public final int LJ(int i) {
        int i2 = this.LJLJLJ;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.ma);
            }
            return resources.getDimensionPixelSize(R.dimen.m_);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return LJ(1);
        }
        return LJ(0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mSuperState);
        extendableSavedState.extendableStates.getOrDefault("expandableWidgetHelper", null).getClass();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !C16330kX.LIZJ(this)) {
            return super.onTouchEvent(motionEvent);
        }
        getWidth();
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.LJLILLLLZI != colorStateList) {
            this.LJLILLLLZI = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.LJLJI != mode) {
            this.LJLJI = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        C80475ViB impl = getImpl();
        if (impl.LIZLLL != f) {
            impl.LIZLLL = f;
            impl.LJII(f, impl.LJ, impl.LJFF);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C80475ViB impl = getImpl();
        if (impl.LJ != f) {
            impl.LJ = f;
            impl.LJII(impl.LIZLLL, f, impl.LJFF);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C80475ViB impl = getImpl();
        if (impl.LJFF != f) {
            impl.LJFF = f;
            impl.LJII(impl.LIZLLL, impl.LJ, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.LJLJLJ) {
                this.LJLJLJ = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().LIZIZ) {
            getImpl().LIZIZ = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C80246VeU c80246VeU) {
        getImpl().LJIIJ = c80246VeU;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            C80475ViB impl = getImpl();
            impl.LJIIL = impl.LJIIL;
            Matrix matrix = impl.LJIJJ;
            matrix.reset();
            impl.LJIIZILJ.getDrawable();
            impl.LJIIZILJ.setImageMatrix(matrix);
            if (this.LJLJJI != null) {
                LJIIIIZZ();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.LJLJJLL != colorStateList) {
            this.LJLJJLL = colorStateList;
            getImpl().LJIIIZ();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<InterfaceC80490ViQ> arrayList = getImpl().LJIILLIIL;
        if (arrayList != null) {
            Iterator<InterfaceC80490ViQ> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<InterfaceC80490ViQ> arrayList = getImpl().LJIILLIIL;
        if (arrayList != null) {
            Iterator<InterfaceC80490ViQ> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z) {
        C80475ViB impl = getImpl();
        impl.LIZJ = z;
        impl.LJIIJJI();
        throw null;
    }

    @Override // X.InterfaceC80411Vh9
    public void setShapeAppearanceModel(C80416VhE c80416VhE) {
        getImpl().LIZ = c80416VhE;
    }

    public void setShowMotionSpec(C80246VeU c80246VeU) {
        getImpl().LJIIIZ = c80246VeU;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C80246VeU.LIZ(i, getContext()));
    }

    public void setSize(int i) {
        this.LJLJLJ = 0;
        if (i != this.LJLJL) {
            this.LJLJL = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.LJLJJI != colorStateList) {
            this.LJLJJI = colorStateList;
            LJIIIIZZ();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.LJLJJL != mode) {
            this.LJLJJL = mode;
            LJIIIIZZ();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().LJIIIIZZ();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().LJIIIIZZ();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().LJIIIIZZ();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.LJLJLLL != z) {
            this.LJLJLLL = z;
            getImpl().LJFF();
        }
    }

    @Override // X.C80366VgQ, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public final void LJFF(C80471Vi7 c80471Vi7, boolean z) {
        C80487ViN c80487ViN;
        int i;
        C80475ViB impl = getImpl();
        if (c80471Vi7 == null) {
            c80487ViN = null;
        } else {
            c80487ViN = new C80487ViN(this, c80471Vi7);
        }
        if (impl.LJIIZILJ.getVisibility() == 0) {
            if (impl.LJIILIIL == 1) {
                return;
            }
        } else if (impl.LJIILIIL != 2) {
            return;
        }
        Animator animator = impl.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        if (C16330kX.LIZJ(impl.LJIIZILJ) && !impl.LJIIZILJ.isInEditMode()) {
            C80246VeU c80246VeU = impl.LJIIJ;
            if (c80246VeU == null) {
                if (impl.LJII == null) {
                    impl.LJII = C80246VeU.LIZ(R.animator.b, impl.LJIIZILJ.getContext());
                }
                c80246VeU = impl.LJII;
                c80246VeU.getClass();
            }
            AnimatorSet LIZ = impl.LIZ(c80246VeU, 0.0f, 0.0f, 0.0f);
            LIZ.addListener(new C80477ViD(impl, z, c80487ViN));
            ArrayList<Animator.AnimatorListener> arrayList = impl.LJIILL;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    LIZ.addListener(it.next());
                }
            }
            LIZ.start();
            return;
        }
        C80474ViA c80474ViA = impl.LJIIZILJ;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        c80474ViA.LIZ(i, z);
        if (c80487ViN == null) {
            return;
        }
        c80487ViN.LIZ.LIZ(c80487ViN.LIZIZ);
    }

    public final void LJIIIZ(C80472Vi8 c80472Vi8, boolean z) {
        C80487ViN c80487ViN;
        C80475ViB impl = getImpl();
        if (c80472Vi8 == null) {
            c80487ViN = null;
        } else {
            c80487ViN = new C80487ViN(this, c80472Vi8);
        }
        boolean z2 = true;
        if (impl.LJIIZILJ.getVisibility() != 0) {
            if (impl.LJIILIIL == 2) {
                return;
            }
        } else if (impl.LJIILIIL != 1) {
            return;
        }
        Animator animator = impl.LJIIIIZZ;
        if (animator != null) {
            animator.cancel();
        }
        if (!C16330kX.LIZJ(impl.LJIIZILJ) || impl.LJIIZILJ.isInEditMode()) {
            z2 = false;
        }
        if (z2) {
            if (impl.LJIIZILJ.getVisibility() != 0) {
                impl.LJIIZILJ.setAlpha(0.0f);
                impl.LJIIZILJ.setScaleY(0.0f);
                impl.LJIIZILJ.setScaleX(0.0f);
                impl.LJIIL = 0.0f;
                Matrix matrix = impl.LJIJJ;
                matrix.reset();
                impl.LJIIZILJ.getDrawable();
                impl.LJIIZILJ.setImageMatrix(matrix);
            }
            C80246VeU c80246VeU = impl.LJIIIZ;
            if (c80246VeU == null) {
                if (impl.LJI == null) {
                    impl.LJI = C80246VeU.LIZ(R.animator.c, impl.LJIIZILJ.getContext());
                }
                c80246VeU = impl.LJI;
                c80246VeU.getClass();
            }
            AnimatorSet LIZ = impl.LIZ(c80246VeU, 1.0f, 1.0f, 1.0f);
            LIZ.addListener(new C80478ViE(impl, z, c80487ViN));
            ArrayList<Animator.AnimatorListener> arrayList = impl.LJIILJJIL;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    LIZ.addListener(it.next());
                }
            }
            LIZ.start();
            return;
        }
        impl.LJIIZILJ.LIZ(0, z);
        impl.LJIIZILJ.setAlpha(1.0f);
        impl.LJIIZILJ.setScaleY(1.0f);
        impl.LJIIZILJ.setScaleX(1.0f);
        impl.LJIIL = 1.0f;
        Matrix matrix2 = impl.LJIJJ;
        matrix2.reset();
        impl.LJIIZILJ.getDrawable();
        impl.LJIIZILJ.setImageMatrix(matrix2);
        if (c80487ViN == null) {
            return;
        }
        c80487ViN.LIZ.LIZIZ();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        getSizeDimension();
        getImpl().LJIIJJI();
        throw null;
    }
}
