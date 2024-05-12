package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9Q extends AbstractC39455Fe7 {
    public D9Q() {
        this.LIZJ.LJIIIIZZ(8.22f, 4.0f);
        this.LIZJ.LJIIIZ(3.15f, 3.15f, false, false, -3.15f, 3.14f);
        this.LIZJ.LJII(5.0f, 33.64f);
        this.LIZJ.LJIIJ(0.0f, 1.74f, 1.4f, 3.15f, 3.15f, 3.15f);
        this.LIZJ.LJIIJJI(9.27f);
        this.LIZJ.LJIIL(4.14f, 5.05f);
        this.LIZJ.LJIIIZ(3.16f, 3.16f, false, false, 4.88f, 0.0f);
        this.LIZJ.LJIIL(4.13f, -5.05f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(9.28f);
        this.LIZJ.LIZJ(3.15f, 3.15f, false, false, 43.0f, 33.63f);
        this.LIZJ.LJIIL(-0.07f, -26.49f);
        this.LIZJ.LIZJ(3.15f, 3.15f, false, false, 39.78f, 4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.22f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(22.09f, 15.14f);
        this.LIZJ.LJIIJ(0.7f, 0.0f, 1.26f, 0.56f, 1.26f, 1.26f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.26f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, -0.56f, 1.26f, -1.26f, 1.26f);
        this.LIZJ.LJI(17.69f);
        this.LIZJ.LJIIJ(-0.7f, 0.0f, -1.26f, -0.57f, -1.26f, -1.26f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(20.4f);
        this.LIZJ.LJIIJ(0.0f, -0.7f, 0.56f, -1.26f, 1.26f, -1.26f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(12.62f);
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
