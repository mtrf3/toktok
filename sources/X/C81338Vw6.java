package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.Scroller;

/* renamed from: X.Vw6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81338Vw6 extends C81335Vw3 {
    public C81338Vw6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C81335Vw3
    public final void LJI(Scroller scroller, int i, int i2) {
        scroller.startScroll(0, i, 0, i2 - i);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }
}
