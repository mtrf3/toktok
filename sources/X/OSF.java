package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OSF extends LinearLayout.LayoutParams {
    public final boolean LIZ;

    public OSF() {
        super(-1, -1);
    }

    public OSF(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public OSF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        boolean z = false;
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ani});
            if (typedArray != null) {
                z = typedArray.getBoolean(0, false);
            }
        } else {
            typedArray = null;
        }
        this.LIZ = z;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }
}
