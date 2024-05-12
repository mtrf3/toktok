package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.03x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C014503x extends LinearLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C014503x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = getResources().getDimensionPixelOffset(R.dimen.i9);
        this.LJLILLLLZI = getResources().getDimensionPixelOffset(R.dimen.i8);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.LJLIL * 2), this.LJLILLLLZI), 1073741824), i2);
    }
}
