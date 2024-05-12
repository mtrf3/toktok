package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.VTc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79788VTc extends AbstractC270614k {
    public final /* synthetic */ C79787VTb LIZ;
    public final /* synthetic */ Context LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.getTop() == r6.LIZ.LJLJI.top) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r2.LJLLILLLL = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r0.getLeft() == r6.LIZ.LJLJI.left) goto L15;
     */
    @Override // X.AbstractC270614k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewDragStateChanged(int r7) {
        /*
            r6 = this;
            super.onViewDragStateChanged(r7)
            X.VTb r2 = r6.LIZ
            r5 = 1
            if (r7 == 0) goto Lf
            if (r7 == r5) goto Lb
        La:
            return
        Lb:
            r0 = 4
            r2.LJLLILLLL = r0
            goto La
        Lf:
            int r0 = r2.getDragEdge()
            r3 = 0
            r4 = 0
            r1 = 2
            if (r0 == r5) goto L20
            X.VTb r0 = r6.LIZ
            int r0 = r0.getDragEdge()
            if (r0 != r1) goto L35
        L20:
            X.VTb r0 = r6.LIZ
            android.view.View r0 = r0.LJLIL
            if (r0 == 0) goto L4a
            int r1 = r0.getLeft()
            X.VTb r0 = r6.LIZ
            android.graphics.Rect r0 = r0.LJLJI
            int r0 = r0.left
            if (r1 != r0) goto L48
        L32:
            r2.LJLLILLLL = r3
            goto La
        L35:
            X.VTb r0 = r6.LIZ
            android.view.View r0 = r0.LJLIL
            if (r0 == 0) goto L4e
            int r1 = r0.getTop()
            X.VTb r0 = r6.LIZ
            android.graphics.Rect r0 = r0.LJLJI
            int r0 = r0.top
            if (r1 != r0) goto L48
            goto L32
        L48:
            r3 = 2
            goto L32
        L4a:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r4
        L4e:
            kotlin.jvm.internal.o.LJIIZILJ()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79788VTc.onViewDragStateChanged(int):void");
    }

    public C79788VTc(C79787VTb c79787VTb, Context context) {
        this.LIZ = c79787VTb;
        this.LIZIZ = context;
    }

    @Override // X.AbstractC270614k
    public final void onEdgeDragStarted(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        super.onEdgeDragStarted(i, i2);
        if (this.LIZ.LJLL) {
            return;
        }
        boolean z4 = false;
        if (this.LIZ.getDragEdge() == 2 && i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LIZ.getDragEdge() == 1 && i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LIZ.getDragEdge() == 8 && i == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.LIZ.getDragEdge() == 4 && i == 8) {
            z4 = true;
        }
        if (z || z2 || z3 || z4) {
            C79787VTb c79787VTb = this.LIZ;
            C270714l c270714l = c79787VTb.LJZL;
            if (c270714l != null) {
                View view = c79787VTb.LJLIL;
                if (view != null) {
                    c270714l.LIZJ(i2, view);
                    return;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View child, int i) {
        o.LJIIJ(child, "child");
        this.LIZ.getClass();
        if (this.LIZ.LJLL) {
            return false;
        }
        C79787VTb c79787VTb = this.LIZ;
        C270714l c270714l = c79787VTb.LJZL;
        if (c270714l != null) {
            View view = c79787VTb.LJLIL;
            if (view != null) {
                c270714l.LIZJ(i, view);
                return false;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionHorizontal(View child, int i, int i2) {
        o.LJIIJ(child, "child");
        int dragEdge = this.LIZ.getDragEdge();
        if (dragEdge != 1) {
            if (dragEdge != 2) {
                return child.getLeft();
            }
            int min = Math.min(i, this.LIZ.LJLJI.left);
            C79787VTb c79787VTb = this.LIZ;
            int i3 = c79787VTb.LJLJI.left;
            View view = c79787VTb.LJLILLLLZI;
            if (view != null) {
                return Math.max(min, i3 - view.getWidth());
            }
            o.LJIIZILJ();
            throw null;
        }
        C79787VTb c79787VTb2 = this.LIZ;
        int i4 = c79787VTb2.LJLJI.left;
        View view2 = c79787VTb2.LJLILLLLZI;
        if (view2 != null) {
            return Math.max(Math.min(i, view2.getWidth() + i4), this.LIZ.LJLJI.left);
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View child, int i, int i2) {
        o.LJIIJ(child, "child");
        int dragEdge = this.LIZ.getDragEdge();
        if (dragEdge != 4) {
            if (dragEdge != 8) {
                return child.getTop();
            }
            int min = Math.min(i, this.LIZ.LJLJI.top);
            C79787VTb c79787VTb = this.LIZ;
            int i3 = c79787VTb.LJLJI.top;
            View view = c79787VTb.LJLILLLLZI;
            if (view != null) {
                return Math.max(min, i3 - view.getHeight());
            }
            o.LJIIZILJ();
            throw null;
        }
        C79787VTb c79787VTb2 = this.LIZ;
        int i4 = c79787VTb2.LJLJI.top;
        View view2 = c79787VTb2.LJLILLLLZI;
        if (view2 != null) {
            return Math.max(Math.min(i, view2.getHeight() + i4), this.LIZ.LJLJI.top);
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View releasedChild, float f, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIJ(releasedChild, "releasedChild");
        int i = (int) f;
        boolean z4 = false;
        if (C39221FaL.LIZ(i, this.LIZIZ) >= this.LIZ.getMinFlingVelocity()) {
            z = true;
        } else {
            z = false;
        }
        if (C39221FaL.LIZ(i, this.LIZIZ) <= (-this.LIZ.getMinFlingVelocity())) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = (int) f2;
        if (C39221FaL.LIZ(i2, this.LIZIZ) <= (-this.LIZ.getMinFlingVelocity())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C39221FaL.LIZ(i2, this.LIZIZ) >= this.LIZ.getMinFlingVelocity()) {
            z4 = true;
        }
        int halfwayPivotHorizontal = this.LIZ.getHalfwayPivotHorizontal();
        int halfwayPivotVertical = this.LIZ.getHalfwayPivotVertical();
        int dragEdge = this.LIZ.getDragEdge();
        if (dragEdge != 1) {
            if (dragEdge != 2) {
                if (dragEdge != 4) {
                    if (dragEdge != 8) {
                        return;
                    }
                    if (z3) {
                        this.LIZ.LIZJ(true);
                        return;
                    }
                    if (z4) {
                        this.LIZ.LIZIZ(true);
                        return;
                    }
                    View view = this.LIZ.LJLIL;
                    if (view != null) {
                        if (view.getBottom() < halfwayPivotVertical) {
                            this.LIZ.LIZJ(true);
                            return;
                        } else {
                            this.LIZ.LIZIZ(true);
                            return;
                        }
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                if (z3) {
                    this.LIZ.LIZIZ(true);
                    return;
                }
                if (z4) {
                    this.LIZ.LIZJ(true);
                    return;
                }
                View view2 = this.LIZ.LJLIL;
                if (view2 != null) {
                    if (view2.getTop() < halfwayPivotVertical) {
                        this.LIZ.LIZIZ(true);
                        return;
                    } else {
                        this.LIZ.LIZJ(true);
                        return;
                    }
                }
                o.LJIIZILJ();
                throw null;
            }
            if (z) {
                this.LIZ.LIZIZ(true);
                return;
            }
            if (z2) {
                this.LIZ.LIZJ(true);
                return;
            }
            View view3 = this.LIZ.LJLIL;
            if (view3 != null) {
                if (view3.getRight() < halfwayPivotHorizontal) {
                    this.LIZ.LIZJ(true);
                    return;
                } else {
                    this.LIZ.LIZIZ(true);
                    return;
                }
            }
            o.LJIIZILJ();
            throw null;
        }
        if (z) {
            this.LIZ.LIZJ(true);
            return;
        }
        if (z2) {
            this.LIZ.LIZIZ(true);
            return;
        }
        View view4 = this.LIZ.LJLIL;
        if (view4 != null) {
            if (view4.getLeft() < halfwayPivotHorizontal) {
                this.LIZ.LIZIZ(true);
                return;
            } else {
                this.LIZ.LIZJ(true);
                return;
            }
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    @Override // X.AbstractC270614k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewPositionChanged(android.view.View r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79788VTc.onViewPositionChanged(android.view.View, int, int, int, int):void");
    }
}
