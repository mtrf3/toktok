package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40991jD extends C1K5 {
    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C40991jD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C40991jD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        int i2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ah1}, 0, 0);
        Context context2 = getContext();
        if (obtainStyledAttributes.hasValue(0)) {
            TypedValue LIZ = C259910h.LIZ();
            obtainStyledAttributes.getValue(0, LIZ);
            if (LIZ.type == 2) {
                i2 = C259910h.LJI(C259710f.LIZ.LJFF, LIZ.data, context2);
            } else {
                i2 = LIZ.resourceId;
            }
            if (i2 != -1) {
                setImageResource(i2);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
