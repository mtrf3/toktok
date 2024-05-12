package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33228D2i extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33228D2i() {
        this.LIZJ.LJIIIIZZ(31.68f, 15.74f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 3.4f, 2.11f);
        this.LIZJ.LJIIL(6.7f, -11.6f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, false, 40.48f, 4.0f);
        this.LIZJ.LJI(29.95f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -1.3f, 0.76f);
        this.LIZJ.LJII(23.38f, 14.0f);
        this.LIZJ.LJIIIZ(18.3f, 18.3f, false, true, 4.38f, 0.4f);
        this.LIZJ.LJII(31.4f, 8.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(4.75f);
        this.LIZJ.LJIIL(-4.47f, 7.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(25.64f, 27.18f);
        this.LIZJ.LJIIL(-1.21f, -3.72f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.95f, 0.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.21f, 3.72f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.47f, 0.35f);
        this.LIZJ.LJIIJJI(-3.92f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.29f, 0.9f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(3.16f, 2.3f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.19f, 0.56f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-1.21f, 3.72f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.77f, 0.56f);
        this.LIZJ.LJIIL(3.16f, -2.3f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.59f, 0.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(3.16f, 2.3f);
        this.LIZJ.LJIIJ(0.4f, 0.28f, 0.92f, -0.1f, 0.77f, -0.56f);
        this.LIZJ.LJIIL(-1.2f, -3.72f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.17f, -0.56f);
        this.LIZJ.LJIIL(3.17f, -2.3f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.3f, -0.9f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-3.9f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, -0.48f, -0.35f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(37.95f, 30.0f);
        dij.LJIIIZ(14.0f, 14.0f, true, false, -28.0f, 0.0f);
        dij.LJIIIZ(14.0f, 14.0f, false, false, 28.0f, 0.0f);
        dij.LIZLLL();
        C32856Cuy.LJJIJIL(dij);
        C32856Cuy.w4(dij);
        dij.LJIIIIZZ(16.63f, 8.0f);
        dij.LJIIJJI(-4.75f);
        dij.LJIIL(4.44f, 7.7f);
        dij.LJIIIZ(17.97f, 17.97f, false, false, -3.4f, 2.08f);
        dij.LJII(6.24f, 6.25f);
        dij.LIZJ(1.5f, 1.5f, false, true, 7.55f, 4.0f);
        dij.LJIIJJI(10.53f);
        dij.LJIIJ(0.54f, 0.0f, 1.04f, 0.29f, 1.3f, 0.76f);
        dij.LJIIL(2.77f, 4.85f);
        dij.LJIIL(-2.3f, 4.04f);
        dij.LJII(16.63f, 8.0f);
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
