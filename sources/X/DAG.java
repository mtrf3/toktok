package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAG extends AbstractC39455Fe7 {
    public DAG() {
        this.LIZJ.LJIIIIZZ(31.68f, 1.42f);
        this.LIZJ.LJII(8.56f, 26.32f);
        this.LIZJ.LIZJ(1.0f, 1.0f, false, false, 9.29f, 28.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(10.07f);
        this.LIZJ.LJIIJ(0.32f, 0.0f, 0.56f, 0.3f, 0.48f, 0.62f);
        this.LIZJ.LJIIL(-4.37f, 17.5f);
        this.LIZJ.LJIIJ(-0.12f, 0.5f, 0.5f, 0.83f, 0.85f, 0.46f);
        this.LIZJ.LJIIL(23.12f, -24.9f);
        C32856Cuy.Qa(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.65f, 47.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(30.1f);
        this.LIZJ.LJIIL(5.14f, -16.92f);
        this.LIZJ.LJIIJJI(6.14f);
        this.LIZJ.LJII(46.53f, 47.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(-4.54f);
        this.LIZJ.LJIIL(-0.89f, -3.55f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-5.56f);
        this.LIZJ.LJIIL(-0.9f, 3.55f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(3.6f, -14.28f);
        this.LIZJ.LJIIL(-1.85f, 7.37f);
        this.LIZJ.LJIIJJI(3.86f);
        this.LIZJ.LJIIL(-1.84f, -7.37f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-0.17f);
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
