package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.VhZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80437VhZ extends C80418VhG implements Drawable.Callback, InterfaceC80242VeQ {
    public static final int[] LLLFZ = {R.attr.state_enabled};
    public static final ShapeDrawable LLLI = new ShapeDrawable(new OvalShape());
    public ColorStateList LLFF;
    public ColorStateList LLFFF;
    public float LLFII;
    public float LLFZ;
    public ColorStateList LLI;
    public float LLIFFJFJJ;
    public ColorStateList LLII;
    public CharSequence LLIIII;
    public boolean LLIIIILZ;
    public Drawable LLIIIJ;
    public ColorStateList LLIIIL;
    public float LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public Drawable LLIIL;
    public Drawable LLIILII;
    public ColorStateList LLIILZL;
    public float LLIIZ;
    public CharSequence LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public Drawable LLILL;
    public ColorStateList LLILLIZIL;
    public C80246VeU LLILLJJLI;
    public C80246VeU LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final Context LLJILJIL;
    public final Paint LLJILJILJ;
    public final Paint.FontMetrics LLJILLL;
    public final RectF LLJJ;
    public final PointF LLJJI;
    public final Path LLJJIII;
    public final C80240VeO LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public ColorFilter LLJL;
    public PorterDuffColorFilter LLJLIL;
    public ColorStateList LLJLILLLLZIIL;
    public PorterDuff.Mode LLJLL;
    public int[] LLJLLIL;
    public boolean LLJLLL;
    public ColorStateList LLJZ;
    public WeakReference<InterfaceC80444Vhg> LLJZIJLIL;
    public TextUtils.TruncateAt LLL;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final float LJIJJLI() {
        if (this.LLLFFI) {
            return LJII();
        }
        return this.LLFZ;
    }

    public final void LJJI() {
        InterfaceC80444Vhg interfaceC80444Vhg = this.LLJZIJLIL.get();
        if (interfaceC80444Vhg != null) {
            interfaceC80444Vhg.LIZ();
        }
    }

    public final boolean LJJJJJ() {
        if (this.LLILIL && this.LLILL != null && this.LLJJJJLIIL) {
            return true;
        }
        return false;
    }

    public final boolean LJJJJJL() {
        if (this.LLIIIILZ && this.LLIIIJ != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJJJL() {
        if (this.LLIIJLIL && this.LLIIL != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.LLFII;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(LJIJJ() + this.LLJJIJI.LIZ(this.LLIIII.toString()) + LJIJI() + this.LLILZ + this.LLIZ + this.LLIZLLLIL + this.LLJIJIL), this.LLLFF);
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (LJIL(this.LLFF) || LJIL(this.LLFFF) || LJIL(this.LLI)) {
            return true;
        }
        if (this.LLJLLL && LJIL(this.LLJZ)) {
            return true;
        }
        C80229VeD c80229VeD = this.LLJJIJI.LJFF;
        if (c80229VeD != null && (colorStateList = c80229VeD.LIZ) != null && colorStateList.isStateful()) {
            return true;
        }
        if ((this.LLILIL && this.LLILL != null && this.LLILII) || LJJ(this.LLIIIJ) || LJJ(this.LLILL) || LJIL(this.LLJLILLLLZIIL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80242VeQ
    public final void LIZ() {
        LJJI();
        invalidateSelf();
    }

    public final float LJIJI() {
        Drawable drawable;
        if (!LJJJJJL() && !LJJJJJ()) {
            return 0.0f;
        }
        float f = this.LLILZIL;
        if (this.LLJJJJLIIL) {
            drawable = this.LLILL;
        } else {
            drawable = this.LLIIIJ;
        }
        float f2 = this.LLIIIZ;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.LLILZLL;
    }

    public final float LJIJJ() {
        if (LJJJJL()) {
            return this.LLJ + this.LLIIZ + this.LLJI;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LLJL;
    }

    public static boolean LJIL(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void LJJJJLI(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void LJIIZILJ(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C07840Sm.LIZJ(drawable, C07840Sm.LIZIZ(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.LLIIL) {
            if (drawable.isStateful()) {
                drawable.setState(this.LLJLLIL);
            }
            C07820Sk.LJII(drawable, this.LLIILZL);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.LLIIIJ;
        if (drawable == drawable2 && this.LLIIJI) {
            C07820Sk.LJII(drawable2, this.LLIIIL);
        }
    }

    public final void LJJII(boolean z) {
        if (this.LLILII != z) {
            this.LLILII = z;
            float LJIJI = LJIJI();
            if (!z && this.LLJJJJLIIL) {
                this.LLJJJJLIIL = false;
            }
            float LJIJI2 = LJIJI();
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJIII(Drawable drawable) {
        if (this.LLILL != drawable) {
            float LJIJI = LJIJI();
            this.LLILL = drawable;
            float LJIJI2 = LJIJI();
            LJJJJLI(this.LLILL);
            LJIIZILJ(this.LLILL);
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJIIJ(ColorStateList colorStateList) {
        if (this.LLILLIZIL != colorStateList) {
            this.LLILLIZIL = colorStateList;
            if (this.LLILIL && this.LLILL != null && this.LLILII) {
                C07820Sk.LJII(this.LLILL, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        if (this.LLILIL != z) {
            boolean LJJJJJ = LJJJJJ();
            this.LLILIL = z;
            boolean LJJJJJ2 = LJJJJJ();
            if (LJJJJJ != LJJJJJ2) {
                if (LJJJJJ2) {
                    LJIIZILJ(this.LLILL);
                } else {
                    LJJJJLI(this.LLILL);
                }
                invalidateSelf();
                LJJI();
            }
        }
    }

    public final void LJJIIZ(float f) {
        if (this.LLFZ != f) {
            this.LLFZ = f;
            setShapeAppearanceModel(this.LJLIL.LIZ.LJ(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIZI(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.LLIIIJ;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC07870Sp;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((InterfaceC07870Sp) drawable3).LIZIZ();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float LJIJI = LJIJI();
            if (drawable != null) {
                drawable4 = C07840Sm.LJFF(drawable).mutate();
            }
            this.LLIIIJ = drawable4;
            float LJIJI2 = LJIJI();
            LJJJJLI(drawable2);
            if (LJJJJJL()) {
                LJIIZILJ(this.LLIIIJ);
            }
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJIJ(float f) {
        if (this.LLIIIZ != f) {
            float LJIJI = LJIJI();
            this.LLIIIZ = f;
            float LJIJI2 = LJIJI();
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJIJIIJI(ColorStateList colorStateList) {
        this.LLIIJI = true;
        if (this.LLIIIL != colorStateList) {
            this.LLIIIL = colorStateList;
            if (LJJJJJL()) {
                C07820Sk.LJII(this.LLIIIJ, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJIJIIJIL(boolean z) {
        if (this.LLIIIILZ != z) {
            boolean LJJJJJL = LJJJJJL();
            this.LLIIIILZ = z;
            boolean LJJJJJL2 = LJJJJJL();
            if (LJJJJJL != LJJJJJL2) {
                if (LJJJJJL2) {
                    LJIIZILJ(this.LLIIIJ);
                } else {
                    LJJJJLI(this.LLIIIJ);
                }
                invalidateSelf();
                LJJI();
            }
        }
    }

    public final void LJJIJIL(ColorStateList colorStateList) {
        if (this.LLI != colorStateList) {
            this.LLI = colorStateList;
            if (this.LLLFFI) {
                C80421VhJ c80421VhJ = this.LJLIL;
                if (c80421VhJ.LIZLLL != colorStateList) {
                    c80421VhJ.LIZLLL = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void LJJIJL(float f) {
        if (this.LLIFFJFJJ != f) {
            this.LLIFFJFJJ = f;
            this.LLJILJILJ.setStrokeWidth(f);
            if (this.LLLFFI) {
                this.LJLIL.LJIIJ = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJLIJ(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.LLIIL;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC07870Sp;
            drawable2 = drawable3;
            if (z) {
                drawable2 = ((InterfaceC07870Sp) drawable3).LIZIZ();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float LJIJJ = LJIJJ();
            if (drawable != null) {
                drawable4 = C07840Sm.LJFF(drawable).mutate();
            }
            this.LLIIL = drawable4;
            this.LLIILII = new RippleDrawable(C80270Ves.LIZJ(this.LLII), this.LLIIL, LLLI);
            float LJIJJ2 = LJIJJ();
            LJJJJLI(drawable2);
            if (LJJJJL()) {
                LJIIZILJ(this.LLIIL);
            }
            invalidateSelf();
            if (LJIJJ != LJIJJ2) {
                LJJI();
            }
        }
    }

    public final void LJJIL(float f) {
        if (this.LLJI != f) {
            this.LLJI = f;
            invalidateSelf();
            if (LJJJJL()) {
                LJJI();
            }
        }
    }

    public final void LJJIZ(float f) {
        if (this.LLIIZ != f) {
            this.LLIIZ = f;
            invalidateSelf();
            if (LJJJJL()) {
                LJJI();
            }
        }
    }

    public final void LJJJ(float f) {
        if (this.LLJ != f) {
            this.LLJ = f;
            invalidateSelf();
            if (LJJJJL()) {
                LJJI();
            }
        }
    }

    public final void LJJJI(ColorStateList colorStateList) {
        if (this.LLIILZL != colorStateList) {
            this.LLIILZL = colorStateList;
            if (LJJJJL()) {
                C07820Sk.LJII(this.LLIIL, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void LJJJIL(boolean z) {
        if (this.LLIIJLIL != z) {
            boolean LJJJJL = LJJJJL();
            this.LLIIJLIL = z;
            boolean LJJJJL2 = LJJJJL();
            if (LJJJJL != LJJJJL2) {
                if (LJJJJL2) {
                    LJIIZILJ(this.LLIIL);
                } else {
                    LJJJJLI(this.LLIIL);
                }
                invalidateSelf();
                LJJI();
            }
        }
    }

    public final void LJJJJ(float f) {
        if (this.LLILZLL != f) {
            float LJIJI = LJIJI();
            this.LLILZLL = f;
            float LJIJI2 = LJIJI();
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJJJI(float f) {
        if (this.LLILZIL != f) {
            float LJIJI = LJIJI();
            this.LLILZIL = f;
            float LJIJI2 = LJIJI();
            invalidateSelf();
            if (LJIJI != LJIJI2) {
                LJJI();
            }
        }
    }

    public final void LJJJJIZL(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.LLII != colorStateList) {
            this.LLII = colorStateList;
            if (this.LLJLLL) {
                colorStateList2 = C80270Ves.LIZJ(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.LLJZ = colorStateList2;
            onStateChange(getState());
        }
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.LLJJLIIIJLLLLLLLZ) == 0) {
            return;
        }
        if (i < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            if (Build.VERSION.SDK_INT > 21) {
                i2 = canvas.saveLayerAlpha(f, f2, f3, f4, i);
            } else {
                i2 = canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
            }
        } else {
            i2 = 0;
        }
        if (!this.LLLFFI) {
            this.LLJILJILJ.setColor(this.LLJJIJIIJIL);
            this.LLJILJILJ.setStyle(Paint.Style.FILL);
            this.LLJJ.set(bounds);
            canvas.drawRoundRect(this.LLJJ, LJIJJLI(), LJIJJLI(), this.LLJILJILJ);
        }
        if (!this.LLLFFI) {
            this.LLJILJILJ.setColor(this.LLJJIJIL);
            this.LLJILJILJ.setStyle(Paint.Style.FILL);
            Paint paint = this.LLJILJILJ;
            ColorFilter colorFilter = this.LLJL;
            if (colorFilter == null) {
                colorFilter = this.LLJLIL;
            }
            paint.setColorFilter(colorFilter);
            this.LLJJ.set(bounds);
            canvas.drawRoundRect(this.LLJJ, LJIJJLI(), LJIJJLI(), this.LLJILJILJ);
        }
        if (this.LLLFFI) {
            super.draw(canvas);
        }
        if (this.LLIFFJFJJ > 0.0f && !this.LLLFFI) {
            this.LLJILJILJ.setColor(this.LLJJJIL);
            this.LLJILJILJ.setStyle(Paint.Style.STROKE);
            if (!this.LLLFFI) {
                Paint paint2 = this.LLJILJILJ;
                ColorFilter colorFilter2 = this.LLJL;
                if (colorFilter2 == null) {
                    colorFilter2 = this.LLJLIL;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.LLJJ;
            float f5 = bounds.left;
            float f6 = this.LLIFFJFJJ / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.LLFZ - (this.LLIFFJFJJ / 2.0f);
            canvas.drawRoundRect(this.LLJJ, f7, f7, this.LLJILJILJ);
        }
        this.LLJILJILJ.setColor(this.LLJJJJ);
        this.LLJILJILJ.setStyle(Paint.Style.FILL);
        this.LLJJ.set(bounds);
        if (!this.LLLFFI) {
            canvas.drawRoundRect(this.LLJJ, LJIJJLI(), LJIJJLI(), this.LLJILJILJ);
            i3 = 0;
        } else {
            RectF rectF2 = new RectF(bounds);
            Path path = this.LLJJIII;
            C80419VhH c80419VhH = this.LJZ;
            C80421VhJ c80421VhJ = this.LJLIL;
            c80419VhH.LIZ(c80421VhJ.LIZ, c80421VhJ.LJIIIZ, rectF2, this.LJLZ, path);
            i3 = 0;
            LJFF(canvas, this.LLJILJILJ, this.LLJJIII, this.LJLIL.LIZ, LJI());
        }
        if (LJJJJJL()) {
            LJIJ(bounds, this.LLJJ);
            RectF rectF3 = this.LLJJ;
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.LLIIIJ.setBounds(i3, i3, (int) this.LLJJ.width(), (int) this.LLJJ.height());
            this.LLIIIJ.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (LJJJJJ()) {
            LJIJ(bounds, this.LLJJ);
            RectF rectF4 = this.LLJJ;
            float f10 = rectF4.left;
            float f11 = rectF4.top;
            canvas.translate(f10, f11);
            this.LLILL.setBounds(i3, i3, (int) this.LLJJ.width(), (int) this.LLJJ.height());
            this.LLILL.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (this.LLLF && this.LLIIII != null) {
            PointF pointF = this.LLJJI;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.LLIIII != null) {
                float LJIJI = LJIJI() + this.LLILZ + this.LLIZ;
                if (C07840Sm.LIZIZ(this) == 0) {
                    pointF.x = bounds.left + LJIJI;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - LJIJI;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.LLJJIJI.LIZ.getFontMetrics(this.LLJILLL);
                Paint.FontMetrics fontMetrics = this.LLJILLL;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF5 = this.LLJJ;
            rectF5.setEmpty();
            if (this.LLIIII != null) {
                float LJIJI2 = LJIJI() + this.LLILZ + this.LLIZ;
                float LJIJJ = LJIJJ() + this.LLJIJIL + this.LLIZLLLIL;
                if (C07840Sm.LIZIZ(this) == 0) {
                    rectF5.left = bounds.left + LJIJI2;
                    rectF5.right = bounds.right - LJIJJ;
                } else {
                    rectF5.left = bounds.left + LJIJJ;
                    rectF5.right = bounds.right - LJIJI2;
                }
                rectF5.top = bounds.top;
                rectF5.bottom = bounds.bottom;
            }
            C80240VeO c80240VeO = this.LLJJIJI;
            if (c80240VeO.LJFF != null) {
                c80240VeO.LIZ.drawableState = getState();
                C80240VeO c80240VeO2 = this.LLJJIJI;
                c80240VeO2.LJFF.LIZJ(this.LLJILJIL, c80240VeO2.LIZ, c80240VeO2.LIZIZ);
            }
            this.LLJJIJI.LIZ.setTextAlign(align);
            if (Math.round(this.LLJJIJI.LIZ(this.LLIIII.toString())) > Math.round(this.LLJJ.width())) {
                z = true;
                i6 = canvas.save();
                canvas.clipRect(this.LLJJ);
            } else {
                z = false;
                i6 = 0;
            }
            CharSequence charSequence = this.LLIIII;
            if (z && this.LLL != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.LLJJIJI.LIZ, this.LLJJ.width(), this.LLL);
            }
            int length = charSequence.length();
            PointF pointF2 = this.LLJJI;
            i5 = 0;
            i4 = 255;
            canvas.drawText(charSequence, 0, length, pointF2.x, pointF2.y, this.LLJJIJI.LIZ);
            if (z) {
                canvas.restoreToCount(i6);
            }
        } else {
            i4 = 255;
            i5 = 0;
        }
        if (LJJJJL()) {
            RectF rectF6 = this.LLJJ;
            rectF6.setEmpty();
            if (LJJJJL()) {
                float f12 = this.LLJIJIL + this.LLJI;
                if (C07840Sm.LIZIZ(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF6.right = f13;
                    rectF6.left = f13 - this.LLIIZ;
                } else {
                    float f14 = bounds.left + f12;
                    rectF6.left = f14;
                    rectF6.right = f14 + this.LLIIZ;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.LLIIZ;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF6.top = f16;
                rectF6.bottom = f16 + f15;
            }
            RectF rectF7 = this.LLJJ;
            float f17 = rectF7.left;
            float f18 = rectF7.top;
            canvas.translate(f17, f18);
            this.LLIIL.setBounds(i5, i5, (int) this.LLJJ.width(), (int) this.LLJJ.height());
            this.LLIILII.setBounds(this.LLIIL.getBounds());
            this.LLIILII.jumpToCurrentState();
            this.LLIILII.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.LLJJLIIIJLLLLLLLZ >= i4) {
            return;
        }
        canvas.restoreToCount(i2);
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.LLLFFI) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.LLFZ);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.LLFII, this.LLFZ);
        }
        outline.setAlpha(this.LLJJLIIIJLLLLLLLZ / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (LJJJJJL()) {
            onLayoutDirectionChanged |= C07840Sm.LIZJ(this.LLIIIJ, i);
        }
        if (LJJJJJ()) {
            onLayoutDirectionChanged |= C07840Sm.LIZJ(this.LLILL, i);
        }
        if (LJJJJL()) {
            onLayoutDirectionChanged |= C07840Sm.LIZJ(this.LLIIL, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (LJJJJJL()) {
            onLevelChange |= this.LLIIIJ.setLevel(i);
        }
        if (LJJJJJ()) {
            onLevelChange |= this.LLILL.setLevel(i);
        }
        if (LJJJJL()) {
            onLevelChange |= this.LLIIL.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.LLLFFI) {
            super.onStateChange(iArr);
        }
        return LJJIFFI(iArr, this.LLJLLIL);
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LLJJLIIIJLLLLLLLZ != i) {
            this.LLJJLIIIJLLLLLLLZ = i;
            invalidateSelf();
        }
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.LLJL != colorFilter) {
            this.LLJL = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.LLJLILLLLZIIL != colorStateList) {
            this.LLJLILLLLZIIL = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.LLJLL != mode) {
            this.LLJLL = mode;
            ColorStateList colorStateList = this.LLJLILLLLZIIL;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.LLJLIL = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public C80437VhZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.a2n, com.zhiliaoapp.musically.R.style.a0_);
        this.LLFZ = -1.0f;
        this.LLJILJILJ = new Paint(1);
        this.LLJILLL = new Paint.FontMetrics();
        this.LLJJ = new RectF();
        this.LLJJI = new PointF();
        this.LLJJIII = new Path();
        this.LLJJLIIIJLLLLLLLZ = 255;
        this.LLJLL = PorterDuff.Mode.SRC_IN;
        this.LLJZIJLIL = new WeakReference<>(null);
        LJIIIIZZ(context);
        this.LLJILJIL = context;
        C80240VeO c80240VeO = new C80240VeO(this);
        this.LLJJIJI = c80240VeO;
        this.LLIIII = "";
        c80240VeO.LIZ.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = LLLFZ;
        setState(iArr);
        if (!Arrays.equals(this.LLJLLIL, iArr)) {
            this.LLJLLIL = iArr;
            if (LJJJJL()) {
                LJJIFFI(getState(), iArr);
            }
        }
        this.LLLF = true;
        LLLI.setTint(-1);
    }

    public final void LJIJ(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (LJJJJJL() || LJJJJJ()) {
            float f = this.LLILZ + this.LLILZIL;
            if (this.LLJJJJLIIL) {
                drawable = this.LLILL;
            } else {
                drawable = this.LLIIIJ;
            }
            float f2 = this.LLIIIZ;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (C07840Sm.LIZIZ(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.LLJJJJLIIL) {
                drawable2 = this.LLILL;
            } else {
                drawable2 = this.LLIIIJ;
            }
            float f5 = this.LLIIIZ;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(C80250VeY.LIZIZ(24, this.LLJILJIL));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80437VhZ.LJJIFFI(int[], int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (LJJJJJL()) {
            visible |= this.LLIIIJ.setVisible(z, z2);
        }
        if (LJJJJJ()) {
            visible |= this.LLILL.setVisible(z, z2);
        }
        if (LJJJJL()) {
            visible |= this.LLIIL.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }
}
