package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.2RY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RY extends FrameLayout {
    public InterfaceC88472Yns<? super Integer, Boolean> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2RY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final InterfaceC88472Yns<Integer, Boolean> getChildListCanVerticalScrollCallback() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns == null) {
            return super.canScrollVertically(i);
        }
        return interfaceC88472Yns.invoke(Integer.valueOf(i)).booleanValue();
    }

    public final void setChildListCanVerticalScrollCallback(InterfaceC88472Yns<? super Integer, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2RY(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2RY.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
