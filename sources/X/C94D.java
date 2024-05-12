package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import defpackage.a1;

/* renamed from: X.94D, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94D extends RelativeLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;
    public final boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = 20;
        this.LJLJJL = C90193gN.LIZIZ(getContext());
        this.LJLJI = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.view.MotionEvent r6, X.C2301091i r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            int r1 = r6.getAction()
            r3 = 0
            if (r1 == 0) goto L23
            r4 = 1
            if (r1 == r4) goto L16
            r0 = 2
            if (r1 == r0) goto L30
            r0 = 3
            if (r1 == r0) goto L16
        L15:
            return r3
        L16:
            boolean r0 = r5.LJLJJI
            if (r0 == 0) goto L15
            if (r7 == 0) goto L20
            r0 = 0
            r7.LIZ(r0, r4)
        L20:
            r5.LJLJJI = r3
            return r4
        L23:
            float r0 = r6.getRawX()
            r5.LJLIL = r0
            float r0 = r6.getRawY()
            r5.LJLILLLLZI = r0
            goto L15
        L30:
            float r1 = r5.LJLIL
            float r0 = r6.getRawX()
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r5.LJLILLLLZI
            float r0 = r6.getRawY()
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L79
            int r0 = r5.LJLJI
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L79
            r5.LJLJJI = r4
            boolean r0 = r5.LJLJJL
            if (r0 == 0) goto L7c
            float r2 = r5.LJLIL
            float r0 = r6.getRawX()
        L5d:
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r2)
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            if (r7 == 0) goto L6d
            r7.LIZ(r2, r3)
        L6d:
            float r0 = r6.getRawX()
            r5.LJLIL = r0
            float r0 = r6.getRawY()
            r5.LJLILLLLZI = r0
        L79:
            boolean r0 = r5.LJLJJI
            return r0
        L7c:
            float r2 = r6.getRawX()
            float r0 = r5.LJLIL
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94D.LIZ(android.view.MotionEvent, X.91i):boolean");
    }
}
