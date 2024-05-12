package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CwC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32932CwC extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32932CwC() {
        this.LIZJ.LJIIIIZZ(34.23f, 23.63f);
        C32856Cuy.x5(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(4.95f, 4.95f);
        C32856Cuy.LLIIZ(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.42f, -1.41f);
        C32856Cuy.y5(this.LIZJ);
        this.LIZJ.LJIIL(-4.95f, -4.96f);
        C32856Cuy.A5(this.LIZJ);
        Q7L.LIZLLL(this.LIZJ, "p", -1.42f, 1.42f);
        this.LIZJ.LJIIIIZZ(42.72f, 32.82f);
        C32856Cuy.B5(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.41f, -1.42f);
        C32856Cuy.LLLLLJLJLL(this.LIZJ);
        this.LIZJ.LJIIL(4.96f, 4.95f);
        C32856Cuy.t8(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-4.95f, -4.95f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(3.47f, 36.0f);
        dij.LJII(36.0f, 3.47f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 8.49f, 0.0f);
        dij.LJIIL(6.64f, 6.64f);
        dij.LJIIJ(0.69f, 0.7f, 0.74f, 1.78f, 0.42f, 2.7f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, 7.64f, 7.64f);
        dij.LJIIJ(0.92f, -0.32f, 2.0f, -0.27f, 2.7f, 0.42f);
        dij.LJIIL(6.64f, 6.64f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 0.0f, 8.49f);
        dij.LJII(36.0f, 68.53f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, -8.49f, 0.0f);
        dij.LJIIL(-6.64f, -6.64f);
        dij.LJIIJ(-0.69f, -0.7f, -0.74f, -1.78f, -0.42f, -2.7f);
        dij.LJIIIZ(6.0f, 6.0f, false, false, -7.64f, -7.64f);
        dij.LJIIJ(-0.92f, 0.32f, -2.0f, 0.27f, -2.7f, -0.42f);
        dij.LJIIL(-6.64f, -6.64f);
        dij.LJIIIZ(6.0f, 6.0f, false, true, 0.0f, -8.49f);
        dij.LIZLLL();
        dij.LJIILIIL(2.12f, 2.12f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 0.0f, 4.24f);
        dij.LJIIL(6.32f, 6.32f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, 11.4f, 11.4f);
        dij.LJIIL(6.33f, 6.33f);
        C32856Cuy.h7(dij);
        dij.LJIIL(21.21f, -21.22f);
        dij.LJIIL(-3.89f, -3.89f);
        C32856Cuy.B5(dij);
        C32856Cuy.t(dij);
        C32856Cuy.g9(dij);
        dij.LJIIL(3.9f, 3.9f);
        dij.LJIIL(9.19f, -9.2f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 0.0f, -4.24f);
        dij.LJIIL(-6.32f, -6.32f);
        dij.LJIIIZ(9.0f, 9.0f, false, true, -11.4f, -11.4f);
        dij.LJIIL(-6.33f, -6.33f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, -4.24f, 0.0f);
        dij.LJIIL(-9.2f, 9.2f);
        dij.LJIIL(3.9f, 3.89f);
        C32856Cuy.LLIILZL(dij);
        dij.LJII(31.4f, 20.8f);
        C32856Cuy.D5(dij);
        dij.LJIIL(-3.9f, -3.9f);
        dij.LJII(5.6f, 38.13f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
