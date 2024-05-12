package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.4MI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MI extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4MI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (getOrientation() == 0) {
            int size = View.MeasureSpec.getSize(i);
            Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
            int i5 = 0;
            TextView textView = null;
            int i6 = 0;
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                View view = (View) iDObjectS0S0101000.next();
                if (view.getVisibility() != 8) {
                    if (textView == null && (view instanceof TextView)) {
                        textView = (TextView) view;
                    }
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        i3 = marginLayoutParams.leftMargin;
                    } else {
                        i3 = 0;
                    }
                    int i7 = measuredWidth + i3;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        i4 = marginLayoutParams2.rightMargin;
                    } else {
                        i4 = 0;
                    }
                    i6 += i7 + i4;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + i6;
            if (paddingRight > size && textView != null) {
                int measuredWidth2 = textView.getMeasuredWidth() - (paddingRight - size);
                if (measuredWidth2 >= 0) {
                    i5 = measuredWidth2;
                }
                textView.setMaxWidth(i5);
            }
        }
        super.onMeasure(i, i2);
    }
}
