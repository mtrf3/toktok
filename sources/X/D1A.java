package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1A extends AbstractC39455Fe7 {
    public D1A() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 10.5f);
        C32856Cuy.Mh(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(4.5f, 4.5f, false, false, 4.5f, -4.5f);
        this.LIZJ.LJIILL(-6.05f);
        this.LIZJ.LJIIL(8.62f, 6.26f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, false, 45.5f, 32.0f);
        C32856Cuy.n9(this.LIZJ);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, false, -2.38f, -1.21f);
        this.LIZJ.LJIIL(-8.62f, 6.26f);
        C32856Cuy.m9(this.LIZJ);
        C32856Cuy.c9(this.LIZJ);
        C32856Cuy.W6(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(31.5f, 15.0f);
        C32856Cuy.LJLJL(this.LIZJ);
        C32856Cuy.Mj(this.LIZJ);
        C32856Cuy.y2(this.LIZJ);
        C32856Cuy.LJIJJ(this.LIZJ);
        C32856Cuy.e5(this.LIZJ);
        this.LIZJ.LIZLLL();
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILIIL(11.0f, 14.05f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJII(35.55f, 24.0f);
        this.LIZJ.LJIIL(6.95f, -5.05f);
        this.LIZJ.LJIILL(10.1f);
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
