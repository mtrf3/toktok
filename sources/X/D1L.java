package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D1L extends AbstractC39455Fe7 {
    public D1L() {
        this.LIZJ.LJIIIIZZ(42.88f, 43.7f);
        C32856Cuy.Zh(this.LIZJ);
        this.LIZJ.LJIIL(-3.6f, -3.6f);
        this.LIZJ.LJIIL(0.07f, -0.04f);
        C32856Cuy.sn(this.LIZJ);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -3.1f, 3.14f);
        this.LIZJ.LJIIL(-3.6f, -3.6f);
        C32856Cuy.zk(this.LIZJ);
        this.LIZJ.LJII(4.29f, 3.7f);
        C32856Cuy.Ik(this.LIZJ);
        Q7L.LIZLLL(this.LIZJ, "p", 38.59f, 38.59f);
        this.LIZJ.LJIIIIZZ(14.83f, 10.0f);
        this.LIZJ.LJIIL(-0.77f, -0.77f);
        this.LIZJ.LJIIL(0.02f, -0.3f);
        this.LIZJ.LJIIJ(0.08f, -0.92f, 0.2f, -1.2f, 0.25f, -1.3f);
        C32856Cuy.Jg(this.LIZJ);
        C32856Cuy.Ta(this.LIZJ);
        this.LIZJ.LJIIL(-0.3f, 0.02f);
        this.LIZJ.LJIIL(-0.77f, -0.77f);
        C32856Cuy.am(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(14.83f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.93f, 42.71f);
        this.LIZJ.LJIIL(-12.3f, -12.3f);
        this.LIZJ.LJIIL(-8.2f, 4.73f);
        C32856Cuy.be(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.37f, 0.17f, -0.68f, 0.42f, -0.88f);
        this.LIZJ.LJII(5.3f, 11.07f);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, -2.53f, 2.75f);
        C32856Cuy.vi(this.LIZJ);
        this.LIZJ.LJIIIZ(7.0f, 7.0f, false, false, 2.75f, -2.53f);
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
