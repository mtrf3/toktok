package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a1;

/* renamed from: X.4n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119794n1 extends ViewGroup {
    public View LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119794n1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r15 == (-2)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        r5 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r15 == (-2)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (r15 == (-2)) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be A[EDGE_INSN: B:19:0x00be->B:20:0x00be BREAK  A[LOOP:0: B:2:0x001a->B:28:0x002a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002a A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119794n1.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i7;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LJLIL = null;
        int width = getWidth();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        i7 = marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    } else {
                        i7 = 0;
                    }
                    i5 = childAt.getMeasuredWidth() + i7;
                    childAt.getMeasuredHeight();
                    if (i5 <= (width - getPaddingLeft()) - getPaddingRight()) {
                        this.LJLIL = childAt;
                        break;
                    }
                }
                i9++;
            } else {
                i5 = 0;
                break;
            }
        }
        int paddingLeft = getPaddingLeft();
        if (C90193gN.LIZ()) {
            paddingLeft = (width - (getPaddingLeft() + i5)) - getPaddingRight();
        }
        View view = this.LJLIL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i6 = marginLayoutParams.leftMargin;
                i8 = marginLayoutParams.topMargin;
            } else {
                i6 = 0;
            }
            int i10 = paddingLeft + i6;
            int paddingTop = getPaddingTop() + i8;
            C17M.LIZIZ(view, paddingTop, i10, paddingTop, view.getMeasuredWidth() + i10);
        }
    }
}
