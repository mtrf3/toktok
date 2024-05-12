package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6M extends AbstractC39455Fe7 {
    public D6M() {
        this.LIZJ.LJIIIIZZ(13.0f, 7.5f);
        this.LIZJ.LJIIJ(-1.19f, 0.0f, -2.3f, 0.6f, -2.94f, 1.61f);
        this.LIZJ.LJII(4.5f, 17.76f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 0.22f, 4.08f);
        this.LIZJ.LJIIL(16.54f, 20.65f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 5.46f, 0.0f);
        this.LIZJ.LJIIL(16.55f, -20.65f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, false, false, 0.21f, -4.08f);
        this.LIZJ.LJIIL(-5.55f, -8.65f);
        this.LIZJ.LIZJ(3.5f, 3.5f, false, false, 35.0f, 7.5f);
        C32856Cuy.LLLLIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(-0.42f, 3.23f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.42f, -0.23f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(5.33f);
        this.LIZJ.LJIIL(-2.95f, 7.37f);
        this.LIZJ.LJIIL(-0.15f, 0.41f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(7.74f);
        this.LIZJ.LJIIL(4.84f, -7.55f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(8.12f, 21.28f);
        this.LIZJ.LJIIJJI(7.03f);
        this.LIZJ.LJIIL(0.1f, 0.35f);
        this.LIZJ.LJII(20.0f, 36.09f);
        this.LIZJ.LJII(8.12f, 21.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(19.5f, 15.3f);
        this.LIZJ.LJII(32.0f, 21.44f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(0.04f, -0.16f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(7.85f);
        this.LIZJ.LJIIL(-12.25f, 15.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(12.64f, -18.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-8.3f);
        this.LIZJ.LJIIIZ(5.5f, 5.5f, false, false, -0.08f, -0.23f);
        this.LIZJ.LJIIL(-2.72f, -7.55f);
        C32856Cuy.M6(this.LIZJ);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.42f, 0.23f);
        this.LIZJ.LJIIL(4.84f, 7.55f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(-14.3f, -7.78f);
        this.LIZJ.LJIIL(2.81f, 7.78f);
        this.LIZJ.LJI(18.44f);
        this.LIZJ.LJIIL(3.12f, -7.78f);
        C40084FoG.LJ(this.LIZJ, "p", 4.4f);
        this.LIZJ.LJIILIIL(-2.02f, 28.03f);
        this.LIZJ.LJII(18.3f, 21.28f);
        this.LIZJ.LJIIJJI(10.62f);
        this.LIZJ.LJIIL(-4.98f, 17.25f);
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
