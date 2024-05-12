package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.4mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C119734mv extends ViewGroup {
    public final List<List<View>> LJLIL;
    public final List<Integer> LJLILLLLZI;
    public final List<Integer> LJLJI;
    public final int LJLJJI;
    public List<View> LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getMaxLine() {
        return this.LJLJLJ;
    }

    public final int getSpaceH() {
        return this.LJLJL;
    }

    public final int getSpaceV() {
        return this.LJLJJLL;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public final void setMaxLine(int i) {
        this.LJLJLJ = i;
    }

    public final void setSpaceH(int i) {
        this.LJLJL = i;
    }

    public final void setSpaceV(int i) {
        this.LJLJJLL = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        o.LJIIIZ(p, "p");
        return new ViewGroup.MarginLayoutParams(p);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119734mv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 8) {
                if (i4 == childCount - 1) {
                    i7 = Math.max(i5, i7);
                    i8 += i6;
                }
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i5 + measuredWidth > paddingLeft) {
                    i7 = Math.max(i7, i5);
                    i3 = measuredWidth + this.LJLJL;
                    i8 += i6;
                    i9++;
                    int i10 = this.LJLJLJ;
                    if (i10 > 0 && i9 > i10) {
                        i6 = measuredHeight;
                        break;
                    }
                } else {
                    i3 = measuredWidth + this.LJLJL + i5;
                    measuredHeight = Math.max(i6, measuredHeight);
                }
                if (i4 == childCount - 1) {
                    i7 = Math.max(i3, i7);
                    i8 += measuredHeight;
                }
                i5 = i3;
                i6 = measuredHeight;
            }
            i4++;
        }
        if (i6 > 0) {
            i8 += ((i8 / i6) - 1) * this.LJLJJLL;
        }
        if (mode != 1073741824) {
            size = getPaddingLeft() + i7 + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + i8;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119734mv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJI = -1;
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = 5;
        this.LJLJL = 10;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.LJLJJI = 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLJI).clear();
        this.LJLJJL.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        int i10 = 0;
        while (true) {
            i5 = 8;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (measuredWidth + i8 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i9++;
                    int i11 = this.LJLJLJ;
                    if (i11 > 0 && i9 > i11) {
                        break;
                    }
                    ((ArrayList) this.LJLILLLLZI).add(Integer.valueOf(i10));
                    ((ArrayList) this.LJLIL).add(this.LJLJJL);
                    ((ArrayList) this.LJLJI).add(Integer.valueOf(i8));
                    this.LJLJJL = new ArrayList();
                    i10 = measuredHeight;
                    i8 = 0;
                }
                i8 += measuredWidth + this.LJLJL;
                i10 = Math.max(i10, measuredHeight);
                this.LJLJJL.add(childAt);
            }
            i7++;
        }
        ((ArrayList) this.LJLILLLLZI).add(Integer.valueOf(i10));
        ((ArrayList) this.LJLJI).add(Integer.valueOf(i8));
        ((ArrayList) this.LJLIL).add(this.LJLJJL);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.LJLIL).size();
        int i12 = 0;
        while (i12 < size) {
            List<View> list = (List) ListProtector.get(this.LJLIL, i12);
            this.LJLJJL = list;
            int size2 = list.size();
            int intValue = ((Number) ListProtector.get(this.LJLILLLLZI, i12)).intValue() + this.LJLJJLL;
            int intValue2 = ((Number) ListProtector.get(this.LJLJI, i12)).intValue();
            int i13 = this.LJLJJI;
            if (i13 != -1) {
                if (i13 != 0) {
                    if (i13 == i6) {
                        paddingLeft = (width - (getPaddingLeft() + intValue2)) - getPaddingRight();
                        List<View> list2 = this.LJLJJL;
                        o.LJIIIZ(list2, "<this>");
                        Collections.reverse(list2);
                    }
                } else {
                    paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
                }
            } else {
                paddingLeft = getPaddingLeft();
            }
            int i14 = 0;
            while (i14 < size2) {
                View view = (View) ListProtector.get(this.LJLJJL, i14);
                if (view.getVisibility() != i5) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int i15 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i16 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i15, i16, view.getMeasuredWidth() + i15, view.getMeasuredHeight() + i16);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.LJLJL;
                }
                i14++;
                i5 = 8;
            }
            paddingTop += intValue;
            i12++;
            i6 = 1;
        }
    }
}
