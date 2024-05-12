package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C119604mi extends W5G {
    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public void setCornerRadius(float f) {
        V8L v8l = new V8L();
        v8l.LJFF(f);
        getHierarchy().LJIL(v8l);
    }

    public C119604mi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
