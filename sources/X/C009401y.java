package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.01y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009401y extends ViewGroup.MarginLayoutParams {
    public int LIZ;

    public C009401y() {
        super(-2, -2);
        this.LIZ = 8388627;
    }

    public C009401y(C009401y c009401y) {
        super((ViewGroup.MarginLayoutParams) c009401y);
        this.LIZ = c009401y.LIZ;
    }

    public C009401y(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C009401y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_gravity});
        this.LIZ = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
