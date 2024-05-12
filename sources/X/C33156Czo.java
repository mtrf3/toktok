package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33156Czo extends AbstractC39455Fe7 {
    public C33156Czo() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(16.0f, 8.0f);
        C32856Cuy.eo(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-4.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, 2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(22.0f);
        p3.LJIIJ(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(22.0f);
        p4.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-4.0f);
        p5.LJIIJJI(4.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(2.0f, 2.0f, false, false, 2.0f, -2.0f);
        p6.LJIJ(10.0f);
        p6.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LLLLJ(this.LIZJ);
        this.LIZJ.LJIILIIL(16.0f, 6.0f);
        C32856Cuy.s6(this.LIZJ);
        C32856Cuy.LJJLJLI(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(22.0f);
        p7.LJIILL(22.0f);
        C32856Cuy.LJFF(this.LIZJ);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIJ(16.0f);
        p9.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.0f, 38.0f);
        C32856Cuy.n9(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(22.0f);
        p10.LJIILL(22.0f);
        C32856Cuy.LLLLIIIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(10.1f, -15.8f);
        C32856Cuy.O2(this.LIZJ);
        this.LIZJ.LJIIIIZZ(19.0f, 23.87f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIL(4.63f, 3.09f);
        this.LIZJ.LJII(19.0f, 29.73f);
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
