package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D71 extends AbstractC39455Fe7 {
    public D71() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(7.0f, 11.0f);
        p.LJIIIZ(7.0f, 7.0f, false, true, 7.0f, -7.0f);
        C32856Cuy.Q9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(35.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p3.LJI(13.5f);
        this.LIZJ.LIZJ(6.5f, 6.5f, false, true, 7.0f, 36.5f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(4.0f, 19.5f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.77f, -0.32f, 1.61f, -0.5f, 2.5f, -0.5f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.LLZZZIL(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(19.5f);
        this.LIZJ.LIZLLL();
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIIZZ(36.0f, 34.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(13.5f);
        p7.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, 5.0f);
        C32856Cuy.N6(this.LIZJ);
        C32856Cuy.g1(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
