package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexItem;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vcf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80133Vcf extends ViewGroup implements InterfaceC80136Vci {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public Drawable LJLJL;
    public Drawable LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int[] LJLLJ;
    public SparseIntArray LJLLL;
    public final C80135Vch LJLLLL;
    public List<C80134Vcg> LJLLLLLL;
    public final C80130Vcc LJLZ;

    @Override // X.InterfaceC80136Vci
    public final int LJ(View view) {
        return 0;
    }

    @Override // X.InterfaceC80136Vci
    public final void LJIILL(int i, View view) {
    }

    @Override // X.InterfaceC80136Vci
    public final boolean LJIILLIIL() {
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public List<C80134Vcg> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.LJLLLLLL.size());
        for (C80134Vcg c80134Vcg : this.LJLLLLLL) {
            if (c80134Vcg.LJII - c80134Vcg.LJIIIIZZ != 0) {
                arrayList.add(c80134Vcg);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC80136Vci
    public int getLargestMainSize() {
        Iterator<C80134Vcg> it = this.LJLLLLLL.iterator();
        int i = LiveLayoutPreloadThreadPriority.DEFAULT;
        while (it.hasNext()) {
            i = Math.max(i, it.next().LJ);
        }
        return i;
    }

    @Override // X.InterfaceC80136Vci
    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.LJLLLLLL.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LJLLLLLL, i4);
            if (LJIILIIL(i4)) {
                if (LJIILLIIL()) {
                    i2 = this.LJLLI;
                } else {
                    i2 = this.LJLLILLLL;
                }
                i3 += i2;
            }
            if (LJIIZILJ(i4)) {
                if (LJIILLIIL()) {
                    i = this.LJLLI;
                } else {
                    i = this.LJLLILLLL;
                }
                i3 += i;
            }
            i3 += c80134Vcg.LJI;
        }
        return i3;
    }

    @Override // X.InterfaceC80136Vci
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // X.InterfaceC80136Vci
    public int getAlignContent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC80136Vci
    public int getAlignItems() {
        return this.LJLJJI;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.LJLJL;
    }

    public Drawable getDividerDrawableVertical() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC80136Vci
    public int getFlexDirection() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC80136Vci
    public List<C80134Vcg> getFlexLinesInternal() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC80136Vci
    public int getFlexWrap() {
        return this.LJLILLLLZI;
    }

    public int getJustifyContent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC80136Vci
    public int getMaxLine() {
        return this.LJLJJLL;
    }

    public int getShowDividerHorizontal() {
        return this.LJLJLLL;
    }

    public int getShowDividerVertical() {
        return this.LJLL;
    }

    @Override // X.InterfaceC80136Vci
    public final void LJI(C80134Vcg c80134Vcg) {
        if (LJIILLIIL()) {
            if ((this.LJLL & 4) > 0) {
                int i = c80134Vcg.LJ;
                int i2 = this.LJLLILLLL;
                c80134Vcg.LJ = i + i2;
                c80134Vcg.LJFF += i2;
                return;
            }
            return;
        }
        if ((this.LJLJLLL & 4) <= 0) {
            return;
        }
        int i3 = c80134Vcg.LJ;
        int i4 = this.LJLLI;
        c80134Vcg.LJ = i3 + i4;
        c80134Vcg.LJFF += i4;
    }

    public final View LJII(int i) {
        if (i >= 0) {
            int[] iArr = this.LJLLJ;
            if (i >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i]);
        }
        return null;
    }

    @Override // X.InterfaceC80136Vci
    public final View LJIIIZ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC80136Vci
    public final View LJIIJJI(int i) {
        return LJII(i);
    }

    public final boolean LJIILIIL(int i) {
        if (i < 0 || i >= this.LJLLLLLL.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LJLLLLLL, i2);
            if (c80134Vcg.LJII - c80134Vcg.LJIIIIZZ > 0) {
                if (LJIILLIIL()) {
                    if ((this.LJLJLLL & 2) == 0) {
                        return false;
                    }
                    return true;
                }
                if ((this.LJLL & 2) == 0) {
                    return false;
                }
                return true;
            }
        }
        if (LJIILLIIL()) {
            if ((this.LJLJLLL & 1) == 0) {
                return false;
            }
            return true;
        }
        if ((this.LJLL & 1) == 0) {
            return false;
        }
        return true;
    }

    public final boolean LJIIZILJ(int i) {
        if (i < 0 || i >= this.LJLLLLLL.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.LJLLLLLL.size(); i2++) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LJLLLLLL, i2);
            if (c80134Vcg.LJII - c80134Vcg.LJIIIIZZ > 0) {
                return false;
            }
        }
        if (LJIILLIIL()) {
            if ((this.LJLJLLL & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.LJLL & 4) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FlexboxLayout$LayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof FlexboxLayout$LayoutParams) {
            return new FlexboxLayout$LayoutParams((FlexboxLayout$LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new FlexboxLayout$LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new FlexboxLayout$LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.LJLJLJ == null && this.LJLJL == null) {
            return;
        }
        if (this.LJLJLLL == 0 && this.LJLL == 0) {
            return;
        }
        int LIZLLL = C16310kV.LIZLLL(this);
        int i = this.LJLIL;
        boolean z3 = false;
        boolean z4 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    if (LIZLLL == 1) {
                        z3 = true;
                    }
                    if (this.LJLILLLLZI == 2) {
                        z3 = !z3;
                    }
                    LIZJ(canvas, z3, true);
                    return;
                }
                if (LIZLLL != 1) {
                    z4 = false;
                }
                if (this.LJLILLLLZI == 2) {
                    z4 = !z4;
                }
                LIZJ(canvas, z4, false);
                return;
            }
            if (LIZLLL != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LJLILLLLZI == 2) {
                z3 = true;
            }
            LIZIZ(canvas, z2, z3);
            return;
        }
        if (LIZLLL == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLILLLLZI == 2) {
            z3 = true;
        }
        LIZIZ(canvas, z, z3);
    }

    public void setAlignContent(int i) {
        if (this.LJLJJL != i) {
            this.LJLJJL = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.LJLJJI != i) {
            this.LJLJJI = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.LJLJL) {
            return;
        }
        this.LJLJL = drawable;
        if (drawable != null) {
            this.LJLLI = drawable.getIntrinsicHeight();
        } else {
            this.LJLLI = 0;
        }
        if (this.LJLJL == null && this.LJLJLJ == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = drawable;
        if (drawable != null) {
            this.LJLLILLLL = drawable.getIntrinsicWidth();
        } else {
            this.LJLLILLLL = 0;
        }
        if (this.LJLJL == null && this.LJLJLJ == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.LJLIL != i) {
            this.LJLIL = i;
            requestLayout();
        }
    }

    @Override // X.InterfaceC80136Vci
    public void setFlexLines(List<C80134Vcg> list) {
        this.LJLLLLLL = list;
    }

    public void setFlexWrap(int i) {
        if (this.LJLILLLLZI != i) {
            this.LJLILLLLZI = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.LJLJI != i) {
            this.LJLJI = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.LJLJLLL) {
            this.LJLJLLL = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.LJLL) {
            this.LJLL = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new FlexboxLayout$LayoutParams(getContext(), attributeSet);
    }

    public C80133Vcf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = -1;
        this.LJLLLL = new C80135Vch(this);
        this.LJLLLLLL = new ArrayList();
        this.LJLZ = new C80130Vcc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.vh, R.attr.vi, R.attr.a_d, R.attr.a_e, R.attr.a_f, R.attr.adc, R.attr.add, R.attr.ajt, R.attr.b0e, R.attr.bal, R.attr.bam, R.attr.bao}, 0, 0);
        this.LJLIL = obtainStyledAttributes.getInt(5, 0);
        this.LJLILLLLZI = obtainStyledAttributes.getInt(6, 0);
        this.LJLJI = obtainStyledAttributes.getInt(7, 0);
        this.LJLJJI = obtainStyledAttributes.getInt(1, 0);
        this.LJLJJL = obtainStyledAttributes.getInt(0, 0);
        this.LJLJJLL = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = obtainStyledAttributes.getInt(9, 0);
        if (i != 0) {
            this.LJLL = i;
            this.LJLJLLL = i;
        }
        int i2 = obtainStyledAttributes.getInt(11, 0);
        if (i2 != 0) {
            this.LJLL = i2;
        }
        int i3 = obtainStyledAttributes.getInt(10, 0);
        if (i3 != 0) {
            this.LJLJLLL = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean LJIIL(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View LJII = LJII(i - i3);
            if (LJII != null && LJII.getVisibility() != 8) {
                if (LJIILLIIL()) {
                    if ((this.LJLL & 2) != 0) {
                        return true;
                    }
                    return false;
                }
                if ((this.LJLJLLL & 2) != 0) {
                    return true;
                }
                return false;
            }
        }
        if (LJIILLIIL()) {
            if ((this.LJLL & 1) != 0) {
                return true;
            }
            return false;
        }
        if ((this.LJLJLLL & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80133Vcf.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC80136Vci
    public final int LIZ(int i, int i2, View view) {
        int i3;
        int i4 = 0;
        if (LJIILLIIL()) {
            if (LJIIL(i, i2)) {
                i4 = 0 + this.LJLLILLLL;
            }
            if ((this.LJLL & 4) > 0) {
                i3 = this.LJLLILLLL;
            } else {
                return i4;
            }
        } else {
            if (LJIIL(i, i2)) {
                i4 = 0 + this.LJLLI;
            }
            if ((this.LJLJLLL & 4) <= 0) {
                return i4;
            }
            i3 = this.LJLLI;
        }
        return i4 + i3;
    }

    public final void LIZIZ(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.LJLLLLLL.size();
        for (int i3 = 0; i3 < size; i3++) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LJLLLLLL, i3);
            for (int i4 = 0; i4 < c80134Vcg.LJII; i4++) {
                int i5 = c80134Vcg.LJIILJJIL + i4;
                View LJII = LJII(i5);
                if (LJII != null && LJII.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJII.getLayoutParams();
                    if (LJIIL(i5, i4)) {
                        if (z) {
                            left = LJII.getRight() + marginLayoutParams.rightMargin;
                        } else {
                            left = (LJII.getLeft() - marginLayoutParams.leftMargin) - this.LJLLILLLL;
                        }
                        LJFF(canvas, left, c80134Vcg.LIZIZ, c80134Vcg.LJI);
                    }
                    if (i4 == c80134Vcg.LJII - 1 && (this.LJLL & 4) > 0) {
                        if (z) {
                            right = (LJII.getLeft() - marginLayoutParams.leftMargin) - this.LJLLILLLL;
                        } else {
                            right = LJII.getRight() + marginLayoutParams.rightMargin;
                        }
                        LJFF(canvas, right, c80134Vcg.LIZIZ, c80134Vcg.LJI);
                    }
                }
            }
            if (LJIILIIL(i3)) {
                if (z2) {
                    i2 = c80134Vcg.LIZLLL;
                } else {
                    i2 = c80134Vcg.LIZIZ - this.LJLLI;
                }
                LIZLLL(canvas, paddingLeft, i2, max);
            }
            if (LJIIZILJ(i3) && (this.LJLJLLL & 4) > 0) {
                if (z2) {
                    i = c80134Vcg.LIZIZ - this.LJLLI;
                } else {
                    i = c80134Vcg.LIZLLL;
                }
                LIZLLL(canvas, paddingLeft, i, max);
            }
        }
    }

    public final void LIZJ(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.LJLLLLLL.size();
        for (int i3 = 0; i3 < size; i3++) {
            C80134Vcg c80134Vcg = (C80134Vcg) ListProtector.get(this.LJLLLLLL, i3);
            for (int i4 = 0; i4 < c80134Vcg.LJII; i4++) {
                int i5 = c80134Vcg.LJIILJJIL + i4;
                View LJII = LJII(i5);
                if (LJII != null && LJII.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LJII.getLayoutParams();
                    if (LJIIL(i5, i4)) {
                        if (z2) {
                            top = LJII.getBottom() + marginLayoutParams.bottomMargin;
                        } else {
                            top = (LJII.getTop() - marginLayoutParams.topMargin) - this.LJLLI;
                        }
                        LIZLLL(canvas, c80134Vcg.LIZ, top, c80134Vcg.LJI);
                    }
                    if (i4 == c80134Vcg.LJII - 1 && (this.LJLJLLL & 4) > 0) {
                        if (z2) {
                            bottom = (LJII.getTop() - marginLayoutParams.topMargin) - this.LJLLI;
                        } else {
                            bottom = LJII.getBottom() + marginLayoutParams.bottomMargin;
                        }
                        LIZLLL(canvas, c80134Vcg.LIZ, bottom, c80134Vcg.LJI);
                    }
                }
            }
            if (LJIILIIL(i3)) {
                if (z) {
                    i2 = c80134Vcg.LIZJ;
                } else {
                    i2 = c80134Vcg.LIZ - this.LJLLILLLL;
                }
                LJFF(canvas, i2, paddingTop, max);
            }
            if (LJIIZILJ(i3) && (this.LJLL & 4) > 0) {
                if (z) {
                    i = c80134Vcg.LIZ - this.LJLLILLLL;
                } else {
                    i = c80134Vcg.LIZJ;
                }
                LJFF(canvas, i, paddingTop, max);
            }
        }
    }

    @Override // X.InterfaceC80136Vci
    public final int LJIIJ(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // X.InterfaceC80136Vci
    public final int LJIILJJIL(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLLL == null) {
            this.LJLLL = new SparseIntArray(getChildCount());
        }
        C80135Vch c80135Vch = this.LJLLLL;
        SparseIntArray sparseIntArray = this.LJLLL;
        int flexItemCount = c80135Vch.LIZ.getFlexItemCount();
        List<C80138Vck> LJFF = c80135Vch.LJFF(flexItemCount);
        C80138Vck c80138Vck = new C80138Vck();
        if (view != null && (layoutParams instanceof FlexItem)) {
            c80138Vck.LJLILLLLZI = ((FlexItem) layoutParams).getOrder();
        } else {
            c80138Vck.LJLILLLLZI = 1;
        }
        if (i == -1 || i == flexItemCount) {
            c80138Vck.LJLIL = flexItemCount;
        } else if (i < c80135Vch.LIZ.getFlexItemCount()) {
            c80138Vck.LJLIL = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C80138Vck) ListProtector.get(LJFF, i2)).LJLIL++;
            }
        } else {
            c80138Vck.LJLIL = flexItemCount;
        }
        ((ArrayList) LJFF).add(c80138Vck);
        this.LJLLJ = C80135Vch.LJIIZILJ(flexItemCount + 1, LJFF, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    public final void LIZLLL(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.LJLJL;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.LJLLI + i2);
        this.LJLJL.draw(canvas);
    }

    public final void LJFF(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.LJLJLJ;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.LJLLILLLL + i, i3 + i2);
        this.LJLJLJ.draw(canvas);
    }

    @Override // X.InterfaceC80136Vci
    public final void LJIIIIZZ(View view, int i, int i2, C80134Vcg c80134Vcg) {
        if (LJIIL(i, i2)) {
            if (LJIILLIIL()) {
                int i3 = c80134Vcg.LJ;
                int i4 = this.LJLLILLLL;
                c80134Vcg.LJ = i3 + i4;
                c80134Vcg.LJFF += i4;
                return;
            }
            int i5 = c80134Vcg.LJ;
            int i6 = this.LJLLI;
            c80134Vcg.LJ = i5 + i6;
            c80134Vcg.LJFF += i6;
        }
    }

    public final void LJIJJ(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                paddingBottom = getLargestMainSize();
                largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
            } else {
                throw new IllegalArgumentException(KMP.LJ("Invalid flex direction: ", i));
            }
        } else {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i4 = View.combineMeasuredStates(i4, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
                } else {
                    throw new IllegalStateException(KMP.LJ("Unknown width mode is set: ", mode));
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
            }
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < paddingBottom) {
                        i4 = View.combineMeasuredStates(i4, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
                } else {
                    throw new IllegalStateException(KMP.LJ("Unknown height mode is set: ", mode2));
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
            }
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(int r30, int r31, int r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80133Vcf.LJIJ(int, int, int, int, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int LIZLLL = C16310kV.LIZLLL(this);
        int i5 = this.LJLIL;
        boolean z4 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (LIZLLL == 1) {
                            z4 = true;
                        }
                        if (this.LJLILLLLZI == 2) {
                            z4 = !z4;
                        }
                        LJIJI(i, i2, i3, i4, z4, true);
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Invalid flex direction is set: ");
                    LIZ.append(this.LJLIL);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
                if (LIZLLL == 1) {
                    z4 = true;
                }
                if (this.LJLILLLLZI == 2) {
                    z4 = !z4;
                }
                LJIJI(i, i2, i3, i4, z4, false);
                return;
            }
            if (LIZLLL != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIJ(i, i2, i3, i4, z3);
            return;
        }
        if (LIZLLL == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJIJ(i, i2, i3, i4, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(int r31, int r32, int r33, int r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80133Vcf.LJIJI(int, int, int, int, boolean, boolean):void");
    }
}
