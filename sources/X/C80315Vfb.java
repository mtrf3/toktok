package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o3.h0;

/* renamed from: X.Vfb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80315Vfb extends LinearLayout {
    public final FrameLayout LJLIL;
    public final LinearLayout LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final FrameLayout LJLJJI;
    public EditText LJLJJL;
    public CharSequence LJLJJLL;
    public final C80316Vfc LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public AppCompatTextView LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public CharSequence LJLLL;
    public boolean LJLLLL;
    public AppCompatTextView LJLLLLLL;
    public ColorStateList LJLZ;
    public int LJZ;
    public ColorStateList LJZI;
    public ColorStateList LJZL;
    public CharSequence LL;
    public final AppCompatTextView LLD;
    public CharSequence LLF;
    public final AppCompatTextView LLFF;
    public boolean LLFFF;
    public CharSequence LLFII;
    public boolean LLFZ;
    public C80418VhG LLI;
    public C80418VhG LLIFFJFJJ;
    public final C80416VhE LLII;
    public final int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public final Rect LLIILII;
    public final Rect LLIILZL;
    public final RectF LLIIZ;
    public Typeface LLIL;
    public final C80364VgO LLILII;
    public ColorStateList LLILIL;
    public boolean LLILL;
    public PorterDuff.Mode LLILLIZIL;
    public boolean LLILLJJLI;
    public Drawable LLILLL;
    public int LLILZ;
    public View.OnLongClickListener LLILZIL;
    public final LinkedHashSet<InterfaceC80337Vfx> LLILZLL;
    public int LLIZ;
    public final SparseArray<AbstractC80331Vfr> LLIZLLLIL;
    public final C80364VgO LLJ;
    public final LinkedHashSet<InterfaceC80338Vfy> LLJI;
    public ColorStateList LLJIJIL;
    public boolean LLJILJIL;
    public PorterDuff.Mode LLJILJILJ;
    public boolean LLJILLL;
    public Drawable LLJJ;
    public int LLJJI;
    public Drawable LLJJIII;
    public View.OnLongClickListener LLJJIJI;
    public View.OnLongClickListener LLJJIJIIJIL;
    public final C80364VgO LLJJIJIL;
    public ColorStateList LLJJJ;
    public ColorStateList LLJJJIL;
    public ColorStateList LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public ColorStateList LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public final C80225Ve9 LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public ValueAnimator LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;

    private AbstractC80331Vfr getEndIconDelegate() {
        AbstractC80331Vfr abstractC80331Vfr = this.LLIZLLLIL.get(this.LLIZ);
        if (abstractC80331Vfr != null) {
            return abstractC80331Vfr;
        }
        return this.LLIZLLLIL.get(0);
    }

    private C80364VgO getEndIconToUpdateDummyDrawable() {
        if (this.LLJJIJIL.getVisibility() == 0) {
            return this.LLJJIJIL;
        }
        if (this.LLIZ != 0 && LJI()) {
            return this.LLJ;
        }
        return null;
    }

    public final void LIZIZ() {
        int i;
        C80418VhG c80418VhG = this.LLI;
        if (c80418VhG == null) {
            return;
        }
        c80418VhG.setShapeAppearanceModel(this.LLII);
        if (this.LLIIIILZ == 2 && this.LLIIIL > -1 && this.LLIIJLIL != 0) {
            C80418VhG c80418VhG2 = this.LLI;
            float f = this.LLIIIL;
            int i2 = this.LLIIJLIL;
            c80418VhG2.LJLIL.LJIIJ = f;
            c80418VhG2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            C80421VhJ c80421VhJ = c80418VhG2.LJLIL;
            if (c80421VhJ.LIZLLL != valueOf) {
                c80421VhJ.LIZLLL = valueOf;
                c80418VhG2.onStateChange(c80418VhG2.getState());
            }
        }
        int i3 = this.LLIIL;
        if (this.LLIIIILZ == 1) {
            TypedValue LIZ = C78972Uz2.LIZ(R.attr.a4y, getContext());
            if (LIZ != null) {
                i = LIZ.data;
            } else {
                i = 0;
            }
            i3 = C07290Qj.LJIIIZ(this.LLIIL, i);
        }
        this.LLIIL = i3;
        this.LLI.LJIIJJI(ColorStateList.valueOf(i3));
        if (this.LLIZ == 3) {
            this.LJLJJL.getBackground().invalidateSelf();
        }
        C80418VhG c80418VhG3 = this.LLIFFJFJJ;
        if (c80418VhG3 != null) {
            if (this.LLIIIL > -1 && this.LLIIJLIL != 0) {
                c80418VhG3.LJIIJJI(ColorStateList.valueOf(this.LLIIJLIL));
            }
            invalidate();
        }
        invalidate();
    }

    public final void LIZJ() {
        LIZLLL(this.LLJ, this.LLJILJIL, this.LLJIJIL, this.LLJILLL, this.LLJILJILJ);
    }

    public final int LJ() {
        float LJFF;
        if (!this.LLFFF) {
            return 0;
        }
        int i = this.LLIIIILZ;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return 0;
            }
            LJFF = this.LLJZ.LJFF() / 2.0f;
        } else {
            LJFF = this.LLJZ.LJFF();
        }
        return (int) LJFF;
    }

    public final boolean LJFF() {
        if (this.LLFFF && !TextUtils.isEmpty(this.LLFII) && (this.LLI instanceof C80422VhK)) {
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (this.LJLJJI.getVisibility() == 0 && this.LLJ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void LJII() {
        int i = this.LLIIIILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.LLFFF && !(this.LLI instanceof C80422VhK)) {
                        this.LLI = new C80422VhK(this.LLII);
                    } else {
                        this.LLI = new C80418VhG(this.LLII);
                    }
                    this.LLIFFJFJJ = null;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    throw new IllegalArgumentException(C08380Uo.LIZ(LIZ, this.LLIIIILZ, " is illegal; only @BoxBackgroundMode constants are supported.", LIZ));
                }
            } else {
                this.LLI = new C80418VhG(this.LLII);
                this.LLIFFJFJJ = new C80418VhG();
            }
        } else {
            this.LLI = null;
            this.LLIFFJFJJ = null;
        }
        EditText editText = this.LJLJJL;
        if (editText != null && this.LLI != null && editText.getBackground() == null && this.LLIIIILZ != 0) {
            C16300kU.LJIILLIIL(this.LJLJJL, this.LLI);
        }
        LJJIFFI();
        if (this.LLIIIILZ == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.LLIIIJ = getResources().getDimensionPixelSize(R.dimen.yz);
            } else if (C80285Vf7.LJ(getContext())) {
                this.LLIIIJ = getResources().getDimensionPixelSize(R.dimen.yy);
            }
        }
        if (this.LJLJJL != null && this.LLIIIILZ == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText2 = this.LJLJJL;
                C16310kV.LJIIJ(editText2, C16310kV.LJFF(editText2), getResources().getDimensionPixelSize(R.dimen.yx), C16310kV.LJ(this.LJLJJL), getResources().getDimensionPixelSize(R.dimen.yw));
            } else if (C80285Vf7.LJ(getContext())) {
                EditText editText3 = this.LJLJJL;
                C16310kV.LJIIJ(editText3, C16310kV.LJFF(editText3), getResources().getDimensionPixelSize(R.dimen.yv), C16310kV.LJ(this.LJLJJL), getResources().getDimensionPixelSize(R.dimen.yu));
            }
        }
        if (this.LLIIIILZ != 0) {
            LJIIZILJ();
        }
    }

    public final void LJIILJJIL() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.LJLLI;
        if (appCompatTextView != null) {
            if (this.LJLL) {
                i = this.LJLLILLLL;
            } else {
                i = this.LJLLJ;
            }
            LJIIL(appCompatTextView, i);
            if (!this.LJLL && (colorStateList2 = this.LJZI) != null) {
                this.LJLLI.setTextColor(colorStateList2);
            }
            if (this.LJLL && (colorStateList = this.LJZL) != null) {
                this.LJLLI.setTextColor(colorStateList);
            }
        }
    }

    public final boolean LJIILL() {
        boolean z;
        boolean z2;
        if (this.LJLJJL == null) {
            return false;
        }
        boolean z3 = true;
        if ((getStartIconDrawable() != null || this.LL != null) && this.LJLILLLLZI.getMeasuredWidth() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int measuredWidth = this.LJLILLLLZI.getMeasuredWidth() - this.LJLJJL.getPaddingLeft();
            if (this.LLILLL == null || this.LLILZ != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.LLILLL = colorDrawable;
                this.LLILZ = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] LIZ = C07Z.LIZ(this.LJLJJL);
            Drawable drawable = LIZ[0];
            Drawable drawable2 = this.LLILLL;
            if (drawable != drawable2) {
                C07Z.LJ(this.LJLJJL, drawable2, LIZ[1], LIZ[2], LIZ[3]);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.LLILLL != null) {
                Drawable[] LIZ2 = C07Z.LIZ(this.LJLJJL);
                C07Z.LJ(this.LJLJJL, null, LIZ2[1], LIZ2[2], LIZ2[3]);
                this.LLILLL = null;
                z2 = true;
            }
            z2 = false;
        }
        if ((this.LLJJIJIL.getVisibility() == 0 || ((this.LLIZ != 0 && LJI()) || this.LLF != null)) && this.LJLJI.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.LLFF.getMeasuredWidth() - this.LJLJJL.getPaddingRight();
            C80364VgO endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] LIZ3 = C07Z.LIZ(this.LJLJJL);
            Drawable drawable3 = this.LLJJ;
            if (drawable3 != null) {
                if (this.LLJJI != measuredWidth2) {
                    this.LLJJI = measuredWidth2;
                    drawable3.setBounds(0, 0, measuredWidth2, 1);
                    C07Z.LJ(this.LJLJJL, LIZ3[0], LIZ3[1], this.LLJJ, LIZ3[3]);
                }
            } else {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.LLJJ = colorDrawable2;
                this.LLJJI = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = LIZ3[2];
            Drawable drawable5 = this.LLJJ;
            if (drawable4 != drawable5) {
                this.LLJJIII = drawable4;
                C07Z.LJ(this.LJLJJL, LIZ3[0], LIZ3[1], drawable5, LIZ3[3]);
            } else {
                z3 = z2;
            }
        } else {
            if (this.LLJJ == null) {
                return z2;
            }
            Drawable[] LIZ4 = C07Z.LIZ(this.LJLJJL);
            if (LIZ4[2] == this.LLJJ) {
                C07Z.LJ(this.LJLJJL, LIZ4[0], LIZ4[1], this.LLJJIII, LIZ4[3]);
            } else {
                z3 = z2;
            }
            this.LLJJ = null;
        }
        return z3;
    }

    public final void LJIILLIIL() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.LJLJJL;
        if (editText == null || this.LLIIIILZ != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C03D.LIZ(background)) {
            background = background.mutate();
        }
        if (this.LJLJL.LJ()) {
            background.setColorFilter(C03R.LIZJ(this.LJLJL.LJI(), PorterDuff.Mode.SRC_IN));
        } else if (this.LJLL && (appCompatTextView = this.LJLLI) != null) {
            background.setColorFilter(C03R.LIZJ(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C07840Sm.LIZ(background);
            this.LJLJJL.refreshDrawableState();
        }
    }

    public final void LJIIZILJ() {
        if (this.LLIIIILZ != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LJLIL.getLayoutParams();
            int LJ = LJ();
            if (LJ != layoutParams.topMargin) {
                layoutParams.topMargin = LJ;
                this.LJLIL.requestLayout();
            }
        }
    }

    public final void LJIJJ() {
        if (this.LJLJJL == null) {
            return;
        }
        int i = 0;
        if (this.LLILII.getVisibility() != 0) {
            i = C16310kV.LJFF(this.LJLJJL);
        }
        C16310kV.LJIIJ(this.LLD, i, this.LJLJJL.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.z3), this.LJLJJL.getCompoundPaddingBottom());
    }

    public final void LJIJJLI() {
        int i;
        AppCompatTextView appCompatTextView = this.LLD;
        if (this.LL != null && !this.LLJLLL) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        LJIILL();
    }

    public final void LJJ() {
        if (this.LJLJJL == null) {
            return;
        }
        int i = 0;
        if (!LJI() && this.LLJJIJIL.getVisibility() != 0) {
            i = C16310kV.LJ(this.LJLJJL);
        }
        C16310kV.LJIIJ(this.LLFF, getContext().getResources().getDimensionPixelSize(R.dimen.z3), this.LJLJJL.getPaddingTop(), i, this.LJLJJL.getPaddingBottom());
    }

    public final void LJJI() {
        boolean z;
        int visibility = this.LLFF.getVisibility();
        int i = 0;
        if (this.LLF != null && !this.LLJLLL) {
            z = true;
        } else {
            z = false;
        }
        AppCompatTextView appCompatTextView = this.LLFF;
        if (!z) {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (visibility != this.LLFF.getVisibility()) {
            getEndIconDelegate().LIZJ(z);
        }
        LJIILL();
    }

    public final void LJJIFFI() {
        boolean z;
        boolean z2;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.LLI == null || this.LLIIIILZ == 0) {
            return;
        }
        boolean z3 = false;
        if (isFocused() || ((editText2 = this.LJLJJL) != null && editText2.hasFocus())) {
            z = true;
        } else {
            z = false;
        }
        if (isHovered() || ((editText = this.LJLJJL) != null && editText.isHovered())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isEnabled()) {
            this.LLIIJLIL = this.LLJLLIL;
        } else if (this.LJLJL.LJ()) {
            if (this.LLJJLIIIJLLLLLLLZ != null) {
                LJIL(z, z2);
            } else {
                this.LLIIJLIL = this.LJLJL.LJI();
            }
        } else if (this.LJLL && (appCompatTextView = this.LJLLI) != null) {
            if (this.LLJJLIIIJLLLLLLLZ != null) {
                LJIL(z, z2);
            } else {
                this.LLIIJLIL = appCompatTextView.getCurrentTextColor();
            }
        } else if (z) {
            this.LLIIJLIL = this.LLJJL;
        } else if (z2) {
            this.LLIIJLIL = this.LLJJJJLIIL;
        } else {
            this.LLIIJLIL = this.LLJJJJJIL;
        }
        if (getErrorIconDrawable() != null) {
            C80316Vfc c80316Vfc = this.LJLJL;
            if (c80316Vfc.LJIIJ && c80316Vfc.LJ()) {
                z3 = true;
            }
        }
        setErrorIconVisible(z3);
        LJIIJ(this.LLJJIJIL, this.LLJJJ);
        LJIIJ(this.LLILII, this.LLILIL);
        LJIIJ(this.LLJ, this.LLJIJIL);
        AbstractC80331Vfr endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof C80342Vg2) {
            if (this.LJLJL.LJ() && getEndIconDrawable() != null) {
                Drawable mutate = C07840Sm.LJFF(getEndIconDrawable()).mutate();
                C07820Sk.LJI(mutate, this.LJLJL.LJI());
                this.LLJ.setImageDrawable(mutate);
            } else {
                LIZJ();
            }
        }
        if (z && isEnabled()) {
            this.LLIIIL = this.LLIIJI;
        } else {
            this.LLIIIL = this.LLIIIZ;
        }
        if (this.LLIIIILZ == 1) {
            if (!isEnabled()) {
                this.LLIIL = this.LLJLIL;
            } else if (z2) {
                if (!z) {
                    this.LLIIL = this.LLJLL;
                }
                this.LLIIL = this.LLJLILLLLZIIL;
            } else {
                if (!z) {
                    this.LLIIL = this.LLJL;
                }
                this.LLIIL = this.LLJLILLLLZIIL;
            }
        }
        LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        if (this.LLLFF) {
            return;
        }
        boolean z2 = true;
        this.LLLFF = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C80225Ve9 c80225Ve9 = this.LLJZ;
        if (c80225Ve9 != null) {
            z = c80225Ve9.LJIILL(drawableState);
        } else {
            z = false;
        }
        if (this.LJLJJL != null) {
            if (!C16330kX.LIZJ(this) || !isEnabled()) {
                z2 = false;
            }
            LJIJ(z2, false);
        }
        LJIILLIIL();
        LJJIFFI();
        if (z) {
            invalidate();
        }
        this.LLLFF = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.LJLJJL;
        if (editText != null) {
            return LJ() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public C80418VhG getBoxBackground() {
        int i = this.LLIIIILZ;
        if (i == 1 || i == 2) {
            return this.LLI;
        }
        throw new IllegalStateException();
    }

    public float getBoxCornerRadiusBottomEnd() {
        C80418VhG c80418VhG = this.LLI;
        return c80418VhG.LJLIL.LIZ.LJII.LIZ(c80418VhG.LJI());
    }

    public float getBoxCornerRadiusBottomStart() {
        C80418VhG c80418VhG = this.LLI;
        return c80418VhG.LJLIL.LIZ.LJI.LIZ(c80418VhG.LJI());
    }

    public float getBoxCornerRadiusTopEnd() {
        C80418VhG c80418VhG = this.LLI;
        return c80418VhG.LJLIL.LIZ.LJFF.LIZ(c80418VhG.LJI());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.LLI.LJII();
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.LJLJLJ && this.LJLL && (appCompatTextView = this.LJLLI) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public CharSequence getEndIconContentDescription() {
        return this.LLJ.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.LLJ.getDrawable();
    }

    public CharSequence getError() {
        C80316Vfc c80316Vfc = this.LJLJL;
        if (c80316Vfc.LJIIJ) {
            return c80316Vfc.LJIIIZ;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.LJLJL.LJIIL;
    }

    public int getErrorCurrentTextColors() {
        return this.LJLJL.LJI();
    }

    public Drawable getErrorIconDrawable() {
        return this.LLJJIJIL.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.LJLJL.LJI();
    }

    public CharSequence getHelperText() {
        C80316Vfc c80316Vfc = this.LJLJL;
        if (c80316Vfc.LJIILLIIL) {
            return c80316Vfc.LJIILL;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.LJLJL.LJIIZILJ;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.LLFFF) {
            return this.LLFII;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.LLJZ.LJFF();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C80225Ve9 c80225Ve9 = this.LLJZ;
        return c80225Ve9.LJI(c80225Ve9.LJIIJJI);
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.LLJ.getContentDescription();
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.LLJ.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.LJLLLL) {
            return this.LJLLL;
        }
        return null;
    }

    public ColorStateList getPrefixTextColor() {
        return this.LLD.getTextColors();
    }

    public CharSequence getStartIconContentDescription() {
        return this.LLILII.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.LLILII.getDrawable();
    }

    public ColorStateList getSuffixTextColor() {
        return this.LLFF.getTextColors();
    }

    public final void LJIIIIZZ() {
        float f;
        float LIZIZ;
        float f2;
        float LIZIZ2;
        int i;
        float LIZIZ3;
        int i2;
        if (!LJFF()) {
            return;
        }
        RectF rectF = this.LLIIZ;
        C80225Ve9 c80225Ve9 = this.LLJZ;
        int width = this.LJLJJL.getWidth();
        int gravity = this.LJLJJL.getGravity();
        boolean LIZJ = c80225Ve9.LIZJ(c80225Ve9.LJJ);
        c80225Ve9.LJJIFFI = LIZJ;
        if (gravity == 17 || (gravity & 7) == 1) {
            f = width / 2.0f;
            LIZIZ = c80225Ve9.LIZIZ() / 2.0f;
        } else {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                if (LIZJ) {
                    i2 = c80225Ve9.LJ.left;
                    f2 = i2;
                } else {
                    f = c80225Ve9.LJ.right;
                    LIZIZ = c80225Ve9.LIZIZ();
                }
            } else if (LIZJ) {
                f = c80225Ve9.LJ.right;
                LIZIZ = c80225Ve9.LIZIZ();
            } else {
                i2 = c80225Ve9.LJ.left;
                f2 = i2;
            }
            rectF.left = f2;
            Rect rect = c80225Ve9.LJ;
            rectF.top = rect.top;
            if (gravity != 17 || (gravity & 7) == 1) {
                LIZIZ2 = (width / 2.0f) + (c80225Ve9.LIZIZ() / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                if (c80225Ve9.LJJIFFI) {
                    LIZIZ3 = c80225Ve9.LIZIZ();
                    LIZIZ2 = LIZIZ3 + f2;
                } else {
                    i = rect.right;
                    LIZIZ2 = i;
                }
            } else if (c80225Ve9.LJJIFFI) {
                i = rect.right;
                LIZIZ2 = i;
            } else {
                LIZIZ3 = c80225Ve9.LIZIZ();
                LIZIZ2 = LIZIZ3 + f2;
            }
            rectF.right = LIZIZ2;
            float LJFF = c80225Ve9.LJFF() + c80225Ve9.LJ.top;
            float f3 = rectF.left;
            float f4 = this.LLIIII;
            rectF.left = f3 - f4;
            rectF.top -= f4;
            rectF.right += f4;
            rectF.bottom = LJFF + f4;
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            C80422VhK c80422VhK = (C80422VhK) this.LLI;
            c80422VhK.getClass();
            c80422VhK.LJIIZILJ(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        f2 = f - LIZIZ;
        rectF.left = f2;
        Rect rect2 = c80225Ve9.LJ;
        rectF.top = rect2.top;
        if (gravity != 17) {
        }
        LIZIZ2 = (width / 2.0f) + (c80225Ve9.LIZIZ() / 2.0f);
        rectF.right = LIZIZ2;
        float LJFF2 = c80225Ve9.LJFF() + c80225Ve9.LJ.top;
        float f32 = rectF.left;
        float f42 = this.LLIIII;
        rectF.left = f32 - f42;
        rectF.top -= f42;
        rectF.right += f42;
        rectF.bottom = LJFF2 + f42;
        rectF.offset(-getPaddingLeft(), -getPaddingTop());
        C80422VhK c80422VhK2 = (C80422VhK) this.LLI;
        c80422VhK2.getClass();
        c80422VhK2.LJIIZILJ(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextInputLayout$SavedState textInputLayout$SavedState = new TextInputLayout$SavedState(super.onSaveInstanceState());
        if (this.LJLJL.LJ()) {
            textInputLayout$SavedState.LJLIL = getError();
        }
        boolean z = true;
        if (this.LLIZ == 0 || !this.LLJ.isChecked()) {
            z = false;
        }
        textInputLayout$SavedState.LJLILLLLZI = z;
        textInputLayout$SavedState.LJLJI = getHint();
        textInputLayout$SavedState.LJLJJI = getHelperText();
        textInputLayout$SavedState.LJLJJL = getPlaceholderText();
        return textInputLayout$SavedState;
    }

    public int getBoxBackgroundColor() {
        return this.LLIIL;
    }

    public int getBoxBackgroundMode() {
        return this.LLIIIILZ;
    }

    public int getBoxStrokeColor() {
        return this.LLJJL;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public int getBoxStrokeWidth() {
        return this.LLIIIZ;
    }

    public int getBoxStrokeWidthFocused() {
        return this.LLIIJI;
    }

    public int getCounterMaxLength() {
        return this.LJLJLLL;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.LJZI;
    }

    public ColorStateList getCounterTextColor() {
        return this.LJZI;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.LLJJJIL;
    }

    public EditText getEditText() {
        return this.LJLJJL;
    }

    public int getEndIconMode() {
        return this.LLIZ;
    }

    public C80364VgO getEndIconView() {
        return this.LLJ;
    }

    public ColorStateList getHintTextColor() {
        return this.LLJJJJ;
    }

    public int getPlaceholderTextAppearance() {
        return this.LJZ;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.LJLZ;
    }

    public CharSequence getPrefixText() {
        return this.LL;
    }

    public TextView getPrefixTextView() {
        return this.LLD;
    }

    public CharSequence getSuffixText() {
        return this.LLF;
    }

    public TextView getSuffixTextView() {
        return this.LLFF;
    }

    public Typeface getTypeface() {
        return this.LLIL;
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.LJLJJL == null) {
            int i = this.LLIZ;
            this.LJLJJL = editText;
            LJII();
            setTextInputAccessibilityDelegate(new C80317Vfd(this));
            C80225Ve9 c80225Ve9 = this.LLJZ;
            Typeface typeface = this.LJLJJL.getTypeface();
            C80227VeB c80227VeB = c80225Ve9.LJIL;
            if (c80227VeB != null) {
                c80227VeB.LJLJI = true;
            }
            if (c80225Ve9.LJIJ != typeface) {
                c80225Ve9.LJIJ = typeface;
                z = true;
            } else {
                z = false;
            }
            C80227VeB c80227VeB2 = c80225Ve9.LJIJJLI;
            if (c80227VeB2 != null) {
                c80227VeB2.LJLJI = true;
            }
            if (c80225Ve9.LJIJI != typeface) {
                c80225Ve9.LJIJI = typeface;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                c80225Ve9.LJIIIZ();
            }
            C80225Ve9 c80225Ve92 = this.LLJZ;
            float textSize = this.LJLJJL.getTextSize();
            if (c80225Ve92.LJIIIIZZ != textSize) {
                c80225Ve92.LJIIIIZZ = textSize;
                c80225Ve92.LJIIIZ();
            }
            int gravity = this.LJLJJL.getGravity();
            C80225Ve9 c80225Ve93 = this.LLJZ;
            int i2 = (gravity & (-113)) | 48;
            if (c80225Ve93.LJII != i2) {
                c80225Ve93.LJII = i2;
                c80225Ve93.LJIIIZ();
            }
            C80225Ve9 c80225Ve94 = this.LLJZ;
            if (c80225Ve94.LJI != gravity) {
                c80225Ve94.LJI = gravity;
                c80225Ve94.LJIIIZ();
            }
            this.LJLJJL.addTextChangedListener(new C80319Vff(this));
            if (this.LLJJJIL == null) {
                this.LLJJJIL = this.LJLJJL.getHintTextColors();
            }
            if (this.LLFFF) {
                if (TextUtils.isEmpty(this.LLFII)) {
                    CharSequence hint = this.LJLJJL.getHint();
                    this.LJLJJLL = hint;
                    setHint(hint);
                    this.LJLJJL.setHint((CharSequence) null);
                }
                this.LLFZ = true;
            }
            if (this.LJLLI != null) {
                LJIILIIL(this.LJLJJL.getText().length());
            }
            LJIILLIIL();
            this.LJLJL.LIZIZ();
            this.LJLILLLLZI.bringToFront();
            this.LJLJI.bringToFront();
            this.LJLJJI.bringToFront();
            this.LLJJIJIL.bringToFront();
            Iterator<InterfaceC80337Vfx> it = this.LLILZLL.iterator();
            while (it.hasNext()) {
                it.next().LIZ(this);
            }
            LJIJJ();
            LJJ();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            LJIJ(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i;
        C80364VgO c80364VgO = this.LLJJIJIL;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c80364VgO.setVisibility(i);
        FrameLayout frameLayout = this.LJLJJI;
        if (!z) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        LJJ();
        if (this.LLIZ != 0) {
            return;
        }
        LJIILL();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.LLFII)) {
            this.LLFII = charSequence;
            C80225Ve9 c80225Ve9 = this.LLJZ;
            if (charSequence == null || !TextUtils.equals(c80225Ve9.LJJ, charSequence)) {
                c80225Ve9.LJJ = charSequence;
                c80225Ve9.LJJI = null;
                Bitmap bitmap = c80225Ve9.LJJII;
                if (bitmap != null) {
                    bitmap.recycle();
                    c80225Ve9.LJJII = null;
                }
                c80225Ve9.LJIIIZ();
            }
            if (!this.LLJLLL) {
                LJIIIIZZ();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.LJLLLL == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.LJLLLLLL = appCompatTextView;
            appCompatTextView.setId(R.id.l5w);
            C16330kX.LJFF(this.LJLLLLLL, 1);
            setPlaceholderTextAppearance(this.LJZ);
            setPlaceholderTextColor(this.LJLZ);
            AppCompatTextView appCompatTextView2 = this.LJLLLLLL;
            if (appCompatTextView2 != null) {
                this.LJLIL.addView(appCompatTextView2);
                this.LJLLLLLL.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView3 = this.LJLLLLLL;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setVisibility(8);
            }
            this.LJLLLLLL = null;
        }
        this.LJLLLL = z;
    }

    public final void LIZ(float f) {
        if (this.LLJZ.LIZJ == f) {
            return;
        }
        if (this.LLLF == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLLF = valueAnimator;
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            this.LLLF.setDuration(167L);
            this.LLLF.addUpdateListener(new C80320Vfg(this));
        }
        this.LLLF.setFloatValues(this.LLJZ.LIZJ, f);
        this.LLLF.start();
    }

    public final void LJIILIIL(int i) {
        boolean z;
        int i2;
        boolean z2 = this.LJLL;
        int i3 = this.LJLJLLL;
        if (i3 == -1) {
            this.LJLLI.setText(String.valueOf(i));
            this.LJLLI.setContentDescription(null);
            this.LJLL = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.LJLL = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.LJLLI;
            int i4 = this.LJLJLLL;
            if (this.LJLL) {
                i2 = R.string.cmc;
            } else {
                i2 = R.string.cmb;
            }
            appCompatTextView.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.LJLL) {
                LJIILJJIL();
            }
            this.LJLLI.setText(C13670gF.LIZJ().LJFF(getContext().getString(R.string.cmd, Integer.valueOf(i), Integer.valueOf(this.LJLJLLL))));
        }
        if (this.LJLJJL != null && z2 != this.LJLL) {
            LJIJ(false, false);
            LJJIFFI();
            LJIILLIIL();
        }
    }

    public final void LJIJI(int i) {
        if (i == 0 && !this.LLJLLL) {
            AppCompatTextView appCompatTextView = this.LJLLLLLL;
            if (appCompatTextView != null && this.LJLLLL) {
                appCompatTextView.setText(this.LJLLL);
                this.LJLLLLLL.setVisibility(0);
                this.LJLLLLLL.bringToFront();
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = this.LJLLLLLL;
        if (appCompatTextView2 == null || !this.LJLLLL) {
            return;
        }
        appCompatTextView2.setText((CharSequence) null);
        this.LJLLLLLL.setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.LLLFFI = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.LLLFFI = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.LLFFF) {
            this.LLJZ.LJ(canvas);
        }
        C80418VhG c80418VhG = this.LLIFFJFJJ;
        if (c80418VhG != null) {
            Rect bounds = c80418VhG.getBounds();
            bounds.top = bounds.bottom - this.LLIIIL;
            this.LLIFFJFJJ.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        TextInputLayout$SavedState textInputLayout$SavedState = (TextInputLayout$SavedState) parcelable;
        super.onRestoreInstanceState(textInputLayout$SavedState.mSuperState);
        setError(textInputLayout$SavedState.LJLIL);
        if (textInputLayout$SavedState.LJLILLLLZI) {
            this.LLJ.post(new RunnableC80321Vfh(this));
        }
        setHint(textInputLayout$SavedState.LJLJI);
        setHelperText(textInputLayout$SavedState.LJLJJI);
        setPlaceholderText(textInputLayout$SavedState.LJLJJL);
        requestLayout();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.LLIIL != i) {
            this.LLIIL = i;
            this.LLJL = i;
            this.LLJLILLLLZIIL = i;
            this.LLJLL = i;
            LIZIZ();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C04330Ez.LIZIZ(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.LLJL = defaultColor;
        this.LLIIL = defaultColor;
        this.LLJLIL = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.LLJLILLLLZIIL = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.LLJLL = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        LIZIZ();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.LLIIIILZ) {
            return;
        }
        this.LLIIIILZ = i;
        if (this.LJLJJL != null) {
            LJII();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.LLJJL != i) {
            this.LLJJL = i;
            LJJIFFI();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.LLJJJJJIL = colorStateList.getDefaultColor();
            this.LLJLLIL = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.LLJJJJLIIL = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.LLJJL = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.LLJJL != colorStateList.getDefaultColor()) {
            this.LLJJL = colorStateList.getDefaultColor();
        }
        LJJIFFI();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.LLJJLIIIJLLLLLLLZ != colorStateList) {
            this.LLJJLIIIJLLLLLLLZ = colorStateList;
            LJJIFFI();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.LLIIIZ = i;
        LJJIFFI();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.LLIIJI = i;
        LJJIFFI();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        int length;
        if (this.LJLJLJ != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.LJLLI = appCompatTextView;
                appCompatTextView.setId(R.id.l5t);
                Typeface typeface = this.LLIL;
                if (typeface != null) {
                    this.LJLLI.setTypeface(typeface);
                }
                this.LJLLI.setMaxLines(1);
                this.LJLJL.LIZ(this.LJLLI, 2);
                C16530kr.LJII((ViewGroup.MarginLayoutParams) this.LJLLI.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.a42));
                LJIILJJIL();
                if (this.LJLLI != null) {
                    EditText editText = this.LJLJJL;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    LJIILIIL(length);
                }
            } else {
                this.LJLJL.LJIIIIZZ(this.LJLLI, 2);
                this.LJLLI = null;
            }
            this.LJLJLJ = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int length;
        if (this.LJLJLLL != i) {
            if (i > 0) {
                this.LJLJLLL = i;
            } else {
                this.LJLJLLL = -1;
            }
            if (this.LJLJLJ && this.LJLLI != null) {
                EditText editText = this.LJLJJL;
                if (editText == null) {
                    length = 0;
                } else {
                    length = editText.getText().length();
                }
                LJIILIIL(length);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.LJLLILLLL != i) {
            this.LJLLILLLL = i;
            LJIILJJIL();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.LJZL != colorStateList) {
            this.LJZL = colorStateList;
            LJIILJJIL();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.LJLLJ != i) {
            this.LJLLJ = i;
            LJIILJJIL();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.LJZI != colorStateList) {
            this.LJZI = colorStateList;
            LJIILJJIL();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.LLJJJIL = colorStateList;
        this.LLJJJJ = colorStateList;
        if (this.LJLJJL != null) {
            LJIJ(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        LJIIIZ(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.LLJ.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.LLJ.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setEndIconDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.LLIZ;
        this.LLIZ = i;
        Iterator<InterfaceC80338Vfy> it = this.LLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this, i2);
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().LIZIZ(this.LLIIIILZ)) {
            getEndIconDelegate().LIZ();
            LIZJ();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("The current box background mode ");
        LIZ.append(this.LLIIIILZ);
        LIZ.append(" is not supported by the end icon mode ");
        LIZ.append(i);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C80364VgO c80364VgO = this.LLJ;
        View.OnLongClickListener onLongClickListener = this.LLJJIJI;
        c80364VgO.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLJJIJI = onLongClickListener;
        C80364VgO c80364VgO = this.LLJ;
        c80364VgO.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.LLJIJIL != colorStateList) {
            this.LLJIJIL = colorStateList;
            this.LLJILJIL = true;
            LIZJ();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.LLJILJILJ != mode) {
            this.LLJILJILJ = mode;
            this.LLJILLL = true;
            LIZJ();
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (LJI() != z) {
            C80364VgO c80364VgO = this.LLJ;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c80364VgO.setVisibility(i);
            LJJ();
            LJIILL();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.LJLJL.LJIIJ) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C80316Vfc c80316Vfc = this.LJLJL;
            c80316Vfc.LIZJ();
            c80316Vfc.LJIIIZ = charSequence;
            c80316Vfc.LJIIJJI.setText(charSequence);
            int i = c80316Vfc.LJII;
            if (i != 1) {
                c80316Vfc.LJIIIIZZ = 1;
            }
            c80316Vfc.LJIIJ(i, c80316Vfc.LJIIIIZZ, c80316Vfc.LJIIIZ(c80316Vfc.LJIIJJI, charSequence));
            return;
        }
        this.LJLJL.LJII();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LJIIL = charSequence;
        AppCompatTextView appCompatTextView = c80316Vfc.LJIIJJI;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C80316Vfc c80316Vfc = this.LJLJL;
        if (c80316Vfc.LJIIJ == z) {
            return;
        }
        c80316Vfc.LIZJ();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c80316Vfc.LIZ, null);
            c80316Vfc.LJIIJJI = appCompatTextView;
            appCompatTextView.setId(R.id.l5u);
            c80316Vfc.LJIIJJI.setTextAlignment(5);
            Typeface typeface = c80316Vfc.LJIJJ;
            if (typeface != null) {
                c80316Vfc.LJIIJJI.setTypeface(typeface);
            }
            int i = c80316Vfc.LJIILIIL;
            c80316Vfc.LJIILIIL = i;
            AppCompatTextView appCompatTextView2 = c80316Vfc.LJIIJJI;
            if (appCompatTextView2 != null) {
                c80316Vfc.LIZIZ.LJIIL(appCompatTextView2, i);
            }
            ColorStateList colorStateList = c80316Vfc.LJIILJJIL;
            c80316Vfc.LJIILJJIL = colorStateList;
            AppCompatTextView appCompatTextView3 = c80316Vfc.LJIIJJI;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c80316Vfc.LJIIL;
            c80316Vfc.LJIIL = charSequence;
            AppCompatTextView appCompatTextView4 = c80316Vfc.LJIIJJI;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            c80316Vfc.LJIIJJI.setVisibility(4);
            C16330kX.LJFF(c80316Vfc.LJIIJJI, 1);
            c80316Vfc.LIZ(c80316Vfc.LJIIJJI, 0);
        } else {
            c80316Vfc.LJII();
            c80316Vfc.LJIIIIZZ(c80316Vfc.LJIIJJI, 0);
            c80316Vfc.LJIIJJI = null;
            c80316Vfc.LIZIZ.LJIILLIIL();
            c80316Vfc.LIZIZ.LJJIFFI();
        }
        c80316Vfc.LJIIJ = z;
    }

    public void setErrorIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setErrorIconDrawable(drawable);
        LJIIJ(this.LLJJIJIL, this.LLJJJ);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C80364VgO c80364VgO = this.LLJJIJIL;
        View.OnLongClickListener onLongClickListener = this.LLJJIJIIJIL;
        c80364VgO.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLJJIJIIJIL = onLongClickListener;
        C80364VgO c80364VgO = this.LLJJIJIL;
        c80364VgO.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.LLJJJ = colorStateList;
        Drawable drawable = this.LLJJIJIL.getDrawable();
        if (drawable != null) {
            drawable = C07840Sm.LJFF(drawable).mutate();
            C07820Sk.LJII(drawable, colorStateList);
        }
        if (this.LLJJIJIL.getDrawable() != drawable) {
            this.LLJJIJIL.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.LLJJIJIL.getDrawable();
        if (drawable != null) {
            drawable = C07840Sm.LJFF(drawable).mutate();
            C07820Sk.LJIIIIZZ(drawable, mode);
        }
        if (this.LLJJIJIL.getDrawable() != drawable) {
            this.LLJJIJIL.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LJIILIIL = i;
        AppCompatTextView appCompatTextView = c80316Vfc.LJIIJJI;
        if (appCompatTextView != null) {
            c80316Vfc.LIZIZ.LJIIL(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LJIILJJIL = colorStateList;
        AppCompatTextView appCompatTextView = c80316Vfc.LJIIJJI;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.LLJZIJLIL != z) {
            this.LLJZIJLIL = z;
            LJIJ(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.LJLJL.LJIILLIIL) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.LJLJL.LJIILLIIL) {
            setHelperTextEnabled(true);
        }
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LIZJ();
        c80316Vfc.LJIILL = charSequence;
        c80316Vfc.LJIIZILJ.setText(charSequence);
        int i = c80316Vfc.LJII;
        if (i != 2) {
            c80316Vfc.LJIIIIZZ = 2;
        }
        c80316Vfc.LJIIJ(i, c80316Vfc.LJIIIIZZ, c80316Vfc.LJIIIZ(c80316Vfc.LJIIZILJ, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LJIJI = colorStateList;
        AppCompatTextView appCompatTextView = c80316Vfc.LJIIZILJ;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C80316Vfc c80316Vfc = this.LJLJL;
        if (c80316Vfc.LJIILLIIL == z) {
            return;
        }
        c80316Vfc.LIZJ();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c80316Vfc.LIZ, null);
            c80316Vfc.LJIIZILJ = appCompatTextView;
            appCompatTextView.setId(R.id.l5v);
            c80316Vfc.LJIIZILJ.setTextAlignment(5);
            Typeface typeface = c80316Vfc.LJIJJ;
            if (typeface != null) {
                c80316Vfc.LJIIZILJ.setTypeface(typeface);
            }
            c80316Vfc.LJIIZILJ.setVisibility(4);
            C16330kX.LJFF(c80316Vfc.LJIIZILJ, 1);
            int i = c80316Vfc.LJIJ;
            c80316Vfc.LJIJ = i;
            AppCompatTextView appCompatTextView2 = c80316Vfc.LJIIZILJ;
            if (appCompatTextView2 != null) {
                C023107f.LJII(appCompatTextView2, i);
            }
            ColorStateList colorStateList = c80316Vfc.LJIJI;
            c80316Vfc.LJIJI = colorStateList;
            AppCompatTextView appCompatTextView3 = c80316Vfc.LJIIZILJ;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            c80316Vfc.LIZ(c80316Vfc.LJIIZILJ, 1);
        } else {
            c80316Vfc.LIZJ();
            int i2 = c80316Vfc.LJII;
            if (i2 == 2) {
                c80316Vfc.LJIIIIZZ = 0;
            }
            c80316Vfc.LJIIJ(i2, c80316Vfc.LJIIIIZZ, c80316Vfc.LJIIIZ(c80316Vfc.LJIIZILJ, null));
            c80316Vfc.LJIIIIZZ(c80316Vfc.LJIIZILJ, 1);
            c80316Vfc.LJIIZILJ = null;
            c80316Vfc.LIZIZ.LJIILLIIL();
            c80316Vfc.LIZIZ.LJJIFFI();
        }
        c80316Vfc.LJIILLIIL = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C80316Vfc c80316Vfc = this.LJLJL;
        c80316Vfc.LJIJ = i;
        AppCompatTextView appCompatTextView = c80316Vfc.LJIIZILJ;
        if (appCompatTextView != null) {
            C023107f.LJII(appCompatTextView, i);
        }
    }

    public void setHint(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setHint(charSequence);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.LLL = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.LLFFF) {
            this.LLFFF = z;
            if (!z) {
                this.LLFZ = false;
                if (!TextUtils.isEmpty(this.LLFII) && TextUtils.isEmpty(this.LJLJJL.getHint())) {
                    this.LJLJJL.setHint(this.LLFII);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.LJLJJL.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.LLFII)) {
                        setHint(hint);
                    }
                    this.LJLJJL.setHint((CharSequence) null);
                }
                this.LLFZ = true;
            }
            if (this.LJLJJL != null) {
                LJIIZILJ();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.LLJZ.LJIIJ(i);
        this.LLJJJJ = this.LLJZ.LJIIJJI;
        if (this.LJLJJL != null) {
            LJIJ(false, false);
            LJIIZILJ();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.LLJJJJ != colorStateList) {
            if (this.LLJJJIL == null) {
                this.LLJZ.LJIIJJI(colorStateList);
            }
            this.LLJJJJ = colorStateList;
            if (this.LJLJJL != null) {
                LJIJ(false, false);
            }
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z) {
            if (this.LLIZ != 1) {
                setEndIconMode(1);
                return;
            }
            return;
        }
        setEndIconMode(0);
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.LLJIJIL = colorStateList;
        this.LLJILJIL = true;
        LIZJ();
    }

    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.LLJILJILJ = mode;
        this.LLJILLL = true;
        LIZJ();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (this.LJLLLL && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.LJLLLL) {
                setPlaceholderTextEnabled(true);
            }
            this.LJLLL = charSequence;
        }
        EditText editText = this.LJLJJL;
        if (editText != null) {
            i = editText.getText().length();
        }
        LJIJI(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.LJZ = i;
        AppCompatTextView appCompatTextView = this.LJLLLLLL;
        if (appCompatTextView != null) {
            C023107f.LJII(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.LJLZ != colorStateList) {
            this.LJLZ = colorStateList;
            AppCompatTextView appCompatTextView = this.LJLLLLLL;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.LL = charSequence2;
        this.LLD.setText(charSequence);
        LJIJJLI();
    }

    public void setPrefixTextAppearance(int i) {
        C023107f.LJII(this.LLD, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.LLD.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.LLILII.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.LLILII.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            LJIIJ(this.LLILII, this.LLILIL);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C80364VgO c80364VgO = this.LLILII;
        View.OnLongClickListener onLongClickListener = this.LLILZIL;
        c80364VgO.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.LLILZIL = onLongClickListener;
        C80364VgO c80364VgO = this.LLILII;
        c80364VgO.setOnLongClickListener(onLongClickListener);
        LJIIJJI(c80364VgO, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.LLILIL != colorStateList) {
            this.LLILIL = colorStateList;
            this.LLILL = true;
            LIZLLL(this.LLILII, true, colorStateList, this.LLILLJJLI, this.LLILLIZIL);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.LLILLIZIL != mode) {
            this.LLILLIZIL = mode;
            this.LLILLJJLI = true;
            LIZLLL(this.LLILII, this.LLILL, this.LLILIL, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        boolean z2;
        int i = 0;
        if (this.LLILII.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            C80364VgO c80364VgO = this.LLILII;
            if (!z) {
                i = 8;
            }
            c80364VgO.setVisibility(i);
            LJIJJ();
            LJIILL();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.LLF = charSequence2;
        this.LLFF.setText(charSequence);
        LJJI();
    }

    public void setSuffixTextAppearance(int i) {
        C023107f.LJII(this.LLFF, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.LLFF.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C80317Vfd c80317Vfd) {
        EditText editText = this.LJLJJL;
        if (editText != null) {
            h0.LJIJI(editText, c80317Vfd);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.LLIL) {
            this.LLIL = typeface;
            C80225Ve9 c80225Ve9 = this.LLJZ;
            C80227VeB c80227VeB = c80225Ve9.LJIL;
            boolean z2 = true;
            if (c80227VeB != null) {
                c80227VeB.LJLJI = true;
            }
            if (c80225Ve9.LJIJ != typeface) {
                c80225Ve9.LJIJ = typeface;
                z = true;
            } else {
                z = false;
            }
            C80227VeB c80227VeB2 = c80225Ve9.LJIJJLI;
            if (c80227VeB2 != null) {
                c80227VeB2.LJLJI = true;
            }
            if (c80225Ve9.LJIJI != typeface) {
                c80225Ve9.LJIJI = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                c80225Ve9.LJIIIZ();
            }
            C80316Vfc c80316Vfc = this.LJLJL;
            if (typeface != c80316Vfc.LJIJJ) {
                c80316Vfc.LJIJJ = typeface;
                AppCompatTextView appCompatTextView = c80316Vfc.LJIIJJI;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c80316Vfc.LJIIZILJ;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.LJLLI;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.LLJ.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.LLJ.setImageDrawable(drawable);
        LJIIJ(this.LLJ, this.LLJIJIL);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        boolean z;
        this.LLJJIJIL.setImageDrawable(drawable);
        if (drawable != null && this.LJLJL.LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        setErrorIconVisible(z);
    }

    public void setHint(CharSequence charSequence) {
        if (this.LLFFF) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.LLJ.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.LLJ.setImageDrawable(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.LLILII.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C20110qd.LIZ(getContext(), i);
        } else {
            drawable = null;
        }
        setStartIconDrawable(drawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0538  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C80315Vfb(android.content.Context r26, android.util.AttributeSet r27) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80315Vfb.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void LJIIIZ(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                LJIIIZ((ViewGroup) childAt, z);
            }
        }
    }

    public static void LJIIJJI(C80364VgO c80364VgO, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean LIZ = C16290kT.LIZ(c80364VgO);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (LIZ || z) {
            z2 = true;
        }
        c80364VgO.setFocusable(z2);
        c80364VgO.setClickable(LIZ);
        c80364VgO.setPressable(LIZ);
        c80364VgO.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C16300kU.LJIJ(c80364VgO, i);
    }

    public final void LJIIJ(C80364VgO c80364VgO, ColorStateList colorStateList) {
        Drawable drawable = c80364VgO.getDrawable();
        if (c80364VgO.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = c80364VgO.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = C07840Sm.LJFF(drawable).mutate();
        C07820Sk.LJII(mutate, ColorStateList.valueOf(colorForState));
        c80364VgO.setImageDrawable(mutate);
    }

    public final void LJIIL(TextView textView, int i) {
        try {
            C023107f.LJII(textView, i);
        } catch (Exception unused) {
            if (1 == 0) {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() == -65281) {
                C023107f.LJII(textView, R.style.m4);
                textView.setTextColor(C04330Ez.LIZIZ(getContext(), R.color.im));
            }
        }
    }

    public final void LJIJ(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.LJLJJL;
        int i2 = 0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.LJLJJL;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean LJ = this.LJLJL.LJ();
        ColorStateList colorStateList3 = this.LLJJJIL;
        if (colorStateList3 != null) {
            this.LLJZ.LJIIJJI(colorStateList3);
            C80225Ve9 c80225Ve9 = this.LLJZ;
            ColorStateList colorStateList4 = this.LLJJJIL;
            if (c80225Ve9.LJIIJ != colorStateList4) {
                c80225Ve9.LJIIJ = colorStateList4;
                c80225Ve9.LJIIIZ();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList5 = this.LLJJJIL;
            if (colorStateList5 != null) {
                i = colorStateList5.getColorForState(new int[]{-16842910}, this.LLJLLIL);
            } else {
                i = this.LLJLLIL;
            }
            this.LLJZ.LJIIJJI(ColorStateList.valueOf(i));
            C80225Ve9 c80225Ve92 = this.LLJZ;
            ColorStateList valueOf = ColorStateList.valueOf(i);
            if (c80225Ve92.LJIIJ != valueOf) {
                c80225Ve92.LJIIJ = valueOf;
                c80225Ve92.LJIIIZ();
            }
        } else if (LJ) {
            C80225Ve9 c80225Ve93 = this.LLJZ;
            AppCompatTextView appCompatTextView2 = this.LJLJL.LJIIJJI;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            c80225Ve93.LJIIJJI(colorStateList2);
        } else if (this.LJLL && (appCompatTextView = this.LJLLI) != null) {
            this.LLJZ.LJIIJJI(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.LLJJJJ) != null) {
            this.LLJZ.LJIIJJI(colorStateList);
        }
        if (z3 || !this.LLJZIJLIL || (isEnabled() && z4)) {
            if (z2 || this.LLJLLL) {
                ValueAnimator valueAnimator = this.LLLF;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.LLLF.cancel();
                }
                if (z && this.LLL) {
                    LIZ(1.0f);
                } else {
                    this.LLJZ.LJIILIIL(1.0f);
                }
                this.LLJLLL = false;
                if (LJFF()) {
                    LJIIIIZZ();
                }
                EditText editText3 = this.LJLJJL;
                if (editText3 != null) {
                    i2 = editText3.getText().length();
                }
                LJIJI(i2);
                LJIJJLI();
                LJJI();
                return;
            }
            return;
        }
        if (!z2 && this.LLJLLL) {
            return;
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LLLF.cancel();
        }
        if (z && this.LLL) {
            LIZ(0.0f);
        } else {
            this.LLJZ.LJIILIIL(0.0f);
        }
        if (LJFF() && (!((C80422VhK) this.LLI).LLFFF.isEmpty()) && LJFF()) {
            ((C80422VhK) this.LLI).LJIIZILJ(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.LLJLLL = true;
        AppCompatTextView appCompatTextView3 = this.LJLLLLLL;
        if (appCompatTextView3 != null && this.LJLLLL) {
            appCompatTextView3.setText((CharSequence) null);
            this.LJLLLLLL.setVisibility(4);
        }
        LJIJJLI();
        LJJI();
    }

    public final void LJIL(boolean z, boolean z2) {
        int defaultColor = this.LLJJLIIIJLLLLLLLZ.getDefaultColor();
        int colorForState = this.LLJJLIIIJLLLLLLLZ.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.LLJJLIIIJLLLLLLLZ.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.LLIIJLIL = colorForState2;
        } else if (z2) {
            this.LLIIJLIL = colorForState;
        } else {
            this.LLIIJLIL = defaultColor;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.LJLJJL;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.LJLJJLL != null) {
            boolean z = this.LLFZ;
            this.LLFZ = false;
            CharSequence hint = editText.getHint();
            this.LJLJJL.setHint(this.LJLJJLL);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.LJLJJL.setHint(hint);
                this.LLFZ = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.LJLIL.getChildCount());
        for (int i2 = 0; i2 < this.LJLIL.getChildCount(); i2++) {
            View childAt = this.LJLIL.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.LJLJJL) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int max;
        boolean z;
        EditText editText;
        super.onMeasure(i, i2);
        if (this.LJLJJL == null || this.LJLJJL.getMeasuredHeight() >= (max = Math.max(this.LJLJI.getMeasuredHeight(), this.LJLILLLLZI.getMeasuredHeight()))) {
            z = false;
        } else {
            this.LJLJJL.setMinimumHeight(max);
            z = true;
        }
        boolean LJIILL = LJIILL();
        if (z || LJIILL) {
            this.LJLJJL.post(new RunnableC80322Vfi(this));
        }
        if (this.LJLLLLLL != null && (editText = this.LJLJJL) != null) {
            this.LJLLLLLL.setGravity(editText.getGravity());
            this.LJLLLLLL.setPadding(this.LJLJJL.getCompoundPaddingLeft(), this.LJLJJL.getCompoundPaddingTop(), this.LJLJJL.getCompoundPaddingRight(), this.LJLJJL.getCompoundPaddingBottom());
        }
        LJIJJ();
        LJJ();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.LJLIL.addView(view, layoutParams2);
            this.LJLIL.setLayoutParams(layoutParams);
            LJIIZILJ();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public static void LIZLLL(C80364VgO c80364VgO, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = c80364VgO.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C07840Sm.LJFF(drawable).mutate();
            if (z) {
                C07820Sk.LJII(drawable, colorStateList);
            }
            if (z2) {
                C07820Sk.LJIIIIZZ(drawable, mode);
            }
        }
        if (c80364VgO.getDrawable() != drawable) {
            c80364VgO.setImageDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.LJLJJL;
        if (editText != null) {
            Rect rect = this.LLIILII;
            C73022SlG.LIZ(this, editText, rect);
            C80418VhG c80418VhG = this.LLIFFJFJJ;
            if (c80418VhG != null) {
                int i5 = rect.bottom;
                c80418VhG.setBounds(rect.left, i5 - this.LLIIJI, rect.right, i5);
            }
            if (this.LLFFF) {
                C80225Ve9 c80225Ve9 = this.LLJZ;
                float textSize = this.LJLJJL.getTextSize();
                if (c80225Ve9.LJIIIIZZ != textSize) {
                    c80225Ve9.LJIIIIZZ = textSize;
                    c80225Ve9.LJIIIZ();
                }
                int gravity = this.LJLJJL.getGravity();
                C80225Ve9 c80225Ve92 = this.LLJZ;
                int i6 = (gravity & (-113)) | 48;
                if (c80225Ve92.LJII != i6) {
                    c80225Ve92.LJII = i6;
                    c80225Ve92.LJIIIZ();
                }
                C80225Ve9 c80225Ve93 = this.LLJZ;
                if (c80225Ve93.LJI != gravity) {
                    c80225Ve93.LJI = gravity;
                    c80225Ve93.LJIIIZ();
                }
                C80225Ve9 c80225Ve94 = this.LLJZ;
                if (this.LJLJJL != null) {
                    Rect rect2 = this.LLIILZL;
                    if (C16310kV.LIZLLL(this) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rect2.bottom = rect.bottom;
                    int i7 = this.LLIIIILZ;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            int compoundPaddingLeft = this.LJLJJL.getCompoundPaddingLeft() + rect.left;
                            if (this.LL != null && !z2) {
                                compoundPaddingLeft = (compoundPaddingLeft - this.LLD.getMeasuredWidth()) + this.LLD.getPaddingLeft();
                            }
                            rect2.left = compoundPaddingLeft;
                            rect2.top = getPaddingTop();
                            int compoundPaddingRight = rect.right - this.LJLJJL.getCompoundPaddingRight();
                            if (this.LL != null && z2) {
                                compoundPaddingRight += this.LLD.getMeasuredWidth() - this.LLD.getPaddingRight();
                            }
                            rect2.right = compoundPaddingRight;
                        } else {
                            rect2.left = this.LJLJJL.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - LJ();
                            rect2.right = rect.right - this.LJLJJL.getPaddingRight();
                        }
                    } else {
                        int compoundPaddingLeft2 = this.LJLJJL.getCompoundPaddingLeft() + rect.left;
                        if (this.LL != null && !z2) {
                            compoundPaddingLeft2 = (compoundPaddingLeft2 - this.LLD.getMeasuredWidth()) + this.LLD.getPaddingLeft();
                        }
                        rect2.left = compoundPaddingLeft2;
                        rect2.top = rect.top + this.LLIIIJ;
                        int compoundPaddingRight2 = rect.right - this.LJLJJL.getCompoundPaddingRight();
                        if (this.LL != null && z2) {
                            compoundPaddingRight2 += this.LLD.getMeasuredWidth() - this.LLD.getPaddingRight();
                        }
                        rect2.right = compoundPaddingRight2;
                    }
                    c80225Ve94.getClass();
                    int i8 = rect2.left;
                    int i9 = rect2.top;
                    int i10 = rect2.right;
                    int i11 = rect2.bottom;
                    Rect rect3 = c80225Ve94.LJ;
                    if (rect3.left != i8 || rect3.top != i9 || rect3.right != i10 || rect3.bottom != i11) {
                        rect3.set(i8, i9, i10, i11);
                        c80225Ve94.LJJIIZ = true;
                        c80225Ve94.LJIIIIZZ();
                    }
                    C80225Ve9 c80225Ve95 = this.LLJZ;
                    if (this.LJLJJL != null) {
                        Rect rect4 = this.LLIILZL;
                        TextPaint textPaint = c80225Ve95.LJJIJ;
                        textPaint.setTextSize(c80225Ve95.LJIIIIZZ);
                        textPaint.setTypeface(c80225Ve95.LJIJI);
                        textPaint.setLetterSpacing(c80225Ve95.LJJJJI);
                        float f = -c80225Ve95.LJJIJ.ascent();
                        rect4.left = this.LJLJJL.getCompoundPaddingLeft() + rect.left;
                        if (this.LLIIIILZ == 1 && this.LJLJJL.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.LJLJJL.getCompoundPaddingTop();
                        }
                        rect4.top = compoundPaddingTop;
                        rect4.right = rect.right - this.LJLJJL.getCompoundPaddingRight();
                        if (this.LLIIIILZ == 1 && this.LJLJJL.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect4.top + f);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.LJLJJL.getCompoundPaddingBottom();
                        }
                        rect4.bottom = compoundPaddingBottom;
                        int i12 = rect4.left;
                        int i13 = rect4.top;
                        int i14 = rect4.right;
                        Rect rect5 = c80225Ve95.LIZLLL;
                        if (rect5.left != i12 || rect5.top != i13 || rect5.right != i14 || rect5.bottom != compoundPaddingBottom) {
                            rect5.set(i12, i13, i14, compoundPaddingBottom);
                            c80225Ve95.LJJIIZ = true;
                            c80225Ve95.LJIIIIZZ();
                        }
                        this.LLJZ.LJIIIZ();
                        if (LJFF() && !this.LLJLLL) {
                            LJIIIIZZ();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }
}
