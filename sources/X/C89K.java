package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.89K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89K extends C89J {
    public int LJLJL;

    public int getHookAtMaxWidth() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89K(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "ctx");
    }

    @Override // X.C89J, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LJLJL = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }
}
