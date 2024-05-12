package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VdM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80176VdM extends ViewGroup.MarginLayoutParams {
    public final int LIZ;
    public final C80182VdS LIZIZ;

    public C80176VdM(int i) {
        super(-1, i);
    }

    public C80176VdM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.anm, R.attr.ann});
        this.LIZ = obtainStyledAttributes.getColor(0, this.LIZ);
        if (obtainStyledAttributes.hasValue(1)) {
            this.LIZIZ = C80182VdS.LJI[obtainStyledAttributes.getInt(1, 0)];
        }
        obtainStyledAttributes.recycle();
    }
}
