package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D8L extends AbstractC39455Fe7 {
    public D8L() {
        this.LIZJ.LJIIIIZZ(25.27f, 15.88f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(3.72f, 3.72f, false, true, 0.0f, -5.27f);
        this.LIZJ.LJIIL(7.1f, -7.1f);
        C32856Cuy.d3(this.LIZJ);
        this.LIZJ.LJIIIIZZ(4.13f, 8.0f);
        C32856Cuy.Qk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.13f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        p3.LJIJ(8.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(4.0f, 17.2f);
        C32856Cuy.ba(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(8.13f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(17.2f, 4.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, -4.0f);
        p5.LJIIJJI(10.8f);
        p5.LJIIIZ(4.0f, 4.0f, false, true, 4.0f, 4.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(40.0f);
        p6.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, 4.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(-10.8f);
        C32856Cuy.M3(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
