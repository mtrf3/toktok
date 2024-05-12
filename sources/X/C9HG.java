package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.o;

/* renamed from: X.9HG, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9HG extends HorizontalScrollView {
    public C9HE LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9HG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final C9HE getOnScrollListener() {
        return this.LJLIL;
    }

    public final void setOnScrollListener(C9HE c9he) {
        this.LJLIL = c9he;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9HG(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C9HG.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        C9HE c9he;
        super.onScrollChanged(i, i2, i3, i4);
        if (Math.abs(i - i3) > C44384HbQ.LJJJLL(1) && (c9he = this.LJLIL) != null) {
            c9he.LIZ();
        }
    }
}
