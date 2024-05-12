package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.4d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113604d2 extends FrameLayout {
    public final float LJLIL;
    public final float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113604d2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = 0.08f;
        this.LJLILLLLZI = 0.75f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.LJLILLLLZI), 1073741824);
        UC0.LJJJLZIJ(this, this.LJLIL);
        super.onMeasure(i, makeMeasureSpec);
    }
}
