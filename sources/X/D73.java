package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D73 extends AbstractC39455Fe7 {
    public D73() {
        this.LIZJ.LJIIIIZZ(20.66f, 4.82f);
        this.LIZJ.LJIIJ(-0.16f, 0.32f, -0.16f, 0.74f, -0.16f, 1.58f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(14.1f);
        this.LIZJ.LJI(6.4f);
        C32856Cuy.ld(this.LIZJ);
        this.LIZJ.LJ(4.0f, 21.64f, 4.0f, 22.06f, 4.0f, 22.9f);
        C32856Cuy.q1(this.LIZJ);
        C32856Cuy.Ai(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(14.1f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(14.1f);
        C32856Cuy.Ai(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(2.2f);
        C32856Cuy.Yj(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(27.5f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(14.1f);
        C32856Cuy.Yj(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-2.2f);
        C32856Cuy.Xi(this.LIZJ);
        this.LIZJ.LJIIJ(-0.32f, -0.16f, -0.74f, -0.16f, -1.58f, -0.16f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJI(27.5f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIJ(6.4f);
        C32856Cuy.Xi(this.LIZJ);
        this.LIZJ.LJ(26.36f, 4.0f, 25.94f, 4.0f, 25.1f, 4.0f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(-2.2f);
        C32856Cuy.ld(this.LIZJ);
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
