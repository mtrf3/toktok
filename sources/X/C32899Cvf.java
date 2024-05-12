package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cvf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32899Cvf extends AbstractC39455Fe7 {
    public C32899Cvf() {
        this.LIZJ.LJIIIIZZ(20.0f, 18.5f);
        C32856Cuy.l6(this.LIZJ);
        C32856Cuy.v9(this.LIZJ);
        C32856Cuy.LJJII(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.5f);
        C32856Cuy.E6(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p2.LJIILL(-8.0f);
        C32856Cuy.LJIIIIZZ(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(8.0f);
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, 0.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.0f, 26.0f);
        C32856Cuy.LJJLIIIJ(this.LIZJ);
        C32856Cuy.F0(this.LIZJ);
        C32856Cuy.B3(this.LIZJ);
        C32856Cuy.G0(this.LIZJ);
        C32856Cuy.B3(this.LIZJ);
        C32856Cuy.F0(this.LIZJ);
        C32856Cuy.y9(this.LIZJ);
        C32856Cuy.LLLLIIIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(20.5f, -10.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(39.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        C32856Cuy.LJLJLJ(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p5.LJI(9.0f);
        p5.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-21.0f);
        C32856Cuy.x(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(8.5f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(9.0f);
        p9.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(9.0f);
        p10.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(6.5f);
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
