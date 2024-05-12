package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cva, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32894Cva extends AbstractC39455Fe7 {
    public C32894Cva() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(32.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(16.5f);
        p2.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.0f);
        p3.LJIIJ(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        C32856Cuy.J6(this.LIZJ);
        C32856Cuy.Zg(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(15.5f);
        C32856Cuy.Zn(this.LIZJ);
        C32856Cuy.n9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(8.0f, 8.0f, false, false, -8.0f, -8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.0f, 16.0f);
        C32856Cuy.qn(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(20.0f);
        p6.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(12.0f);
        p7.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        DIK.LIZIZ(this.LIZJ, "p", 16.0f);
        C32856Cuy.nc(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(20.0f);
        p9.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(20.0f);
        p10.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIJ(16.0f);
        p11.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LLLLIILL(this.LIZJ);
        this.LIZJ.LJIILIIL(7.57f, 5.68f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.57f, 0.82f);
        C32856Cuy.LJLIIL(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.57f, 0.82f);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIL(8.0f, -5.5f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.64f);
        Q7L.LIZLLL(this.LIZJ, "p", -8.0f, -5.5f);
        this.LIZJ.LJIIIIZZ(25.23f, 26.0f);
        this.LIZJ.LJII(20.0f, 29.6f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIILL(-7.2f);
        this.LIZJ.LJIIL(5.23f, 3.6f);
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
