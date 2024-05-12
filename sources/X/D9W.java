package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9W extends AbstractC39455Fe7 {
    public D9W() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(12.0f, 3.0f);
        C32856Cuy.bh(this.LIZJ);
        C32856Cuy.LJLLLL(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, 6.0f);
        p2.LJIIJJI(24.0f);
        p2.LJIIIZ(6.0f, 6.0f, false, false, 6.0f, -6.0f);
        C32856Cuy.g(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        p3.LJI(12.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(19.5f, 21.87f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.74f);
        this.LIZJ.LJIIL(-12.0f, -6.92f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.5f, 0.86f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(13.86f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, 1.5f, 0.86f);
        this.LIZJ.LJIIL(12.0f, -6.92f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
