package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.OkX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62785OkX extends TouchDelegate {
    public final View LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public boolean LIZLLL;
    public final int LJ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r6 = (int) r0
            float r0 = r8.getY()
            int r5 = (int) r0
            int r2 = r8.getAction()
            r4 = 2
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L20
            if (r2 == r1) goto L2e
            if (r2 == r4) goto L2e
            r0 = 3
            if (r2 == r0) goto L1b
        L1a:
            return r3
        L1b:
            boolean r1 = r7.LIZLLL
            r7.LIZLLL = r3
            goto L2a
        L20:
            android.graphics.Rect r0 = r7.LIZIZ
            boolean r0 = r0.contains(r6, r5)
            if (r0 == 0) goto L60
            r7.LIZLLL = r1
        L2a:
            r0 = 1
            if (r1 == 0) goto L1a
            goto L38
        L2e:
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto L1a
            android.graphics.Rect r0 = r7.LIZJ
            boolean r0 = r0.contains(r6, r5)
        L38:
            android.view.View r2 = r7.LIZ
            if (r0 == 0) goto L56
            int r0 = r2.getWidth()
            int r0 = r0 / r4
            float r1 = (float) r0
            int r0 = r2.getHeight()
            int r0 = r0 / r4
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L4b:
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L1a
            boolean r3 = r2.dispatchTouchEvent(r8)
            goto L1a
        L56:
            int r0 = r7.LJ
            int r0 = r0 * 2
            int r0 = -r0
            float r0 = (float) r0
            r8.setLocation(r0, r0)
            goto L4b
        L60:
            r7.LIZLLL = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62785OkX.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C62785OkX(Rect rect, View view) {
        super(rect, view);
        this.LIZIZ = rect;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.LJ = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.LIZJ = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
        this.LIZ = view;
    }
}
