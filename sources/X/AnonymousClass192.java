package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.zhiliaoapp.musically.R;

/* renamed from: X.192, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass192 extends LinearLayoutCompat {
    public static int LJIIIZ(View view) {
        int LIZLLL = C16300kU.LIZLLL(view);
        if (LIZLLL > 0) {
            return LIZLLL;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return LJIIIZ(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public AnonymousClass192(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.ldz) {
                    view = childAt;
                } else if (id == R.id.b1u) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.bt2 && id != R.id.c1c) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = LJIIIZ(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i, makeMeasureSpec);
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (view2 != null) {
            int i9 = paddingBottom - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                    if (layoutParams.width == -1) {
                        int i13 = layoutParams.height;
                        layoutParams.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i2, 0);
                        layoutParams.height = i13;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            r4 = r18
            int r3 = r14.getPaddingLeft()
            int r4 = r4 - r16
            int r0 = r14.getPaddingRight()
            int r13 = r4 - r0
            int r4 = r4 - r3
            int r0 = r14.getPaddingRight()
            int r4 = r4 - r0
            int r2 = r14.getMeasuredHeight()
            int r5 = r14.getChildCount()
            int r12 = r14.getGravity()
            r1 = r12 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r12 = r12 & r0
            r0 = 16
            if (r1 == r0) goto La8
            r0 = 80
            if (r1 == r0) goto L9e
            int r1 = r14.getPaddingTop()
        L32:
            android.graphics.drawable.Drawable r0 = r14.getDividerDrawable()
            r8 = 0
            if (r0 != 0) goto L99
            r11 = 0
        L3a:
            if (r8 >= r5) goto Lb5
            android.view.View r9 = r14.getChildAt(r8)
            if (r9 == 0) goto L85
            int r2 = r9.getVisibility()
            r0 = 8
            if (r2 == r0) goto L85
            int r7 = r9.getMeasuredWidth()
            int r10 = r9.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r2 = r6.gravity
            if (r2 >= 0) goto L5d
            r2 = r12
        L5d:
            int r0 = X.C16310kV.LIZLLL(r14)
            int r0 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r2 = r0 & 7
            r0 = 1
            if (r2 == r0) goto L88
            r0 = 5
            if (r2 == r0) goto L93
            int r2 = r6.leftMargin
            int r2 = r2 + r3
        L70:
            boolean r0 = r14.LJII(r8)
            if (r0 == 0) goto L77
            int r1 = r1 + r11
        L77:
            int r0 = r6.topMargin
            int r1 = r1 + r0
            int r7 = r7 + r2
            int r0 = r10 + r1
            r9.layout(r2, r1, r7, r0)
            int r0 = r6.bottomMargin
            int r10 = r10 + r0
            int r10 = r10 + r1
            r1 = r10
        L85:
            int r8 = r8 + 1
            goto L3a
        L88:
            r0 = 2
            int r2 = X.AnonymousClass030.LIZJ(r4, r7, r0, r3)
            int r0 = r6.leftMargin
            int r2 = r2 + r0
            int r0 = r6.rightMargin
            goto L97
        L93:
            int r2 = r13 - r7
            int r0 = r6.rightMargin
        L97:
            int r2 = r2 - r0
            goto L70
        L99:
            int r11 = r0.getIntrinsicHeight()
            goto L3a
        L9e:
            int r1 = r14.getPaddingTop()
            int r1 = r1 + r19
            int r1 = r1 - r17
            int r1 = r1 - r2
            goto L32
        La8:
            int r0 = r14.getPaddingTop()
            int r19 = r19 - r17
            int r19 = r19 - r2
            int r1 = r19 / 2
            int r1 = r1 + r0
            goto L32
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.onLayout(boolean, int, int, int, int):void");
    }
}
