package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32872CvE extends AbstractC39455Fe7 {
    public C32872CvE() {
        C32856Cuy.ad(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 17.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LJIILL(4.63f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, 0.86f, 0.0f, 1.37f, 0.02f, 1.82f);
        p2.LIZJ(17.0f, 17.0f, false, false, 22.0f, 40.53f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(45.0f);
        C32856Cuy.N8(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-4.47f);
        C32856Cuy.g0(this.LIZJ);
        C32856Cuy.Dn(this.LIZJ);
        this.LIZJ.LJIILL(-1.97f);
        C32856Cuy.Bn(this.LIZJ);
        C32856Cuy.A6(this.LIZJ);
        this.LIZJ.LJIIJ(-0.95f, 0.0f, -1.35f, 0.0f, -1.68f, -0.02f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(13.0f, 13.0f, false, true, -12.3f, -12.3f);
        p5.LJ(10.0f, 23.9f, 10.0f, 23.5f, 10.0f, 22.56f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(18.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.V6(this.LIZJ);
        this.LIZJ.LJIILIIL(32.0f, 10.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIILL(-8.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p7.LJIIJJI(2.0f);
        C32856Cuy.a9(this.LIZJ);
        C32856Cuy.T(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILIIL(0.0f, 19.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p10.LJIILL(-4.5f);
        C32856Cuy.ub(this.LIZJ);
        C32856Cuy.z4(this.LIZJ);
        C32856Cuy.P6(this.LIZJ);
        C32856Cuy.F9(this.LIZJ);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p11.LJIIJJI(2.0f);
        p11.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p11.LJIILL(4.5f);
        this.LIZJ.LJIIL(4.5f, 0.02f);
        C32856Cuy.N2(this.LIZJ);
        this.LIZJ.LJII(42.0f, 40.5f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIJ(45.0f);
        p12.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p12.LJIIJJI(-2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
