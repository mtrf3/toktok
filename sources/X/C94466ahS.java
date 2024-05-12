package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.ahS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94466ahS extends C94163acZ {
    public C94466ahS() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public C94466ahS(Context context) {
        super(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i2));
    }
}
