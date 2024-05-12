package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.agd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94415agd extends C19F {
    public C94415agd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.byh, R.attr.byj, R.attr.byk});
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
            obtainStyledAttributes.recycle();
            if (!isInEditMode() && LLLZLZ != null) {
                setTypeface(C93705aVB.LIZ(context, LLLZLZ));
            }
        }
    }
}
