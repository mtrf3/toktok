package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119774mz extends ViewGroup {
    public final List<List<View>> LJLIL;
    public final List<Integer> LJLILLLLZI;
    public final List<Integer> LJLJI;
    public List<View> LJLJJI;
    public final List<View> LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119774mz(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119774mz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    private final void setUpLineInfo(boolean z) {
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLJI).clear();
        this.LJLJJI.clear();
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            o.LJIIIIZZ(childAt, "getChildAt(i)");
            if (childAt.getVisibility() != 8) {
                int i5 = this.LJLJL;
                if (1 <= i5 && i5 <= i4) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth2 + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (measuredWidth - getPaddingLeft()) - getPaddingRight()) {
                    i2++;
                    int i6 = this.LJLJLJ;
                    if (1 <= i6 && i6 < i2) {
                        break;
                    }
                    ((ArrayList) this.LJLILLLLZI).add(Integer.valueOf(i3));
                    ((ArrayList) this.LJLIL).add(this.LJLJJI);
                    ((ArrayList) this.LJLJI).add(Integer.valueOf(i));
                    i3 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                    this.LJLJJI = new ArrayList();
                    i = 0;
                }
                i += measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i3 = Math.max(i3, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.LJLJJI.add(childAt);
            }
        }
        ((ArrayList) this.LJLILLLLZI).add(Integer.valueOf(i3));
        ((ArrayList) this.LJLJI).add(Integer.valueOf(i));
        ((ArrayList) this.LJLIL).add(this.LJLJJI);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void setGravity(int i) {
        this.LJLJJLL = i;
        invalidate();
    }

    public final void setMaxTagCount(int i) {
        this.LJLJL = i;
        requestLayout();
    }

    public final void setMaxTagLines(int i) {
        this.LJLJLJ = i;
        requestLayout();
    }

    public final void setShowEndItem(boolean z) {
        invalidate();
    }

    public final void setShowMore(boolean z) {
        if (this.LJLJLLL == z) {
            return;
        }
        this.LJLJLLL = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 1;
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
            o.LJIIIIZZ(childAt, "getChildAt(i)");
            if (childAt.getVisibility() != 8) {
                int i10 = this.LJLJL;
                if (i3 <= i10 && i10 <= i4) {
                    i5 = Math.max(i7, i5);
                    i6 += i8;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i2);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i11 = i7 + measuredWidth;
                if (i11 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i9++;
                    int i12 = this.LJLJLJ;
                    if (1 <= i12 && i12 < i9) {
                        i5 = Math.max(i7, i5);
                        i6 += i8;
                        break;
                    } else {
                        i5 = Math.max(i5, i7);
                        i6 += i8;
                        i8 = measuredHeight;
                        i7 = measuredWidth;
                    }
                } else {
                    i8 = Math.max(i8, measuredHeight);
                    i7 = i11;
                }
                if (i4 == childCount - 1) {
                    i5 = Math.max(i7, i5);
                    i6 += i8;
                }
            } else if (i4 == childCount - 1) {
                i5 = Math.max(i7, i5);
                i6 += i8;
            }
            i4++;
            i3 = 1;
        }
        if (mode != 1073741824) {
            size = getPaddingLeft() + i5 + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + i6;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C119774mz(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            r0 = r8 & 2
            if (r0 == 0) goto L6
            r7 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r6, r0)
            r3 = 0
            r5.<init>(r6, r7, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLIL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLILLLLZI = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLJI = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLJJI = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.LJLJJL = r0
            r0 = 7
            int[] r0 = new int[r0]
            r0 = {x0062: FILL_ARRAY_DATA , data: [2130970008, 2130970009, 2130970010, 2130970011, 2130970012, 2130970225, 2130970417} // fill-array
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r0)
            java.lang.String r0 = "context.obtainStyledAttr…, R.styleable.FlowLayout)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            int r0 = r2.getInt(r3, r3)
            r5.LJLJJLL = r0
            r0 = 1
            r1 = -1
            int r0 = r2.getInt(r0, r1)
            r5.LJLJL = r0
            int r0 = r2.getInt(r4, r1)
            r5.LJLJLJ = r0
            r0 = 3
            r2.getBoolean(r0, r3)
            r0 = 4
            r2.getBoolean(r0, r3)
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119774mz.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int paddingRight;
        setUpLineInfo(false);
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((ArrayList) this.LJLIL).size();
        ((ArrayList) this.LJLJJL).clear();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.LJLJLJ;
            int i7 = 1;
            if (1 <= i6 && i6 <= i5) {
                break;
            }
            this.LJLJJI = (List) ListProtector.get(this.LJLIL, i5);
            int intValue = ((Number) ListProtector.get(this.LJLILLLLZI, i5)).intValue();
            int intValue2 = ((Number) ListProtector.get(this.LJLJI, i5)).intValue();
            int i8 = this.LJLJJLL;
            if (C26338AVi.LIZLLL(this)) {
                i8 = -this.LJLJJLL;
            }
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 == 1) {
                        int i9 = measuredWidth - intValue2;
                        if (C26338AVi.LIZLLL(this)) {
                            paddingRight = getPaddingLeft();
                        } else {
                            paddingRight = getPaddingRight();
                        }
                        paddingLeft = i9 - paddingRight;
                    }
                } else {
                    paddingLeft = ((((measuredWidth - getPaddingLeft()) - getPaddingRight()) - intValue2) / 2) + getPaddingLeft();
                }
            } else {
                paddingLeft = getPaddingLeft();
            }
            int size2 = this.LJLJJI.size();
            int i10 = 0;
            while (i10 < size2) {
                if (C26338AVi.LIZLLL(this)) {
                    List<View> list = this.LJLJJI;
                    view = (View) ListProtector.get(list, (list.size() - i10) - i7);
                } else {
                    view = (View) ListProtector.get(this.LJLJJI, i10);
                }
                if (view != null && view.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i11 = marginLayoutParams.leftMargin + paddingLeft;
                    int i12 = marginLayoutParams.topMargin + paddingTop;
                    int measuredWidth2 = view.getMeasuredWidth() + i11;
                    if (measuredWidth2 > (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin) {
                        measuredWidth2 = (measuredWidth - getPaddingRight()) - marginLayoutParams.rightMargin;
                    }
                    C17M.LIZIZ(view, i12, i11, i12, measuredWidth2);
                    ((ArrayList) this.LJLJJL).add(view);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                i10++;
                i7 = 1;
            }
            paddingTop += intValue;
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            o.LJIIIIZZ(childAt, "getChildAt(i)");
            if (!((ArrayList) this.LJLJJL).contains(childAt)) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}
