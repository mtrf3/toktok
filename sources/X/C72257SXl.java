package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.SXl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72257SXl extends TouchDelegate {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public final Rect LJ;
    public final int LJFF;

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            android.view.View r0 = r7.LIZJ
            int r1 = r0.getVisibility()
            r6 = 0
            r0 = 8
            if (r0 != r1) goto L11
            return r6
        L11:
            android.view.View r0 = r7.LIZJ
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L1a
            return r6
        L1a:
            android.view.View r1 = r7.LIZJ
            android.graphics.Rect r0 = r7.LIZ
            r1.getHitRect(r0)
            android.graphics.Rect r3 = r7.LIZ
            int r1 = r3.left
            android.graphics.Rect r2 = r7.LIZIZ
            int r0 = r2.left
            int r1 = r1 - r0
            r3.left = r1
            int r1 = r3.top
            int r0 = r2.top
            int r1 = r1 - r0
            r3.top = r1
            int r1 = r3.right
            int r0 = r2.right
            int r1 = r1 + r0
            r3.right = r1
            int r1 = r3.bottom
            int r0 = r2.bottom
            int r1 = r1 + r0
            r3.bottom = r1
            android.graphics.Rect r0 = r7.LJ
            r0.set(r3)
            android.graphics.Rect r2 = r7.LJ
            int r0 = r7.LJFF
            int r1 = -r0
            int r0 = -r0
            r2.inset(r1, r0)
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r4 = (int) r0
            int r2 = r8.getAction()
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L6e
            if (r2 == r1) goto L7c
            if (r2 == r3) goto L7c
            r0 = 3
            if (r2 == r0) goto L69
        L68:
            return r6
        L69:
            boolean r1 = r7.LIZLLL
            r7.LIZLLL = r6
            goto L78
        L6e:
            android.graphics.Rect r0 = r7.LIZ
            boolean r0 = r0.contains(r5, r4)
            if (r0 == 0) goto L68
            r7.LIZLLL = r1
        L78:
            r0 = 1
            if (r1 == 0) goto L68
            goto L89
        L7c:
            boolean r1 = r7.LIZLLL
            if (r1 == 0) goto L68
            android.graphics.Rect r0 = r7.LJ
            boolean r0 = r0.contains(r5, r4)
            if (r0 != 0) goto L78
            r0 = 0
        L89:
            android.view.View r2 = r7.LIZJ
            if (r0 == 0) goto La1
            int r0 = r2.getWidth()
            int r0 = r0 / r3
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r3
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L9c:
            boolean r6 = r2.dispatchTouchEvent(r8)
            goto L68
        La1:
            int r0 = r7.LJFF
            int r0 = r0 * 2
            float r0 = (float) r0
            float r0 = -r0
            r8.setLocation(r0, r0)
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72257SXl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C72257SXl(android.graphics.Rect r3, android.view.View r4) {
        /*
            r2 = this;
            java.lang.String r0 = "delegateView"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.<init>(r1, r4)
            r2.LIZ = r1
            r2.LIZIZ = r3
            r2.LIZJ = r4
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r2.LJ = r0
            android.content.Context r0 = r4.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r2.LJFF = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72257SXl.<init>(android.graphics.Rect, android.view.View):void");
    }
}
