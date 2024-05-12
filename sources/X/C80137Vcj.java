package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vcj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80137Vcj extends ViewGroup {
    public int LJLIL;

    @Override // android.view.View
    public int getBaseline() {
        return this.LJLIL;
    }

    public C80137Vcj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = -1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i6 = Math.max(i6, baseline);
                    i7 = Math.max(i7, childAt.getMeasuredHeight() - baseline);
                }
                i4 = Math.max(i4, childAt.getMeasuredWidth());
                i3 = Math.max(i3, childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        if (i6 != -1) {
            i3 = Math.max(i3, Math.max(i7, getPaddingBottom()) + i6);
            this.LJLIL = i6;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4, getSuggestedMinimumWidth()), i, i5), View.resolveSizeAndState(Math.max(i3, getSuggestedMinimumHeight()), i2, i5 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int LIZJ = AnonymousClass030.LIZJ(paddingRight, measuredWidth, 2, paddingLeft);
                if (this.LJLIL != -1 && childAt.getBaseline() != -1) {
                    i5 = (this.LJLIL + paddingTop) - childAt.getBaseline();
                } else {
                    i5 = paddingTop;
                }
                childAt.layout(LIZJ, i5, measuredWidth + LIZJ, measuredHeight + i5);
            }
        }
    }
}
