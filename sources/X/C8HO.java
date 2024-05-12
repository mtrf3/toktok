package X;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.8HO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HO extends C8HN {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(0, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }
}
