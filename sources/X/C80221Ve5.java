package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* renamed from: X.Ve5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80221Ve5 extends FrameLayout {
    public boolean LJLIL;
    public final int LJLILLLLZI;
    public ViewGroup LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final Rect LJLL;
    public final C80225Ve9 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public Drawable LJLLL;
    public Drawable LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public ValueAnimator LJZ;
    public long LJZI;
    public int LJZL;
    public C80216Ve0 LL;
    public int LLD;
    public C16800lI LLF;

    public final void LIZ() {
        if (!this.LJLIL) {
            return;
        }
        ViewGroup viewGroup = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        int i = this.LJLILLLLZI;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.LJLJI = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.LJLJJI = view;
            }
        }
        if (this.LJLJI == null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if ((childAt instanceof C011902x) || (childAt instanceof Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.LJLJI = viewGroup;
        }
        LIZJ();
        this.LJLIL = false;
    }

    public final void LIZJ() {
        View view;
        if (!this.LJLLILLLL && (view = this.LJLJJL) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(this.LJLJJL, (ViewGroup) parent);
            }
        }
        if (this.LJLLILLLL && this.LJLJI != null) {
            if (this.LJLJJL == null) {
                this.LJLJJL = new View(getContext());
            }
            if (this.LJLJJL.getParent() == null) {
                this.LJLJI.addView(this.LJLJJL, -1, -1);
            }
        }
    }

    public final void LIZLLL() {
        boolean z;
        if (this.LJLLL != null || this.LJLLLL != null) {
            if (getHeight() + this.LLD < getScrimVisibleHeightTrigger()) {
                z = true;
            } else {
                z = false;
            }
            setScrimsShown(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C79856VVs();
    }

    public int getCollapsedTitleGravity() {
        return this.LJLLI.LJII;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.LJLLI.LJIJ;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.LJLLI.LJI;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.LJLLI.LJIJI;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public int getMaxLines() {
        return this.LJLLI.LJJJJLL;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.LJZL;
        if (i2 >= 0) {
            return i2;
        }
        C16800lI c16800lI = this.LLF;
        if (c16800lI != null) {
            i = c16800lI.LJ();
        } else {
            i = 0;
        }
        int LIZLLL = C16300kU.LIZLLL(this);
        if (LIZLLL > 0) {
            return Math.min((LIZLLL * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public CharSequence getTitle() {
        if (this.LJLLILLLL) {
            return this.LJLLI.LJJ;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LJLLLL;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.LJLLL;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C80225Ve9 c80225Ve9 = this.LJLLI;
        if (c80225Ve9 != null) {
            z |= c80225Ve9.LJIILL(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof C80217Ve1) {
            setFitsSystemWindows(C16300kU.LIZIZ((View) parent));
            if (this.LL == null) {
                this.LL = new C80216Ve0(this);
            }
            ((C80217Ve1) parent).LIZ(this.LL);
            C16340kY.LIZJ(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        List<VTY> list;
        ViewParent parent = getParent();
        C80216Ve0 c80216Ve0 = this.LL;
        if (c80216Ve0 != null && (parent instanceof C80217Ve1) && (list = ((C80217Ve1) parent).LJLJLJ) != null) {
            ((ArrayList) list).remove(c80216Ve0);
        }
        super.onDetachedFromWindow();
    }

    public Drawable getContentScrim() {
        return this.LJLLL;
    }

    public int getExpandedTitleMarginBottom() {
        return this.LJLJLLL;
    }

    public int getExpandedTitleMarginEnd() {
        return this.LJLJLJ;
    }

    public int getExpandedTitleMarginStart() {
        return this.LJLJJLL;
    }

    public int getExpandedTitleMarginTop() {
        return this.LJLJL;
    }

    public int getScrimAlpha() {
        return this.LJLLLLLL;
    }

    public long getScrimAnimationDuration() {
        return this.LJZI;
    }

    public Drawable getStatusBarScrim() {
        return this.LJLLLL;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C79856VVs();
    }

    public static C80215Vdz LIZIZ(View view) {
        C80215Vdz c80215Vdz = (C80215Vdz) view.getTag(R.id.nb0);
        if (c80215Vdz == null) {
            C80215Vdz c80215Vdz2 = new C80215Vdz(view);
            view.setTag(R.id.nb0, c80215Vdz2);
            return c80215Vdz2;
        }
        return c80215Vdz;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C79856VVs;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C16800lI c16800lI;
        int LJ;
        Drawable drawable;
        super.draw(canvas);
        LIZ();
        if (this.LJLJI == null && (drawable = this.LJLLL) != null && this.LJLLLLLL > 0) {
            drawable.mutate().setAlpha(this.LJLLLLLL);
            this.LJLLL.draw(canvas);
        }
        if (this.LJLLILLLL && this.LJLLJ) {
            this.LJLLI.LJ(canvas);
        }
        if (this.LJLLLL != null && this.LJLLLLLL > 0 && (c16800lI = this.LLF) != null && (LJ = c16800lI.LJ()) > 0) {
            this.LJLLLL.setBounds(0, -this.LLD, getWidth(), LJ - this.LLD);
            this.LJLLLL.mutate().setAlpha(this.LJLLLLLL);
            this.LJLLLL.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C79856VVs(getContext(), attributeSet);
    }

    public void setCollapsedTitleGravity(int i) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        if (c80225Ve9.LJII != i) {
            c80225Ve9.LJII = i;
            c80225Ve9.LJIIIZ();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.LJLLI.LJIIJ(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        C80227VeB c80227VeB = c80225Ve9.LJIL;
        if (c80227VeB != null) {
            c80227VeB.LJLJI = true;
        }
        if (c80225Ve9.LJIJ != typeface) {
            c80225Ve9.LJIJ = typeface;
            c80225Ve9.LJIIIZ();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.LJLLL;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.LJLLL = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.LJLLL.setCallback(this);
                this.LJLLL.setAlpha(this.LJLLLLLL);
            }
            C16300kU.LJIIJ(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C04270Et.LIZIZ(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        if (c80225Ve9.LJI != i) {
            c80225Ve9.LJI = i;
            c80225Ve9.LJIIIZ();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.LJLJLLL = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.LJLJLJ = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.LJLJJLL = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.LJLJL = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.LJLLI.LJIIL(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        if (c80225Ve9.LJIIJ != colorStateList) {
            c80225Ve9.LJIIJ = colorStateList;
            c80225Ve9.LJIIIZ();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        C80227VeB c80227VeB = c80225Ve9.LJIJJLI;
        if (c80227VeB != null) {
            c80227VeB.LJLJI = true;
        }
        if (c80225Ve9.LJIJI != typeface) {
            c80225Ve9.LJIJI = typeface;
            c80225Ve9.LJIIIZ();
        }
    }

    public void setMaxLines(int i) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
        if (i != c80225Ve9.LJJJJLL) {
            c80225Ve9.LJJJJLL = i;
            Bitmap bitmap = c80225Ve9.LJJII;
            if (bitmap != null) {
                bitmap.recycle();
                c80225Ve9.LJJII = null;
            }
            c80225Ve9.LJIIIZ();
        }
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.LJLLLLLL) {
            if (this.LJLLL != null && (viewGroup = this.LJLJI) != null) {
                C16300kU.LJIIJ(viewGroup);
            }
            this.LJLLLLLL = i;
            C16300kU.LJIIJ(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.LJZI = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.LJZL != i) {
            this.LJZL = i;
            LIZLLL();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        TimeInterpolator timeInterpolator;
        int i = 0;
        if (C16330kX.LIZJ(this) && !isInEditMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJLZ != z) {
            int i2 = 255;
            if (z2) {
                if (!z) {
                    i2 = 0;
                }
                LIZ();
                ValueAnimator valueAnimator = this.LJZ;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.LJZ = valueAnimator2;
                    valueAnimator2.setDuration(this.LJZI);
                    ValueAnimator valueAnimator3 = this.LJZ;
                    if (i2 > this.LJLLLLLL) {
                        timeInterpolator = C80237VeL.LIZJ;
                    } else {
                        timeInterpolator = C80237VeL.LIZLLL;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.LJZ.addUpdateListener(new C80223Ve7(this));
                } else if (valueAnimator.isRunning()) {
                    this.LJZ.cancel();
                }
                this.LJZ.setIntValues(this.LJLLLLLL, i2);
                this.LJZ.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.LJLZ = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LJLLLL;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.LJLLLL = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.LJLLLL.setState(getDrawableState());
                }
                C07840Sm.LIZJ(this.LJLLLL, C16310kV.LIZLLL(this));
                Drawable drawable4 = this.LJLLLL;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.LJLLLL.setCallback(this);
                this.LJLLLL.setAlpha(this.LJLLLLLL);
            }
            C16300kU.LJIIJ(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C04270Et.LIZIZ(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        C80225Ve9 c80225Ve9 = this.LJLLI;
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
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.LJLLILLLL) {
            this.LJLLILLLL = z;
            setContentDescription(getTitle());
            LIZJ();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LJLLLL;
        if (drawable != null && drawable.isVisible() != z) {
            this.LJLLLL.setVisible(z, false);
        }
        Drawable drawable2 = this.LJLLL;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.LJLLL.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLLL || drawable == this.LJLLLL) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C79856VVs(layoutParams);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.LJLLI.LJIIJJI(colorStateList);
    }

    public C80221Ve5(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.a4_, R.style.y5), attributeSet, R.attr.a4_);
        int i;
        this.LJLIL = true;
        this.LJLL = new Rect();
        this.LJZL = -1;
        Context context2 = getContext();
        C80225Ve9 c80225Ve9 = new C80225Ve9(this);
        this.LJLLI = c80225Ve9;
        c80225Ve9.LJJIJIIJIL = C80237VeL.LJ;
        c80225Ve9.LJIIIZ();
        TypedArray LIZLLL = C80244VeS.LIZLLL(context2, attributeSet, new int[]{R.attr.a48, R.attr.a49, R.attr.a7c, R.attr.aca, R.attr.acb, R.attr.acc, R.attr.acd, R.attr.ace, R.attr.acf, R.attr.acg, R.attr.b0f, R.attr.b_2, R.attr.b_4, R.attr.bev, R.attr.bje, R.attr.bjh, R.attr.bjw}, R.attr.a4_, R.style.y5, new int[0]);
        int i2 = LIZLLL.getInt(3, 8388691);
        if (c80225Ve9.LJI != i2) {
            c80225Ve9.LJI = i2;
            c80225Ve9.LJIIIZ();
        }
        int i3 = LIZLLL.getInt(0, 8388627);
        if (c80225Ve9.LJII != i3) {
            c80225Ve9.LJII = i3;
            c80225Ve9.LJIIIZ();
        }
        int dimensionPixelSize = LIZLLL.getDimensionPixelSize(4, 0);
        this.LJLJLLL = dimensionPixelSize;
        this.LJLJLJ = dimensionPixelSize;
        this.LJLJL = dimensionPixelSize;
        this.LJLJJLL = dimensionPixelSize;
        if (LIZLLL.hasValue(7)) {
            this.LJLJJLL = LIZLLL.getDimensionPixelSize(7, 0);
        }
        if (LIZLLL.hasValue(6)) {
            this.LJLJLJ = LIZLLL.getDimensionPixelSize(6, 0);
        }
        if (LIZLLL.hasValue(8)) {
            this.LJLJL = LIZLLL.getDimensionPixelSize(8, 0);
        }
        if (LIZLLL.hasValue(5)) {
            this.LJLJLLL = LIZLLL.getDimensionPixelSize(5, 0);
        }
        this.LJLLILLLL = LIZLLL.getBoolean(15, true);
        setTitle(C16880lQ.LLLZZ(LIZLLL, 14));
        c80225Ve9.LJIIL(R.style.nl);
        c80225Ve9.LJIIJ(R.style.mw);
        if (LIZLLL.hasValue(9)) {
            c80225Ve9.LJIIL(LIZLLL.getResourceId(9, 0));
        }
        if (LIZLLL.hasValue(1)) {
            c80225Ve9.LJIIJ(LIZLLL.getResourceId(1, 0));
        }
        this.LJZL = LIZLLL.getDimensionPixelSize(12, -1);
        if (LIZLLL.hasValue(10) && (i = LIZLLL.getInt(10, 1)) != c80225Ve9.LJJJJLL) {
            c80225Ve9.LJJJJLL = i;
            Bitmap bitmap = c80225Ve9.LJJII;
            if (bitmap != null) {
                bitmap.recycle();
                c80225Ve9.LJJII = null;
            }
            c80225Ve9.LJIIIZ();
        }
        this.LJZI = LIZLLL.getInt(11, 600);
        setContentScrim(LIZLLL.getDrawable(2));
        setStatusBarScrim(LIZLLL.getDrawable(13));
        this.LJLILLLLZI = LIZLLL.getResourceId(16, -1);
        LIZLLL.recycle();
        setWillNotDraw(false);
        C16360ka.LJIJJ(this, new C80222Ve6(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int measuredHeight2;
        LIZ();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C16800lI c16800lI = this.LLF;
        if (c16800lI != null) {
            i3 = c16800lI.LJ();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            View view = this.LJLJJI;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.LJLLL;
        if (drawable != null && this.LJLLLLLL > 0 && ((view2 = this.LJLJJI) == null || view2 == this ? view == this.LJLJI : view == view2)) {
            drawable.mutate().setAlpha(this.LJLLLLLL);
            this.LJLLL.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.LJLLL;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CharSequence charSequence;
        View view;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z, i, i2, i3, i4);
        C16800lI c16800lI = this.LLF;
        if (c16800lI != null) {
            int LJ = c16800lI.LJ();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (!C16300kU.LIZIZ(childAt) && childAt.getTop() < LJ) {
                    h0.LJIIL(LJ, childAt);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            C80215Vdz LIZIZ = LIZIZ(getChildAt(i13));
            LIZIZ.LIZIZ = LIZIZ.LIZ.getTop();
            LIZIZ.LIZJ = LIZIZ.LIZ.getLeft();
        }
        if (this.LJLLILLLL && (view = this.LJLJJL) != null) {
            if (C16330kX.LIZIZ(view) && this.LJLJJL.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLLJ = z2;
            if (z2) {
                if (C16310kV.LIZLLL(this) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.LJLJJI;
                if (view2 == null) {
                    view2 = this.LJLJI;
                }
                int height = ((getHeight() - LIZIZ(view2).LIZIZ) - view2.getHeight()) - ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
                C73022SlG.LIZ(this, this.LJLJJL, this.LJLL);
                ViewGroup viewGroup = this.LJLJI;
                if (viewGroup instanceof C011902x) {
                    C011902x c011902x = (C011902x) viewGroup;
                    i6 = c011902x.getTitleMarginStart();
                    i7 = c011902x.getTitleMarginEnd();
                    i8 = c011902x.getTitleMarginTop();
                    i5 = c011902x.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof Toolbar)) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i6 = toolbar.getTitleMarginStart();
                    i7 = toolbar.getTitleMarginEnd();
                    i8 = toolbar.getTitleMarginTop();
                    i5 = toolbar.getTitleMarginBottom();
                } else {
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                }
                C80225Ve9 c80225Ve9 = this.LJLLI;
                Rect rect = this.LJLL;
                int i14 = rect.left;
                if (z3) {
                    i9 = i7;
                } else {
                    i9 = i6;
                }
                int i15 = i14 + i9;
                int i16 = rect.top + height + i8;
                int i17 = rect.right;
                if (!z3) {
                    i6 = i7;
                }
                int i18 = i17 - i6;
                int i19 = (rect.bottom + height) - i5;
                Rect rect2 = c80225Ve9.LJ;
                if (rect2.left != i15 || rect2.top != i16 || rect2.right != i18 || rect2.bottom != i19) {
                    rect2.set(i15, i16, i18, i19);
                    c80225Ve9.LJJIIZ = true;
                    c80225Ve9.LJIIIIZZ();
                }
                C80225Ve9 c80225Ve92 = this.LJLLI;
                if (z3) {
                    i10 = this.LJLJLJ;
                } else {
                    i10 = this.LJLJJLL;
                }
                int i20 = this.LJLL.top + this.LJLJL;
                int i21 = i3 - i;
                if (z3) {
                    i11 = this.LJLJJLL;
                } else {
                    i11 = this.LJLJLJ;
                }
                int i22 = i21 - i11;
                int i23 = (i4 - i2) - this.LJLJLLL;
                Rect rect3 = c80225Ve92.LIZLLL;
                if (rect3.left != i10 || rect3.top != i20 || rect3.right != i22 || rect3.bottom != i23) {
                    rect3.set(i10, i20, i22, i23);
                    c80225Ve92.LJJIIZ = true;
                    c80225Ve92.LJIIIIZZ();
                }
                this.LJLLI.LJIIIZ();
            }
        }
        if (this.LJLJI != null && this.LJLLILLLL && TextUtils.isEmpty(this.LJLLI.LJJ)) {
            ViewGroup viewGroup2 = this.LJLJI;
            if (viewGroup2 instanceof C011902x) {
                charSequence = ((C011902x) viewGroup2).getTitle();
            } else if (viewGroup2 instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup2).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
        LIZLLL();
        int childCount3 = getChildCount();
        for (int i24 = 0; i24 < childCount3; i24++) {
            LIZIZ(getChildAt(i24)).LIZ();
        }
    }
}
