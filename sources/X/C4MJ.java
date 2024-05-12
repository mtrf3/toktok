package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.4MJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MJ extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4MJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (getOrientation() == 1) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
        int i5 = 0;
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (!iDObjectS0S0101000.hasNext()) {
                break;
            }
            View view = (View) iDObjectS0S0101000.next();
            if (view.getVisibility() != 8) {
                measureChild(view, i, i2);
                int measuredWidth = view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    i3 = 0;
                }
                int i6 = measuredWidth + i3;
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    layoutParams2 = layoutParams3;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams2 != null) {
                    i4 = marginLayoutParams2.rightMargin;
                } else {
                    i4 = 0;
                }
                i5 += i6 + i4;
            }
        }
        if (getPaddingRight() + getPaddingLeft() + i5 > size) {
            setOrientation(1);
        }
        super.onMeasure(i, i2);
    }
}
