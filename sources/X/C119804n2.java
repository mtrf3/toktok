package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119804n2 extends ViewGroup {
    public final List<List<View>> LJLIL;
    public final List<Integer> LJLILLLLZI;
    public final List<Integer> LJLJI;
    public List<View> LJLJJI;
    public final List<View> LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getFinalLines() {
        return this.LJLL;
    }

    public final int getFirstLineCount() {
        return this.LJLLI;
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

    public final void setFinalLines(int i) {
        this.LJLL = i;
    }

    public final void setFirstLineCount(int i) {
        this.LJLLI = i;
    }

    public final void setGravity(int i) {
        this.LJLJJLL = i;
        invalidate();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119804n2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new ArrayList();
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.adh, R.attr.adi, R.attr.adj, R.attr.adk, R.attr.adl, R.attr.ajc, R.attr.aoj});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.FlowLayout)");
        this.LJLJJLL = obtainStyledAttributes.getInt(0, 0);
        this.LJLJL = obtainStyledAttributes.getInt(1, -1);
        this.LJLJLJ = obtainStyledAttributes.getInt(2, -1);
        obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            o.LJIIIIZZ(childAt, "getChildAt(i)");
            if (childAt.getVisibility() != 8) {
                int i10 = this.LJLJL;
                if (1 <= i10 && i10 <= i3) {
                    i4 = Math.max(i6, i4);
                    i5 += i7;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, View.MeasureSpec.getMode(i)), i2);
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i11 = i6 + measuredWidth;
                if (i11 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i8++;
                    this.LJLL = i8;
                    int i12 = this.LJLJLJ;
                    if (1 <= i12 && i12 < i8) {
                        i4 = Math.max(i6, i4);
                        i5 += i7;
                        break;
                    } else {
                        i4 = Math.max(i4, i6);
                        i5 += i7;
                        i6 = measuredWidth;
                        i7 = measuredHeight;
                    }
                } else {
                    if (i8 == 1) {
                        i9++;
                        this.LJLLI = i9;
                    }
                    measuredHeight = Math.max(i7, measuredHeight);
                    i6 = i11;
                    i7 = measuredHeight;
                }
                if (i3 == childCount - 1) {
                    i4 = Math.max(i6, i4);
                    i5 += measuredHeight;
                }
            } else if (i3 == childCount - 1) {
                i4 = Math.max(i6, i4);
                i5 += i7;
            }
            i3++;
        }
        if (mode != 1073741824) {
            size = getPaddingLeft() + i4 + getPaddingRight();
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + i5;
        }
        setMeasuredDimension(size, size2);
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
