package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.a1;

/* renamed from: X.4YI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YI extends LinearLayout {
    public int LJLIL;

    public final int getMaxHeight() {
        return this.LJLIL;
    }

    public final void setMaxHeight(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4YI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C32151Nz.LJJIFFI(context) / 2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.LJLIL;
        if (measuredHeight > i3) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }
}
