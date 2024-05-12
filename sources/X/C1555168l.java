package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.68l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1555168l extends FrameLayout {
    public float LJLIL;

    public final float getScale() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555168l(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        this.LJLIL = 1.0f;
    }

    public final void setScale(float f) {
        this.LJLIL = f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((int) (getMeasuredHeight() * this.LJLIL), View.MeasureSpec.getMode(i2)));
    }
}
