package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.02s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011402s extends TouchDelegate {
    public final View LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;
    public final Rect LIZLLL;
    public final int LJ;
    public boolean LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (1 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7.LIZLLL.contains(r4, r3) == false) goto L24;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r4 = (int) r0
            float r0 = r8.getY()
            int r3 = (int) r0
            int r6 = r8.getAction()
            r2 = 2
            r5 = 0
            r1 = 1
            if (r6 == 0) goto L25
            if (r6 == r1) goto L51
            if (r6 == r2) goto L51
            r0 = 3
            if (r6 == r0) goto L1b
        L1a:
            return r5
        L1b:
            boolean r1 = r7.LJFF
            r7.LJFF = r5
            r0 = 1
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L5d
            goto L2f
        L25:
            android.graphics.Rect r0 = r7.LIZIZ
            boolean r0 = r0.contains(r4, r3)
            if (r0 == 0) goto L1a
            r7.LJFF = r1
        L2f:
            android.graphics.Rect r0 = r7.LIZJ
            boolean r0 = r0.contains(r4, r3)
            if (r0 != 0) goto L5d
            android.view.View r0 = r7.LIZ
            int r0 = r0.getWidth()
            int r0 = r0 / r2
            float r1 = (float) r0
            android.view.View r0 = r7.LIZ
            int r0 = r0.getHeight()
            int r0 = r0 / r2
            float r0 = (float) r0
            r8.setLocation(r1, r0)
        L4a:
            android.view.View r0 = r7.LIZ
            boolean r5 = r0.dispatchTouchEvent(r8)
            goto L1a
        L51:
            boolean r0 = r7.LJFF
            if (r0 == 0) goto L1a
            android.graphics.Rect r0 = r7.LIZLLL
            boolean r0 = r0.contains(r4, r3)
            if (r0 != 0) goto L2f
        L5d:
            android.graphics.Rect r2 = r7.LIZJ
            int r0 = r2.left
            int r4 = r4 - r0
            float r1 = (float) r4
            int r0 = r2.top
            int r3 = r3 - r0
            float r0 = (float) r3
            r8.setLocation(r1, r0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C011402s.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C011402s(Rect rect, Rect rect2, AnonymousClass194 anonymousClass194) {
        super(rect, anonymousClass194);
        int scaledTouchSlop = ViewConfiguration.get(anonymousClass194.getContext()).getScaledTouchSlop();
        this.LJ = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.LIZIZ = rect3;
        Rect rect4 = new Rect();
        this.LIZLLL = rect4;
        Rect rect5 = new Rect();
        this.LIZJ = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.LIZ = anonymousClass194;
    }
}
