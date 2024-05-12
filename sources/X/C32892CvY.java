package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32892CvY extends AbstractC39455Fe7 {
    public C32892CvY() {
        this.LIZJ.LJIIIIZZ(7.0f, 23.0f);
        C32856Cuy.J1(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(33.0f);
        C32856Cuy.n8(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-33.0f);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 7.0f, 25.0f);
        C32856Cuy.d1(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(7.0f, 9.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        p4.LJIIJJI(9.0f);
        C32856Cuy.n8(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-7.5f);
        p5.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        C32856Cuy.p9(this.LIZJ);
        C32856Cuy.k8(this.LIZJ);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 7.0f, 18.0f);
        C32856Cuy.T9(this.LIZJ);
        this.LIZJ.LJIIIIZZ(40.5f, 39.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p6.LJIIJJI(-9.0f);
        C32856Cuy.V5(this.LIZJ);
        C32856Cuy.O6(this.LIZJ);
        C32856Cuy.LLJJI(this.LIZJ);
        C32856Cuy.D9(this.LIZJ);
        C32856Cuy.R1(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", 9.0f);
        C32856Cuy.Uj(this.LIZJ);
        this.LIZJ.LJIIIIZZ(9.0f, 41.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(9.0f);
        p7.LJIIIZ(0.5f, 0.5f, false, false, 0.5f, -0.5f);
        p7.LJIILL(-2.0f);
        p7.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p7.LJIIJJI(-7.5f);
        p7.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p7.LJIJ(30.0f);
        p7.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, -0.5f);
        p7.LJIIJJI(-2.0f);
        p7.LJIIIZ(0.5f, 0.5f, false, false, -0.5f, 0.5f);
        p7.LJIILL(9.0f);
        C32856Cuy.LLZ(this.LIZJ);
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
