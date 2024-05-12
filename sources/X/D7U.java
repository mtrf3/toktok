package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D7U extends AbstractC39455Fe7 {
    public D7U() {
        this.LIZJ.LJIILIIL(37.62f, 22.2f);
        this.LIZJ.LJIIL(7.3f, -7.29f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -2.82f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-7.3f, -7.3f);
        C32856Cuy.ln(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(3.88f, 3.88f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(5.5f);
        C32856Cuy.Zj(this.LIZJ);
        this.LIZJ.LJIIJJI(33.17f);
        C32856Cuy.zh(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.38f, 25.8f);
        this.LIZJ.LJIIL(-7.3f, 7.29f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, 2.82f);
        p5.LJIIL(7.3f, 7.3f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.41f, 0.0f);
        p5.LJIIL(1.42f, -1.42f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        this.LIZJ.LJII(9.33f, 36.5f);
        this.LIZJ.LJI(42.5f);
        C32856Cuy.xa(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(9.33f);
        C32856Cuy.U2(this.LIZJ);
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
