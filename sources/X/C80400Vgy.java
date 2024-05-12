package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.material.button.MaterialButton$SavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Vgy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80400Vgy extends C19F implements Checkable, InterfaceC80411Vh9 {
    public static final int[] LJLZ = {R.attr.state_checkable};
    public static final int[] LJZ = {R.attr.state_checked};
    public final C80402Vh0 LJLJJI;
    public final LinkedHashSet<InterfaceC80409Vh7> LJLJJL;
    public InterfaceC80412VhA LJLJJLL;
    public PorterDuff.Mode LJLJL;
    public ColorStateList LJLJLJ;
    public Drawable LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;

    private String getA11yClassName() {
        Class cls;
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        if (c80402Vh0 != null && c80402Vh0.LJIILLIIL) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public final boolean LIZ() {
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        if (c80402Vh0 != null && !c80402Vh0.LJIILJJIL) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        boolean z;
        int i = this.LJLLLLLL;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C07Z.LJ(this, this.LJLJLLL, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            C07Z.LJ(this, null, null, this.LJLJLLL, null);
        } else {
            if (i != 16 && i != 32) {
                return;
            }
            C07Z.LJ(this, null, this.LJLJLLL, null, null);
        }
    }

    public int getInsetBottom() {
        return this.LJLJJI.LJFF;
    }

    public int getInsetTop() {
        return this.LJLJJI.LJ;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.LJLLL);
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (LIZ()) {
            return this.LJLJJI.LJI;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (LIZ()) {
            return this.LJLJJI.LJIIJJI;
        }
        return null;
    }

    public C80416VhE getShapeAppearanceModel() {
        if (LIZ()) {
            return this.LJLJJI.LIZIZ;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (LIZ()) {
            return this.LJLJJI.LJIIJ;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (LIZ()) {
            return this.LJLJJI.LJII;
        }
        return 0;
    }

    @Override // X.C19F
    public ColorStateList getSupportBackgroundTintList() {
        if (LIZ()) {
            return this.LJLJJI.LJIIIZ;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // X.C19F
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (LIZ()) {
            return this.LJLJJI.LJIIIIZZ;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LIZ()) {
            V1B.LJLLJ(this, this.LJLJJI.LIZIZ(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(super.onSaveInstanceState());
        materialButton$SavedState.LJLIL = this.LJLLL;
        return materialButton$SavedState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public Drawable getIcon() {
        return this.LJLJLLL;
    }

    public int getIconGravity() {
        return this.LJLLLLLL;
    }

    public int getIconPadding() {
        return this.LJLLJ;
    }

    public int getIconSize() {
        return this.LJLL;
    }

    public ColorStateList getIconTint() {
        return this.LJLJLJ;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.LJLJL;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LJLLL;
    }

    private void LIZJ(boolean z) {
        Drawable drawable = this.LJLJLLL;
        if (drawable != null) {
            Drawable mutate = C07840Sm.LJFF(drawable).mutate();
            this.LJLJLLL = mutate;
            C07820Sk.LJII(mutate, this.LJLJLJ);
            PorterDuff.Mode mode = this.LJLJL;
            if (mode != null) {
                C07820Sk.LJIIIIZZ(this.LJLJLLL, mode);
            }
            int i = this.LJLL;
            if (i == 0) {
                i = this.LJLJLLL.getIntrinsicWidth();
            }
            int i2 = this.LJLL;
            if (i2 == 0) {
                i2 = this.LJLJLLL.getIntrinsicHeight();
            }
            Drawable drawable2 = this.LJLJLLL;
            int i3 = this.LJLLI;
            int i4 = this.LJLLILLLL;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            LIZIZ();
            return;
        }
        Drawable[] LIZ = C07Z.LIZ(this);
        Drawable drawable3 = LIZ[0];
        Drawable drawable4 = LIZ[1];
        Drawable drawable5 = LIZ[2];
        int i5 = this.LJLLLLLL;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.LJLJLLL) || (((i5 == 3 || i5 == 4) && drawable5 != this.LJLJLLL) || ((i5 == 16 || i5 == 32) && drawable4 != this.LJLJLLL))) {
            LIZIZ();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        if (c80402Vh0 != null && c80402Vh0.LJIILLIIL) {
            Button.mergeDrawableStates(onCreateDrawableState, LJLZ);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, LJZ);
        }
        return onCreateDrawableState;
    }

    @Override // X.C19F, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // X.C19F, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        if (c80402Vh0 != null && c80402Vh0.LJIILLIIL) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MaterialButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MaterialButton$SavedState materialButton$SavedState = (MaterialButton$SavedState) parcelable;
        super.onRestoreInstanceState(materialButton$SavedState.mSuperState);
        setChecked(materialButton$SavedState.LJLIL);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LIZIZ(false) != null) {
                c80402Vh0.LIZIZ(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // X.C19F, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (LIZ()) {
            if (drawable != getBackground()) {
                C80402Vh0 c80402Vh0 = this.LJLJJI;
                c80402Vh0.LJIILJJIL = true;
                c80402Vh0.LIZ.setSupportBackgroundTintList(c80402Vh0.LJIIIZ);
                c80402Vh0.LIZ.setSupportBackgroundTintMode(c80402Vh0.LJIIIIZZ);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // X.C19F, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (LIZ()) {
            this.LJLJJI.LJIILLIIL = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        if (c80402Vh0 != null && c80402Vh0.LJIILLIIL && isEnabled() && this.LJLLL != z) {
            this.LJLLL = z;
            refreshDrawableState();
            if (this.LJLLLL) {
                return;
            }
            this.LJLLLL = true;
            Iterator<InterfaceC80409Vh7> it = this.LJLJJL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(this, this.LJLLL);
            }
            this.LJLLLL = false;
        }
    }

    public void setCornerRadius(int i) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (!c80402Vh0.LJIILL || c80402Vh0.LJI != i) {
                c80402Vh0.LJI = i;
                c80402Vh0.LJIILL = true;
                c80402Vh0.LIZJ(c80402Vh0.LIZIZ.LJ(i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (LIZ()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (LIZ()) {
            this.LJLJJI.LIZIZ(false).LJIIJ(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.LJLJLLL != drawable) {
            this.LJLJLLL = drawable;
            LIZJ(true);
            LIZLLL(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.LJLLLLLL != i) {
            this.LJLLLLLL = i;
            LIZLLL(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.LJLLJ != i) {
            this.LJLLJ = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.LJLL != i) {
                this.LJLL = i;
                LIZJ(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.LJLJLJ != colorStateList) {
            this.LJLJLJ = colorStateList;
            LIZJ(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.LJLJL != mode) {
            this.LJLJL = mode;
            LIZJ(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C04330Ez.LIZJ(i, getContext()));
    }

    public void setInsetBottom(int i) {
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        c80402Vh0.LIZLLL(c80402Vh0.LJ, i);
    }

    public void setInsetTop(int i) {
        C80402Vh0 c80402Vh0 = this.LJLJJI;
        c80402Vh0.LIZLLL(i, c80402Vh0.LJFF);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC80412VhA interfaceC80412VhA) {
        this.LJLJJLL = interfaceC80412VhA;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC80412VhA interfaceC80412VhA = this.LJLJJLL;
        if (interfaceC80412VhA != null) {
            ((C80408Vh6) interfaceC80412VhA).LIZ.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LJIIJJI != colorStateList) {
                c80402Vh0.LJIIJJI = colorStateList;
                if (c80402Vh0.LIZ.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) c80402Vh0.LIZ.getBackground()).setColor(C80270Ves.LIZJ(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (LIZ()) {
            setRippleColor(C04330Ez.LIZJ(i, getContext()));
        }
    }

    @Override // X.InterfaceC80411Vh9
    public void setShapeAppearanceModel(C80416VhE c80416VhE) {
        if (LIZ()) {
            this.LJLJJI.LIZJ(c80416VhE);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            c80402Vh0.LJIILIIL = z;
            c80402Vh0.LJFF();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LJIIJ != colorStateList) {
                c80402Vh0.LJIIJ = colorStateList;
                c80402Vh0.LJFF();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (LIZ()) {
            setStrokeColor(C04330Ez.LIZJ(i, getContext()));
        }
    }

    public void setStrokeWidth(int i) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LJII != i) {
                c80402Vh0.LJII = i;
                c80402Vh0.LJFF();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (LIZ()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // X.C19F
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LJIIIZ != colorStateList) {
                c80402Vh0.LJIIIZ = colorStateList;
                if (c80402Vh0.LIZIZ(false) != null) {
                    C07820Sk.LJII(c80402Vh0.LIZIZ(false), c80402Vh0.LJIIIZ);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // X.C19F
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (LIZ()) {
            C80402Vh0 c80402Vh0 = this.LJLJJI;
            if (c80402Vh0.LJIIIIZZ != mode) {
                c80402Vh0.LJIIIIZZ = mode;
                if (c80402Vh0.LIZIZ(false) != null && c80402Vh0.LJIIIIZZ != null) {
                    C07820Sk.LJIIIIZZ(c80402Vh0.LIZIZ(false), c80402Vh0.LJIIIIZZ);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public C80400Vgy(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.azl, com.zhiliaoapp.musically.R.style.zw), attributeSet, com.zhiliaoapp.musically.R.attr.azl);
        this.LJLJJL = new LinkedHashSet<>();
        this.LJLLL = false;
        this.LJLLLL = false;
        Context context2 = getContext();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{R.attr.background, R.attr.insetLeft, R.attr.insetRight, R.attr.insetTop, R.attr.insetBottom, R.attr.checkable, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.xl, com.zhiliaoapp.musically.R.attr.a7o, com.zhiliaoapp.musically.R.attr.ab6, com.zhiliaoapp.musically.R.attr.ag7, com.zhiliaoapp.musically.R.attr.agc, com.zhiliaoapp.musically.R.attr.agf, com.zhiliaoapp.musically.R.attr.agk, com.zhiliaoapp.musically.R.attr.ago, com.zhiliaoapp.musically.R.attr.agp, com.zhiliaoapp.musically.R.attr.b8b, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8, com.zhiliaoapp.musically.R.attr.bf6, com.zhiliaoapp.musically.R.attr.bf9}, com.zhiliaoapp.musically.R.attr.azl, com.zhiliaoapp.musically.R.style.zw, new int[0]);
        this.LJLLJ = LIZLLL.getDimensionPixelSize(12, 0);
        this.LJLJL = C80250VeY.LIZLLL(LIZLLL.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.LJLJLJ = C80285Vf7.LIZ(getContext(), LIZLLL, 14);
        this.LJLJLLL = C80285Vf7.LIZLLL(getContext(), LIZLLL, 10);
        this.LJLLLLLL = LIZLLL.getInteger(11, 1);
        this.LJLL = LIZLLL.getDimensionPixelSize(13, 0);
        C80402Vh0 c80402Vh0 = new C80402Vh0(this, new C80416VhE(C80416VhE.LIZIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.azl, com.zhiliaoapp.musically.R.style.zw)));
        this.LJLJJI = c80402Vh0;
        c80402Vh0.LIZJ = LIZLLL.getDimensionPixelOffset(1, 0);
        c80402Vh0.LIZLLL = LIZLLL.getDimensionPixelOffset(2, 0);
        c80402Vh0.LJ = LIZLLL.getDimensionPixelOffset(3, 0);
        c80402Vh0.LJFF = LIZLLL.getDimensionPixelOffset(4, 0);
        if (LIZLLL.hasValue(8)) {
            int dimensionPixelSize = LIZLLL.getDimensionPixelSize(8, -1);
            c80402Vh0.LJI = dimensionPixelSize;
            c80402Vh0.LIZJ(c80402Vh0.LIZIZ.LJ(dimensionPixelSize));
            c80402Vh0.LJIILL = true;
        }
        c80402Vh0.LJII = LIZLLL.getDimensionPixelSize(20, 0);
        c80402Vh0.LJIIIIZZ = C80250VeY.LIZLLL(LIZLLL.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c80402Vh0.LJIIIZ = C80285Vf7.LIZ(getContext(), LIZLLL, 6);
        c80402Vh0.LJIIJ = C80285Vf7.LIZ(getContext(), LIZLLL, 19);
        c80402Vh0.LJIIJJI = C80285Vf7.LIZ(getContext(), LIZLLL, 16);
        c80402Vh0.LJIILLIIL = LIZLLL.getBoolean(5, false);
        c80402Vh0.LJIJ = LIZLLL.getDimensionPixelSize(9, 0);
        int LJFF = C16310kV.LJFF(this);
        int paddingTop = getPaddingTop();
        int LJ = C16310kV.LJ(this);
        int paddingBottom = getPaddingBottom();
        if (LIZLLL.hasValue(0)) {
            c80402Vh0.LJIILJJIL = true;
            setSupportBackgroundTintList(c80402Vh0.LJIIIZ);
            setSupportBackgroundTintMode(c80402Vh0.LJIIIIZZ);
        } else {
            c80402Vh0.LJ();
        }
        C16310kV.LJIIJ(this, LJFF + c80402Vh0.LIZJ, paddingTop + c80402Vh0.LJ, LJ + c80402Vh0.LIZLLL, paddingBottom + c80402Vh0.LJFF);
        LIZLLL.recycle();
        setCompoundDrawablePadding(this.LJLLJ);
        LIZJ(this.LJLJLLL != null);
    }

    public final void LIZLLL(int i, int i2) {
        boolean z;
        boolean z2;
        if (this.LJLJLLL == null || getLayout() == null) {
            return;
        }
        int i3 = this.LJLLLLLL;
        boolean z3 = true;
        if (i3 == 1 || i3 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z || i3 == 3 || i3 == 4) {
            this.LJLLILLLL = 0;
            if (i3 == 1 || i3 == 3) {
                this.LJLLI = 0;
                LIZJ(false);
                return;
            }
            int i4 = this.LJLL;
            if (i4 == 0) {
                i4 = this.LJLJLLL.getIntrinsicWidth();
            }
            int textWidth = (((((i - getTextWidth()) - C16310kV.LJ(this)) - i4) - this.LJLLJ) - C16310kV.LJFF(this)) / 2;
            if (C16310kV.LIZLLL(this) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJLLLLLL != 4) {
                z3 = false;
            }
            if (z2 != z3) {
                textWidth = -textWidth;
            }
            if (this.LJLLI != textWidth) {
                this.LJLLI = textWidth;
                LIZJ(false);
                return;
            }
            return;
        }
        if (i3 == 16 || i3 == 32) {
            this.LJLLI = 0;
            if (i3 == 16) {
                this.LJLLILLLL = 0;
                LIZJ(false);
                return;
            }
            int i5 = this.LJLL;
            if (i5 == 0) {
                i5 = this.LJLJLLL.getIntrinsicHeight();
            }
            int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.LJLLJ) - getPaddingBottom()) / 2;
            if (this.LJLLILLLL != textHeight) {
                this.LJLLILLLL = textHeight;
                LIZJ(false);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZLLL(i, i2);
    }

    @Override // X.C19F, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        LIZLLL(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // X.C19F, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C80402Vh0 c80402Vh0;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (c80402Vh0 = this.LJLJJI) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            C80418VhG c80418VhG = c80402Vh0.LJIIL;
            if (c80418VhG != null) {
                c80418VhG.setBounds(c80402Vh0.LIZJ, c80402Vh0.LJ, i6 - c80402Vh0.LIZLLL, i5 - c80402Vh0.LJFF);
            }
        }
    }
}
