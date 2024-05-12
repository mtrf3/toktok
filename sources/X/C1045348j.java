package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.48j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1045348j extends LinearLayout {
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1045348j(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1045348j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final InterfaceC88472Yns<MotionEvent, Boolean> getInterceptSwipeCallback() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        C208208Fc c208208Fc;
        o.LJIIIZ(ev, "ev");
        InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null && interfaceC88472Yns.invoke(ev).booleanValue()) {
            requestDisallowInterceptTouchEvent(true);
            Iterator<View> it = C78924UyG.LIZLLL(this).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    return true;
                }
                View view = (View) iDObjectS0S0101000.next();
                if ((view instanceof C208208Fc) && (c208208Fc = (C208208Fc) view) != null) {
                    c208208Fc.LJJJIL(c208208Fc.LJLZ, 3);
                }
            }
        } else {
            return super.onInterceptTouchEvent(ev);
        }
    }

    public final void setInterceptSwipeCallback(InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1045348j(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1045348j.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
