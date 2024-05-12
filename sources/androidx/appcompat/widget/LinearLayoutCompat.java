package androidx.appcompat.widget;

import X.AnonymousClass030;
import X.AnonymousClass033;
import X.C010402i;
import X.C03Q;
import X.X1D;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import o3.h0;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public float LJLJL;
    public boolean LJLJLJ;
    public int[] LJLJLLL;
    public int[] LJLL;
    public Drawable LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public C010402i generateDefaultLayoutParams() {
        int i = this.LJLJJI;
        if (i == 0) {
            return new C010402i(-2, -2);
        }
        if (i == 1) {
            return new C010402i(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.LJLILLLLZI < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.LJLILLLLZI;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.LJLILLLLZI == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.LJLJI;
            if (this.LJLJJI == 1 && (i = this.LJLJJL & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.LJLJJLL;
                    }
                } else {
                    i3 = AnonymousClass030.LIZJ(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.LJLJJLL, 2, i3);
                }
            }
            return i3 + ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public int getBaselineAlignedChildIndex() {
        return this.LJLILLLLZI;
    }

    public Drawable getDividerDrawable() {
        return this.LJLLI;
    }

    public int getDividerPadding() {
        return this.LJLLLL;
    }

    public int getDividerWidth() {
        return this.LJLLILLLL;
    }

    public int getGravity() {
        return this.LJLJJL;
    }

    public int getOrientation() {
        return this.LJLJJI;
    }

    public int getShowDividers() {
        return this.LJLLL;
    }

    public float getWeightSum() {
        return this.LJLJL;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public C010402i generateLayoutParams(AttributeSet attributeSet) {
        return new C010402i(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public C010402i generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C010402i(layoutParams);
    }

    public final boolean LJII(int i) {
        if (i == 0) {
            if ((this.LJLLL & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i == getChildCount()) {
            if ((this.LJLLL & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.LJLLL & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C010402i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.LJLLI == null) {
            return;
        }
        int i2 = 0;
        if (this.LJLJJI == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && LJII(i2)) {
                    LIZJ((childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin) - this.LJLLJ, canvas);
                }
                i2++;
            }
            if (LJII(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.LJLLJ;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                }
                LIZJ(bottom, canvas);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean LIZ = C03Q.LIZ(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && LJII(i2)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                if (LIZ) {
                    left2 = childAt3.getRight() + layoutParams.rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - layoutParams.leftMargin) - this.LJLLILLLL;
                }
                LIZLLL(left2, canvas);
            }
            i2++;
        }
        if (LJII(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (LIZ) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.LJLLILLLL;
                    right = left - i;
                }
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt4.getLayoutParams();
                if (LIZ) {
                    left = childAt4.getLeft() - layoutParams2.leftMargin;
                    i = this.LJLLILLLL;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + layoutParams2.rightMargin;
                }
            }
            LIZLLL(right, canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setBaselineAligned(boolean z) {
        this.LJLIL = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.LJLILLLLZI = i;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("base aligned child index out of range (0, ");
        LIZ.append(getChildCount());
        LIZ.append(")");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.LJLLI) {
            return;
        }
        this.LJLLI = drawable;
        boolean z = false;
        if (drawable != null) {
            this.LJLLILLLL = drawable.getIntrinsicWidth();
            this.LJLLJ = drawable.getIntrinsicHeight();
        } else {
            this.LJLLILLLL = 0;
            this.LJLLJ = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.LJLLLL = i;
    }

    public void setGravity(int i) {
        if (this.LJLJJL != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.LJLJJL = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.LJLJJL;
        if ((8388615 & i3) != i2) {
            this.LJLJJL = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.LJLJLJ = z;
    }

    public void setOrientation(int i) {
        if (this.LJLJJI != i) {
            this.LJLJJI = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.LJLLL) {
            requestLayout();
        }
        this.LJLLL = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.LJLJJL;
        if ((i3 & 112) != i2) {
            this.LJLJJL = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.LJLJL = Math.max(0.0f, f);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(int i, Canvas canvas) {
        this.LJLLI.setBounds(getPaddingLeft() + this.LJLLLL, i, (getWidth() - getPaddingRight()) - this.LJLLLL, this.LJLLJ + i);
        this.LJLLI.draw(canvas);
    }

    public final void LIZLLL(int i, Canvas canvas) {
        this.LJLLI.setBounds(i, getPaddingTop() + this.LJLLLL, this.LJLLILLLL + i, (getHeight() - getPaddingBottom()) - this.LJLLLL);
        this.LJLLI.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x022e, code lost:
    
        if (r9.width == (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04d9, code lost:
    
        if (r9[3] != (-1)) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0703, code lost:
    
        if (r9[3] != (-1)) goto L348;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0659  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = true;
        this.LJLILLLLZI = -1;
        this.LJLJJL = 8388659;
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, new int[]{R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, com.zhiliaoapp.musically.R.attr.a_b, com.zhiliaoapp.musically.R.attr.a_k, com.zhiliaoapp.musically.R.attr.b0q, com.zhiliaoapp.musically.R.attr.bap}, i, 0);
        h0.LJIJ(this, context, new int[]{R.attr.gravity, R.attr.orientation, R.attr.baselineAligned, R.attr.baselineAlignedChildIndex, R.attr.weightSum, com.zhiliaoapp.musically.R.attr.a_b, com.zhiliaoapp.musically.R.attr.a_k, com.zhiliaoapp.musically.R.attr.b0q, com.zhiliaoapp.musically.R.attr.bap}, attributeSet, LJIILIIL.LIZIZ, i);
        int LJII = LJIILIIL.LJII(1, -1);
        if (LJII >= 0) {
            setOrientation(LJII);
        }
        int LJII2 = LJIILIIL.LJII(0, -1);
        if (LJII2 >= 0) {
            setGravity(LJII2);
        }
        boolean LIZ = LJIILIIL.LIZ(2, true);
        if (!LIZ) {
            setBaselineAligned(LIZ);
        }
        this.LJLJL = LJIILIIL.LIZIZ.getFloat(4, -1.0f);
        this.LJLILLLLZI = LJIILIIL.LJII(3, -1);
        this.LJLJLJ = LJIILIIL.LIZ(7, false);
        setDividerDrawable(LJIILIIL.LJ(5));
        this.LJLLL = LJIILIIL.LJII(8, 0);
        this.LJLLLL = LJIILIIL.LIZLLL(6, 0);
        LJIILIIL.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }
}
