package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9J extends AbstractC39455Fe7 {
    public D9J() {
        this.LIZJ.LJIIIIZZ(62.78f, 3.52f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 64.5f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(48.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(9.5f, 9.5f, true, true, -9.5f, -9.5f);
        p2.LJIIJJI(6.5f);
        this.LIZJ.LJIJ(14.73f);
        this.LIZJ.LJIIL(-35.0f, 5.07f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(59.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(9.5f, 9.5f, true, true, -9.5f, -9.5f);
        p4.LJIIJJI(6.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(10.76f);
        this.LIZJ.LJIIJ(0.0f, -0.75f, 0.54f, -1.38f, 1.28f, -1.49f);
        this.LIZJ.LJIIL(38.0f, -5.75f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.5f, 16.77f);
        this.LIZJ.LJIIL(35.0f, -5.07f);
        this.LIZJ.LJIJ(6.74f);
        this.LIZJ.LJIIL(-35.0f, 5.3f);
        this.LIZJ.LJIILL(4.73f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(48.5f, 53.0f);
        this.LIZJ.LJIIIZ(6.5f, 6.5f, true, false, 13.0f, 0.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(-6.5f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJI(55.0f);
        this.LIZJ.LJIIIZ(6.5f, 6.5f, false, false, -6.5f, 6.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.0f, 52.5f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(6.5f, 6.5f, true, false, 6.5f, 6.5f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(-6.5f);
        DIL.LIZ(this.LIZJ, "p", 17.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
