package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.4mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C119344mI extends LinearLayout {
    public int LJLIL;

    public C119344mI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
            i4 += childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight());
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && i4 < (i3 = size + this.LJLIL)) {
            i4 = i3;
        }
        setMeasuredDimension(i4, LinearLayout.resolveSize(i5, i2));
    }
}
