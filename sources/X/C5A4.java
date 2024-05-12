package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5A4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5A4 extends AbstractC1304059w {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5A4(Context context, AttributeSet attributeSet) {
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
    public C5A4(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r5, r0)
            r3 = 0
            r4.<init>(r5, r6, r3)
            int r0 = r4.getScreenWidth()
            int r2 = r0 / 2
            int r0 = X.C1300058i.LJIIJ
            int r0 = r0 / 2
            int r2 = r2 - r0
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            X.V2B.LJIILL(r4, r2, r1, r2, r0)
            r4.setClipToPadding(r3)
            r4.setClipChildren(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5A4.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int screenWidth = (getScreenWidth() / 2) - (C1300058i.LJIIJ / 2);
        V2B.LJIILL(this, screenWidth, getPaddingTop(), screenWidth, getPaddingBottom());
    }
}
