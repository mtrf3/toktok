package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cx8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32990Cx8 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32990Cx8() {
        this.LIZJ.LJIIIIZZ(4.76f, 8.82f);
        this.LIZJ.LJ(4.0f, 10.32f, 4.0f, 12.28f, 4.0f, 16.2f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(6.6f);
        C32856Cuy.yj(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(20.0f);
        C32856Cuy.D1(this.LIZJ);
        C32856Cuy.LJ(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, true, false, 0.0f, 4.0f);
        this.LIZJ.LJIIJJI(8.92f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, false, 0.48f, -0.65f);
        this.LIZJ.LJIIL(-3.72f, -12.0f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.48f, -0.35f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-9.4f);
        C32856Cuy.N1(this.LIZJ);
        this.LIZJ.LJ(8.0f, 27.71f, 8.0f, 26.87f, 8.0f, 25.2f);
        this.LIZJ.LJIJ(13.8f);
        C32856Cuy.Nk(this.LIZJ);
        this.LIZJ.LJ(10.29f, 9.0f, 11.13f, 9.0f, 12.8f, 9.0f);
        this.LIZJ.LJIIJJI(22.4f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(1.68f, 0.0f, 2.52f, 0.0f, 3.16f, 0.33f);
        p5.LJIIIZ(3.0f, 3.0f, false, true, 1.31f, 1.3f);
        p5.LJIIJ(0.33f, 0.65f, 0.33f, 1.49f, 0.33f, 3.17f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(5.96f);
        this.LIZJ.LJIIJ(0.0f, 0.22f, 0.15f, 0.42f, 0.37f, 0.48f);
        this.LIZJ.LJIIL(3.0f, 0.84f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.63f, -0.48f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-4.4f);
        C32856Cuy.Yk(this.LIZJ);
        this.LIZJ.LJ(38.68f, 5.0f, 36.72f, 5.0f, 32.8f, 5.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(15.2f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(-3.92f, 0.0f, -5.88f, 0.0f, -7.38f, 0.76f);
        p10.LJIIIZ(7.0f, 7.0f, false, false, -3.06f, 3.06f);
        p10.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(29.44f, 39.2f);
        dij.LJIIL(-5.73f, -17.76f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 1.88f, -1.9f);
        dij.LJIIL(17.52f, 5.47f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, 0.22f, 2.77f);
        dij.LJIIL(-4.88f, 2.44f);
        dij.LJIIL(5.92f, 5.92f);
        C32856Cuy.LLJIJIL(dij);
        dij.LJIIL(-1.43f, 1.43f);
        C32856Cuy.LLJILJIL(dij);
        dij.LJIIL(-6.03f, -6.03f);
        dij.LJIIL(-2.55f, 5.7f);
        dij.LJIIIZ(1.5f, 1.5f, false, true, -2.8f, -0.16f);
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
