package X;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* renamed from: X.Ve1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80217Ve1 extends LinearLayout implements C06B {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public C16800lI LJLJL;
    public List<VTY> LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public WeakReference<View> LJLLJ;
    public ValueAnimator LJLLL;
    public int[] LJLLLL;
    public Drawable LJLLLLLL;

    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C80218Ve2();
    }

    public C06C<C80217Ve1> getBehavior() {
        return new AppBarLayout$Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int LIZLLL;
        int i2 = this.LJLJI;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c80218Ve2.LIZ;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c80218Ve2).topMargin + ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin;
                if ((i4 & 8) != 0) {
                    LIZLLL = C16300kU.LIZLLL(childAt);
                } else if ((i4 & 2) != 0) {
                    LIZLLL = measuredHeight - C16300kU.LIZLLL(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C16300kU.LIZIZ(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = LIZLLL + i5;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.LJLJI = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.LJLJJI;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) c80218Ve2).topMargin + ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin + childAt.getMeasuredHeight();
            int i4 = c80218Ve2.LIZ;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C16300kU.LIZLLL(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.LJLJJI = max;
        return max;
    }

    public final int getTopInset() {
        C16800lI c16800lI = this.LJLJL;
        if (c16800lI != null) {
            return c16800lI.LJ();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.LJLILLLLZI;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C80218Ve2 c80218Ve2 = (C80218Ve2) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c80218Ve2.LIZ;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) c80218Ve2).topMargin + ((LinearLayout.LayoutParams) c80218Ve2).bottomMargin + i3;
            if (i2 == 0 && C16300kU.LIZIZ(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 = i5 - C16300kU.LIZLLL(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.LJLILLLLZI = max;
        return max;
    }

    public final boolean LJI() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C16300kU.LIZIZ(childAt)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int LIZLLL = C16300kU.LIZLLL(this);
        if (LIZLLL != 0 || ((childCount = getChildCount()) >= 1 && (LIZLLL = C16300kU.LIZLLL(getChildAt(childCount - 1))) != 0)) {
            return (LIZLLL * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLILLLL(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.LJLLJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LJLLJ = null;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.LJLLILLLL;
    }

    public int getPendingAction() {
        return this.LJLJJLL;
    }

    public Drawable getStatusBarForeground() {
        return this.LJLLLLLL;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C80218Ve2();
    }

    public static C80218Ve2 LIZIZ(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C80218Ve2((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C80218Ve2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C80218Ve2(layoutParams);
    }

    public final void LIZ(VTX vtx) {
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new ArrayList();
        }
        if (vtx != null && !((ArrayList) this.LJLJLJ).contains(vtx)) {
            ((ArrayList) this.LJLJLJ).add(vtx);
        }
    }

    public final void LIZJ(int i) {
        this.LJLIL = i;
        if (!willNotDraw()) {
            C16300kU.LJIIJ(this);
        }
        List<VTY> list = this.LJLJLJ;
        if (list != null) {
            int size = ((ArrayList) list).size();
            for (int i2 = 0; i2 < size; i2++) {
                VTY vty = (VTY) ListProtector.get(this.LJLJLJ, i2);
                if (vty != null) {
                    vty.LIZ(this, i);
                }
            }
        }
    }

    public final boolean LJ(boolean z) {
        float f;
        if (this.LJLL == z) {
            return false;
        }
        this.LJLL = z;
        refreshDrawableState();
        if (this.LJLLI && (getBackground() instanceof C80418VhG)) {
            C80418VhG c80418VhG = (C80418VhG) getBackground();
            float dimension = getResources().getDimension(R.dimen.lr);
            if (z) {
                f = 0.0f;
            } else {
                f = dimension;
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.LJLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
            this.LJLLL = ofFloat;
            ofFloat.setDuration(getResources().getInteger(R.integer.ae));
            this.LJLLL.setInterpolator(C80237VeL.LIZ);
            this.LJLLL.addUpdateListener(new C79261V8v(c80418VhG));
            this.LJLLL.start();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(android.view.View r4) {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.LJLLJ
            r2 = -1
            if (r0 != 0) goto L2e
            int r0 = r3.LJLLILLLL
            if (r0 == r2) goto L2e
            if (r4 == 0) goto L11
            android.view.View r1 = r4.findViewById(r0)
            if (r1 != 0) goto L27
        L11:
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            android.view.ViewParent r1 = r3.getParent()
            android.view.View r1 = (android.view.View) r1
            int r0 = r3.LJLLILLLL
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L2e
        L27:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r3.LJLLJ = r0
        L2e:
            java.lang.ref.WeakReference<android.view.View> r0 = r3.LJLLJ
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L4c
        L3a:
            if (r4 == 0) goto L4a
        L3c:
            boolean r0 = r4.canScrollVertically(r2)
            if (r0 != 0) goto L48
            int r0 = r4.getScrollY()
            if (r0 <= 0) goto L4a
        L48:
            r0 = 1
        L49:
            return r0
        L4a:
            r0 = 0
            goto L49
        L4c:
            r4 = r0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80217Ve1.LJFF(android.view.View):boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C80218Ve2;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.LJLLLLLL != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.LJLIL);
            this.LJLLLLLL.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80218Ve2(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.LJLLLL == null) {
            this.LJLLLL = new int[4];
        }
        int[] iArr = this.LJLLLL;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.LJLJLLL;
        if (z) {
            i2 = R.attr.ber;
        } else {
            i2 = -2130971423;
        }
        iArr[0] = i2;
        if (z && this.LJLL) {
            i3 = R.attr.bes;
        } else {
            i3 = -2130971424;
        }
        iArr[1] = i3;
        if (z) {
            i4 = R.attr.beo;
        } else {
            i4 = -2130971420;
        }
        iArr[2] = i4;
        if (z && this.LJLL) {
            i5 = R.attr.ben;
        } else {
            i5 = -2130971419;
        }
        iArr[3] = i5;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        V1B.LJLJL(this, f);
    }

    public void setExpanded(boolean z) {
        LIZLLL(z, C16330kX.LIZJ(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.LJLLI = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.LJLLILLLL = i;
        WeakReference<View> weakReference = this.LJLLJ;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.LJLLJ = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LJLLLLLL;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.LJLLLLLL = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.LJLLLLLL.setState(getDrawableState());
                }
                C07840Sm.LIZJ(this.LJLLLLLL, C16310kV.LIZLLL(this));
                Drawable drawable4 = this.LJLLLLLL;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.LJLLLLLL.setCallback(this);
            }
            if (this.LJLLLLLL != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            C16300kU.LJIIJ(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C20110qd.LIZ(getContext(), i));
    }

    public void setTargetElevation(float f) {
        C80220Ve4.LIZ(this, f);
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
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.LJLLLLLL) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C80218Ve2(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LIZIZ(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LIZIZ(layoutParams);
    }

    /* JADX WARN: Finally extract failed */
    public C80217Ve1(Context context, AttributeSet attributeSet) {
        super(C78865UxJ.LIZ(context, attributeSet, R.attr.w6, R.style.y2), attributeSet, R.attr.w6);
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJLL = 0;
        Context context2 = getContext();
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        try {
            Context context3 = getContext();
            TypedArray LIZLLL = C80244VeS.LIZLLL(context3, attributeSet, C80220Ve4.LIZ, R.attr.w6, R.style.y2, new int[0]);
            try {
                if (LIZLLL.hasValue(0)) {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, LIZLLL.getResourceId(0, 0)));
                }
                LIZLLL.recycle();
            } catch (Throwable th) {
                LIZLLL.recycle();
                throw th;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        TypedArray LIZLLL2 = C80244VeS.LIZLLL(context2, attributeSet, new int[]{android.R.attr.background, android.R.attr.touchscreenBlocksFocus, android.R.attr.keyboardNavigationCluster, R.attr.ab6, R.attr.ac9, R.attr.aob, R.attr.aoc, R.attr.beu}, R.attr.w6, R.style.y2, new int[0]);
        C16300kU.LJIILLIIL(this, LIZLLL2.getDrawable(0));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C80418VhG c80418VhG = new C80418VhG();
            c80418VhG.LJIIJJI(ColorStateList.valueOf(colorDrawable.getColor()));
            c80418VhG.LJIIIIZZ(context2);
            C16300kU.LJIILLIIL(this, c80418VhG);
        }
        if (LIZLLL2.hasValue(4)) {
            LIZLLL(LIZLLL2.getBoolean(4, false), false, false);
        }
        if (LIZLLL2.hasValue(3)) {
            C80220Ve4.LIZ(this, LIZLLL2.getDimensionPixelSize(3, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (LIZLLL2.hasValue(2)) {
                setKeyboardNavigationCluster(LIZLLL2.getBoolean(2, false));
            }
            if (LIZLLL2.hasValue(1)) {
                setTouchscreenBlocksFocus(LIZLLL2.getBoolean(1, false));
            }
        }
        this.LJLLI = LIZLLL2.getBoolean(5, false);
        this.LJLLILLLL = LIZLLL2.getResourceId(6, -1);
        setStatusBarForeground(LIZLLL2.getDrawable(7));
        LIZLLL2.recycle();
        C16360ka.LJIJJ(this, new C80219Ve3(this));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C16300kU.LIZIZ(this) && LJI()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C78609UtB.LJJIIZ(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = -1;
    }

    public final void LIZLLL(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.LJLJJLL = i4 | i3;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C16300kU.LIZIZ(this) && LJI()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                h0.LJIIL(topInset, getChildAt(childCount));
            }
        }
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C80218Ve2) getChildAt(i5).getLayoutParams()).LIZIZ != null) {
                this.LJLJJL = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.LJLLLLLL;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.LJLLI) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((C80218Ve2) getChildAt(i6).getLayoutParams()).LIZ;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        if (this.LJLJLLL != z2) {
            this.LJLJLLL = z2;
            refreshDrawableState();
        }
    }
}
