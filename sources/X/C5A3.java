package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5A3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5A3 extends AbstractC1304059w {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5A3(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5A3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC1304059w
    public final void LIZ(View child) {
        o.LJIIIZ(child, "child");
    }

    static {
        C134845Qy.LIZ(5.0f);
        C134845Qy.LIZ(10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5A3(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r1 = 2
            r0 = r5 & 2
            if (r0 == 0) goto L6
            r4 = 0
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.C134845Qy.LIZJ(r3)
            r2.setClipToPadding(r0)
            r2.setClipChildren(r0)
            android.content.Context r0 = X.C58S.LIZ()
            X.C134845Qy.LIZIZ(r0)
            int r0 = X.C131425Du.LIZIZ
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5A3.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
