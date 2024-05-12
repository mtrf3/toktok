package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VVs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79856VVs extends FrameLayout.LayoutParams {
    public final int LIZ;
    public final float LIZIZ;

    public C79856VVs() {
        super(-1, -1);
        this.LIZIZ = 0.5f;
    }

    public C79856VVs(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZIZ = 0.5f;
    }

    public C79856VVs(FrameLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.LIZIZ = 0.5f;
    }

    public C79856VVs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alp, R.attr.alq});
        this.LIZ = obtainStyledAttributes.getInt(0, 0);
        this.LIZIZ = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }
}
