package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o3.h0;

/* renamed from: X.Vha, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80438Vha extends C02Y implements InterfaceC80444Vhg, InterfaceC80411Vh9 {
    public static final Rect LL = new Rect();
    public static final int[] LLD = {R.attr.state_selected};
    public static final int[] LLF = {R.attr.state_checkable};
    public C80437VhZ LJLJJL;
    public InsetDrawable LJLJJLL;
    public RippleDrawable LJLJL;
    public View.OnClickListener LJLJLJ;
    public CompoundButton.OnCheckedChangeListener LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final C80439Vhb LJLZ;
    public final Rect LJZ;
    public final RectF LJZI;
    public final C80442Vhe LJZL;

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // X.C02Y, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    private C80229VeD getTextAppearance() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLJJIJI.LJFF;
        }
        return null;
    }

    @Override // X.InterfaceC80444Vhg
    public final void LIZ() {
        LIZIZ(this.LJLLLLLL);
        requestLayout();
        invalidateOutline();
    }

    public final boolean LIZJ() {
        Object obj;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && (obj = c80437VhZ.LLIIL) != null && (!(obj instanceof InterfaceC07870Sp) || ((InterfaceC07870Sp) obj).LIZIZ() != null)) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLILII) {
            return true;
        }
        return false;
    }

    public final void LJFF() {
        this.LJLJL = new RippleDrawable(C80270Ves.LIZJ(this.LJLJJL.LLII), getBackgroundDrawable(), null);
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ.LLJLLL) {
            c80437VhZ.LLJLLL = false;
            c80437VhZ.LLJZ = null;
            c80437VhZ.onStateChange(c80437VhZ.getState());
        }
        C16300kU.LJIILLIIL(this, this.LJLJL);
        LJI();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.LJLJJLL;
        if (insetDrawable == null) {
            return this.LJLJJL;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILL;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILLIZIL;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLFFF;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ == null) {
            return 0.0f;
        }
        return Math.max(0.0f, c80437VhZ.LJIJJLI());
    }

    public float getChipEndPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLJIJIL;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ == null || (drawable = c80437VhZ.LLIIIJ) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC07870Sp;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((InterfaceC07870Sp) drawable).LIZIZ();
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIIIZ;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIIIL;
        }
        return null;
    }

    public float getChipMinHeight() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLFII;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILZ;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLI;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIFFJFJJ;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ == null || (drawable = c80437VhZ.LLIIL) == 0) {
            return null;
        }
        boolean z = drawable instanceof InterfaceC07870Sp;
        Drawable drawable2 = drawable;
        if (z) {
            drawable2 = ((InterfaceC07870Sp) drawable).LIZIZ();
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIL;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLJI;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIIZ;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLJ;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIILZL;
        }
        return null;
    }

    public RectF getCloseIconTouchBounds() {
        this.LJZI.setEmpty();
        if (LIZJ() && this.LJLJLJ != null) {
            C80437VhZ c80437VhZ = this.LJLJJL;
            RectF rectF = this.LJZI;
            Rect bounds = c80437VhZ.getBounds();
            rectF.setEmpty();
            if (c80437VhZ.LJJJJL()) {
                float f = c80437VhZ.LLJIJIL + c80437VhZ.LLJI + c80437VhZ.LLIIZ + c80437VhZ.LLJ + c80437VhZ.LLIZLLLIL;
                if (C07840Sm.LIZIZ(c80437VhZ) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return this.LJZI;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLL;
        }
        return null;
    }

    public C80246VeU getHideMotionSpec() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILLL;
        }
        return null;
    }

    public float getIconEndPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILZLL;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILZIL;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLII;
        }
        return null;
    }

    public C80416VhE getShapeAppearanceModel() {
        return this.LJLJJL.LJLIL.LIZ;
    }

    public C80246VeU getShowMotionSpec() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLILLJJLI;
        }
        return null;
    }

    public float getTextEndPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIZLLLIL;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            return c80437VhZ.LLIZ;
        }
        return 0.0f;
    }

    public final void LJ() {
        C80437VhZ c80437VhZ;
        if (LIZJ() && (c80437VhZ = this.LJLJJL) != null && c80437VhZ.LLIIJLIL && this.LJLJLJ != null) {
            h0.LJIJI(this, this.LJLZ);
        } else {
            h0.LJIJI(this, null);
        }
    }

    public final void LJI() {
        C80437VhZ c80437VhZ;
        if (TextUtils.isEmpty(getText()) || (c80437VhZ = this.LJLJJL) == null) {
            return;
        }
        int LJIJJ = (int) (c80437VhZ.LJIJJ() + c80437VhZ.LLJIJIL + c80437VhZ.LLIZLLLIL);
        C80437VhZ c80437VhZ2 = this.LJLJJL;
        int LJIJI = (int) (c80437VhZ2.LJIJI() + c80437VhZ2.LLILZ + c80437VhZ2.LLIZ);
        if (this.LJLJJLL != null) {
            Rect rect = new Rect();
            this.LJLJJLL.getPadding(rect);
            LJIJI += rect.left;
            LJIJJ += rect.right;
        }
        C16310kV.LJIIJ(this, LJIJI, getPaddingTop(), LJIJJ, getPaddingBottom());
    }

    public final void LJII() {
        TextPaint paint = getPaint();
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            paint.drawableState = c80437VhZ.getState();
        }
        C80229VeD textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.LIZJ(getContext(), paint, this.LJZL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // X.C02Y, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && C80437VhZ.LJJ(c80437VhZ.LLIIL)) {
            C80437VhZ c80437VhZ2 = this.LJLJJL;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.LJLLJ) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.LJLLILLLL) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.LJLLI) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.LJLLJ) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.LJLLILLLL) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.LJLLI) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c80437VhZ2.LLJLLIL, iArr)) {
                c80437VhZ2.LLJLLIL = iArr;
                if (c80437VhZ2.LJJJJL() && c80437VhZ2.LJJIFFI(c80437VhZ2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    public CharSequence getChipText() {
        return getText();
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.LJZ.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.LJZ;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLJ(this, this.LJLJJL);
    }

    public Drawable getChipDrawable() {
        return this.LJLJJL;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.LJLLILLLL != z) {
            this.LJLLILLLL = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.LJLLI != z) {
            this.LJLLI = z;
            refreshDrawableState();
        }
    }

    public final void LIZIZ(int i) {
        int i2;
        this.LJLLLLLL = i;
        int i3 = 0;
        if (!this.LJLLL) {
            if (this.LJLJJLL != null) {
                this.LJLJJLL = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                LJFF();
                return;
            }
            LJFF();
            return;
        }
        int max = Math.max(0, i - ((int) this.LJLJJL.LLFII));
        int max2 = Math.max(0, i - this.LJLJJL.getIntrinsicWidth());
        if (max2 <= 0) {
            if (max <= 0) {
                if (this.LJLJJLL != null) {
                    this.LJLJJLL = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    LJFF();
                    return;
                }
                LJFF();
                return;
            }
            i2 = 0;
        } else {
            i2 = max2 / 2;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        if (this.LJLJJLL != null) {
            Rect rect = new Rect();
            this.LJLJJLL.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                LJFF();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.LJLJJLL = new InsetDrawable((Drawable) this.LJLJJL, i2, i3, i2, i3);
        LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r0 != Integer.MIN_VALUE) goto L13;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 10
            r7 = 0
            r6 = 1
            if (r0 != r5) goto L44
            java.lang.Class<X.1fc> r1 = X.AbstractC38761fc.class
            java.lang.String r0 = "LJIIIZ"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L44
            r1.setAccessible(r6)     // Catch: java.lang.Throwable -> L44
            X.Vhb r0 = r8.LJLZ     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L44
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L44
            if (r0 == r3) goto L44
            java.lang.Class<X.1fc> r4 = X.AbstractC38761fc.class
            java.lang.String r2 = "LJIIJJI"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L44
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L44
            r1[r7] = r0     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L44
            r4.setAccessible(r6)     // Catch: java.lang.Throwable -> L44
            X.Vhb r2 = r8.LJLZ     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L44
            r1[r7] = r0     // Catch: java.lang.Throwable -> L44
            r4.invoke(r2, r1)     // Catch: java.lang.Throwable -> L44
            goto L5c
        L44:
            X.Vhb r2 = r8.LJLZ
            android.view.accessibility.AccessibilityManager r0 = r2.LJ
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L56
            android.view.accessibility.AccessibilityManager r0 = r2.LJ
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L5e
        L56:
            boolean r0 = super.dispatchHoverEvent(r9)
            if (r0 == 0) goto L5d
        L5c:
            r7 = 1
        L5d:
            return r7
        L5e:
            int r1 = r9.getAction()
            r0 = 7
            if (r1 == r0) goto L74
            r0 = 9
            if (r1 == r0) goto L74
            if (r1 == r5) goto L6c
            goto L56
        L6c:
            int r0 = r2.LJIIIZ
            if (r0 == r3) goto L56
            r2.LJIIJJI(r3)
            goto L5c
        L74:
            float r1 = r9.getX()
            float r0 = r9.getY()
            int r0 = r2.LJIIL(r1, r0)
            r2.LJIIJJI(r0)
            if (r0 == r3) goto L56
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80438Vha.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r1 == false) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001c. Please report as an issue. */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            X.Vhb r5 = r9.LJLZ
            r5.getClass()
            int r0 = r10.getAction()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            r3 = 1
            if (r0 == r3) goto L1f
            int r1 = r10.getKeyCode()
            r0 = 61
            r6 = 0
            if (r1 == r0) goto L51
            r7 = 66
            if (r1 == r7) goto L6a
            switch(r1) {
                case 19: goto L24;
                case 20: goto L24;
                case 21: goto L24;
                case 22: goto L24;
                case 23: goto L6a;
                default: goto L1f;
            }
        L1f:
            boolean r0 = super.dispatchKeyEvent(r10)
            return r0
        L24:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L1f
            r0 = 19
            if (r1 == r0) goto L4e
            r0 = 21
            if (r1 == r0) goto L4b
            r0 = 22
            if (r1 == r0) goto L38
            r7 = 130(0x82, float:1.82E-43)
        L38:
            int r0 = r10.getRepeatCount()
            int r2 = r0 + 1
            r1 = 0
        L3f:
            if (r8 >= r2) goto L5c
            boolean r0 = r5.LIZLLL(r7, r6)
            if (r0 == 0) goto L5c
            int r8 = r8 + 1
            r1 = 1
            goto L3f
        L4b:
            r7 = 17
            goto L38
        L4e:
            r7 = 33
            goto L38
        L51:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L5f
            r0 = 2
            boolean r1 = r5.LIZLLL(r0, r6)
        L5c:
            if (r1 == 0) goto L1f
            goto L7f
        L5f:
            boolean r0 = r10.hasModifiers(r3)
            if (r0 == 0) goto L1f
            boolean r1 = r5.LIZLLL(r3, r6)
            goto L5c
        L6a:
            boolean r0 = r10.hasNoModifiers()
            if (r0 == 0) goto L1f
            int r0 = r10.getRepeatCount()
            if (r0 != 0) goto L1f
            int r1 = r5.LJIIIIZZ
            if (r1 == r4) goto L7f
            r0 = 16
            r5.LJFF(r1, r0)
        L7f:
            X.Vhb r0 = r9.LJLZ
            int r0 = r0.LJIIIIZZ
            if (r0 == r4) goto L1f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80438Vha.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        C80439Vhb c80439Vhb = this.LJLZ;
        if (c80439Vhb.LJIIIIZZ == 1 || c80439Vhb.LJII == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, LLD);
        }
        if (LIZLLL()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, LLF);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (LIZLLL() || isClickable()) {
            if (LIZLLL()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(LIZLLL());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C80445Vhh) {
            C72866Sik c72866Sik = (C72866Sik) getParent();
            C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
            int i2 = -1;
            if (c72866Sik.LJLJI) {
                i = 0;
                for (int i3 = 0; i3 < c72866Sik.getChildCount(); i3++) {
                    if (c72866Sik.getChildAt(i3) instanceof C80438Vha) {
                        if (c72866Sik.getChildAt(i3) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(com.zhiliaoapp.musically.R.id.j8i);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            c17760mq.LJIIZILJ(C17740mo.LIZ(i2, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.LJLLLL != i) {
            this.LJLLLL = i;
            LJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r4 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            android.graphics.RectF r2 = r5.getCloseIconTouchBounds()
            float r1 = r6.getX()
            float r0 = r6.getY()
            boolean r3 = r2.contains(r1, r0)
            r2 = 1
            r1 = 0
            if (r4 == 0) goto L4f
            if (r4 == r2) goto L33
            r0 = 2
            if (r4 == r0) goto L29
            r0 = 3
            if (r4 == r0) goto L4d
        L20:
            boolean r0 = super.onTouchEvent(r6)
            if (r0 == 0) goto L27
        L26:
            return r2
        L27:
            r2 = 0
            goto L26
        L29:
            boolean r0 = r5.LJLLI
            if (r0 == 0) goto L20
            if (r3 != 0) goto L26
            r5.setCloseIconPressed(r1)
            goto L26
        L33:
            boolean r0 = r5.LJLLI
            if (r0 == 0) goto L4d
            r5.playSoundEffect(r1)
            android.view.View$OnClickListener r0 = r5.LJLJLJ
            if (r0 == 0) goto L41
            r0.onClick(r5)
        L41:
            X.Vhb r0 = r5.LJLZ
            r0.LJIIJ(r2, r2)
            r0 = 1
        L47:
            r5.setCloseIconPressed(r1)
            if (r0 != 0) goto L26
            goto L20
        L4d:
            r0 = 0
            goto L47
        L4f:
            if (r3 == 0) goto L20
            r5.setCloseIconPressed(r2)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80438Vha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.LJLJL) {
            return;
        }
        super.setBackground(drawable);
    }

    @Override // X.C02Y, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.LJLJL) {
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJII(z);
        }
    }

    public void setCheckableResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJII(c80437VhZ.LLJILJIL.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ == null) {
            this.LJLL = z;
            return;
        }
        if (!c80437VhZ.LLILII) {
            return;
        }
        boolean isChecked = isChecked();
        super.setChecked(z);
        if (isChecked == z || (onCheckedChangeListener = this.LJLJLLL) == null) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, z);
    }

    public void setCheckedIcon(Drawable drawable) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIII(drawable);
        }
    }

    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIII(C20110qd.LIZ(c80437VhZ.LLJILJIL, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIJ(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIJ(C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL));
        }
    }

    public void setCheckedIconVisible(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIJZLJL(c80437VhZ.LLJILJIL.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLFFF != colorStateList) {
            c80437VhZ.LLFFF = colorStateList;
            c80437VhZ.onStateChange(c80437VhZ.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList LIZJ;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLFFF != (LIZJ = C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL))) {
            c80437VhZ.LLFFF = LIZJ;
            c80437VhZ.onStateChange(c80437VhZ.getState());
        }
    }

    public void setChipCornerRadius(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIZ(f);
        }
    }

    public void setChipCornerRadiusResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIZ(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C80437VhZ c80437VhZ) {
        C80437VhZ c80437VhZ2 = this.LJLJJL;
        if (c80437VhZ2 != c80437VhZ) {
            if (c80437VhZ2 != null) {
                c80437VhZ2.LLJZIJLIL = new WeakReference<>(null);
            }
            this.LJLJJL = c80437VhZ;
            c80437VhZ.LLLF = false;
            c80437VhZ.LLJZIJLIL = new WeakReference<>(this);
            LIZIZ(this.LJLLLLLL);
        }
    }

    public void setChipEndPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLJIJIL != f) {
            c80437VhZ.LLJIJIL = f;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            float dimension = c80437VhZ.LLJILJIL.getResources().getDimension(i);
            if (c80437VhZ.LLJIJIL != dimension) {
                c80437VhZ.LLJIJIL = dimension;
                c80437VhZ.invalidateSelf();
                c80437VhZ.LJJI();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIZI(drawable);
        }
    }

    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIZI(C20110qd.LIZ(c80437VhZ.LLJILJIL, i));
        }
    }

    public void setChipIconSize(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJ(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJ(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIIJI(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIIJI(C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL));
        }
    }

    public void setChipIconVisible(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIIJIL(c80437VhZ.LLJILJIL.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLFII != f) {
            c80437VhZ.LLFII = f;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
    }

    public void setChipMinHeightResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            float dimension = c80437VhZ.LLJILJIL.getResources().getDimension(i);
            if (c80437VhZ.LLFII != dimension) {
                c80437VhZ.LLFII = dimension;
                c80437VhZ.invalidateSelf();
                c80437VhZ.LJJI();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLILZ != f) {
            c80437VhZ.LLILZ = f;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            float dimension = c80437VhZ.LLJILJIL.getResources().getDimension(i);
            if (c80437VhZ.LLILZ != dimension) {
                c80437VhZ.LLILZ = dimension;
                c80437VhZ.invalidateSelf();
                c80437VhZ.LJJI();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIL(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIL(C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL));
        }
    }

    public void setChipStrokeWidth(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJL(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJL(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJLIJ(drawable);
        }
        LJ();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLIL != charSequence) {
            C13670gF LIZJ = C13670gF.LIZJ();
            c80437VhZ.LLIL = LIZJ.LJ(charSequence, LIZJ.LIZJ);
            c80437VhZ.invalidateSelf();
        }
    }

    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIL(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIL(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJLIJ(C20110qd.LIZ(c80437VhZ.LLJILJIL, i));
        }
        LJ();
    }

    public void setCloseIconSize(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIZ(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIZ(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJ(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJ(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJI(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJI(C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJIIJ(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.LJLJJL == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C80437VhZ c80437VhZ = this.LJLJJL;
            if (c80437VhZ != null) {
                c80437VhZ.LLL = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.LJLLL = z;
        LIZIZ(this.LJLLLLLL);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(C80246VeU c80246VeU) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLILLL = c80246VeU;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLILLL = C80246VeU.LIZ(i, c80437VhZ.LLJILJIL);
        }
    }

    public void setIconEndPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJ(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJ(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJI(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJI(c80437VhZ.LLJILJIL.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.LJLJJL == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLLFF = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.LJLJLLL = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.LJLJLJ = onClickListener;
        LJ();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJIZL(colorStateList);
        }
        if (!this.LJLJJL.LLJLLL) {
            LJFF();
        }
    }

    public void setRippleColorResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJJIZL(C04330Ez.LIZJ(i, c80437VhZ.LLJILJIL));
            if (!this.LJLJJL.LLJLLL) {
                LJFF();
            }
        }
    }

    @Override // X.InterfaceC80411Vh9
    public void setShapeAppearanceModel(C80416VhE c80416VhE) {
        this.LJLJJL.setShapeAppearanceModel(c80416VhE);
    }

    public void setShowMotionSpec(C80246VeU c80246VeU) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLILLJJLI = c80246VeU;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLILLJJLI = C80246VeU.LIZ(i, c80437VhZ.LLJILJIL);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLJJIJI.LIZIZ(new C80229VeD(c80437VhZ.LLJILJIL, i), c80437VhZ.LLJILJIL);
        }
        LJII();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLIZLLLIL != f) {
            c80437VhZ.LLIZLLLIL = f;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            float dimension = c80437VhZ.LLJILJIL.getResources().getDimension(i);
            if (c80437VhZ.LLIZLLLIL != dimension) {
                c80437VhZ.LLIZLLLIL = dimension;
                c80437VhZ.invalidateSelf();
                c80437VhZ.LJJI();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null && c80437VhZ.LLIZ != f) {
            c80437VhZ.LLIZ = f;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            float dimension = c80437VhZ.LLJILJIL.getResources().getDimension(i);
            if (c80437VhZ.LLIZ != dimension) {
                c80437VhZ.LLIZ = dimension;
                c80437VhZ.invalidateSelf();
                c80437VhZ.LJJI();
            }
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIIJZLJL(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJIJIIJIL(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LJJJIL(z);
        }
        LJ();
    }

    public void setTextAppearance(C80229VeD c80229VeD) {
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLJJIJI.LIZIZ(c80229VeD, c80437VhZ.LLJILJIL);
        }
        LJII();
    }

    public C80438Vha(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.a2n, com.zhiliaoapp.musically.R.style.a0_), attributeSet, com.zhiliaoapp.musically.R.attr.a2n);
        C80229VeD c80229VeD;
        C80246VeU c80246VeU;
        C80246VeU c80246VeU2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.LJZ = new Rect();
        this.LJZI = new RectF();
        this.LJZL = new C80442Vhe(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        C80437VhZ c80437VhZ = new C80437VhZ(context2, attributeSet);
        TypedArray LIZLLL = C80244VeS.LIZLLL(c80437VhZ.LLJILJIL, attributeSet, new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, com.zhiliaoapp.musically.R.attr.a1y, com.zhiliaoapp.musically.R.attr.a1z, com.zhiliaoapp.musically.R.attr.a22, com.zhiliaoapp.musically.R.attr.a23, com.zhiliaoapp.musically.R.attr.a26, com.zhiliaoapp.musically.R.attr.a27, com.zhiliaoapp.musically.R.attr.a28, com.zhiliaoapp.musically.R.attr.a2_, com.zhiliaoapp.musically.R.attr.a2a, com.zhiliaoapp.musically.R.attr.a2b, com.zhiliaoapp.musically.R.attr.a2c, com.zhiliaoapp.musically.R.attr.a2d, com.zhiliaoapp.musically.R.attr.a2e, com.zhiliaoapp.musically.R.attr.a2f, com.zhiliaoapp.musically.R.attr.a2k, com.zhiliaoapp.musically.R.attr.a2l, com.zhiliaoapp.musically.R.attr.a2m, com.zhiliaoapp.musically.R.attr.a2o, com.zhiliaoapp.musically.R.attr.a3v, com.zhiliaoapp.musically.R.attr.a3w, com.zhiliaoapp.musically.R.attr.a3x, com.zhiliaoapp.musically.R.attr.a3y, com.zhiliaoapp.musically.R.attr.a3z, com.zhiliaoapp.musically.R.attr.a40, com.zhiliaoapp.musically.R.attr.a41, com.zhiliaoapp.musically.R.attr.abq, com.zhiliaoapp.musically.R.attr.afn, com.zhiliaoapp.musically.R.attr.agb, com.zhiliaoapp.musically.R.attr.agl, com.zhiliaoapp.musically.R.attr.b8b, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8, com.zhiliaoapp.musically.R.attr.bas, com.zhiliaoapp.musically.R.attr.bid, com.zhiliaoapp.musically.R.attr.bim}, com.zhiliaoapp.musically.R.attr.a2n, com.zhiliaoapp.musically.R.style.a0_, new int[0]);
        c80437VhZ.LLLFFI = LIZLLL.hasValue(37);
        ColorStateList LIZ = C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 24);
        if (c80437VhZ.LLFF != LIZ) {
            c80437VhZ.LLFF = LIZ;
            c80437VhZ.onStateChange(c80437VhZ.getState());
        }
        ColorStateList LIZ2 = C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 11);
        if (c80437VhZ.LLFFF != LIZ2) {
            c80437VhZ.LLFFF = LIZ2;
            c80437VhZ.onStateChange(c80437VhZ.getState());
        }
        float dimension = LIZLLL.getDimension(19, 0.0f);
        if (c80437VhZ.LLFII != dimension) {
            c80437VhZ.LLFII = dimension;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        if (LIZLLL.hasValue(12)) {
            c80437VhZ.LJJIIZ(LIZLLL.getDimension(12, 0.0f));
        }
        c80437VhZ.LJJIJIL(C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 22));
        c80437VhZ.LJJIJL(LIZLLL.getDimension(23, 0.0f));
        c80437VhZ.LJJJJIZL(C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 36));
        String LLLZZ = C16880lQ.LLLZZ(LIZLLL, 5);
        LLLZZ = LLLZZ == null ? "" : LLLZZ;
        if (!TextUtils.equals(c80437VhZ.LLIIII, LLLZZ)) {
            c80437VhZ.LLIIII = LLLZZ;
            c80437VhZ.LLJJIJI.LIZLLL = true;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        Context context3 = c80437VhZ.LLJILJIL;
        if (LIZLLL.hasValue(0) && (resourceId3 = LIZLLL.getResourceId(0, 0)) != 0) {
            c80229VeD = new C80229VeD(context3, resourceId3);
        } else {
            c80229VeD = null;
        }
        c80229VeD.LJIIJ = LIZLLL.getDimension(1, c80229VeD.LJIIJ);
        c80437VhZ.LLJJIJI.LIZIZ(c80229VeD, c80437VhZ.LLJILJIL);
        int i = LIZLLL.getInt(3, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c80437VhZ.LLL = TextUtils.TruncateAt.END;
                }
            } else {
                c80437VhZ.LLL = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            c80437VhZ.LLL = TextUtils.TruncateAt.START;
        }
        c80437VhZ.LJJIJIIJIL(LIZLLL.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c80437VhZ.LJJIJIIJIL(LIZLLL.getBoolean(15, false));
        }
        c80437VhZ.LJJIIZI(C80285Vf7.LIZLLL(c80437VhZ.LLJILJIL, LIZLLL, 14));
        if (LIZLLL.hasValue(17)) {
            c80437VhZ.LJJIJIIJI(C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 17));
        }
        c80437VhZ.LJJIJ(LIZLLL.getDimension(16, -1.0f));
        c80437VhZ.LJJJIL(LIZLLL.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c80437VhZ.LJJJIL(LIZLLL.getBoolean(26, false));
        }
        c80437VhZ.LJJIJLIJ(C80285Vf7.LIZLLL(c80437VhZ.LLJILJIL, LIZLLL, 25));
        c80437VhZ.LJJJI(C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 30));
        c80437VhZ.LJJIZ(LIZLLL.getDimension(28, 0.0f));
        c80437VhZ.LJJII(LIZLLL.getBoolean(6, false));
        c80437VhZ.LJJIIJZLJL(LIZLLL.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c80437VhZ.LJJIIJZLJL(LIZLLL.getBoolean(8, false));
        }
        c80437VhZ.LJJIII(C80285Vf7.LIZLLL(c80437VhZ.LLJILJIL, LIZLLL, 7));
        if (LIZLLL.hasValue(9)) {
            c80437VhZ.LJJIIJ(C80285Vf7.LIZ(c80437VhZ.LLJILJIL, LIZLLL, 9));
        }
        Context context4 = c80437VhZ.LLJILJIL;
        if (LIZLLL.hasValue(39) && (resourceId2 = LIZLLL.getResourceId(39, 0)) != 0) {
            c80246VeU = C80246VeU.LIZ(resourceId2, context4);
        } else {
            c80246VeU = null;
        }
        c80437VhZ.LLILLJJLI = c80246VeU;
        Context context5 = c80437VhZ.LLJILJIL;
        if (LIZLLL.hasValue(33) && (resourceId = LIZLLL.getResourceId(33, 0)) != 0) {
            c80246VeU2 = C80246VeU.LIZ(resourceId, context5);
        } else {
            c80246VeU2 = null;
        }
        c80437VhZ.LLILLL = c80246VeU2;
        float dimension2 = LIZLLL.getDimension(21, 0.0f);
        if (c80437VhZ.LLILZ != dimension2) {
            c80437VhZ.LLILZ = dimension2;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        c80437VhZ.LJJJJI(LIZLLL.getDimension(35, 0.0f));
        c80437VhZ.LJJJJ(LIZLLL.getDimension(34, 0.0f));
        float dimension3 = LIZLLL.getDimension(41, 0.0f);
        if (c80437VhZ.LLIZ != dimension3) {
            c80437VhZ.LLIZ = dimension3;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        float dimension4 = LIZLLL.getDimension(40, 0.0f);
        if (c80437VhZ.LLIZLLLIL != dimension4) {
            c80437VhZ.LLIZLLLIL = dimension4;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        c80437VhZ.LJJJ(LIZLLL.getDimension(29, 0.0f));
        c80437VhZ.LJJIL(LIZLLL.getDimension(27, 0.0f));
        float dimension5 = LIZLLL.getDimension(13, 0.0f);
        if (c80437VhZ.LLJIJIL != dimension5) {
            c80437VhZ.LLJIJIL = dimension5;
            c80437VhZ.invalidateSelf();
            c80437VhZ.LJJI();
        }
        c80437VhZ.LLLFF = LIZLLL.getDimensionPixelSize(4, Integer.MAX_VALUE);
        LIZLLL.recycle();
        TypedArray LIZLLL2 = C80244VeS.LIZLLL(context2, attributeSet, new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, com.zhiliaoapp.musically.R.attr.a1y, com.zhiliaoapp.musically.R.attr.a1z, com.zhiliaoapp.musically.R.attr.a22, com.zhiliaoapp.musically.R.attr.a23, com.zhiliaoapp.musically.R.attr.a26, com.zhiliaoapp.musically.R.attr.a27, com.zhiliaoapp.musically.R.attr.a28, com.zhiliaoapp.musically.R.attr.a2_, com.zhiliaoapp.musically.R.attr.a2a, com.zhiliaoapp.musically.R.attr.a2b, com.zhiliaoapp.musically.R.attr.a2c, com.zhiliaoapp.musically.R.attr.a2d, com.zhiliaoapp.musically.R.attr.a2e, com.zhiliaoapp.musically.R.attr.a2f, com.zhiliaoapp.musically.R.attr.a2k, com.zhiliaoapp.musically.R.attr.a2l, com.zhiliaoapp.musically.R.attr.a2m, com.zhiliaoapp.musically.R.attr.a2o, com.zhiliaoapp.musically.R.attr.a3v, com.zhiliaoapp.musically.R.attr.a3w, com.zhiliaoapp.musically.R.attr.a3x, com.zhiliaoapp.musically.R.attr.a3y, com.zhiliaoapp.musically.R.attr.a3z, com.zhiliaoapp.musically.R.attr.a40, com.zhiliaoapp.musically.R.attr.a41, com.zhiliaoapp.musically.R.attr.abq, com.zhiliaoapp.musically.R.attr.afn, com.zhiliaoapp.musically.R.attr.agb, com.zhiliaoapp.musically.R.attr.agl, com.zhiliaoapp.musically.R.attr.b8b, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8, com.zhiliaoapp.musically.R.attr.bas, com.zhiliaoapp.musically.R.attr.bid, com.zhiliaoapp.musically.R.attr.bim}, com.zhiliaoapp.musically.R.attr.a2n, com.zhiliaoapp.musically.R.style.a0_, new int[0]);
        this.LJLLL = LIZLLL2.getBoolean(32, false);
        this.LJLLLLLL = (int) Math.ceil(LIZLLL2.getDimension(20, (float) Math.ceil(C80250VeY.LIZIZ(48, getContext()))));
        LIZLLL2.recycle();
        setChipDrawable(c80437VhZ);
        c80437VhZ.LJIIJ(C16360ka.LJIIIIZZ(this));
        TypedArray LIZLLL3 = C80244VeS.LIZLLL(context2, attributeSet, new int[]{R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.ellipsize, R.attr.maxWidth, R.attr.text, R.attr.checkable, com.zhiliaoapp.musically.R.attr.a1y, com.zhiliaoapp.musically.R.attr.a1z, com.zhiliaoapp.musically.R.attr.a22, com.zhiliaoapp.musically.R.attr.a23, com.zhiliaoapp.musically.R.attr.a26, com.zhiliaoapp.musically.R.attr.a27, com.zhiliaoapp.musically.R.attr.a28, com.zhiliaoapp.musically.R.attr.a2_, com.zhiliaoapp.musically.R.attr.a2a, com.zhiliaoapp.musically.R.attr.a2b, com.zhiliaoapp.musically.R.attr.a2c, com.zhiliaoapp.musically.R.attr.a2d, com.zhiliaoapp.musically.R.attr.a2e, com.zhiliaoapp.musically.R.attr.a2f, com.zhiliaoapp.musically.R.attr.a2k, com.zhiliaoapp.musically.R.attr.a2l, com.zhiliaoapp.musically.R.attr.a2m, com.zhiliaoapp.musically.R.attr.a2o, com.zhiliaoapp.musically.R.attr.a3v, com.zhiliaoapp.musically.R.attr.a3w, com.zhiliaoapp.musically.R.attr.a3x, com.zhiliaoapp.musically.R.attr.a3y, com.zhiliaoapp.musically.R.attr.a3z, com.zhiliaoapp.musically.R.attr.a40, com.zhiliaoapp.musically.R.attr.a41, com.zhiliaoapp.musically.R.attr.abq, com.zhiliaoapp.musically.R.attr.afn, com.zhiliaoapp.musically.R.attr.agb, com.zhiliaoapp.musically.R.attr.agl, com.zhiliaoapp.musically.R.attr.b8b, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8, com.zhiliaoapp.musically.R.attr.bas, com.zhiliaoapp.musically.R.attr.bid, com.zhiliaoapp.musically.R.attr.bim}, com.zhiliaoapp.musically.R.attr.a2n, com.zhiliaoapp.musically.R.style.a0_, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C80285Vf7.LIZ(context2, LIZLLL3, 2));
        }
        boolean hasValue = LIZLLL3.hasValue(37);
        LIZLLL3.recycle();
        this.LJLZ = new C80439Vhb(this, this);
        LJ();
        if (!hasValue) {
            setOutlineProvider(new C80443Vhf(this));
        }
        setChecked(this.LJLL);
        setText(c80437VhZ.LLIIII);
        setEllipsize(c80437VhZ.LLL);
        LJII();
        if (!this.LJLJJL.LLLF) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        LJI();
        if (this.LJLLL) {
            setMinHeight(this.LJLLLLLL);
        }
        this.LJLLLL = C16310kV.LIZLLL(this);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c80437VhZ.LLLF) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C80437VhZ c80437VhZ2 = this.LJLJJL;
        if (c80437VhZ2 != null && !TextUtils.equals(c80437VhZ2.LLIIII, charSequence)) {
            c80437VhZ2.LLIIII = charSequence;
            c80437VhZ2.LLJJIJI.LIZLLL = true;
            c80437VhZ2.invalidateSelf();
            c80437VhZ2.LJJI();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C80437VhZ c80437VhZ = this.LJLJJL;
        if (c80437VhZ != null) {
            c80437VhZ.LLJJIJI.LIZIZ(new C80229VeD(c80437VhZ.LLJILJIL, i), c80437VhZ.LLJILJIL);
        }
        LJII();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C80439Vhb c80439Vhb = this.LJLZ;
        int i2 = c80439Vhb.LJIIIIZZ;
        if (i2 != Integer.MIN_VALUE) {
            c80439Vhb.LIZ(i2);
        }
        if (z) {
            c80439Vhb.LIZLLL(i, rect);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }
}
