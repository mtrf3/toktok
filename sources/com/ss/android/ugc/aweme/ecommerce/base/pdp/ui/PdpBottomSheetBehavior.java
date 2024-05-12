package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes5.dex */
public final class PdpBottomSheetBehavior extends BottomSheetBehavior<View> {
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r1 != 3) goto L25;
     */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C45621qg r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            r6 = 0
            r7 = 2131374456(0x7f0a3178, float:1.8369032E38)
            android.view.View r0 = r10.findViewById(r7)     // Catch: java.lang.Exception -> L1a
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r0 = r6
        L1b:
            r1 = 0
            r4 = 1
            r5 = -1
            if (r0 == 0) goto L31
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != r4) goto L31
            r0 = 1
        L27:
            r2 = 3
            if (r0 == 0) goto L33
            int r0 = r8.getState()
            if (r0 != r2) goto L33
            return r1
        L31:
            r0 = 0
            goto L27
        L33:
            java.lang.String r0 = "pdp_half_screen_event_conflict"
            boolean r0 = X.C19N.LJ(r0, r1)
            if (r0 == 0) goto L4a
            int r1 = r11.getAction()
            if (r1 == 0) goto L91
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r4) goto L8c
            r0 = 2
            if (r1 == r0) goto L4f
            if (r1 == r2) goto L8c
        L4a:
            boolean r0 = super.onInterceptTouchEvent(r9, r10, r11)
            return r0
        L4f:
            android.view.View r0 = r10.findViewById(r7)     // Catch: java.lang.Exception -> L56
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch: java.lang.Exception -> L56
            r6 = r0
        L56:
            if (r6 == 0) goto L5f
            boolean r0 = r6.canScrollVertically(r5)
            if (r0 != r4) goto L5f
            goto L4a
        L5f:
            int r1 = r8.getState()
            r0 = 4
            if (r1 != r0) goto L4a
            float r1 = r11.getY()
            float r0 = r8.LIZIZ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r11.getX()
            float r0 = r8.LIZ
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4a
            int r0 = X.C27162AlK.LJIIJ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r8.LIZ = r3
            r8.LIZIZ = r3
            return r4
        L8c:
            r8.LIZ = r3
            r8.LIZIZ = r3
            goto L4a
        L91:
            float r0 = r11.getX()
            r8.LIZ = r0
            float r0 = r11.getY()
            r8.LIZIZ = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpBottomSheetBehavior.onInterceptTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }
}
