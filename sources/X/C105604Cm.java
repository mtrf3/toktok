package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.4Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C105604Cm extends FrameLayout {
    public float LJLIL;

    public void setRatio(float f) {
        this.LJLIL = f;
    }

    public C105604Cm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = 0.5625f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        float f = this.LJLIL;
        if (f != 0.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) (size * f), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
