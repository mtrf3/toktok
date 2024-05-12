package X;

import com.bytedance.android.widget.Widget;
import kotlin.jvm.internal.o;

/* renamed from: X.Cdh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31785Cdh extends Error {
    public final String LJLIL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C31785Cdh(java.lang.Class<? extends com.bytedance.android.widget.Widget> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "widgetClass"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r3)
            r1.append(r0)
            java.lang.String r0 = " should use WidgetContainer!"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31785Cdh.<init>(java.lang.Class):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31785Cdh(Widget widget) {
        this((Class<? extends Widget>) widget.getClass());
        o.LJIIIZ(widget, "widget");
    }

    public C31785Cdh(String str) {
        this.LJLIL = str;
    }
}
