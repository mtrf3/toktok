package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;

/* renamed from: X.VhB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80413VhB extends CardView implements Checkable, InterfaceC80411Vh9 {
    public static final int[] LJLLILLLL = {R.attr.state_checkable};
    public static final int[] LJLLJ = {R.attr.state_checked};
    public static final int[] LJLLL = {com.zhiliaoapp.musically.R.attr.beq};
    public final C80414VhC LJLJLJ;
    public final boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public void setOnCheckedChangeListener(InterfaceC80398Vgw interfaceC80398Vgw) {
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.LJLJLJ.LIZJ.getBounds());
        return rectF;
    }

    public final void LJ() {
        C80414VhC c80414VhC;
        Drawable drawable;
        if (Build.VERSION.SDK_INT > 26 && (drawable = (c80414VhC = this.LJLJLJ).LJIILIIL) != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            c80414VhC.LJIILIIL.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            c80414VhC.LJIILIIL.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.LJLJLJ.LIZJ.LJLIL.LIZJ;
    }

    public ColorStateList getCardForegroundColor() {
        return this.LJLJLJ.LIZLLL.LJLIL.LIZJ;
    }

    public Drawable getCheckedIcon() {
        return this.LJLJLJ.LJIIIIZZ;
    }

    public int getCheckedIconMargin() {
        return this.LJLJLJ.LJ;
    }

    public int getCheckedIconSize() {
        return this.LJLJLJ.LJFF;
    }

    public ColorStateList getCheckedIconTint() {
        return this.LJLJLJ.LJIIJ;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.LJLJLJ.LIZIZ.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.LJLJLJ.LIZIZ.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.LJLJLJ.LIZIZ.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.LJLJLJ.LIZIZ.top;
    }

    public float getProgress() {
        return this.LJLJLJ.LIZJ.LJLIL.LJIIIZ;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.LJLJLJ.LIZJ.LJII();
    }

    public ColorStateList getRippleColor() {
        return this.LJLJLJ.LJIIIZ;
    }

    public C80416VhE getShapeAppearanceModel() {
        return this.LJLJLJ.LJIIJJI;
    }

    public int getStrokeColor() {
        ColorStateList colorStateList = this.LJLJLJ.LJIIL;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.LJLJLJ.LJIIL;
    }

    public int getStrokeWidth() {
        return this.LJLJLJ.LJI;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C80414VhC c80414VhC = this.LJLJLJ;
        if (c80414VhC != null && c80414VhC.LJIIZILJ && isEnabled()) {
            this.LJLL = !this.LJLL;
            refreshDrawableState();
            LJ();
        }
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLJ(this, this.LJLJLJ.LIZJ);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.LJLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C80414VhC c80414VhC = this.LJLJLJ;
        if (c80414VhC != null && c80414VhC.LJIIZILJ) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, LJLLILLLL);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, LJLLJ);
        }
        if (this.LJLLI) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, LJLLL);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C80414VhC c80414VhC = this.LJLJLJ;
        if (c80414VhC != null && c80414VhC.LJIIZILJ) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.LJLJLLL) {
            C80414VhC c80414VhC = this.LJLJLJ;
            if (!c80414VhC.LJIILLIIL) {
                c80414VhC.LJIILLIIL = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LIZJ.LJIIJJI(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LIZJ.LJIIJ(c80414VhC.LIZ.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C80418VhG c80418VhG = this.LJLJLJ.LIZLLL;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c80418VhG.LJIIJJI(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.LJLJLJ.LJIIZILJ = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.LJLL != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.LJLJLJ.LJ(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.LJLJLJ.LJ = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.LJLJLJ.LJ = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.LJLJLJ.LJ(C20110qd.LIZ(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.LJLJLJ.LJFF = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.LJLJLJ.LJFF = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LJIIJ = colorStateList;
        Drawable drawable = c80414VhC.LJIIIIZZ;
        if (drawable != null) {
            C07820Sk.LJII(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        Drawable drawable;
        super.setClickable(z);
        C80414VhC c80414VhC = this.LJLJLJ;
        if (c80414VhC != null) {
            Drawable drawable2 = c80414VhC.LJII;
            if (c80414VhC.LIZ.isClickable()) {
                drawable = c80414VhC.LIZJ();
            } else {
                drawable = c80414VhC.LIZLLL;
            }
            c80414VhC.LJII = drawable;
            if (drawable2 != drawable) {
                if (Build.VERSION.SDK_INT >= 23 && (c80414VhC.LIZ.getForeground() instanceof InsetDrawable)) {
                    ((InsetDrawable) c80414VhC.LIZ.getForeground()).setDrawable(drawable);
                } else {
                    c80414VhC.LIZ.setForeground(c80414VhC.LIZLLL(drawable));
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.LJLLI != z) {
            this.LJLLI = z;
            refreshDrawableState();
            LJ();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.LJLJLJ.LJIIIIZZ();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.LJLJLJ.LJIIIIZZ();
        this.LJLJLJ.LJII();
    }

    public void setProgress(float f) {
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LIZJ.LJIIL(f);
        C80418VhG c80418VhG = c80414VhC.LIZLLL;
        if (c80418VhG != null) {
            c80418VhG.LJIIL(f);
        }
        C80418VhG c80418VhG2 = c80414VhC.LJIILL;
        if (c80418VhG2 != null) {
            c80418VhG2.LJIIL(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LJFF(c80414VhC.LJIIJJI.LJ(f));
        c80414VhC.LJII.invalidateSelf();
        if (c80414VhC.LJI() || (c80414VhC.LIZ.getPreventCornerOverlap() && !c80414VhC.LIZJ.LJIIIZ())) {
            c80414VhC.LJII();
        }
        if (c80414VhC.LJI()) {
            c80414VhC.LJIIIIZZ();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LJIIIZ = colorStateList;
        Drawable drawable = c80414VhC.LJIILIIL;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C80414VhC c80414VhC = this.LJLJLJ;
        ColorStateList LIZJ = C04330Ez.LIZJ(i, getContext());
        c80414VhC.LJIIIZ = LIZJ;
        Drawable drawable = c80414VhC.LJIILIIL;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(LIZJ);
        }
    }

    @Override // X.InterfaceC80411Vh9
    public void setShapeAppearanceModel(C80416VhE c80416VhE) {
        setClipToOutline(c80416VhE.LIZLLL(getBoundsAsRectF()));
        this.LJLJLJ.LJFF(c80416VhE);
    }

    public void setStrokeColor(int i) {
        C80414VhC c80414VhC = this.LJLJLJ;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (c80414VhC.LJIIL == valueOf) {
            return;
        }
        c80414VhC.LJIIL = valueOf;
        C80418VhG c80418VhG = c80414VhC.LIZLLL;
        c80418VhG.LJLIL.LJIIJ = c80414VhC.LJI;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL == valueOf) {
            return;
        }
        c80421VhJ.LIZLLL = valueOf;
        c80418VhG.onStateChange(c80418VhG.getState());
    }

    public void setStrokeWidth(int i) {
        C80414VhC c80414VhC = this.LJLJLJ;
        if (i == c80414VhC.LJI) {
            return;
        }
        c80414VhC.LJI = i;
        C80418VhG c80418VhG = c80414VhC.LIZLLL;
        ColorStateList colorStateList = c80414VhC.LJIIL;
        c80418VhG.LJLIL.LJIIJ = i;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL == colorStateList) {
            return;
        }
        c80421VhJ.LIZLLL = colorStateList;
        c80418VhG.onStateChange(c80418VhG.getState());
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.LJLJLJ.LJIIIIZZ();
        this.LJLJLJ.LJII();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.LJLJLJ.LIZJ.LJIIJJI(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C80414VhC c80414VhC = this.LJLJLJ;
        if (c80414VhC.LJIIL == colorStateList) {
            return;
        }
        c80414VhC.LJIIL = colorStateList;
        C80418VhG c80418VhG = c80414VhC.LIZLLL;
        c80418VhG.LJLIL.LJIIJ = c80414VhC.LJI;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL == colorStateList) {
            return;
        }
        c80421VhJ.LIZLLL = colorStateList;
        c80418VhG.onStateChange(c80418VhG.getState());
    }

    public C80413VhB(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.b01, com.zhiliaoapp.musically.R.style.a08), attributeSet, com.zhiliaoapp.musically.R.attr.b01);
        Drawable drawable;
        this.LJLL = false;
        this.LJLLI = false;
        this.LJLJLLL = true;
        TypedArray LIZLLL = C80244VeS.LIZLLL(getContext(), attributeSet, new int[]{R.attr.checkable, com.zhiliaoapp.musically.R.attr.a1k, com.zhiliaoapp.musically.R.attr.a1y, com.zhiliaoapp.musically.R.attr.a20, com.zhiliaoapp.musically.R.attr.a21, com.zhiliaoapp.musically.R.attr.a22, com.zhiliaoapp.musically.R.attr.b8b, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8, com.zhiliaoapp.musically.R.attr.beq, com.zhiliaoapp.musically.R.attr.bf6, com.zhiliaoapp.musically.R.attr.bf9}, com.zhiliaoapp.musically.R.attr.b01, com.zhiliaoapp.musically.R.style.a08, new int[0]);
        C80414VhC c80414VhC = new C80414VhC(this, attributeSet);
        this.LJLJLJ = c80414VhC;
        c80414VhC.LIZJ.LJIIJJI(super.getCardBackgroundColor());
        c80414VhC.LIZIZ.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c80414VhC.LJII();
        ColorStateList LIZ = C80285Vf7.LIZ(c80414VhC.LIZ.getContext(), LIZLLL, 10);
        c80414VhC.LJIIL = LIZ;
        if (LIZ == null) {
            c80414VhC.LJIIL = ColorStateList.valueOf(-1);
        }
        c80414VhC.LJI = LIZLLL.getDimensionPixelSize(11, 0);
        boolean z = LIZLLL.getBoolean(0, false);
        c80414VhC.LJIIZILJ = z;
        c80414VhC.LIZ.setLongClickable(z);
        c80414VhC.LJIIJ = C80285Vf7.LIZ(c80414VhC.LIZ.getContext(), LIZLLL, 5);
        c80414VhC.LJ(C80285Vf7.LIZLLL(c80414VhC.LIZ.getContext(), LIZLLL, 2));
        c80414VhC.LJFF = LIZLLL.getDimensionPixelSize(4, 0);
        c80414VhC.LJ = LIZLLL.getDimensionPixelSize(3, 0);
        ColorStateList LIZ2 = C80285Vf7.LIZ(c80414VhC.LIZ.getContext(), LIZLLL, 6);
        c80414VhC.LJIIIZ = LIZ2;
        if (LIZ2 == null) {
            c80414VhC.LJIIIZ = ColorStateList.valueOf(C78966Uyw.LJJIII(com.zhiliaoapp.musically.R.attr.a4i, c80414VhC.LIZ));
        }
        ColorStateList LIZ3 = C80285Vf7.LIZ(c80414VhC.LIZ.getContext(), LIZLLL, 1);
        c80414VhC.LIZLLL.LJIIJJI(LIZ3 == null ? ColorStateList.valueOf(0) : LIZ3);
        Drawable drawable2 = c80414VhC.LJIILIIL;
        if (drawable2 != null) {
            ((RippleDrawable) drawable2).setColor(c80414VhC.LJIIIZ);
        }
        c80414VhC.LIZJ.LJIIJ(c80414VhC.LIZ.getCardElevation());
        C80418VhG c80418VhG = c80414VhC.LIZLLL;
        float f = c80414VhC.LJI;
        ColorStateList colorStateList = c80414VhC.LJIIL;
        c80418VhG.LJLIL.LJIIJ = f;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL != colorStateList) {
            c80421VhJ.LIZLLL = colorStateList;
            c80418VhG.onStateChange(c80418VhG.getState());
        }
        c80414VhC.LIZ.setBackgroundInternal(c80414VhC.LIZLLL(c80414VhC.LIZJ));
        if (c80414VhC.LIZ.isClickable()) {
            drawable = c80414VhC.LIZJ();
        } else {
            drawable = c80414VhC.LIZLLL;
        }
        c80414VhC.LJII = drawable;
        c80414VhC.LIZ.setForeground(c80414VhC.LIZLLL(drawable));
        LIZLLL.recycle();
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        super.onMeasure(i, i2);
        C80414VhC c80414VhC = this.LJLJLJ;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (c80414VhC.LJIILJJIL != null) {
            int i4 = c80414VhC.LJ;
            int i5 = c80414VhC.LJFF;
            int i6 = (measuredWidth - i4) - i5;
            int i7 = (measuredHeight - i4) - i5;
            if (c80414VhC.LIZ.getUseCompatPadding()) {
                float maxCardElevation = c80414VhC.LIZ.getMaxCardElevation() * 1.5f;
                float f2 = 0.0f;
                if (c80414VhC.LJI()) {
                    f = c80414VhC.LIZ();
                } else {
                    f = 0.0f;
                }
                i7 -= (int) Math.ceil((maxCardElevation + f) * 2.0f);
                float maxCardElevation2 = c80414VhC.LIZ.getMaxCardElevation();
                if (c80414VhC.LJI()) {
                    f2 = c80414VhC.LIZ();
                }
                i6 -= (int) Math.ceil((maxCardElevation2 + f2) * 2.0f);
            }
            int i8 = c80414VhC.LJ;
            if (C16310kV.LIZLLL(c80414VhC.LIZ) == 1) {
                i3 = i8;
            } else {
                i3 = i6;
                i6 = i8;
            }
            c80414VhC.LJIILJJIL.setLayerInset(2, i3, c80414VhC.LJ, i6, i7);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void LIZLLL(int i, int i2, int i3, int i4) {
        C80414VhC c80414VhC = this.LJLJLJ;
        c80414VhC.LIZIZ.set(0, 0, 0, 0);
        c80414VhC.LJII();
    }

    public final void LJFF(int i, int i2, int i3, int i4) {
        super.LIZLLL(i, i2, i3, i4);
    }
}
