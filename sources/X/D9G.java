package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9G extends AbstractC39455Fe7 {
    public D9G() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(41.0f, 4.2f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(16.3f);
        C32856Cuy.C5(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-2.4f);
        C32856Cuy.LLJJJ(this.LIZJ);
        C32856Cuy.LJJIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(46.97f, 37.1f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-5.8f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(43.0f);
        this.LIZJ.LJIIJ(0.0f, 0.56f, -0.47f, 1.01f, -1.04f, 1.01f);
        this.LIZJ.LJIIJJI(-2.26f);
        this.LIZJ.LJIIJ(-0.57f, 0.0f, -1.03f, -0.45f, -1.03f, -1.01f);
        this.LIZJ.LJIJ(37.1f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.8f);
        this.LIZJ.LJIIJ(-0.58f, 0.0f, -1.04f, -0.45f, -1.04f, -1.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-2.2f);
        this.LIZJ.LJIIJ(0.0f, -0.55f, 0.46f, -1.0f, 1.03f, -1.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(5.8f);
        C32856Cuy.z9(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, -0.56f, 0.47f, -1.01f, 1.04f, -1.01f);
        this.LIZJ.LJIIJJI(2.26f);
        this.LIZJ.LJIIJ(0.57f, 0.0f, 1.03f, 0.45f, 1.03f, 1.01f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIILL(5.89f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIIJJI(5.8f);
        this.LIZJ.LJIIJ(0.58f, 0.0f, 1.04f, 0.45f, 1.04f, 1.0f);
        C32856Cuy.q1(this.LIZJ);
        this.LIZJ.LJIIJ(0.0f, 0.55f, -0.46f, 1.0f, -1.03f, 1.0f);
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
