package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D2I extends AbstractC39455Fe7 {
    public D2I() {
        this.LIZJ.LJIIIIZZ(27.0f, 24.5f);
        C32856Cuy.t5(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.01f);
        this.LIZJ.LJIIJJI(-9.95f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(9.89f, 9.89f);
        C32856Cuy.xk(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-2.13f, 2.13f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        this.LIZJ.LJIIL(-9.89f, -9.89f);
        C32856Cuy.LLLF(this.LIZJ);
        C32856Cuy.z9(this.LIZJ);
        C32856Cuy.fg(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(14.95f, 18.49f);
        this.LIZJ.LJII(5.06f, 8.6f);
        C32856Cuy.vk(this.LIZJ);
        this.LIZJ.LJII(7.2f, 5.06f);
        C32856Cuy.rk(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(9.89f, 9.89f);
        C32856Cuy.Dh(this.LIZJ);
        C32856Cuy.LJLJJL(this.LIZJ);
        C32856Cuy.eg(this.LIZJ);
        C32856Cuy.H(this.LIZJ);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.01f);
        this.LIZJ.LJIIJJI(9.95f);
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
