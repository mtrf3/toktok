package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7K extends AbstractC39455Fe7 {
    public D7K() {
        this.LIZJ.LJIIIIZZ(36.0f, 10.33f);
        this.LIZJ.LJIIJ(0.0f, 5.16f, -2.92f, 9.6f, -7.11f, 11.58f);
        this.LIZJ.LIZJ(14.45f, 14.45f, false, true, 38.0f, 35.46f);
        C32856Cuy.N9(this.LIZJ);
        C32856Cuy.cj(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-5.54f);
        this.LIZJ.LJIIJ(0.0f, -6.21f, 3.8f, -11.5f, 9.11f, -13.55f);
        this.LIZJ.LIZJ(12.72f, 12.72f, false, true, 12.0f, 10.33f);
        C32856Cuy.e(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, -3.0f);
        p2.LJIIJJI(18.0f);
        p2.LJIIIZ(3.0f, 3.0f, false, true, 3.0f, 3.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(15.37f, 35.11f);
        this.LIZJ.LIZJ(3.0f, 3.0f, false, false, 14.0f, 37.63f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(39.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.Ua(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(-1.37f);
        this.LIZJ.LJIIIZ(3.0f, 3.0f, false, false, -1.37f, -2.52f);
        this.LIZJ.LJIIL(-5.36f, -3.48f);
        this.LIZJ.LJIIIZ(6.0f, 6.0f, false, false, -6.54f, 0.0f);
        this.LIZJ.LJIIL(-5.37f, 3.48f);
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
