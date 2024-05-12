package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33005CxN extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33005CxN() {
        this.LIZJ.LJIIIIZZ(4.17f, 39.6f);
        this.LIZJ.LJIIJ(0.0f, 2.31f, 1.87f, 4.18f, 4.18f, 4.18f);
        this.LIZJ.LJI(20.9f);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-2.17f);
        C32856Cuy.Bn(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.35f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(8.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(25.04f);
        this.LIZJ.LJIILL(10.47f);
        C32856Cuy.En(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(2.18f);
        C32856Cuy.Dn(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(8.3f);
        this.LIZJ.LJIIJ(0.0f, -2.3f, -1.87f, -4.17f, -4.18f, -4.17f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(8.35f);
        this.LIZJ.LIZJ(4.17f, 4.17f, false, false, 4.17f, 8.3f);
        this.LIZJ.LJIILL(31.3f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.22f, 18.78f);
        C32856Cuy.yn(dij);
        dij.LJIIJJI(-14.7f);
        C32856Cuy.xn(dij);
        dij.LJIILL(-2.17f);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(14.7f);
        C32856Cuy.I1(dij);
        dij.LJIIIIZZ(21.91f, 28.17f);
        C32856Cuy.yn(dij);
        dij.LJIIJJI(-7.39f);
        C32856Cuy.xn(dij);
        C32856Cuy.y9(dij);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(7.4f);
        C32856Cuy.I1(dij);
        dij.LJIIIIZZ(33.4f, 32.2f);
        dij.LJIILL(-6.51f);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(2.16f);
        C32856Cuy.An(dij);
        dij.LJIILL(6.5f);
        dij.LJIIJJI(6.51f);
        C32856Cuy.An(dij);
        dij.LJIILL(2.18f);
        C32856Cuy.yn(dij);
        C32856Cuy.wb(dij);
        dij.LJIILL(6.5f);
        C32856Cuy.yn(dij);
        dij.LJIIJJI(-2.18f);
        C32856Cuy.xn(dij);
        dij.LJIILL(-6.5f);
        C32856Cuy.wb(dij);
        C32856Cuy.xn(dij);
        dij.LJIILL(-2.18f);
        C32856Cuy.zn(dij);
        dij.LJIIJJI(6.5f);
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
