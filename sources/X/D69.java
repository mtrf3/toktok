package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D69 extends AbstractC39455Fe7 {
    public D69() {
        C32856Cuy.LJZL(this.LIZJ);
        this.LIZJ.LJIIJ(1.8f, 0.0f, 3.47f, 0.21f, 5.0f, 0.6f);
        this.LIZJ.LJIILL(3.05f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, false, 1.93f, 3.43f);
        this.LIZJ.LJII(23.0f, 37.0f);
        this.LIZJ.LJIIIZ(5.65f, 5.65f, false, false, 0.0f, 8.0f);
        C32856Cuy.Z(this.LIZJ);
        C32856Cuy.Ok(this.LIZJ);
        this.LIZJ.LJIIIIZZ(41.5f, 30.65f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(29.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-1.3f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p2.LJIIJJI(12.5f);
        p2.LJIIL(-2.86f, -2.48f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -0.05f, -1.46f);
        p2.LJIIL(0.87f, -0.87f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.41f, 0.0f);
        p2.LJIIL(5.3f, 5.3f);
        p2.LJIIJ(0.64f, 0.64f, 0.64f, 1.68f, 0.0f, 2.33f);
        p2.LJIIL(-5.3f, 5.29f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        p2.LJIIL(-0.87f, -0.87f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.05f, -1.46f);
        p2.LJIIL(2.86f, -2.48f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(30.5f, 39.35f);
        C32856Cuy.Xn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(1.3f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(30.5f);
        C32856Cuy.N7(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
