package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.4e3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114234e3 extends FrameLayout {
    public int LJLIL;

    public final void setMaxHeight(int i) {
        if (i != this.LJLIL && getHeight() > i) {
            this.LJLIL = i;
            requestLayout();
        } else {
            this.LJLIL = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114234e3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            int i4 = this.LJLIL;
            if (size > i4) {
                size = i4;
            }
        } else if (mode == 0) {
            int i5 = this.LJLIL;
            if (size > i5) {
                size = i5;
            }
        } else if (mode == Integer.MIN_VALUE && size > (i3 = this.LJLIL)) {
            size = i3;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, mode));
    }
}
