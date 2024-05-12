package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.Vdj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80199Vdj extends AbstractC270614k {
    public int LIZ;
    public int LIZIZ = -1;
    public final /* synthetic */ SwipeDismissBehavior LIZJ;

    public C80199Vdj(SwipeDismissBehavior swipeDismissBehavior) {
        this.LIZJ = swipeDismissBehavior;
    }

    @Override // X.AbstractC270614k
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // X.AbstractC270614k
    public final void onViewDragStateChanged(int i) {
        C80203Vdn c80203Vdn = this.LIZJ.LIZIZ;
        if (c80203Vdn != null) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    return;
                }
                C111664Zu.LIZIZ().LIZLLL(c80203Vdn.LIZ.LJIIL);
                return;
            }
            C111664Zu LIZIZ = C111664Zu.LIZIZ();
            C80204Vdo c80204Vdo = c80203Vdn.LIZ.LJIIL;
            synchronized (LIZIZ.LIZ) {
                if (LIZIZ.LIZJ(c80204Vdo)) {
                    C111644Zs c111644Zs = LIZIZ.LIZJ;
                    if (c111644Zs.LIZJ) {
                        c111644Zs.LIZJ = false;
                        LIZIZ.LJFF(c111644Zs);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC270614k
    public final void onViewCaptured(View view, int i) {
        this.LIZIZ = i;
        this.LIZ = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View view, int i) {
        int i2 = this.LIZIZ;
        if ((i2 == -1 || i2 == i) && this.LIZJ.LIZ(view)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        boolean z;
        int width;
        int width2;
        int width3;
        if (C16310kV.LIZLLL(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i3 = this.LIZJ.LIZLLL;
        if (i3 == 0) {
            if (z) {
                width = this.LIZ - view.getWidth();
                width2 = this.LIZ;
            } else {
                width = this.LIZ;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 == 1) {
            if (z) {
                width = this.LIZ;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.LIZ - view.getWidth();
                width2 = this.LIZ;
            }
        } else {
            width = this.LIZ - view.getWidth();
            width2 = view.getWidth() + this.LIZ;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (java.lang.Math.abs(r8.getLeft() - r7.LIZ) >= java.lang.Math.round(r8.getWidth() * r7.LIZJ.LJ)) goto L9;
     */
    @Override // X.AbstractC270614k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewReleased(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            r0 = -1
            r7.LIZIZ = r0
            int r6 = r8.getWidth()
            r3 = 1
            r5 = 0
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 == 0) goto L65
            int r0 = X.C16310kV.LIZLLL(r8)
            if (r0 != r3) goto L63
            r2 = 1
        L14:
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
            int r1 = r0.LIZLLL
            r0 = 2
            if (r1 != r0) goto L4b
        L1b:
            int r0 = r8.getLeft()
            int r2 = r7.LIZ
            if (r0 >= r2) goto L49
            int r2 = r2 - r6
        L24:
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
            X.14l r1 = r0.LIZ
            int r0 = r8.getTop()
            boolean r0 = r1.LJIJI(r2, r0)
            if (r0 == 0) goto L3d
            X.Vdl r1 = new X.Vdl
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
            r1.<init>(r0, r8, r3)
            X.C16300kU.LJIIL(r8, r1)
        L3c:
            return
        L3d:
            if (r3 == 0) goto L3c
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
            X.Vdn r0 = r0.LIZIZ
            if (r0 == 0) goto L3c
            r0.LIZ(r8)
            goto L3c
        L49:
            int r2 = r2 + r6
            goto L24
        L4b:
            if (r1 != 0) goto L57
            if (r2 == 0) goto L54
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L81
            goto L1b
        L54:
            if (r4 <= 0) goto L81
            goto L1b
        L57:
            if (r1 != r3) goto L81
            if (r2 == 0) goto L5e
            if (r4 <= 0) goto L81
            goto L1b
        L5e:
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L81
            goto L1b
        L63:
            r2 = 0
            goto L14
        L65:
            int r2 = r8.getLeft()
            int r0 = r7.LIZ
            int r2 = r2 - r0
            int r0 = r8.getWidth()
            float r1 = (float) r0
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
            float r0 = r0.LJ
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L81
            goto L1b
        L81:
            int r2 = r7.LIZ
            r3 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80199Vdj.onViewReleased(android.view.View, float, float):void");
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float width = (view.getWidth() * this.LIZJ.LJFF) + this.LIZ;
        float width2 = (view.getWidth() * this.LIZJ.LJI) + this.LIZ;
        float f = i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
        }
    }
}
