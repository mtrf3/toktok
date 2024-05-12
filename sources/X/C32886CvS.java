package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CvS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32886CvS extends AbstractC39455Fe7 {
    public C32886CvS() {
        this.LIZJ.LJIIIIZZ(35.15f, 6.65f);
        C32856Cuy.LLJJIJIIJIL(this.LIZJ);
        this.LIZJ.LJIIL(-8.3f, 8.29f);
        C32856Cuy.x5(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(0.71f, 0.71f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        this.LIZJ.LJIIL(8.3f, -8.29f);
        C32856Cuy.Kb(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(11.0f, 12.0f);
        C32856Cuy.zn(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(11.68f);
        C32856Cuy.Dc(this.LIZJ);
        C32856Cuy.n6(this.LIZJ);
        C32856Cuy.hl(this.LIZJ);
        C32856Cuy.LJLLILLLL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(3.0f, 3.0f, false, false, 3.0f, 3.0f);
        p5.LJIIJJI(21.0f);
        C32856Cuy.il(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(19.56f);
        C32856Cuy.H3(this.LIZJ);
        C32856Cuy.LLLJIL(this.LIZJ);
        C32856Cuy.LLZLLIL(this.LIZJ);
        this.LIZJ.LJIILIIL(11.1f, 9.2f);
        C32856Cuy.O2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(21.0f, 22.87f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIL(4.63f, 3.09f);
        this.LIZJ.LJII(21.0f, 28.73f);
        C78269Unh.LIZJ(this.LIZJ, "p", -5.86f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
