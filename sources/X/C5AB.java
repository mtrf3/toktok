package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5AB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AB extends AbstractC1304059w {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5AB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC1304059w
    public final void LIZ(View child) {
        o.LJIIIZ(child, "child");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5AB(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5AB.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // X.AbstractC1304059w, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC88471Ynr<Integer, Integer, C76800UCe> scrollChangeListener = getScrollChangeListener();
        if (scrollChangeListener != null) {
            scrollChangeListener.invoke(Integer.valueOf(getScrollX()), Integer.valueOf(i - i3));
        }
    }
}
