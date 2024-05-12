package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9Y extends AbstractC39455Fe7 {
    public D9Y() {
        this.LIZJ.LJIIIIZZ(12.88f, 5.0f);
        this.LIZJ.LJIIJJI(29.25f);
        this.LIZJ.LJ(43.16f, 5.0f, 44.0f, 5.83f, 44.0f, 6.86f);
        this.LIZJ.LJIILL(33.28f);
        this.LIZJ.LJIIJ(0.0f, 1.03f, -0.84f, 1.86f, -1.87f, 1.86f);
        this.LIZJ.LJI(11.01f);
        this.LIZJ.LJIJ(6.86f);
        this.LIZJ.LJIIJ(0.0f, -1.03f, 0.84f, -1.86f, 1.87f, -1.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(5.62f, 9.87f);
        this.LIZJ.LJIIJ(-0.72f, 0.0f, -1.3f, 0.58f, -1.3f, 1.3f);
        C32856Cuy.o2(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-1.3f, 7.88f);
        C32856Cuy.o2(this.LIZJ);
        this.LIZJ.LJIIJ(-0.73f, 0.0f, -1.31f, 0.58f, -1.31f, 1.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(1.3f, 5.27f);
        this.LIZJ.LJIIJ(-0.72f, 0.0f, -1.3f, 0.59f, -1.3f, 1.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(0.69f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJ(0.0f, 0.72f, 0.58f, 1.3f, 1.3f, 1.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.76f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.3f, -0.58f, 1.3f, -1.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.68f);
        p4.LJIIJ(0.0f, -0.72f, -0.58f, -1.3f, -1.3f, -1.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(18.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.64f, 21.44f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.3f, 0.59f, 1.3f, 1.3f);
        this.LIZJ.LJIJ(40.7f);
        this.LIZJ.LJIIJ(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        this.LIZJ.LJI(5.31f);
        this.LIZJ.LIZJ(1.3f, 1.3f, false, true, 4.0f, 40.7f);
        this.LIZJ.LJIJ(22.75f);
        this.LIZJ.LJIIJ(0.0f, -0.72f, 0.59f, -1.3f, 1.3f, -1.3f);
        this.LIZJ.LJIIJJI(2.34f);
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
