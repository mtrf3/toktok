package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33039Cxv extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33039Cxv() {
        this.LIZJ.LJIIIIZZ(19.73f, 22.23f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJIIJJI(-1.98f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(1.0f);
        this.LIZJ.LJIIIZ(7.96f, 7.96f, false, false, 15.92f, 0.0f);
        C32856Cuy.Vn(this.LIZJ);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(38.1f, 4.34f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.72f, -0.73f);
        dij.LJIIL(-2.15f, 2.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.78f, 0.31f);
        dij.LJIIL(-3.14f, -0.13f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.72f, 1.73f);
        dij.LJIIL(2.3f, 2.15f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.3f, 0.77f);
        dij.LJIIL(-0.11f, 2.78f);
        dij.LJI(11.78f);
        dij.LJIILJJIL(-0.43f, 0.02f, -0.64f, 0.05f, false);
        dij.LJIIL(0.19f, -2.51f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.99f, -0.92f);
        dij.LJI(25.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        dij.LJIJ(7.16f);
        C32856Cuy.Bn(dij);
        dij.LJI(12.32f);
        dij.LJIIIZ(4.97f, 4.97f, false, false, -4.96f, 4.61f);
        dij.LJIIL(-0.52f, 7.15f);
        dij.LJIIL(-0.02f, 0.21f);
        dij.LJIIL(-0.76f, 10.17f);
        C32856Cuy.b0(dij);
        dij.LJIIL(-0.76f, 10.37f);
        dij.LIZJ(4.97f, 4.97f, false, false, 10.3f, 44.0f);
        dij.LJIIJJI(27.4f);
        dij.LJIIIZ(4.97f, 4.97f, false, false, 4.97f, -5.33f);
        dij.LJII(41.9f, 28.3f);
        C32856Cuy.b0(dij);
        dij.LJIIL(-0.53f, -7.1f);
        dij.LJIIJJI(0.05f);
        dij.LJIIL(-0.23f, -3.07f);
        dij.LJIIIZ(4.97f, 4.97f, false, false, -4.96f, -4.6f);
        dij.LJI(34.8f);
        dij.LJIIL(1.13f, -1.22f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.77f, -0.32f);
        dij.LJIIL(3.15f, 0.14f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 0.72f, -1.73f);
        dij.LJIIL(-2.3f, -2.15f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.31f, -0.77f);
        C279417u.LIZIZ(dij, 0.14f, -3.14f, 11.79f, 17.5f);
        dij.LJI(36.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 0.92f);
        dij.LJIIL(0.18f, 2.48f);
        C32856Cuy.nb(dij);
        dij.LJIIL(1.3f, 18.04f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -0.98f, 1.07f);
        dij.LJI(10.3f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.07f);
        dij.LJIIL(1.5f, -20.62f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.98f, -0.82f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
