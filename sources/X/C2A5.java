package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2A5, reason: invalid class name */
/* loaded from: classes.dex */
public class C2A5 extends C47131t7 {
    public C2A5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wk);
        if (size > 0) {
            size = Math.min(dimensionPixelSize, (int) (size * 0.8f));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.wj);
        if (size2 > 0) {
            size2 = Math.min(dimensionPixelSize2, (int) (size2 * 0.84f));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(size2, View.MeasureSpec.getMode(i2)));
    }
}
