package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.4e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C114224e2 extends LinearLayout {
    public C114224e2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (getOrientation() == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int childCount = getChildCount();
            int i3 = 0;
            TextView textView = null;
            int i4 = 0;
            boolean z2 = false;
            int i5 = 0;
            while (true) {
                z = true;
                if (i4 >= childCount || z2) {
                    break;
                }
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8) {
                    if (childAt instanceof TextView) {
                        TextView textView2 = (TextView) childAt;
                        if (textView2.getEllipsize() != null) {
                            if (textView == null) {
                                textView2.setMaxWidth(Integer.MAX_VALUE);
                                textView = textView2;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.weight <= 0.0f) {
                        z = false;
                    }
                    z2 |= z;
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                    i5 += childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                }
                i4++;
            }
            if (textView != null && i5 != 0) {
                z = false;
            }
            boolean z3 = z2 | z;
            int size = View.MeasureSpec.getSize(i);
            if (!z3 && i5 > size) {
                int measuredWidth = textView.getMeasuredWidth() - (i5 - size);
                if (measuredWidth >= 0) {
                    i3 = measuredWidth;
                }
                textView.setMaxWidth(i3);
            }
        }
        super.onMeasure(i, i2);
    }
}
