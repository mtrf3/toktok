package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9K extends AbstractC39455Fe7 {
    public D9K() {
        this.LIZJ.LJIIIIZZ(5.37f, 15.63f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIJ(2.49f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C32856Cuy.gd(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(7.67f);
        this.LIZJ.LJIIIZ(20.18f, 20.18f, true, true, -3.9f, 21.7f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, 0.57f, -1.27f);
        this.LIZJ.LJIIL(1.88f, -0.69f);
        this.LIZJ.LJIIJ(0.52f, -0.18f, 1.1f, 0.08f, 1.31f, 0.59f);
        this.LIZJ.LJIIIZ(16.19f, 16.19f, true, false, 2.41f, -16.86f);
        this.LIZJ.LJIIJJI(8.87f);
        C32856Cuy.N2(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(7.37f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
