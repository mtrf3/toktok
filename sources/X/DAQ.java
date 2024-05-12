package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAQ extends AbstractC39455Fe7 {
    public DAQ() {
        C32856Cuy.X5(this.LIZJ);
        this.LIZJ.LJIILIIL(11.94f, 24.84f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-3.4f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(18.92f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-4.25f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-2.76f);
        this.LIZJ.LJIIJJI(11.88f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(2.76f);
        this.LIZJ.LJIIJJI(-4.23f);
        C78269Unh.LIZJ(this.LIZJ, "p", 12.92f);
        this.LIZJ.LJIILIIL(14.99f, 0.0f);
        this.LIZJ.LJI(28.2f);
        this.LIZJ.LJIIL(-4.78f, -15.68f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(3.69f);
        this.LIZJ.LJIIL(3.38f, 13.39f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJJI(0.14f);
        this.LIZJ.LJIIL(3.38f, -13.4f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(3.69f);
        this.LIZJ.LJIIL(-4.78f, 15.7f);
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
