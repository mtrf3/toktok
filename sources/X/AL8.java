package X;

import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* loaded from: classes5.dex */
public final class AL8 implements View.OnTouchListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final /* synthetic */ WebKitView LJLJI;

    public AL8(WebKitView webKitView) {
        this.LJLJI = webKitView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            int r1 = r7.getAction()
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L45
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L45
        L1a:
            return r3
        L1b:
            float r1 = r7.getX()
            float r0 = r5.LJLIL
            float r1 = r1 - r0
            float r2 = r7.getY()
            float r0 = r5.LJLILLLLZI
            float r2 = r2 - r0
            float r1 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1a
            boolean r0 = X.ALA.LIZ
            if (r0 == 0) goto L3f
            com.bytedance.lynx.hybrid.webkit.WebKitView r0 = r5.LJLJI
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L1a
        L3f:
            com.bytedance.lynx.hybrid.webkit.WebKitView r0 = r5.LJLJI
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L1a
        L45:
            com.bytedance.lynx.hybrid.webkit.WebKitView r0 = r5.LJLJI
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L1a
        L4b:
            float r0 = r7.getX()
            r5.LJLIL = r0
            float r0 = r7.getY()
            r5.LJLILLLLZI = r0
            com.bytedance.lynx.hybrid.webkit.WebKitView r0 = r5.LJLJI
            r0.requestDisallowInterceptTouchEvent(r4)
            X.ALA.LIZ = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AL8.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
