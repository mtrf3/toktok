package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import defpackage.a1;

/* renamed from: X.3xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101113xz extends RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101113xz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        if (childCount < 1) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        do {
            i4 = Math.max(i4, getChildAt(i3).getMeasuredWidth());
            i3++;
        } while (i3 < childCount);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i4, 1073741824), i2);
    }
}
