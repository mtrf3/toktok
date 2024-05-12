package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1G extends AbstractC39455Fe7 {
    public D1G() {
        this.LIZJ.LJIIIIZZ(11.5f, 5.5f);
        C32856Cuy.ec(this.LIZJ);
        C32856Cuy.LJJ(this.LIZJ);
        C32856Cuy.Q8(this.LIZJ);
        C32856Cuy.sb(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.82f, 11.25f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -3.64f, 0.0f);
        this.LIZJ.LJII(9.48f, 24.8f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 11.31f, 29.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.19f);
        C32856Cuy.LJJLIIIIJ(this.LIZJ);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, false, 19.0f, 42.0f);
        C32856Cuy.LJIIJJI(this.LIZJ);
        C32856Cuy.ig(this.LIZJ);
        C32856Cuy.B9(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(5.2f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 1.82f, -4.21f);
        this.LIZJ.LJIIL(-12.7f, -13.54f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(19.5f, 26.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-7.04f);
        this.LIZJ.LJII(24.0f, 13.7f);
        this.LIZJ.LJII(35.54f, 26.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(28.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(13.0f);
        p5.LJIIJJI(-9.0f);
        C32856Cuy.LLZZJLIL(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
