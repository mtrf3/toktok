package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ve2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80218Ve2 extends LinearLayout.LayoutParams {
    public int LIZ;
    public final Interpolator LIZIZ;

    public C80218Ve2() {
        super(-1, -2);
        this.LIZ = 1;
    }

    public C80218Ve2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C80218Ve2(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.LIZ = 1;
    }

    public C80218Ve2(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZ = 1;
    }

    public C80218Ve2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ank, R.attr.anl});
        this.LIZ = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.LIZIZ = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
