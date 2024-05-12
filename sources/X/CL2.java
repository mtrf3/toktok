package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CL2 extends C47121t6 {
    public final void setCountDownListener(CL3 listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CL2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
